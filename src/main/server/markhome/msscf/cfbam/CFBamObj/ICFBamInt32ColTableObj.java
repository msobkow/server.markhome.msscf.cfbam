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

public interface ICFBamInt32ColTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Int32Col instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamInt32ColObj newInstance();

	/**
	 *	Instantiate a new Int32Col edition of the specified Int32Col instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamInt32ColEditObj newEditInstance( ICFBamInt32ColObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamInt32ColObj realiseInt32Col( ICFBamInt32ColObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamInt32ColObj createInt32Col( ICFBamInt32ColObj Obj );

	/**
	 *	Read a Int32Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Int32Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamInt32ColObj readInt32Col( CFBamValuePKey pkey );

	/**
	 *	Read a Int32Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Int32Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamInt32ColObj readInt32Col( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamInt32ColObj readCachedInt32Col( CFBamValuePKey pkey );

	public void reallyDeepDisposeInt32Col( ICFBamInt32ColObj obj );

	void deepDisposeInt32Col( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamInt32ColObj lockInt32Col( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the Int32Col-derived instances in the database.
	 *
	 *	@return	List of ICFBamInt32ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamInt32ColObj> readAllInt32Col();

	/**
	 *	Return a sorted map of all the Int32Col-derived instances in the database.
	 *
	 *	@return	List of ICFBamInt32ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamInt32ColObj> readAllInt32Col( boolean forceRead );

	List<ICFBamInt32ColObj> readCachedAllInt32Col();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamInt32ColObj readInt32ColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamInt32ColObj readInt32ColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamInt32ColObj readInt32ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamInt32ColObj readInt32ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt32ColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt32ColObj> readInt32ColByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamInt32ColObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt32ColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt32ColObj> readInt32ColByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt32ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt32ColObj> readInt32ColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamInt32ColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt32ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt32ColObj> readInt32ColByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt32ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt32ColObj> readInt32ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamInt32ColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt32ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt32ColObj> readInt32ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt32ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt32ColObj> readInt32ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamInt32ColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt32ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt32ColObj> readInt32ColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt32ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt32ColObj> readInt32ColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamInt32ColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt32ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt32ColObj> readInt32ColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt32ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt32ColObj> readInt32ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamInt32ColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt32ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt32ColObj> readInt32ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt32ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt32ColObj> readInt32ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamInt32ColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt32ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt32ColObj> readInt32ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamInt32ColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt32ColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt32ColObj> readInt32ColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of CFBamInt32ColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamInt32ColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamInt32ColObj> readInt32ColByTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	ICFBamInt32ColObj readCachedInt32ColByIdIdx( long TenantId,
		long Id );

	ICFBamInt32ColObj readCachedInt32ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamInt32ColObj> readCachedInt32ColByValTentIdx( long TenantId );

	List<ICFBamInt32ColObj> readCachedInt32ColByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamInt32ColObj> readCachedInt32ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamInt32ColObj> readCachedInt32ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamInt32ColObj> readCachedInt32ColByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamInt32ColObj> readCachedInt32ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamInt32ColObj> readCachedInt32ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamInt32ColObj> readCachedInt32ColByTableIdx( long TenantId,
		long TableId );

	void deepDisposeInt32ColByIdIdx( long TenantId,
		long Id );

	void deepDisposeInt32ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeInt32ColByValTentIdx( long TenantId );

	void deepDisposeInt32ColByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeInt32ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeInt32ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeInt32ColByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeInt32ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeInt32ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeInt32ColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 */
	ICFBamInt32ColObj updateInt32Col( ICFBamInt32ColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteInt32Col( ICFBamInt32ColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Int32Col key attribute of the instance generating the id.
	 */
	void deleteInt32ColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Int32Col key attribute of the instance generating the id.
	 */
	void deleteInt32ColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 */
	void deleteInt32ColByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int32Col key attribute of the instance generating the id.
	 */
	void deleteInt32ColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Int32Col key attribute of the instance generating the id.
	 */
	void deleteInt32ColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int32Col key attribute of the instance generating the id.
	 */
	void deleteInt32ColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int32Col key attribute of the instance generating the id.
	 */
	void deleteInt32ColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The Int32Col key attribute of the instance generating the id.
	 */
	void deleteInt32ColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The Int32Col key attribute of the instance generating the id.
	 */
	void deleteInt32ColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Int32Col key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Int32Col key attribute of the instance generating the id.
	 */
	void deleteInt32ColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Move the CFBamInt32ColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamInt32ColObj refreshed cache instance.
	 */
	ICFBamInt32ColObj moveUpInt32Col( ICFBamInt32ColObj Obj );

	/**
	 *	Move the CFBamInt32ColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamInt32ColObj refreshed cache instance.
	 */
	ICFBamInt32ColObj moveDownInt32Col( ICFBamInt32ColObj Obj );
}
