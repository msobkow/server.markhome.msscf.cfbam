
// Description: Java 11 Default Factory implementation for UInt32Col.

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
	 *	CFBamUInt32ColFactory implementation for UInt32Col
	 */
public class CFBamUInt32ColDefaultFactory
	implements ICFBamUInt32ColFactory
{
	public CFBamUInt32ColDefaultFactory() {
	}

	public CFBamUInt32ColByTableIdxKey newTableIdxKey() {
		CFBamUInt32ColByTableIdxKey key =
			new CFBamUInt32ColByTableIdxKey();
		return( key );
	}

	public CFBamUInt32ColBuff newBuff() {
		CFBamUInt32ColBuff buff =
			new CFBamUInt32ColBuff();
		return( buff );
	}

	public CFBamUInt32ColHBuff newHBuff() {
		CFBamUInt32ColHBuff hbuff =
			new CFBamUInt32ColHBuff();
		return( hbuff );
	}
}
