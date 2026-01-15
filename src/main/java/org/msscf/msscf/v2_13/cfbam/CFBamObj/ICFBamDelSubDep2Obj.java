// Description: Java 11 Object interface for CFBam DelSubDep2.

/*
 *	org.msscf.msscf.CFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory CFBam 2.13 Business Application Model
 *	
 *	This program is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	This program is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.msscf.msscf.v2_13.cfbam.CFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cfbam.CFBam.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfsec.CFSec.*;
import org.msscf.msscf.v2_13.cfint.CFInt.*;
import org.msscf.msscf.v2_13.cfsec.CFSecObj.*;
import org.msscf.msscf.v2_13.cfint.CFIntObj.*;
import org.msscf.msscf.v2_13.cfbam.CFBam.*;

public interface ICFBamDelSubDep2Obj
	extends ICFBamDelDepObj
{
	/**
	 *	Get the current edition of this DelSubDep2 instance as a ICFBamDelSubDep2EditObj.
	 *
	 *	@return	The ICFBamDelSubDep2EditObj edition of this instance.
	 */
	ICFBamDelSubDep2EditObj getEditAsDelSubDep2();

	/**
	 *	Get the ICFBamDelSubDep2TableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamDelSubDep2TableObj table cache which manages this instance.
	 */
	ICFBamDelSubDep2TableObj getDelSubDep2Table();

	/**
	 *	Get the CFBamDelSubDep2Buff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamDelSubDep2Buff instance which currently backs this object.
	 */
	CFBamDelSubDep2Buff getDelSubDep2Buff();

	/**
	 *	Get the required long attribute DelSubDep1TenantId.
	 *
	 *	@return	The required long attribute DelSubDep1TenantId.
	 */
	long getRequiredDelSubDep1TenantId();

	/**
	 *	Get the required long attribute DelSubDep1Id.
	 *
	 *	@return	The required long attribute DelSubDep1Id.
	 */
	long getRequiredDelSubDep1Id();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Get the required ICFBamDelSubDep1Obj instance referenced by the DelSubDep1 key.
	 *
	 *	@return	The required ICFBamDelSubDep1Obj instance referenced by the DelSubDep1 key.
	 */
	ICFBamDelSubDep1Obj getRequiredContainerDelSubDep1();

	/**
	 *	Get the required ICFBamDelSubDep1Obj instance referenced by the DelSubDep1 key.
	 *
	 *	@return	The required ICFBamDelSubDep1Obj instance referenced by the DelSubDep1 key.
	 */
	ICFBamDelSubDep1Obj getRequiredContainerDelSubDep1( boolean forceRead );

	/**
	 *	Get the array of optional ICFBamDelSubDep3Obj array of instances referenced by the DelDep key.
	 *
	 *	@return	The optional ICFBamDelSubDep3Obj[] array of instances referenced by the DelDep key.
	 */
	List<ICFBamDelSubDep3Obj> getOptionalComponentsDelDep();

	/**
	 *	Get the array of optional ICFBamDelSubDep3Obj array of instances referenced by the DelDep key.
	 *
	 *	@return	The optional ICFBamDelSubDep3Obj[] array of instances referenced by the DelDep key.
	 */
	List<ICFBamDelSubDep3Obj> getOptionalComponentsDelDep( boolean forceRead );

}
