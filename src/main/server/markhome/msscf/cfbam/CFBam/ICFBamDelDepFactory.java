
// Description: Java 11 Factory interface for DelDep.

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
 *	CFBamDelDepFactory interface for DelDep
 */
public interface ICFBamDelDepFactory
{

	/**
	 *	Allocate a DefSchemaIdx key over DelDep instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamDelDepByDefSchemaIdxKey newDefSchemaIdxKey();

	/**
	 *	Allocate a DelDepIdx key over DelDep instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamDelDepByDelDepIdxKey newDelDepIdxKey();

	/**
	 *	Allocate a DelDep instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamDelDepBuff newBuff();

	/**
	 *	Allocate a DelDep history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamDelDepHBuff newHBuff();

}
