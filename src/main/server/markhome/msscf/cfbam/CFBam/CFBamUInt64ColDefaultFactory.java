
// Description: Java 11 Default Factory implementation for UInt64Col.

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
	 *	CFBamUInt64ColFactory implementation for UInt64Col
	 */
public class CFBamUInt64ColDefaultFactory
	implements ICFBamUInt64ColFactory
{
	public CFBamUInt64ColDefaultFactory() {
	}

	public CFBamUInt64ColByTableIdxKey newTableIdxKey() {
		CFBamUInt64ColByTableIdxKey key =
			new CFBamUInt64ColByTableIdxKey();
		return( key );
	}

	public CFBamUInt64ColBuff newBuff() {
		CFBamUInt64ColBuff buff =
			new CFBamUInt64ColBuff();
		return( buff );
	}

	public CFBamUInt64ColHBuff newHBuff() {
		CFBamUInt64ColHBuff hbuff =
			new CFBamUInt64ColHBuff();
		return( hbuff );
	}
}
