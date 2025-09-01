
// Description: Java 11 Factory interface for Int32Col.

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
 *	CFBamInt32ColFactory interface for Int32Col
 */
public interface ICFBamInt32ColFactory
{

	/**
	 *	Allocate a TableIdx key over Int32Col instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamInt32ColByTableIdxKey newTableIdxKey();

	/**
	 *	Allocate a Int32Col instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamInt32ColBuff newBuff();

	/**
	 *	Allocate a Int32Col history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamInt32ColHBuff newHBuff();

}
