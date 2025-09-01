
// Description: Java 11 Factory interface for PopTopDep.

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
 *	CFBamPopTopDepFactory interface for PopTopDep
 */
public interface ICFBamPopTopDepFactory
{

	/**
	 *	Allocate a ContRelIdx key over PopTopDep instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamPopTopDepByContRelIdxKey newContRelIdxKey();

	/**
	 *	Allocate a UNameIdx key over PopTopDep instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamPopTopDepByUNameIdxKey newUNameIdxKey();

	/**
	 *	Allocate a PopTopDep instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamPopTopDepBuff newBuff();

	/**
	 *	Allocate a PopTopDep history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamPopTopDepHBuff newHBuff();

}
