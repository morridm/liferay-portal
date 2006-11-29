/**
 * Copyright (c) 2000-2006 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.lock.service;

import com.liferay.lock.model.Lock;
import com.liferay.portal.PortalException;
import com.liferay.portal.SystemException;

import java.lang.Comparable;

import java.rmi.RemoteException;

import java.util.Set;

/**
 * <a href="LockServiceUtil.java.html"><b><i>View Source</i></b></a>
 *
 * @author  Brian Wing Shun Chan
 *
 */
public class LockServiceUtil {

	public static void clear() throws RemoteException, SystemException {
		LockService lockService = LockServiceFactory.getService();

		lockService.clear();
	}

	public static Lock getLock(String className, Comparable pk)
		throws PortalException, RemoteException, SystemException {

		LockService lockService = LockServiceFactory.getService();

		return lockService.getLock(className, pk);
	}

	public static Set getLocksByCompanyId(String companyId)
		throws RemoteException, SystemException {

		LockService lockService = LockServiceFactory.getService();

		return lockService.getLocksByCompanyId(companyId);
	}

	public static Set getLocksByUserId(String userId)
		throws RemoteException, SystemException {

		LockService lockService = LockServiceFactory.getService();

		return lockService.getLocksByUserId(userId);
	}

	public static boolean hasLock(
			String className, Comparable pk, String userId)
		throws RemoteException, SystemException {

		LockService lockService = LockServiceFactory.getService();

		return lockService.hasLock(className, pk, userId);
	}

	public static boolean isLocked(String className, Comparable pk)
		throws RemoteException, SystemException {

		LockService lockService = LockServiceFactory.getService();

		return lockService.isLocked(className, pk);
	}

	public static void lock(
			String className, Comparable pk, String companyId, String userId,
			long expirationTime)
		throws PortalException, RemoteException, SystemException {

		LockService lockService = LockServiceFactory.getService();

		lockService.lock(className, pk, companyId, userId, expirationTime);
	}

	public static void unlock(String className, Comparable pk)
		throws RemoteException, SystemException {

		LockService lockService = LockServiceFactory.getService();

		lockService.unlock(className, pk);
	}

}