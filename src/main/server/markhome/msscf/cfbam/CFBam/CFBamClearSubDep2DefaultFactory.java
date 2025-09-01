
// Description: Java 11 Default Factory implementation for ClearSubDep2.

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
	 *	CFBamClearSubDep2Factory implementation for ClearSubDep2
	 */
public class CFBamClearSubDep2DefaultFactory
	implements ICFBamClearSubDep2Factory
{
	public CFBamClearSubDep2DefaultFactory() {
	}

	public CFBamClearSubDep2ByClearSubDep1IdxKey newClearSubDep1IdxKey() {
		CFBamClearSubDep2ByClearSubDep1IdxKey key =
			new CFBamClearSubDep2ByClearSubDep1IdxKey();
		return( key );
	}

	public CFBamClearSubDep2ByUNameIdxKey newUNameIdxKey() {
		CFBamClearSubDep2ByUNameIdxKey key =
			new CFBamClearSubDep2ByUNameIdxKey();
		return( key );
	}

	public CFBamClearSubDep2Buff newBuff() {
		CFBamClearSubDep2Buff buff =
			new CFBamClearSubDep2Buff();
		return( buff );
	}

	public CFBamClearSubDep2HBuff newHBuff() {
		CFBamClearSubDep2HBuff hbuff =
			new CFBamClearSubDep2HBuff();
		return( hbuff );
	}
}
