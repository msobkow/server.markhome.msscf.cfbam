
// Description: Java 11 Factory interface for Param.

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
 *	CFBamParamFactory interface for Param
 */
public interface ICFBamParamFactory
{

	/**
	 *	Allocate a primary key for Param instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamParamPKey newPKey();

	/**
	 *	Allocate a primary history key for Param instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamParamHPKey newHPKey();

	/**
	 *	Allocate a UNameIdx key over Param instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamParamByUNameIdxKey newUNameIdxKey();

	/**
	 *	Allocate a ValTentIdx key over Param instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamParamByValTentIdxKey newValTentIdxKey();

	/**
	 *	Allocate a ServerMethodIdx key over Param instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamParamByServerMethodIdxKey newServerMethodIdxKey();

	/**
	 *	Allocate a DefSchemaIdx key over Param instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamParamByDefSchemaIdxKey newDefSchemaIdxKey();

	/**
	 *	Allocate a ServerTypeIdx key over Param instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamParamByServerTypeIdxKey newServerTypeIdxKey();

	/**
	 *	Allocate a PrevIdx key over Param instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamParamByPrevIdxKey newPrevIdxKey();

	/**
	 *	Allocate a NextIdx key over Param instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamParamByNextIdxKey newNextIdxKey();

	/**
	 *	Allocate a ContPrevIdx key over Param instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamParamByContPrevIdxKey newContPrevIdxKey();

	/**
	 *	Allocate a ContNextIdx key over Param instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamParamByContNextIdxKey newContNextIdxKey();

	/**
	 *	Allocate a Param instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamParamBuff newBuff();

	/**
	 *	Allocate a Param history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamParamHBuff newHBuff();

}
