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

public interface ICFBamRelationColTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new RelationCol instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamRelationColObj newInstance();

	/**
	 *	Instantiate a new RelationCol edition of the specified RelationCol instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamRelationColEditObj newEditInstance( ICFBamRelationColObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamRelationColObj realiseRelationCol( ICFBamRelationColObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamRelationColObj createRelationCol( ICFBamRelationColObj Obj );

	/**
	 *	Read a RelationCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The RelationCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamRelationColObj readRelationCol( CFBamRelationColPKey pkey );

	/**
	 *	Read a RelationCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The RelationCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamRelationColObj readRelationCol( CFBamRelationColPKey pkey,
		boolean forceRead );

	ICFBamRelationColObj readCachedRelationCol( CFBamRelationColPKey pkey );

	public void reallyDeepDisposeRelationCol( ICFBamRelationColObj obj );

	void deepDisposeRelationCol( CFBamRelationColPKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamRelationColObj lockRelationCol( CFBamRelationColPKey pkey );

	/**
	 *	Return a sorted list of all the RelationCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamRelationColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamRelationColObj> readAllRelationCol();

	/**
	 *	Return a sorted map of all the RelationCol-derived instances in the database.
	 *
	 *	@return	List of ICFBamRelationColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamRelationColObj> readAllRelationCol( boolean forceRead );

	List<ICFBamRelationColObj> readCachedAllRelationCol();

	/**
	 *	Get the CFBamRelationColObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamRelationColObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamRelationColObj readRelationColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamRelationColObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamRelationColObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamRelationColObj readRelationColByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the CFBamRelationColObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamRelationColObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamRelationColObj readRelationColByUNameIdx(long TenantId,
		long RelationId,
		String Name );

	/**
	 *	Get the CFBamRelationColObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	CFBamRelationColObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamRelationColObj readRelationColByUNameIdx(long TenantId,
		long RelationId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamRelationColObj instances sorted by their primary keys for the duplicate RelColTenantIdx key.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRelationColObj cached instances sorted by their primary keys for the duplicate RelColTenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRelationColObj> readRelationColByRelColTenantIdx( long TenantId );

	/**
	 *	Get the map of CFBamRelationColObj instances sorted by their primary keys for the duplicate RelColTenantIdx key.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRelationColObj cached instances sorted by their primary keys for the duplicate RelColTenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRelationColObj> readRelationColByRelColTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamRelationColObj instances sorted by their primary keys for the duplicate RelationIdx key.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRelationColObj cached instances sorted by their primary keys for the duplicate RelationIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRelationColObj> readRelationColByRelationIdx( long TenantId,
		long RelationId );

	/**
	 *	Get the map of CFBamRelationColObj instances sorted by their primary keys for the duplicate RelationIdx key.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRelationColObj cached instances sorted by their primary keys for the duplicate RelationIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRelationColObj> readRelationColByRelationIdx( long TenantId,
		long RelationId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamRelationColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRelationColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRelationColObj> readRelationColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamRelationColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRelationColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRelationColObj> readRelationColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamRelationColObj instances sorted by their primary keys for the duplicate FromColIdx key.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argFromColId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRelationColObj cached instances sorted by their primary keys for the duplicate FromColIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRelationColObj> readRelationColByFromColIdx( long TenantId,
		long FromColId );

	/**
	 *	Get the map of CFBamRelationColObj instances sorted by their primary keys for the duplicate FromColIdx key.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argFromColId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRelationColObj cached instances sorted by their primary keys for the duplicate FromColIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRelationColObj> readRelationColByFromColIdx( long TenantId,
		long FromColId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamRelationColObj instances sorted by their primary keys for the duplicate ToColIdx key.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argToColId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRelationColObj cached instances sorted by their primary keys for the duplicate ToColIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRelationColObj> readRelationColByToColIdx( long TenantId,
		long ToColId );

	/**
	 *	Get the map of CFBamRelationColObj instances sorted by their primary keys for the duplicate ToColIdx key.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argToColId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRelationColObj cached instances sorted by their primary keys for the duplicate ToColIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRelationColObj> readRelationColByToColIdx( long TenantId,
		long ToColId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamRelationColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRelationColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRelationColObj> readRelationColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Get the map of CFBamRelationColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	argPrevTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRelationColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRelationColObj> readRelationColByPrevIdx( Long PrevTenantId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamRelationColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRelationColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRelationColObj> readRelationColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Get the map of CFBamRelationColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	argNextTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRelationColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRelationColObj> readRelationColByNextIdx( Long NextTenantId,
		Long NextId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamRelationColObj instances sorted by their primary keys for the duplicate RelPrevIdx key.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRelationColObj cached instances sorted by their primary keys for the duplicate RelPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRelationColObj> readRelationColByRelPrevIdx( long TenantId,
		long RelationId,
		Long PrevId );

	/**
	 *	Get the map of CFBamRelationColObj instances sorted by their primary keys for the duplicate RelPrevIdx key.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRelationColObj cached instances sorted by their primary keys for the duplicate RelPrevIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRelationColObj> readRelationColByRelPrevIdx( long TenantId,
		long RelationId,
		Long PrevId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamRelationColObj instances sorted by their primary keys for the duplicate RelNextIdx key.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRelationColObj cached instances sorted by their primary keys for the duplicate RelNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRelationColObj> readRelationColByRelNextIdx( long TenantId,
		long RelationId,
		Long NextId );

	/**
	 *	Get the map of CFBamRelationColObj instances sorted by their primary keys for the duplicate RelNextIdx key.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamRelationColObj cached instances sorted by their primary keys for the duplicate RelNextIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamRelationColObj> readRelationColByRelNextIdx( long TenantId,
		long RelationId,
		Long NextId,
		boolean forceRead );

	ICFBamRelationColObj readCachedRelationColByIdIdx( long TenantId,
		long Id );

	ICFBamRelationColObj readCachedRelationColByUNameIdx( long TenantId,
		long RelationId,
		String Name );

	List<ICFBamRelationColObj> readCachedRelationColByRelColTenantIdx( long TenantId );

	List<ICFBamRelationColObj> readCachedRelationColByRelationIdx( long TenantId,
		long RelationId );

	List<ICFBamRelationColObj> readCachedRelationColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamRelationColObj> readCachedRelationColByFromColIdx( long TenantId,
		long FromColId );

	List<ICFBamRelationColObj> readCachedRelationColByToColIdx( long TenantId,
		long ToColId );

	List<ICFBamRelationColObj> readCachedRelationColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	List<ICFBamRelationColObj> readCachedRelationColByNextIdx( Long NextTenantId,
		Long NextId );

	List<ICFBamRelationColObj> readCachedRelationColByRelPrevIdx( long TenantId,
		long RelationId,
		Long PrevId );

	List<ICFBamRelationColObj> readCachedRelationColByRelNextIdx( long TenantId,
		long RelationId,
		Long NextId );

	void deepDisposeRelationColByIdIdx( long TenantId,
		long Id );

	void deepDisposeRelationColByUNameIdx( long TenantId,
		long RelationId,
		String Name );

	void deepDisposeRelationColByRelColTenantIdx( long TenantId );

	void deepDisposeRelationColByRelationIdx( long TenantId,
		long RelationId );

	void deepDisposeRelationColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeRelationColByFromColIdx( long TenantId,
		long FromColId );

	void deepDisposeRelationColByToColIdx( long TenantId,
		long ToColId );

	void deepDisposeRelationColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	void deepDisposeRelationColByNextIdx( Long NextTenantId,
		Long NextId );

	void deepDisposeRelationColByRelPrevIdx( long TenantId,
		long RelationId,
		Long PrevId );

	void deepDisposeRelationColByRelNextIdx( long TenantId,
		long RelationId,
		Long NextId );

	/**
	 *	Internal use only.
	 */
	ICFBamRelationColObj updateRelationCol( ICFBamRelationColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteRelationCol( ICFBamRelationColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The RelationCol key attribute of the instance generating the id.
	 */
	void deleteRelationColByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The RelationCol key attribute of the instance generating the id.
	 */
	void deleteRelationColByUNameIdx(long TenantId,
		long RelationId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 */
	void deleteRelationColByRelColTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The RelationCol key attribute of the instance generating the id.
	 */
	void deleteRelationColByRelationIdx( long TenantId,
		long RelationId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The RelationCol key attribute of the instance generating the id.
	 */
	void deleteRelationColByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argFromColId	The RelationCol key attribute of the instance generating the id.
	 */
	void deleteRelationColByFromColIdx( long TenantId,
		long FromColId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argToColId	The RelationCol key attribute of the instance generating the id.
	 */
	void deleteRelationColByToColIdx( long TenantId,
		long ToColId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The RelationCol key attribute of the instance generating the id.
	 */
	void deleteRelationColByPrevIdx( Long PrevTenantId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The RelationCol key attribute of the instance generating the id.
	 */
	void deleteRelationColByNextIdx( Long NextTenantId,
		Long NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The RelationCol key attribute of the instance generating the id.
	 */
	void deleteRelationColByRelPrevIdx( long TenantId,
		long RelationId,
		Long PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The RelationCol key attribute of the instance generating the id.
	 */
	void deleteRelationColByRelNextIdx( long TenantId,
		long RelationId,
		Long NextId );

	/**
	 *	Move the CFBamRelationColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamRelationColObj refreshed cache instance.
	 */
	ICFBamRelationColObj moveUpRelationCol( ICFBamRelationColObj Obj );

	/**
	 *	Move the CFBamRelationColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	CFBamRelationColObj refreshed cache instance.
	 */
	ICFBamRelationColObj moveDownRelationCol( ICFBamRelationColObj Obj );
}
