
// Description: Java 11 Factory interface for Value.

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
 *	CFBamValueFactory interface for Value
 */
public interface ICFBamValueFactory
{

	/**
	 *	Allocate a primary key for Value instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamValuePKey newPKey();

	/**
	 *	Allocate a primary history key for Value instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamValueHPKey newHPKey();

	/**
	 *	Allocate a UNameIdx key over Value instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamValueByUNameIdxKey newUNameIdxKey();

	/**
	 *	Allocate a ValTentIdx key over Value instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamValueByValTentIdxKey newValTentIdxKey();

	/**
	 *	Allocate a ScopeIdx key over Value instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamValueByScopeIdxKey newScopeIdxKey();

	/**
	 *	Allocate a DefSchemaIdx key over Value instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamValueByDefSchemaIdxKey newDefSchemaIdxKey();

	/**
	 *	Allocate a PrevIdx key over Value instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamValueByPrevIdxKey newPrevIdxKey();

	/**
	 *	Allocate a NextIdx key over Value instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamValueByNextIdxKey newNextIdxKey();

	/**
	 *	Allocate a ContPrevIdx key over Value instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamValueByContPrevIdxKey newContPrevIdxKey();

	/**
	 *	Allocate a ContNextIdx key over Value instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamValueByContNextIdxKey newContNextIdxKey();

	/**
	 *	Allocate a Value instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamValueBuff newBuff();

	/**
	 *	Allocate a Value history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamValueHBuff newHBuff();

}
