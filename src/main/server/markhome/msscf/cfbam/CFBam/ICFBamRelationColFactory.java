
// Description: Java 11 Factory interface for RelationCol.

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

/*
 *	CFBamRelationColFactory interface for RelationCol
 */
public interface ICFBamRelationColFactory
{

	/**
	 *	Allocate a primary key for RelationCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamRelationColPKey newPKey();

	/**
	 *	Allocate a primary history key for RelationCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamRelationColHPKey newHPKey();

	/**
	 *	Allocate a UNameIdx key over RelationCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamRelationColByUNameIdxKey newUNameIdxKey();

	/**
	 *	Allocate a RelColTenantIdx key over RelationCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamRelationColByRelColTenantIdxKey newRelColTenantIdxKey();

	/**
	 *	Allocate a RelationIdx key over RelationCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamRelationColByRelationIdxKey newRelationIdxKey();

	/**
	 *	Allocate a DefSchemaIdx key over RelationCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamRelationColByDefSchemaIdxKey newDefSchemaIdxKey();

	/**
	 *	Allocate a FromColIdx key over RelationCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamRelationColByFromColIdxKey newFromColIdxKey();

	/**
	 *	Allocate a ToColIdx key over RelationCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamRelationColByToColIdxKey newToColIdxKey();

	/**
	 *	Allocate a PrevIdx key over RelationCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamRelationColByPrevIdxKey newPrevIdxKey();

	/**
	 *	Allocate a NextIdx key over RelationCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamRelationColByNextIdxKey newNextIdxKey();

	/**
	 *	Allocate a RelPrevIdx key over RelationCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamRelationColByRelPrevIdxKey newRelPrevIdxKey();

	/**
	 *	Allocate a RelNextIdx key over RelationCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamRelationColByRelNextIdxKey newRelNextIdxKey();

	/**
	 *	Allocate a RelationCol instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamRelationColBuff newBuff();

	/**
	 *	Allocate a RelationCol history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamRelationColHBuff newHBuff();

}
