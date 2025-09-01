// Description: Java 11 Table Object interface for CFBam.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBam.*;

public interface ICFBamNumberColTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new NumberCol instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamNumberColObj newInstance();

	/**
	 *	Instantiate a new NumberCol edition of the specified NumberCol instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamNumberColEditObj newEditInstance( ICFBamNumberColObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamNumberColObj realiseNumberCol( ICFBamNumberColObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamNumberColObj createNumberCol( ICFBamNumberColObj Obj );

	/**
	 *	Read a NumberCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NumberCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamNumberColObj readNumberCol( CFBamValuePKey pkey );

	/**
	 *	Read a NumberCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NumberCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamNumberColObj readNumberCol( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamNumberColObj readCachedNumberCol( CFBamValuePKey pkey );

	public void reallyDeepDisposeNumberCol( ICFBamNumberColObj obj );

	void deepDisposeNumberCol( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamNumberColObj lockNumberCol( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the NumberCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamNumberColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamNumberColObj> readAllNumberCol();

	/**
	 *	Return a sorted map of all the NumberCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamNumberColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamNumberColObj> readAllNumberCol( boolean forceRead );

	List<ICFBamNumberColObj> readCachedAllNumberCol();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamNumberColObj readNumberColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamNumberColObj readNumberColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamNumberColObj readNumberColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamNumberColObj readNumberColByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberColObj> readNumberColByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamNumberColObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberColObj> readNumberColByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberColObj> readNumberColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamNumberColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberColObj> readNumberColByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberColObj> readNumberColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamNumberColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberColObj> readNumberColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberColObj> readNumberColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamNumberColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberColObj> readNumberColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberColObj> readNumberColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamNumberColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberColObj> readNumberColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberColObj> readNumberColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamNumberColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberColObj> readNumberColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberColObj> readNumberColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamNumberColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberColObj> readNumberColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamNumberColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberColObj> readNumberColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of CFBamNumberColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamNumberColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamNumberColObj> readNumberColByTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	ICFBamNumberColObj readCachedNumberColByIdIdx( long TenantId,
		long Id );

	ICFBamNumberColObj readCachedNumberColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamNumberColObj> readCachedNumberColByValTentIdx( long TenantId );

	List<ICFBamNumberColObj> readCachedNumberColByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamNumberColObj> readCachedNumberColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamNumberColObj> readCachedNumberColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamNumberColObj> readCachedNumberColByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamNumberColObj> readCachedNumberColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamNumberColObj> readCachedNumberColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamNumberColObj> readCachedNumberColByTableIdx( long TenantId,
		long TableId );

	void deepDisposeNumberColByIdIdx( long TenantId,
		long Id );

	void deepDisposeNumberColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeNumberColByValTentIdx( long TenantId );

	void deepDisposeNumberColByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeNumberColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeNumberColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeNumberColByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeNumberColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeNumberColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeNumberColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 */
	ICFBamNumberColObj updateNumberCol( ICFBamNumberColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteNumberCol( ICFBamNumberColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The NumberCol key attribute of the instance generating the id.
	 */
	void deleteNumberColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The NumberCol key attribute of the instance generating the id.
	 */
	void deleteNumberColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 */
	void deleteNumberColByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberCol key attribute of the instance generating the id.
	 */
	void deleteNumberColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The NumberCol key attribute of the instance generating the id.
	 */
	void deleteNumberColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NumberCol key attribute of the instance generating the id.
	 */
	void deleteNumberColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NumberCol key attribute of the instance generating the id.
	 */
	void deleteNumberColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The NumberCol key attribute of the instance generating the id.
	 */
	void deleteNumberColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The NumberCol key attribute of the instance generating the id.
	 */
	void deleteNumberColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The NumberCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The NumberCol key attribute of the instance generating the id.
	 */
	void deleteNumberColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Move the CFBamNumberColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamNumberColObj refreshed cache instance.
	 */
	ICFBamNumberColObj moveUpNumberCol( ICFBamNumberColObj Obj );

	/**
	 *	Move the CFBamNumberColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamNumberColObj refreshed cache instance.
	 */
	ICFBamNumberColObj moveDownNumberCol( ICFBamNumberColObj Obj );
}
