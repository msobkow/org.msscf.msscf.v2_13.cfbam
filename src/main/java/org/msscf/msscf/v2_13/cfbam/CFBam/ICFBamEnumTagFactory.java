
// Description: Java 11 Factory interface for EnumTag.

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

package org.msscf.msscf.v2_13.cfbam.CFBam;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfsec.CFSec.*;
import org.msscf.msscf.v2_13.cfint.CFInt.*;

/*
 *	CFBamEnumTagFactory interface for EnumTag
 */
public interface ICFBamEnumTagFactory
{

	/**
	 *	Allocate a primary key for EnumTag instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamEnumTagPKey newPKey();

	/**
	 *	Allocate a primary history key for EnumTag instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamEnumTagHPKey newHPKey();

	/**
	 *	Allocate a EnumTagTenantIdx key over EnumTag instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamEnumTagByEnumTagTenantIdxKey newEnumTagTenantIdxKey();

	/**
	 *	Allocate a EnumIdx key over EnumTag instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamEnumTagByEnumIdxKey newEnumIdxKey();

	/**
	 *	Allocate a DefSchemaIdx key over EnumTag instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamEnumTagByDefSchemaIdxKey newDefSchemaIdxKey();

	/**
	 *	Allocate a EnumNameIdx key over EnumTag instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamEnumTagByEnumNameIdxKey newEnumNameIdxKey();

	/**
	 *	Allocate a PrevIdx key over EnumTag instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamEnumTagByPrevIdxKey newPrevIdxKey();

	/**
	 *	Allocate a NextIdx key over EnumTag instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamEnumTagByNextIdxKey newNextIdxKey();

	/**
	 *	Allocate a EnumTag instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamEnumTagBuff newBuff();

	/**
	 *	Allocate a EnumTag history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamEnumTagHBuff newHBuff();

}
