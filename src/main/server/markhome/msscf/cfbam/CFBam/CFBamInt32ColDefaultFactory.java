
// Description: Java 11 Default Factory implementation for Int32Col.

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
	 *	CFBamInt32ColFactory implementation for Int32Col
	 */
public class CFBamInt32ColDefaultFactory
	implements ICFBamInt32ColFactory
{
	public CFBamInt32ColDefaultFactory() {
	}

	public CFBamInt32ColByTableIdxKey newTableIdxKey() {
		CFBamInt32ColByTableIdxKey key =
			new CFBamInt32ColByTableIdxKey();
		return( key );
	}

	public CFBamInt32ColBuff newBuff() {
		CFBamInt32ColBuff buff =
			new CFBamInt32ColBuff();
		return( buff );
	}

	public CFBamInt32ColHBuff newHBuff() {
		CFBamInt32ColHBuff hbuff =
			new CFBamInt32ColHBuff();
		return( hbuff );
	}
}
