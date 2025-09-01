
// Description: Java 11 Factory interface for DoubleDef.

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
 *	CFBamDoubleDefFactory interface for DoubleDef
 */
public interface ICFBamDoubleDefFactory
{

	/**
	 *	Allocate a DoubleDef instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamDoubleDefBuff newBuff();

	/**
	 *	Allocate a DoubleDef history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamDoubleDefHBuff newHBuff();

}
