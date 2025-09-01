
// Description: Java 11 Factory interface for TokenDef.

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
 *	CFBamTokenDefFactory interface for TokenDef
 */
public interface ICFBamTokenDefFactory
{

	/**
	 *	Allocate a TokenDef instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamTokenDefBuff newBuff();

	/**
	 *	Allocate a TokenDef history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamTokenDefHBuff newHBuff();

}
