
// Description: Java 11 Default Factory implementation for StringDef.

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
	 *	CFBamStringDefFactory implementation for StringDef
	 */
public class CFBamStringDefDefaultFactory
	implements ICFBamStringDefFactory
{
	public CFBamStringDefDefaultFactory() {
	}

	public CFBamStringDefBuff newBuff() {
		CFBamStringDefBuff buff =
			new CFBamStringDefBuff();
		return( buff );
	}

	public CFBamStringDefHBuff newHBuff() {
		CFBamStringDefHBuff hbuff =
			new CFBamStringDefHBuff();
		return( hbuff );
	}
}
