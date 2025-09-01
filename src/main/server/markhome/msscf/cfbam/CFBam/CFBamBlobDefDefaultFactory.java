
// Description: Java 11 Default Factory implementation for BlobDef.

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
	 *	CFBamBlobDefFactory implementation for BlobDef
	 */
public class CFBamBlobDefDefaultFactory
	implements ICFBamBlobDefFactory
{
	public CFBamBlobDefDefaultFactory() {
	}

	public CFBamBlobDefBuff newBuff() {
		CFBamBlobDefBuff buff =
			new CFBamBlobDefBuff();
		return( buff );
	}

	public CFBamBlobDefHBuff newHBuff() {
		CFBamBlobDefHBuff hbuff =
			new CFBamBlobDefHBuff();
		return( hbuff );
	}
}
