
// Description: Java 11 Factory interface for TokenCol.

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
 *	CFBamTokenColFactory interface for TokenCol
 */
public interface ICFBamTokenColFactory
{

	/**
	 *	Allocate a TableIdx key over TokenCol instances.
	 *
	 *	@return	The new instance.
	 */
	CFBamTokenColByTableIdxKey newTableIdxKey();

	/**
	 *	Allocate a TokenCol instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamTokenColBuff newBuff();

	/**
	 *	Allocate a TokenCol history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamTokenColHBuff newHBuff();

}
