// Description: Java 11 CFBam Authorization Interface.

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
import java.io.*;
import java.net.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfbam.CFBamObj.ICFBamClusterObj;
import server.markhome.msscf.cfbam.CFBamObj.ICFBamTenantObj;
import server.markhome.msscf.cfbam.CFBamObj.ICFBamSecSessionObj;

/*
 *	A CFBamAuthorization is an authorization ticket
 *	for the system providing services.  For example, a
 *	database layer implements an Authorization that
 *	resolves a database connection (which may be under the
 *	control of an active cursor).
 */
public class CFBamAuthorization
	extends CFSecAuthorization
	implements Serializable
{
	public CFBamAuthorization() {
		super();
	}
}
