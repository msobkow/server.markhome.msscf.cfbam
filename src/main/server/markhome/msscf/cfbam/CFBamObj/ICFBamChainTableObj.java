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

public interface ICFBamChainTableObj
{
	ICFBamSchemaObj getSchema();
	void setSchema( ICFBamSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Chain instance.
	 *
	 *	@return	A new instance.
	 */
	ICFBamChainObj newInstance();

	/**
	 *	Instantiate a new Chain edition of the specified Chain instance.
	 *
	 *	@return	A new edition.
	 */
	ICFBamChainEditObj newEditInstance( ICFBamChainObj orig );

	/**
	 *	Internal use only.
	 */
	ICFBamChainObj realiseChain( ICFBamChainObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFBamChainObj createChain( ICFBamChainObj Obj );

	/**
	 *	Read a Chain-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Chain-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamChainObj readChain( CFBamChainPKey pkey );

	/**
	 *	Read a Chain-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Chain-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFBamChainObj readChain( CFBamChainPKey pkey,
		boolean forceRead );

	ICFBamChainObj readCachedChain( CFBamChainPKey pkey );

	public void reallyDeepDisposeChain( ICFBamChainObj obj );

	void deepDisposeChain( CFBamChainPKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFBamChainObj lockChain( CFBamChainPKey pkey );

	/**
	 *	Return a sorted list of all the Chain-derived instances in the database.
	 *
	 *	@return	List of ICFBamChainObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamChainObj> readAllChain();

	/**
	 *	Return a sorted map of all the Chain-derived instances in the database.
	 *
	 *	@return	List of ICFBamChainObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFBamChainObj> readAllChain( boolean forceRead );

	List<ICFBamChainObj> readCachedAllChain();

	/**
	 *	Get the CFBamChainObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Chain key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Chain key attribute of the instance generating the id.
	 *
	 *	@return	CFBamChainObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamChainObj readChainByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFBamChainObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The Chain key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Chain key attribute of the instance generating the id.
	 *
	 *	@return	CFBamChainObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFBamChainObj readChainByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of CFBamChainObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The Chain key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamChainObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamChainObj> readChainByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFBamChainObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The Chain key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamChainObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamChainObj> readChainByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamChainObj instances sorted by their primary keys for the duplicate ChainTableIdx key.
	 *
	 *	@param	argTenantId	The Chain key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Chain key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamChainObj cached instances sorted by their primary keys for the duplicate ChainTableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamChainObj> readChainByChainTableIdx( long TenantId,
		long TableId );

	/**
	 *	Get the map of CFBamChainObj instances sorted by their primary keys for the duplicate ChainTableIdx key.
	 *
	 *	@param	argTenantId	The Chain key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Chain key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamChainObj cached instances sorted by their primary keys for the duplicate ChainTableIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamChainObj> readChainByChainTableIdx( long TenantId,
		long TableId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamChainObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Chain key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Chain key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamChainObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamChainObj> readChainByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Get the map of CFBamChainObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	argDefSchemaTenantId	The Chain key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Chain key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamChainObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamChainObj> readChainByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the CFBamChainObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Chain key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Chain key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Chain key attribute of the instance generating the id.
	 *
	 *	@return	CFBamChainObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamChainObj readChainByUNameIdx(long TenantId,
		long TableId,
		String Name );

	/**
	 *	Get the CFBamChainObj instance for the unique UNameIdx key.
	 *
	 *	@param	argTenantId	The Chain key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Chain key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Chain key attribute of the instance generating the id.
	 *
	 *	@return	CFBamChainObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFBamChainObj readChainByUNameIdx(long TenantId,
		long TableId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFBamChainObj instances sorted by their primary keys for the duplicate PrevRelIdx key.
	 *
	 *	@param	argPrevRelationTenantId	The Chain key attribute of the instance generating the id.
	 *
	 *	@param	argPrevRelationId	The Chain key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamChainObj cached instances sorted by their primary keys for the duplicate PrevRelIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamChainObj> readChainByPrevRelIdx( long PrevRelationTenantId,
		long PrevRelationId );

	/**
	 *	Get the map of CFBamChainObj instances sorted by their primary keys for the duplicate PrevRelIdx key.
	 *
	 *	@param	argPrevRelationTenantId	The Chain key attribute of the instance generating the id.
	 *
	 *	@param	argPrevRelationId	The Chain key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamChainObj cached instances sorted by their primary keys for the duplicate PrevRelIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamChainObj> readChainByPrevRelIdx( long PrevRelationTenantId,
		long PrevRelationId,
		boolean forceRead );

	/**
	 *	Get the map of CFBamChainObj instances sorted by their primary keys for the duplicate NextRelIdx key.
	 *
	 *	@param	argNextRelationTenantId	The Chain key attribute of the instance generating the id.
	 *
	 *	@param	argNextRelationId	The Chain key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamChainObj cached instances sorted by their primary keys for the duplicate NextRelIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamChainObj> readChainByNextRelIdx( long NextRelationTenantId,
		long NextRelationId );

	/**
	 *	Get the map of CFBamChainObj instances sorted by their primary keys for the duplicate NextRelIdx key.
	 *
	 *	@param	argNextRelationTenantId	The Chain key attribute of the instance generating the id.
	 *
	 *	@param	argNextRelationId	The Chain key attribute of the instance generating the id.
	 *
	 *	@return	List of CFBamChainObj cached instances sorted by their primary keys for the duplicate NextRelIdx key,
	 *		which may be an empty set.
	 */
	List<ICFBamChainObj> readChainByNextRelIdx( long NextRelationTenantId,
		long NextRelationId,
		boolean forceRead );

	ICFBamChainObj readCachedChainByIdIdx( long TenantId,
		long Id );

	List<ICFBamChainObj> readCachedChainByTenantIdx( long TenantId );

	List<ICFBamChainObj> readCachedChainByChainTableIdx( long TenantId,
		long TableId );

	List<ICFBamChainObj> readCachedChainByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	ICFBamChainObj readCachedChainByUNameIdx( long TenantId,
		long TableId,
		String Name );

	List<ICFBamChainObj> readCachedChainByPrevRelIdx( long PrevRelationTenantId,
		long PrevRelationId );

	List<ICFBamChainObj> readCachedChainByNextRelIdx( long NextRelationTenantId,
		long NextRelationId );

	void deepDisposeChainByIdIdx( long TenantId,
		long Id );

	void deepDisposeChainByTenantIdx( long TenantId );

	void deepDisposeChainByChainTableIdx( long TenantId,
		long TableId );

	void deepDisposeChainByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	void deepDisposeChainByUNameIdx( long TenantId,
		long TableId,
		String Name );

	void deepDisposeChainByPrevRelIdx( long PrevRelationTenantId,
		long PrevRelationId );

	void deepDisposeChainByNextRelIdx( long NextRelationTenantId,
		long NextRelationId );

	/**
	 *	Internal use only.
	 */
	ICFBamChainObj updateChain( ICFBamChainObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteChain( ICFBamChainObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Chain key attribute of the instance generating the id.
	 *
	 *	@param	argId	The Chain key attribute of the instance generating the id.
	 */
	void deleteChainByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Chain key attribute of the instance generating the id.
	 */
	void deleteChainByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Chain key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Chain key attribute of the instance generating the id.
	 */
	void deleteChainByChainTableIdx( long TenantId,
		long TableId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDefSchemaTenantId	The Chain key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Chain key attribute of the instance generating the id.
	 */
	void deleteChainByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The Chain key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Chain key attribute of the instance generating the id.
	 *
	 *	@param	argName	The Chain key attribute of the instance generating the id.
	 */
	void deleteChainByUNameIdx(long TenantId,
		long TableId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argPrevRelationTenantId	The Chain key attribute of the instance generating the id.
	 *
	 *	@param	argPrevRelationId	The Chain key attribute of the instance generating the id.
	 */
	void deleteChainByPrevRelIdx( long PrevRelationTenantId,
		long PrevRelationId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argNextRelationTenantId	The Chain key attribute of the instance generating the id.
	 *
	 *	@param	argNextRelationId	The Chain key attribute of the instance generating the id.
	 */
	void deleteChainByNextRelIdx( long NextRelationTenantId,
		long NextRelationId );
}
