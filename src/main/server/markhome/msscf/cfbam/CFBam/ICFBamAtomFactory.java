
// Description: Java 11 Factory interface for Atom.

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
 *	CFBamAtomFactory interface for Atom
 */
public interface ICFBamAtomFactory
{

	/**
	 *	Allocate a Atom instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamAtomBuff newBuff();

	/**
	 *	Allocate a Atom history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFBamAtomHBuff newHBuff();

}
