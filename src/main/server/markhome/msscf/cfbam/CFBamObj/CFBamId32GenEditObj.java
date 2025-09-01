// Description: Java 11 edit object instance implementation for CFBam Id32Gen.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBam.*;

public class CFBamId32GenEditObj
	extends CFBamInt32TypeEditObj

	implements ICFBamId32GenEditObj
{
	protected ICFBamTableObj optionalLookupDispenser;

	public CFBamId32GenEditObj( ICFBamId32GenObj argOrig ) {
		super( argOrig );
		optionalLookupDispenser = null;
	}

	public String getClassCode() {
		return( CFBamId32GenObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "Id32Gen" );
	}

	public ICFLibAnyObj getScope() {
		return( super.getScope() );
	}

	public ICFLibAnyObj getObjScope() {
		return( super.getObjScope() );
	}

	public String getObjName() {
		String objName;
		objName = getRequiredName();
		return( objName );
	}

	public ICFLibAnyObj getObjQualifier( Class qualifyingClass ) {
		ICFLibAnyObj container = this;
		if( qualifyingClass != null ) {
			while( container != null ) {
				if( container instanceof ICFBamClusterObj ) {
					break;
				}
				else if( container instanceof ICFBamTenantObj ) {
					break;
				}
				else if( qualifyingClass.isInstance( container ) ) {
					break;
				}
				container = container.getObjScope();
			}
		}
		else {
			while( container != null ) {
				if( container instanceof ICFBamClusterObj ) {
					break;
				}
				else if( container instanceof ICFBamTenantObj ) {
					break;
				}
				container = container.getObjScope();
			}
		}
		return( container );
	}

	public ICFLibAnyObj getNamedObject( String objName ) {
		String nextName;
		String remainingName;
		ICFLibAnyObj subObj = null;
		ICFLibAnyObj retObj;
		int nextDot = objName.indexOf( '.' );
		if( nextDot >= 0 ) {
			nextName = objName.substring( 0, nextDot );
			remainingName = objName.substring( nextDot + 1 );
		}
		else {
			nextName = objName;
			remainingName = null;
		}
		if( remainingName == null ) {
			retObj = subObj;
		}
		else if( subObj == null ) {
			retObj = null;
		}
		else {
			retObj = subObj.getNamedObject( remainingName );
		}
		return( retObj );
	}

	public String getObjQualifiedName() {
		String qualName = getObjName();
		ICFLibAnyObj container = getObjScope();
		String containerName;
		while( container != null ) {
			if( container instanceof ICFSecClusterObj ) {
				container = null;
			}
			else if( container instanceof ICFSecTenantObj ) {
				container = null;
			}
			else if( container instanceof ICFBamSchemaDefObj ) {
				container = null;
			}
			else {
				containerName = container.getObjName();
				qualName = containerName + "." + qualName;
				container = container.getObjScope();
			}
		}
		return( qualName );
	}

	public ICFBamValueObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		ICFBamId32GenObj retobj = getSchema().getId32GenTableObj().realiseId32Gen( (ICFBamId32GenObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsId32Gen().forget();
	}

	public ICFBamValueObj moveUp() {
		throw new CFLibUsageException( getClass(),
			"moveUp",
			"You cannot move an edited object in the chain" );
	}

	public ICFBamValueObj moveDown() {
		throw new CFLibUsageException( getClass(),
			"moveDown",
			"You cannot move an edited object in the chain" );
	}

	public ICFBamValueObj create() {
		copyBuffToOrig();
		ICFBamId32GenObj retobj = ((ICFBamSchemaObj)getOrigAsId32Gen().getSchema()).getId32GenTableObj().createId32Gen( getOrigAsId32Gen() );
		if( retobj == getOrigAsId32Gen() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamValueEditObj update() {
		getSchema().getId32GenTableObj().updateId32Gen( (ICFBamId32GenObj)this );
		return( null );
	}

	public CFBamValueEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getId32GenTableObj().deleteId32Gen( getOrigAsId32Gen() );
		return( null );
	}

	public ICFBamId32GenTableObj getId32GenTable() {
		return( orig.getSchema().getId32GenTableObj() );
	}

	public ICFBamId32GenEditObj getEditAsId32Gen() {
		return( (ICFBamId32GenEditObj)this );
	}

	public ICFBamId32GenObj getOrigAsId32Gen() {
		return( (ICFBamId32GenObj)orig );
	}

	public CFBamValueBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsId32Gen().getSchema().getBackingStore()).getFactoryId32Gen().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFBamValueBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			optionalLookupDispenser = null;
		}
	}

	public CFBamId32GenBuff getId32GenBuff() {
		return( (CFBamId32GenBuff)getBuff() );
	}

	public Long getOptionalDispenserTenantId() {
		return( getId32GenBuff().getOptionalDispenserTenantId() );
	}

	public Long getOptionalDispenserId() {
		return( getId32GenBuff().getOptionalDispenserId() );
	}

	public short getRequiredSlice() {
		return( getId32GenBuff().getRequiredSlice() );
	}

	public void setRequiredSlice( short value ) {
		if( getId32GenBuff().getRequiredSlice() != value ) {
			getId32GenBuff().setRequiredSlice( value );
		}
	}

	public int getRequiredBlockSize() {
		return( getId32GenBuff().getRequiredBlockSize() );
	}

	public void setRequiredBlockSize( int value ) {
		if( getId32GenBuff().getRequiredBlockSize() != value ) {
			getId32GenBuff().setRequiredBlockSize( value );
		}
	}

	public ICFBamTableObj getOptionalLookupDispenser() {
		return( getOptionalLookupDispenser( false ) );
	}

	public ICFBamTableObj getOptionalLookupDispenser( boolean forceRead ) {
		if( forceRead || ( optionalLookupDispenser == null ) ) {
			boolean anyMissing = false;
			if( getId32GenBuff().getOptionalDispenserTenantId() == null ) {
				anyMissing = true;
			}
			if( getId32GenBuff().getOptionalDispenserId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				ICFBamTableObj obj = ((ICFBamSchemaObj)getOrigAsId32Gen().getSchema()).getTableTableObj().readTableByIdIdx( getId32GenBuff().getOptionalDispenserTenantId(),
					getId32GenBuff().getOptionalDispenserId() );
				optionalLookupDispenser = obj;
			}
		}
		return( optionalLookupDispenser );
	}

	public void setOptionalLookupDispenser( ICFBamTableObj value ) {
			if( buff == null ) {
				getId32GenBuff();
			}
			if( value != null ) {
				getId32GenBuff().setOptionalDispenserTenantId( value.getRequiredTenantId() );
				getId32GenBuff().setOptionalDispenserId( value.getRequiredId() );
			}
			else {
				getId32GenBuff().setOptionalDispenserTenantId( null );
				getId32GenBuff().setOptionalDispenserId( null );
			}
			optionalLookupDispenser = value;
	}

	public void copyBuffToOrig() {
		CFBamId32GenBuff origBuff = getOrigAsId32Gen().getId32GenBuff();
		CFBamId32GenBuff myBuff = getId32GenBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamId32GenBuff origBuff = getOrigAsId32Gen().getId32GenBuff();
		CFBamId32GenBuff myBuff = getId32GenBuff();
		myBuff.set( origBuff );
	}
}
