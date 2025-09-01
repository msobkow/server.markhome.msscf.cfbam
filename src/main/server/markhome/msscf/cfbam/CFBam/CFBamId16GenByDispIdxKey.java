// Description: Java 11 implementation of a Id16Gen by DispIdx index key object.

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
import java.math.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;

public class CFBamId16GenByDispIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected Long optionalDispenserTenantId;
	protected Long optionalDispenserId;
	public CFBamId16GenByDispIdxKey() {
		optionalDispenserTenantId = null;
		optionalDispenserId = null;
	}

	public Long getOptionalDispenserTenantId() {
		return( optionalDispenserTenantId );
	}

	public void setOptionalDispenserTenantId( Long value ) {
		if( value == null ) {
			optionalDispenserTenantId = null;
		}
		else if( value < CFBamId16GenBuff.DISPENSERTENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalDispenserTenantId",
				1,
				"value",
				value,
				CFBamId16GenBuff.DISPENSERTENANTID_MIN_VALUE );
		}
		else {
			optionalDispenserTenantId = value;
		}
	}

	public Long getOptionalDispenserId() {
		return( optionalDispenserId );
	}

	public void setOptionalDispenserId( Long value ) {
		if( value == null ) {
			optionalDispenserId = null;
		}
		else if( value < CFBamId16GenBuff.DISPENSERID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalDispenserId",
				1,
				"value",
				value,
				CFBamId16GenBuff.DISPENSERID_MIN_VALUE );
		}
		else {
			optionalDispenserId = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFBamId16GenByDispIdxKey ) {
			CFBamId16GenByDispIdxKey rhs = (CFBamId16GenByDispIdxKey)obj;
			if( getOptionalDispenserTenantId() != null ) {
				if( rhs.getOptionalDispenserTenantId() != null ) {
					if( ! getOptionalDispenserTenantId().equals( rhs.getOptionalDispenserTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalDispenserTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalDispenserId() != null ) {
				if( rhs.getOptionalDispenserId() != null ) {
					if( ! getOptionalDispenserId().equals( rhs.getOptionalDispenserId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalDispenserId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof CFBamId16GenBuff ) {
			CFBamId16GenBuff rhs = (CFBamId16GenBuff)obj;
			if( getOptionalDispenserTenantId() != null ) {
				if( rhs.getOptionalDispenserTenantId() != null ) {
					if( ! getOptionalDispenserTenantId().equals( rhs.getOptionalDispenserTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalDispenserTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalDispenserId() != null ) {
				if( rhs.getOptionalDispenserId() != null ) {
					if( ! getOptionalDispenserId().equals( rhs.getOptionalDispenserId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalDispenserId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else {
			return( false );
		}
	}

	public int hashCode() {
		int hashCode = 0;
		if( getOptionalDispenserTenantId() != null ) {
			hashCode = hashCode + getOptionalDispenserTenantId().hashCode();
		}
		if( getOptionalDispenserId() != null ) {
			hashCode = hashCode + getOptionalDispenserId().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFBamId16GenByDispIdxKey ) {
			CFBamId16GenByDispIdxKey rhs = (CFBamId16GenByDispIdxKey)obj;
			if( getOptionalDispenserTenantId() != null ) {
				Long lhsDispenserTenantId = getOptionalDispenserTenantId();
				if( rhs.getOptionalDispenserTenantId() != null ) {
					Long rhsDispenserTenantId = rhs.getOptionalDispenserTenantId();
					int cmp = lhsDispenserTenantId.compareTo( rhsDispenserTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDispenserTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalDispenserId() != null ) {
				Long lhsDispenserId = getOptionalDispenserId();
				if( rhs.getOptionalDispenserId() != null ) {
					Long rhsDispenserId = rhs.getOptionalDispenserId();
					int cmp = lhsDispenserId.compareTo( rhsDispenserId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDispenserId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFBamId16GenBuff ) {
			CFBamId16GenBuff rhs = (CFBamId16GenBuff)obj;
			if( getOptionalDispenserTenantId() != null ) {
				Long lhsDispenserTenantId = getOptionalDispenserTenantId();
				if( rhs.getOptionalDispenserTenantId() != null ) {
					Long rhsDispenserTenantId = rhs.getOptionalDispenserTenantId();
					int cmp = lhsDispenserTenantId.compareTo( rhsDispenserTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDispenserTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalDispenserId() != null ) {
				Long lhsDispenserId = getOptionalDispenserId();
				if( rhs.getOptionalDispenserId() != null ) {
					Long rhsDispenserId = rhs.getOptionalDispenserId();
					int cmp = lhsDispenserId.compareTo( rhsDispenserId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDispenserId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				null );
		}
	}

	public String toString() {
		String ret = "<CFBamId16GenByDispIdx"
			+ " OptionalDispenserTenantId=" + ( ( getOptionalDispenserTenantId() == null ) ? "null" : "\"" + getOptionalDispenserTenantId().toString() + "\"" )
			+ " OptionalDispenserId=" + ( ( getOptionalDispenserId() == null ) ? "null" : "\"" + getOptionalDispenserId().toString() + "\"" )
			+ "/>";
		return( ret );
	}
}
