
// Description: Java 11 Factory interface for Int16Col.

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
 *	CFBamInt16ColFactory interface for Int16Col
 */
public interface ICFBamInt16ColFactory
{

	/**
	 *	Allocate a TableIdx key over Int16Col instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamInt16ColByTableIdxKey newTableIdxKey();

	/**
	 *	Allocate a Int16Col instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamInt16ColBuff newBuff();

	/**
	 *	Allocate a Int16Col history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamInt16ColHBuff newHBuff();

}
