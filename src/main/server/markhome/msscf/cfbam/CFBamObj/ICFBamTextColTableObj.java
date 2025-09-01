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

public interface ICFBamTextColTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new TextCol instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamTextColObj newInstance();

	/**
	 *	Instantiate a new TextCol edition of the specified TextCol instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamTextColEditObj newEditInstance( ICFBamTextColObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamTextColObj realiseTextCol( ICFBamTextColObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamTextColObj createTextCol( ICFBamTextColObj Obj );

	/**
	 *	Read a TextCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TextCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamTextColObj readTextCol( CFBamValuePKey pkey );

	/**
	 *	Read a TextCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TextCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamTextColObj readTextCol( CFBamValuePKey pkey,
		boolean forceRead );

	ICFBamTextColObj readCachedTextCol( CFBamValuePKey pkey );

	public void reallyDeepDisposeTextCol( ICFBamTextColObj obj );

	void deepDisposeTextCol( CFBamValuePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamTextColObj lockTextCol( CFBamValuePKey pkey );

	/**
	 *	Return a sorted list of all the TextCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamTextColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamTextColObj> readAllTextCol();

	/**
	 *	Return a sorted map of all the TextCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamTextColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamTextColObj> readAllTextCol( boolean forceRead );

	List<ICFBamTextColObj> readCachedAllTextCol();

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamTextColObj readTextColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamValueObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamTextColObj readTextColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamTextColObj readTextColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Get the CFBamValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamTextColObj readTextColByUNameIdx( long TenantId,
		long ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTextColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTextColObj> readTextColByValTentIdx( long TenantId );

	/**
	 *	Get the map of CFBamTextColObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	argTenantId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTextColObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTextColObj> readTextColByValTentIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTextColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTextColObj> readTextColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Get the map of CFBamTextColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argTenantId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTextColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTextColObj> readTextColByScopeIdx( long TenantId,
		long ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTextColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTextColObj> readTextColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamTextColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTextColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTextColObj> readTextColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTextColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTextColObj> readTextColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamTextColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTextColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTextColObj> readTextColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTextColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTextColObj> readTextColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamTextColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTextColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTextColObj> readTextColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTextColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTextColObj> readTextColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Get the map of CFBamTextColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	argTenantId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTextColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTextColObj> readTextColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTextColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTextColObj> readTextColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Get the map of CFBamTextColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	argTenantId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTextColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTextColObj> readTextColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamTextColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTextColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTextColObj> readTextColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of CFBamTextColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	argTenantId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamTextColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamTextColObj> readTextColByTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	ICFBamTextColObj readCachedTextColByIdIdx( long TenantId,
		long Id );

	ICFBamTextColObj readCachedTextColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	List<ICFBamTextColObj> readCachedTextColByValTentIdx( long TenantId );

	List<ICFBamTextColObj> readCachedTextColByScopeIdx( long TenantId,
		long ScopeId );

	List<ICFBamTextColObj> readCachedTextColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamTextColObj> readCachedTextColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamTextColObj> readCachedTextColByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamTextColObj> readCachedTextColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	List<ICFBamTextColObj> readCachedTextColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	List<ICFBamTextColObj> readCachedTextColByTableIdx( long TenantId,
		long TableId );

	void deepDisposeTextColByIdIdx( long TenantId,
		long Id );

	void deepDisposeTextColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	void deepDisposeTextColByValTentIdx( long TenantId );

	void deepDisposeTextColByScopeIdx( long TenantId,
		long ScopeId );

	void deepDisposeTextColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeTextColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeTextColByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeTextColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	void deepDisposeTextColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	void deepDisposeTextColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 */
	ICFBamTextColObj updateTextCol( ICFBamTextColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTextCol( ICFBamTextColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The TextCol key attribute of the instance generating the id.
	 */
	void deleteTextColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TextCol key attribute of the instance generating the id.
	 */
	void deleteTextColByUNameIdx( long TenantId,
		long ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TextCol key attribute of the instance generating the id.
	 */
	void deleteTextColByValTentIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextCol key attribute of the instance generating the id.
	 */
	void deleteTextColByScopeIdx( long TenantId,
		long ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The TextCol key attribute of the instance generating the id.
	 */
	void deleteTextColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TextCol key attribute of the instance generating the id.
	 */
	void deleteTextColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TextCol key attribute of the instance generating the id.
	 */
	void deleteTextColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The TextCol key attribute of the instance generating the id.
	 */
	void deleteTextColByContPrevIdx( long TenantId,
		long ScopeId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	argScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The TextCol key attribute of the instance generating the id.
	 */
	void deleteTextColByContNextIdx( long TenantId,
		long ScopeId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TextCol key attribute of the instance generating the id.
	 */
	void deleteTextColByTableIdx( long TenantId,
		long TableId );

	/**
	 *	Move the CFBamTextColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamTextColObj refreshed cache instance.
	 */
	ICFBamTextColObj moveUpTextCol( ICFBamTextColObj Obj );

	/**
	 *	Move the CFBamTextColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamTextColObj refreshed cache instance.
	 */
	ICFBamTextColObj moveDownTextCol( ICFBamTextColObj Obj );
}
