
// Description: Java 11 DbIO interface for IndexCol.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBam;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBamObj.*;

/*
 *	CFBamIndexColTable database interface for IndexCol
 */
public interface ICFBamIndexColTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createIndexCol( CFSecAuthorization Authorization,
		CFBamIndexColBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateIndexCol( CFSecAuthorization Authorization,
		CFBamIndexColBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteIndexCol( CFSecAuthorization Authorization,
		CFBamIndexColBuff Buff );
	/**
	 *	Delete the IndexCol instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByIdIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argId );

	/**
	 *	Delete the IndexCol instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteIndexColByIdIdx( CFSecAuthorization Authorization,
		CFBamIndexColPKey argKey );
	/**
	 *	Delete the IndexCol instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByUNameIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argIndexId,
		String argName );

	/**
	 *	Delete the IndexCol instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteIndexColByUNameIdx( CFSecAuthorization Authorization,
		CFBamIndexColByUNameIdxKey argKey );
	/**
	 *	Delete the IndexCol instances identified by the key IdxColTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByIdxColTenantIdx( CFSecAuthorization Authorization,
		long argTenantId );

	/**
	 *	Delete the IndexCol instances identified by the key IdxColTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteIndexColByIdxColTenantIdx( CFSecAuthorization Authorization,
		CFBamIndexColByIdxColTenantIdxKey argKey );
	/**
	 *	Delete the IndexCol instances identified by the key IndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByIndexIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argIndexId );

	/**
	 *	Delete the IndexCol instances identified by the key IndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteIndexColByIndexIdx( CFSecAuthorization Authorization,
		CFBamIndexColByIndexIdxKey argKey );
	/**
	 *	Delete the IndexCol instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByDefSchemaIdx( CFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId );

	/**
	 *	Delete the IndexCol instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteIndexColByDefSchemaIdx( CFSecAuthorization Authorization,
		CFBamIndexColByDefSchemaIdxKey argKey );
	/**
	 *	Delete the IndexCol instances identified by the key ColIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argColumnId	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByColIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argColumnId );

	/**
	 *	Delete the IndexCol instances identified by the key ColIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteIndexColByColIdx( CFSecAuthorization Authorization,
		CFBamIndexColByColIdxKey argKey );
	/**
	 *	Delete the IndexCol instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrevTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByPrevIdx( CFSecAuthorization Authorization,
		Long argPrevTenantId,
		Long argPrevId );

	/**
	 *	Delete the IndexCol instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteIndexColByPrevIdx( CFSecAuthorization Authorization,
		CFBamIndexColByPrevIdxKey argKey );
	/**
	 *	Delete the IndexCol instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNextTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByNextIdx( CFSecAuthorization Authorization,
		Long argNextTenantId,
		Long argNextId );

	/**
	 *	Delete the IndexCol instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteIndexColByNextIdx( CFSecAuthorization Authorization,
		CFBamIndexColByNextIdxKey argKey );
	/**
	 *	Delete the IndexCol instances identified by the key IdxPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByIdxPrevIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argIndexId,
		Long argPrevId );

	/**
	 *	Delete the IndexCol instances identified by the key IdxPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteIndexColByIdxPrevIdx( CFSecAuthorization Authorization,
		CFBamIndexColByIdxPrevIdxKey argKey );
	/**
	 *	Delete the IndexCol instances identified by the key IdxNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The IndexCol key attribute of the instance generating the id.
	 */
	void deleteIndexColByIdxNextIdx( CFSecAuthorization Authorization,
		long argTenantId,
		long argIndexId,
		Long argNextId );

	/**
	 *	Delete the IndexCol instances identified by the key IdxNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteIndexColByIdxNextIdx( CFSecAuthorization Authorization,
		CFBamIndexColByIdxNextIdxKey argKey );


	/**
	 *	Read the derived IndexCol buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the IndexCol instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	CFBamIndexColBuff readDerived( CFSecAuthorization Authorization,
		CFBamIndexColPKey PKey );

	/**
	 *	Lock the derived IndexCol buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the IndexCol instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	CFBamIndexColBuff lockDerived( CFSecAuthorization Authorization,
		CFBamIndexColPKey PKey );

	/**
	 *	Read all IndexCol instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	CFBamIndexColBuff[] readAllDerived( CFSecAuthorization Authorization );

	/**
	 *	Read the derived IndexCol buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	CFBamIndexColBuff readDerivedByIdIdx( CFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read the derived IndexCol buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	CFBamIndexColBuff readDerivedByUNameIdx( CFSecAuthorization Authorization,
		long TenantId,
		long IndexId,
		String Name );

	/**
	 *	Read an array of the derived IndexCol buffer instances identified by the duplicate key IdxColTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamIndexColBuff[] readDerivedByIdxColTenantIdx( CFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the derived IndexCol buffer instances identified by the duplicate key IndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamIndexColBuff[] readDerivedByIndexIdx( CFSecAuthorization Authorization,
		long TenantId,
		long IndexId );

	/**
	 *	Read an array of the derived IndexCol buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamIndexColBuff[] readDerivedByDefSchemaIdx( CFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Read an array of the derived IndexCol buffer instances identified by the duplicate key ColIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argColumnId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamIndexColBuff[] readDerivedByColIdx( CFSecAuthorization Authorization,
		long TenantId,
		long ColumnId );

	/**
	 *	Read an array of the derived IndexCol buffer instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrevTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamIndexColBuff[] readDerivedByPrevIdx( CFSecAuthorization Authorization,
		Long PrevTenantId,
		Long PrevId );

	/**
	 *	Read an array of the derived IndexCol buffer instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNextTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamIndexColBuff[] readDerivedByNextIdx( CFSecAuthorization Authorization,
		Long NextTenantId,
		Long NextId );

	/**
	 *	Read an array of the derived IndexCol buffer instances identified by the duplicate key IdxPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamIndexColBuff[] readDerivedByIdxPrevIdx( CFSecAuthorization Authorization,
		long TenantId,
		long IndexId,
		Long PrevId );

	/**
	 *	Read an array of the derived IndexCol buffer instances identified by the duplicate key IdxNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFBamIndexColBuff[] readDerivedByIdxNextIdx( CFSecAuthorization Authorization,
		long TenantId,
		long IndexId,
		Long NextId );

	/**
	 *	Read the specific IndexCol buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the IndexCol instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamIndexColBuff readBuff( CFSecAuthorization Authorization,
		CFBamIndexColPKey PKey );

	/**
	 *	Lock the specific IndexCol buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the IndexCol instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamIndexColBuff lockBuff( CFSecAuthorization Authorization,
		CFBamIndexColPKey PKey );

	/**
	 *	Read all the specific IndexCol buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific IndexCol instances in the database accessible for the Authorization.
	 */
	CFBamIndexColBuff[] readAllBuff( CFSecAuthorization Authorization );

	/**
	 *	Read the specific IndexCol buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamIndexColBuff readBuffByIdIdx( CFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read the specific IndexCol buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argName	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamIndexColBuff readBuffByUNameIdx( CFSecAuthorization Authorization,
		long TenantId,
		long IndexId,
		String Name );

	/**
	 *	Read an array of the specific IndexCol buffer instances identified by the duplicate key IdxColTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamIndexColBuff[] readBuffByIdxColTenantIdx( CFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the specific IndexCol buffer instances identified by the duplicate key IndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamIndexColBuff[] readBuffByIndexIdx( CFSecAuthorization Authorization,
		long TenantId,
		long IndexId );

	/**
	 *	Read an array of the specific IndexCol buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamIndexColBuff[] readBuffByDefSchemaIdx( CFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId );

	/**
	 *	Read an array of the specific IndexCol buffer instances identified by the duplicate key ColIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argColumnId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamIndexColBuff[] readBuffByColIdx( CFSecAuthorization Authorization,
		long TenantId,
		long ColumnId );

	/**
	 *	Read an array of the specific IndexCol buffer instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrevTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamIndexColBuff[] readBuffByPrevIdx( CFSecAuthorization Authorization,
		Long PrevTenantId,
		Long PrevId );

	/**
	 *	Read an array of the specific IndexCol buffer instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNextTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamIndexColBuff[] readBuffByNextIdx( CFSecAuthorization Authorization,
		Long NextTenantId,
		Long NextId );

	/**
	 *	Read an array of the specific IndexCol buffer instances identified by the duplicate key IdxPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamIndexColBuff[] readBuffByIdxPrevIdx( CFSecAuthorization Authorization,
		long TenantId,
		long IndexId,
		Long PrevId );

	/**
	 *	Read an array of the specific IndexCol buffer instances identified by the duplicate key IdxNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFBamIndexColBuff[] readBuffByIdxNextIdx( CFSecAuthorization Authorization,
		long TenantId,
		long IndexId,
		Long NextId );

	/**
	 *	Move the specified buffer up in the chain (i.e. to the previous position.)
	 *
	 *	@return	The refreshed buffer after it has been moved
	 */
	CFBamIndexColBuff moveBuffUp( CFSecAuthorization Authorization,
		long TenantId,
		long Id,
		int revision );

	/**
	 *	Move the specified buffer down in the chain (i.e. to the next position.)
	 *
	 *	@return	The refreshed buffer after it has been moved
	 */
	CFBamIndexColBuff moveBuffDown( CFSecAuthorization Authorization,
		long TenantId,
		long Id,
		int revision );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
