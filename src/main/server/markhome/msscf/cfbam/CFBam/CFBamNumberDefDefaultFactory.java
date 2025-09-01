
// Description: Java 11 Default Factory implementation for NumberDef.

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
	 *	CFBamNumberDefFactory implementation for NumberDef
	 */
public class CFBamNumberDefDefaultFactory
	implements ICFBamNumberDefFactory
{
	public CFBamNumberDefDefaultFactory() {
	}

	public CFBamNumberDefBuff newBuff() {
		CFBamNumberDefBuff buff =
			new CFBamNumberDefBuff();
		return( buff );
	}

	public CFBamNumberDefHBuff newHBuff() {
		CFBamNumberDefHBuff hbuff =
			new CFBamNumberDefHBuff();
		return( hbuff );
	}
}
