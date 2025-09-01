
// Description: Java 11 Factory interface for ClearDep.

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
 *	CFBamClearDepFactory interface for ClearDep
 */
public interface ICFBamClearDepFactory
{

	/**
	 *	Allocate a ClearDepIdx key over ClearDep instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamClearDepByClearDepIdxKey newClearDepIdxKey();

	/**
	 *	Allocate a DefSchemaIdx key over ClearDep instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamClearDepByDefSchemaIdxKey newDefSchemaIdxKey();

	/**
	 *	Allocate a ClearDep instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamClearDepBuff newBuff();

	/**
	 *	Allocate a ClearDep history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamClearDepHBuff newHBuff();

}
