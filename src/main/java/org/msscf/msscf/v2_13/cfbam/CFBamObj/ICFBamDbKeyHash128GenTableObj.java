// Description: Java 11 Table Object interface for CFBam.

/*
 *	org.msscf.msscf.CFBam
 *
 *	Copyright (c) 2020 Mark Stephen Sobkow
 *	
 *	MSS Code Factory CFBam 2.13 Business Application Model
 *	
 *	Copyright 2020 Mark Stephen Sobkow
 *	
 *		This file is part of MSS Code Factory.
 *	
 *		MSS Code Factory is available under dual commercial license from Mark Stephen
 *		Sobkow, or under the terms of the GNU General Public License, Version 3
 *		or later.
 *	
 *	    MSS Code Factory is free software: you can redistribute it and/or modify
 *	    it under the terms of the GNU General Public License as published by
 *	    the Free Software Foundation, either version 3 of the License, or
 *	    (at your option) any later version.
 *	
 *	    MSS Code Factory is distributed in the hope that it will be useful,
 *	    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	    GNU General Public License for more details.
 *	
 *	    You should have received a copy of the GNU General Public License
 *	    along with MSS Code Factory.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	Donations to support MSS Code Factory can be made at
 *	https://www.paypal.com/paypalme2/MarkSobkow
 *	
 *	Please contact Mark Stephen Sobkow at mark.sobkow@gmail.com for commercial licensing.
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.msscf.msscf.v2_13.cfbam.CFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfsec.CFSec.*;
import org.msscf.msscf.v2_13.cfint.CFInt.*;
import org.msscf.msscf.v2_13.cfsec.CFSecObj.*;
import org.msscf.msscf.v2_13.cfint.CFIntObj.*;
import org.msscf.msscf.v2_13.cfbam.CFBam.*;

public interface ICFBamDbKeyHash128GenTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new DbKeyHash128Gen instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamDbKeyHash128GenObj newInstance();

	/**
	 *	Instantiate a new DbKeyHash128Gen edition of the specified DbKeyHash128Gen instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamDbKeyHash128GenEditObj newEditInstance( ICFBamDbKeyHash128GenObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash128GenObj realiseDbKeyHash128Gen( ICFBamDbKeyHash128GenObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash128GenObj createDbKeyHash128Gen( ICFBamDbKeyHash128GenObj Obj );

	/**
	 *	Read a DbKeyHash128Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash128Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDbKeyHash128GenObj readDbKeyHash128Gen( CFBamValuePKey pkey );

	/**
	 *	Read a DbKeyHash128Gen-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash128Gen-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDbKeyHash128GenObj readDbKeyHash128Gen( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamDbKeyHash128GenObj readCachedDbKeyHash128Gen( CFBamValuePKey pkey );

	public void reallyDeepDisposeDbKeyHash128Gen( ICFBamDbKeyHash128GenObj obj );

	void deepDisposeDbKeyHash128Gen( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash128GenObj lockDbKeyHash128Gen( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the DbKeyHash128Gen-derived instances in the database.
	 *
	 *	@return	List of ICFBamDbKeyHash128GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDbKeyHash128GenObj> readAllDbKeyHash128Gen();

	/**
	 *	Return a sorted map of all the DbKeyHash128Gen-derived instances in the database.
	 *
	 *	@return	List of ICFBamDbKeyHash128GenObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDbKeyHash128GenObj> readAllDbKeyHash128Gen( boolean forceRead );

	List<ICFBamDbKeyHash128GenObj> readCachedAllDbKeyHash128Gen();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash128GenObj readDbKeyHash128GenByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash128GenObj readDbKeyHash128GenByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash128GenObj readDbKeyHash128GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash128GenObj readDbKeyHash128GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash128GenObj> readDbKeyHash128GenByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamDbKeyHash128GenObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash128GenObj> readDbKeyHash128GenByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash128GenObj> readDbKeyHash128GenByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamDbKeyHash128GenObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash128GenObj> readDbKeyHash128GenByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash128GenObj> readDbKeyHash128GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamDbKeyHash128GenObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash128GenObj> readDbKeyHash128GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash128GenObj> readDbKeyHash128GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamDbKeyHash128GenObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash128GenObj> readDbKeyHash128GenByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash128GenObj> readDbKeyHash128GenByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamDbKeyHash128GenObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash128GenObj> readDbKeyHash128GenByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash128GenObj> readDbKeyHash128GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamDbKeyHash128GenObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash128GenObj> readDbKeyHash128GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash128GenObj> readDbKeyHash128GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamDbKeyHash128GenObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash128GenObj> readDbKeyHash128GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamDbKeyHash128TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash128GenObj> readDbKeyHash128GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of CFBamDbKeyHash128GenObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash128GenObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash128GenObj> readDbKeyHash128GenBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	ICFBamDbKeyHash128GenObj readCachedDbKeyHash128GenByIdIdx( long TenantId,
		long Id );

	ICFBamDbKeyHash128GenObj readCachedDbKeyHash128GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamDbKeyHash128GenObj> readCachedDbKeyHash128GenByValTentIdx( long TenantId );

	List<ICFBamDbKeyHash128GenObj> readCachedDbKeyHash128GenByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamDbKeyHash128GenObj> readCachedDbKeyHash128GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamDbKeyHash128GenObj> readCachedDbKeyHash128GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamDbKeyHash128GenObj> readCachedDbKeyHash128GenByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamDbKeyHash128GenObj> readCachedDbKeyHash128GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamDbKeyHash128GenObj> readCachedDbKeyHash128GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamDbKeyHash128GenObj> readCachedDbKeyHash128GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeDbKeyHash128GenByIdIdx( long TenantId,
		long Id );

	void deepDisposeDbKeyHash128GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeDbKeyHash128GenByValTentIdx( long TenantId );

	void deepDisposeDbKeyHash128GenByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeDbKeyHash128GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeDbKeyHash128GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeDbKeyHash128GenByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeDbKeyHash128GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeDbKeyHash128GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeDbKeyHash128GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash128GenObj updateDbKeyHash128Gen( ICFBamDbKeyHash128GenObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDbKeyHash128Gen( ICFBamDbKeyHash128GenObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128GenByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash128Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128GenByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128GenByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128GenByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128GenByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128GenByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128GenByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128GenByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128GenByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DbKeyHash128Gen key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash128GenBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Move the CFBamDbKeyHash128GenObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDbKeyHash128GenObj refreshed cache instance.
	 */
	ICFBamDbKeyHash128GenObj moveUpDbKeyHash128Gen( ICFBamDbKeyHash128GenObj Obj );

	/**
	 *	Move the CFBamDbKeyHash128GenObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDbKeyHash128GenObj refreshed cache instance.
	 */
	ICFBamDbKeyHash128GenObj moveDownDbKeyHash128Gen( ICFBamDbKeyHash128GenObj Obj );
}
