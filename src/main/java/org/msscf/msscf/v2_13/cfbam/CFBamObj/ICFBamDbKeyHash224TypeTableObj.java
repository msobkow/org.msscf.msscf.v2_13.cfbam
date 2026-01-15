// Description: Java 11 Table Object interface for CFBam.

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
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfsec.CFSec.*;
import org.msscf.msscf.v2_13.cfint.CFInt.*;
import org.msscf.msscf.v2_13.cfsec.CFSecObj.*;
import org.msscf.msscf.v2_13.cfint.CFIntObj.*;
import org.msscf.msscf.v2_13.cfbam.CFBam.*;

public interface ICFBamDbKeyHash224TypeTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new DbKeyHash224Type instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamDbKeyHash224TypeObj newInstance();

	/**
	 *	Instantiate a new DbKeyHash224Type edition of the specified DbKeyHash224Type instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamDbKeyHash224TypeEditObj newEditInstance( ICFBamDbKeyHash224TypeObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash224TypeObj realiseDbKeyHash224Type( ICFBamDbKeyHash224TypeObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash224TypeObj createDbKeyHash224Type( ICFBamDbKeyHash224TypeObj Obj );

	/**
	 *	Read a DbKeyHash224Type-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash224Type-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDbKeyHash224TypeObj readDbKeyHash224Type( CFBamValuePKey pkey );

	/**
	 *	Read a DbKeyHash224Type-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DbKeyHash224Type-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamDbKeyHash224TypeObj readDbKeyHash224Type( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamDbKeyHash224TypeObj readCachedDbKeyHash224Type( CFBamValuePKey pkey );

	public void reallyDeepDisposeDbKeyHash224Type( ICFBamDbKeyHash224TypeObj obj );

	void deepDisposeDbKeyHash224Type( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash224TypeObj lockDbKeyHash224Type( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the DbKeyHash224Type-derived instances in the database.
	 *
	 *	@return	List of ICFBamDbKeyHash224TypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDbKeyHash224TypeObj> readAllDbKeyHash224Type();

	/**
	 *	Return a sorted map of all the DbKeyHash224Type-derived instances in the database.
	 *
	 *	@return	List of ICFBamDbKeyHash224TypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamDbKeyHash224TypeObj> readAllDbKeyHash224Type( boolean forceRead );

	List<ICFBamDbKeyHash224TypeObj> readCachedAllDbKeyHash224Type();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash224TypeObj readDbKeyHash224TypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash224TypeObj readDbKeyHash224TypeByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash224TypeObj readDbKeyHash224TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamDbKeyHash224TypeObj readDbKeyHash224TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224TypeObj> readDbKeyHash224TypeByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamDbKeyHash224TypeObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224TypeObj> readDbKeyHash224TypeByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224TypeObj> readDbKeyHash224TypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamDbKeyHash224TypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224TypeObj> readDbKeyHash224TypeByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224TypeObj> readDbKeyHash224TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamDbKeyHash224TypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224TypeObj> readDbKeyHash224TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224TypeObj> readDbKeyHash224TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamDbKeyHash224TypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224TypeObj> readDbKeyHash224TypeByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224TypeObj> readDbKeyHash224TypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamDbKeyHash224TypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224TypeObj> readDbKeyHash224TypeByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224TypeObj> readDbKeyHash224TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamDbKeyHash224TypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224TypeObj> readDbKeyHash224TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224TypeObj> readDbKeyHash224TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamDbKeyHash224TypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224TypeObj> readDbKeyHash224TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamDbKeyHash224TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224TypeObj> readDbKeyHash224TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Get the map of CFBamDbKeyHash224TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamDbKeyHash224TypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamDbKeyHash224TypeObj> readDbKeyHash224TypeBySchemaIdx( long TenantId,
		long SchemaDefId,
		boolean forceRead );

	ICFBamDbKeyHash224TypeObj readCachedDbKeyHash224TypeByIdIdx( long TenantId,
		long Id );

	ICFBamDbKeyHash224TypeObj readCachedDbKeyHash224TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamDbKeyHash224TypeObj> readCachedDbKeyHash224TypeByValTentIdx( long TenantId );

	List<ICFBamDbKeyHash224TypeObj> readCachedDbKeyHash224TypeByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamDbKeyHash224TypeObj> readCachedDbKeyHash224TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamDbKeyHash224TypeObj> readCachedDbKeyHash224TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamDbKeyHash224TypeObj> readCachedDbKeyHash224TypeByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamDbKeyHash224TypeObj> readCachedDbKeyHash224TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamDbKeyHash224TypeObj> readCachedDbKeyHash224TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamDbKeyHash224TypeObj> readCachedDbKeyHash224TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	void deepDisposeDbKeyHash224TypeByIdIdx( long TenantId,
		long Id );

	void deepDisposeDbKeyHash224TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeDbKeyHash224TypeByValTentIdx( long TenantId );

	void deepDisposeDbKeyHash224TypeByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeDbKeyHash224TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeDbKeyHash224TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeDbKeyHash224TypeByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeDbKeyHash224TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeDbKeyHash224TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeDbKeyHash224TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Internal use only.
	 */
	ICFBamDbKeyHash224TypeObj updateDbKeyHash224Type( ICFBamDbKeyHash224TypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDbKeyHash224Type( ICFBamDbKeyHash224TypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argId	The DbKeyHash224Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224TypeByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argName	The DbKeyHash224Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224TypeByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224TypeByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224TypeByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DbKeyHash224Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224TypeByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash224Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224TypeByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash224Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224TypeByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DbKeyHash224Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224TypeByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DbKeyHash224Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224TypeByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The DbKeyHash224Type key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The DbKeyHash224Type key attribute of the instance generating the id.
	 */
	void deleteDbKeyHash224TypeBySchemaIdx( long TenantId,
		long SchemaDefId );

	/**
	 *	Move the CFBamDbKeyHash224TypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDbKeyHash224TypeObj refreshed cache instance.
	 */
	ICFBamDbKeyHash224TypeObj moveUpDbKeyHash224Type( ICFBamDbKeyHash224TypeObj Obj );

	/**
	 *	Move the CFBamDbKeyHash224TypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamDbKeyHash224TypeObj refreshed cache instance.
	 */
	ICFBamDbKeyHash224TypeObj moveDownDbKeyHash224Type( ICFBamDbKeyHash224TypeObj Obj );
}
