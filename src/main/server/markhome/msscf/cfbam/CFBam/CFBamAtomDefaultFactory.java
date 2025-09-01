
// Description: Java 11 Default Factory implementation for Atom.

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
	 *	CFBamAtomFactory implementation for Atom
	 */
public class CFBamAtomDefaultFactory
	implements ICFBamAtomFactory
{
	public CFBamAtomDefaultFactory() {
	}

	public CFBamAtomBuff newBuff() {
		CFBamAtomBuff buff =
			new CFBamAtomBuff();
		return( buff );
	}

	public CFBamAtomHBuff newHBuff() {
		CFBamAtomHBuff hbuff =
			new CFBamAtomHBuff();
		return( hbuff );
	}
}
