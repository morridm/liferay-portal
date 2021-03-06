<%--
/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
--%>

<%@ include file="/html/portlet/init.jsp" %>

<%@ page import="com.liferay.portlet.journal.NoSuchArticleException" %><%@
page import="com.liferay.portlet.journal.service.permission.JournalArticlePermission" %><%@
page import="com.liferay.portlet.journal.service.permission.JournalPermission" %>

<%
String portletResource = ParamUtil.getString(request, "portletResource");

long groupId = ParamUtil.getLong(renderRequest, "groupId");

if (groupId <= 0) {
	groupId = GetterUtil.getLong(portletPreferences.getValue("groupId", String.valueOf(scopeGroupId)));
}

String articleId = ParamUtil.getString(renderRequest, "articleId");
String ddmTemplateKey = ParamUtil.getString(renderRequest, "ddmTemplateKey");

if (Validator.isNull(articleId)) {
	articleId = GetterUtil.getString(portletPreferences.getValue("articleId", StringPool.BLANK));
	ddmTemplateKey = GetterUtil.getString(portletPreferences.getValue("ddmTemplateKey", StringPool.BLANK));
}

boolean showAvailableLocales = GetterUtil.getBoolean(portletPreferences.getValue("showAvailableLocales", StringPool.BLANK));
String[] extensions = portletPreferences.getValues("extensions", null);
boolean enablePrint = GetterUtil.getBoolean(portletPreferences.getValue("enablePrint", null));
boolean enableRelatedAssets = GetterUtil.getBoolean(portletPreferences.getValue("enableRelatedAssets", null), true);
boolean enableRatings = GetterUtil.getBoolean(portletPreferences.getValue("enableRatings", null));
boolean enableComments = PropsValues.JOURNAL_ARTICLE_COMMENTS_ENABLED && GetterUtil.getBoolean(portletPreferences.getValue("enableComments", null));
boolean enableCommentRatings = GetterUtil.getBoolean(portletPreferences.getValue("enableCommentRatings", null));
boolean enableViewCountIncrement = GetterUtil.getBoolean(portletPreferences.getValue("enableViewCountIncrement", null), PropsValues.ASSET_ENTRY_BUFFERED_INCREMENT_ENABLED);

String[] conversions = DocumentConversionUtil.getConversions("html");

boolean openOfficeServerEnabled = PrefsPropsUtil.getBoolean(PropsKeys.OPENOFFICE_SERVER_ENABLED, PropsValues.OPENOFFICE_SERVER_ENABLED);
boolean enableConversions = openOfficeServerEnabled && (extensions != null) && (extensions.length > 0);
%>

<%@ include file="/html/portlet/journal_content/init-ext.jsp" %>