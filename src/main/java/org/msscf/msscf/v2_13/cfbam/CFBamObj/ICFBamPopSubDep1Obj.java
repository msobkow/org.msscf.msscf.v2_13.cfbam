// Description: Java 11 Object interface for CFBam PopSubDep1.

/*
 *	org.msscf.msscf.CFBam
 *
 *	Copyright (c) 2016-2025 Mark Stephen Sobkow
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

public interface ICFBamPopSubDep1Obj
	extends ICFBamPopDepObj
{
	/**
	 *	Get the current edition of this PopSubDep1 instance as a ICFBamPopSubDep1EditObj.
	 *
	 *	@return	The ICFBamPopSubDep1EditObj edition of this instance.
	 */
	ICFBamPopSubDep1EditObj getEditAsPopSubDep1();

	/**
	 *	Get the ICFBamPopSubDep1TableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamPopSubDep1TableObj table cache which manages this instance.
	 */
	ICFBamPopSubDep1TableObj getPopSubDep1Table();

	/**
	 *	Get the CFBamPopSubDep1Buff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamPopSubDep1Buff instance which currently backs this object.
	 */
	CFBamPopSubDep1Buff getPopSubDep1Buff();

	/**
	 *	Get the required long attribute PopTopDepTenantId.
	 *
	 *	@return	The required long attribute PopTopDepTenantId.
	 */
	long getRequiredPopTopDepTenantId();

	/**
	 *	Get the required long attribute PopTopDepId.
	 *
	 *	@return	The required long attribute PopTopDepId.
	 */
	long getRequiredPopTopDepId();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Get the required ICFBamPopTopDepObj instance referenced by the ContPopTopDep key.
	 *
	 *	@return	The required ICFBamPopTopDepObj instance referenced by the ContPopTopDep key.
	 */
	ICFBamPopTopDepObj getRequiredContainerContPopTopDep();

	/**
	 *	Get the required ICFBamPopTopDepObj instance referenced by the ContPopTopDep key.
	 *
	 *	@return	The required ICFBamPopTopDepObj instance referenced by the ContPopTopDep key.
	 */
	ICFBamPopTopDepObj getRequiredContainerContPopTopDep( boolean forceRead );

	/**
	 *	Get the array of optional ICFBamPopSubDep2Obj array of instances referenced by the PopDep key.
	 *
	 *	@return	The optional ICFBamPopSubDep2Obj[] array of instances referenced by the PopDep key.
	 */
	List<ICFBamPopSubDep2Obj> getOptionalComponentsPopDep();

	/**
	 *	Get the array of optional ICFBamPopSubDep2Obj array of instances referenced by the PopDep key.
	 *
	 *	@return	The optional ICFBamPopSubDep2Obj[] array of instances referenced by the PopDep key.
	 */
	List<ICFBamPopSubDep2Obj> getOptionalComponentsPopDep( boolean forceRead );

}
