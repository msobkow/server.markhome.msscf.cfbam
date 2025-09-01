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

public interface ICFBamPopSubDep2TableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new PopSubDep2 instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamPopSubDep2Obj newInstance();

	/**
	 *	Instantiate a new PopSubDep2 edition of the specified PopSubDep2 instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamPopSubDep2EditObj newEditInstance( ICFBamPopSubDep2Obj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamPopSubDep2Obj realisePopSubDep2( ICFBamPopSubDep2Obj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamPopSubDep2Obj createPopSubDep2( ICFBamPopSubDep2Obj Obj );

	/**
	 *	Read a PopSubDep2-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The PopSubDep2-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamPopSubDep2Obj readPopSubDep2( CFBamScopePKey pkey );

	/**
	 *	Read a PopSubDep2-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The PopSubDep2-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamPopSubDep2Obj readPopSubDep2( CFBamScopePKey pkey,
		boolean forceRead );

	ICFBamPopSubDep2Obj readCachedPopSubDep2( CFBamScopePKey pkey );

	public void reallyDeepDisposePopSubDep2( ICFBamPopSubDep2Obj obj );

	void deepDisposePopSubDep2( CFBamScopePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamPopSubDep2Obj lockPopSubDep2( CFBamScopePKey pkey );

	/**
	 *	Return a sorted list of all the PopSubDep2-derived instances in the database.
	 *
	 *	@return	List of ICFBamPopSubDep2Obj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamPopSubDep2Obj> readAllPopSubDep2();

	/**
	 *	Return a sorted map of all the PopSubDep2-derived instances in the database.
	 *
	 *	@return	List of ICFBamPopSubDep2Obj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamPopSubDep2Obj> readAllPopSubDep2( boolean forceRead );

	List<ICFBamPopSubDep2Obj> readCachedAllPopSubDep2();

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argId	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamPopSubDep2Obj readPopSubDep2ByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamScopeObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argId	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	CFBamScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamPopSubDep2Obj readPopSubDep2ByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of CFBamScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPopSubDep2Obj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPopSubDep2Obj> readPopSubDep2ByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFBamPopSubDep2Obj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPopSubDep2Obj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPopSubDep2Obj> readPopSubDep2ByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPopDepObj instances sorted by their primary keys for the duplicate RelationIdx key.
	 *
	 *	@param	argRelationTenantId	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPopSubDep2Obj cached instances sorted by their primary keys for the duplicate RelationIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPopSubDep2Obj> readPopSubDep2ByRelationIdx( long RelationTenantId,
		long RelationId );

	/**
	 *	Get the map of CFBamPopSubDep2Obj instances sorted by their primary keys for the duplicate RelationIdx key.
	 *
	 *	@param	argRelationTenantId	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPopSubDep2Obj cached instances sorted by their primary keys for the duplicate RelationIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPopSubDep2Obj> readPopSubDep2ByRelationIdx( long RelationTenantId,
		long RelationId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPopDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPopSubDep2Obj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPopSubDep2Obj> readPopSubDep2ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamPopSubDep2Obj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPopSubDep2Obj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPopSubDep2Obj> readPopSubDep2ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamPopSubDep2Obj instances sorted by their primary keys for the duplicate PopSubDep1Idx key.
	 *
	 *	@param	argPopSubDep1TenantId	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argPopSubDep1Id	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPopSubDep2Obj cached instances sorted by their primary keys for the duplicate PopSubDep1Idx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPopSubDep2Obj> readPopSubDep2ByPopSubDep1Idx( long PopSubDep1TenantId,
		long PopSubDep1Id );

	/**
	 *	Get the map of CFBamPopSubDep2Obj instances sorted by their primary keys for the duplicate PopSubDep1Idx key.
	 *
	 *	@param	argPopSubDep1TenantId	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argPopSubDep1Id	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamPopSubDep2Obj cached instances sorted by their primary keys for the duplicate PopSubDep1Idx key,
	 *		which may be an empty set.
	 */
	List<ICFBamPopSubDep2Obj> readPopSubDep2ByPopSubDep1Idx( long PopSubDep1TenantId,
		long PopSubDep1Id,
		boolean forceRead );

	/**
	 *	Get the CFBamPopSubDep2Obj instance for the unique UNameIdx key.
	 *
	 *	@param	argPopSubDep1TenantId	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argPopSubDep1Id	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argName	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	CFBamPopSubDep2Obj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamPopSubDep2Obj readPopSubDep2ByUNameIdx(long PopSubDep1TenantId,
		long PopSubDep1Id,
		String Name );

	/**
	 *	Get the CFBamPopSubDep2Obj instance for the unique UNameIdx key.
	 *
	 *	@param	argPopSubDep1TenantId	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argPopSubDep1Id	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argName	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	CFBamPopSubDep2Obj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamPopSubDep2Obj readPopSubDep2ByUNameIdx(long PopSubDep1TenantId,
		long PopSubDep1Id,
		String Name,
		boolean forceRead );

	ICFBamPopSubDep2Obj readCachedPopSubDep2ByIdIdx( long TenantId,
		long Id );

	List<ICFBamPopSubDep2Obj> readCachedPopSubDep2ByTenantIdx( long TenantId );

	List<ICFBamPopSubDep2Obj> readCachedPopSubDep2ByRelationIdx( long RelationTenantId,
		long RelationId );

	List<ICFBamPopSubDep2Obj> readCachedPopSubDep2ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	List<ICFBamPopSubDep2Obj> readCachedPopSubDep2ByPopSubDep1Idx( long PopSubDep1TenantId,
		long PopSubDep1Id );

	ICFBamPopSubDep2Obj readCachedPopSubDep2ByUNameIdx( long PopSubDep1TenantId,
		long PopSubDep1Id,
		String Name );

	void deepDisposePopSubDep2ByIdIdx( long TenantId,
		long Id );

	void deepDisposePopSubDep2ByTenantIdx( long TenantId );

	void deepDisposePopSubDep2ByRelationIdx( long RelationTenantId,
		long RelationId );

	void deepDisposePopSubDep2ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposePopSubDep2ByPopSubDep1Idx( long PopSubDep1TenantId,
		long PopSubDep1Id );

	void deepDisposePopSubDep2ByUNameIdx( long PopSubDep1TenantId,
		long PopSubDep1Id,
		String Name );

	/**
	 *	Internal use only.
	 */
	ICFBamPopSubDep2Obj updatePopSubDep2( ICFBamPopSubDep2Obj Obj );

	/**
	 *	Internal use only.
	 */
	void deletePopSubDep2( ICFBamPopSubDep2Obj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argId	The PopSubDep2 key attribute of the instance generating the id.
	 */
	void deletePopSubDep2ByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The PopSubDep2 key attribute of the instance generating the id.
	 */
	void deletePopSubDep2ByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argRelationTenantId	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The PopSubDep2 key attribute of the instance generating the id.
	 */
	void deletePopSubDep2ByRelationIdx( long RelationTenantId,
		long RelationId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The PopSubDep2 key attribute of the instance generating the id.
	 */
	void deletePopSubDep2ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPopSubDep1TenantId	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argPopSubDep1Id	The PopSubDep2 key attribute of the instance generating the id.
	 */
	void deletePopSubDep2ByPopSubDep1Idx( long PopSubDep1TenantId,
		long PopSubDep1Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPopSubDep1TenantId	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argPopSubDep1Id	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argName	The PopSubDep2 key attribute of the instance generating the id.
	 */
	void deletePopSubDep2ByUNameIdx(long PopSubDep1TenantId,
		long PopSubDep1Id,
		String Name );
}
