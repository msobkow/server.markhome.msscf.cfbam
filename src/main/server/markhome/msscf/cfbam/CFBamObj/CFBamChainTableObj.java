// Description: Java 11 Table Object implementation for CFBam.

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

public class CFBamChainTableObj
	implements ICFBamChainTableObj
{
	protected ICFBamSchemaObj schema;
	private Map<CFBamChainPKey, ICFBamChainObj> members;
	private Map<CFBamChainPKey, ICFBamChainObj> allChain;
	private Map< CFBamChainByTenantIdxKey,
		Map<CFBamChainPKey, ICFBamChainObj > > indexByTenantIdx;
	private Map< CFBamChainByChainTableIdxKey,
		Map<CFBamChainPKey, ICFBamChainObj > > indexByChainTableIdx;
	private Map< CFBamChainByDefSchemaIdxKey,
		Map<CFBamChainPKey, ICFBamChainObj > > indexByDefSchemaIdx;
	private Map< CFBamChainByUNameIdxKey,
		ICFBamChainObj > indexByUNameIdx;
	private Map< CFBamChainByPrevRelIdxKey,
		Map<CFBamChainPKey, ICFBamChainObj > > indexByPrevRelIdx;
	private Map< CFBamChainByNextRelIdxKey,
		Map<CFBamChainPKey, ICFBamChainObj > > indexByNextRelIdx;
	public static String TABLE_NAME = "Chain";
	public static String TABLE_DBNAME = "chain_def";

	public CFBamChainTableObj() {
		schema = null;
		members = new HashMap<CFBamChainPKey, ICFBamChainObj>();
		allChain = null;
		indexByTenantIdx = null;
		indexByChainTableIdx = null;
		indexByDefSchemaIdx = null;
		indexByUNameIdx = null;
		indexByPrevRelIdx = null;
		indexByNextRelIdx = null;
	}

	public CFBamChainTableObj( ICFBamSchemaObj argSchema ) {
		schema = (ICFBamSchemaObj)argSchema;
		members = new HashMap<CFBamChainPKey, ICFBamChainObj>();
		allChain = null;
		indexByTenantIdx = null;
		indexByChainTableIdx = null;
		indexByDefSchemaIdx = null;
		indexByUNameIdx = null;
		indexByPrevRelIdx = null;
		indexByNextRelIdx = null;
	}

	public ICFBamSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( ICFBamSchemaObj value ) {
		schema = (ICFBamSchemaObj)value;
	}

	public String getTableName() {
		return( TABLE_NAME );
	}

	public String getTableDbName() {
		return( TABLE_DBNAME );
	}

	public Class getObjQualifyingClass() {
		return( ICFBamSchemaDefObj.class );
	}


	public void minimizeMemory() {
		allChain = null;
		indexByTenantIdx = null;
		indexByChainTableIdx = null;
		indexByDefSchemaIdx = null;
		indexByUNameIdx = null;
		indexByPrevRelIdx = null;
		indexByNextRelIdx = null;
		List<ICFBamChainObj> toForget = new LinkedList<ICFBamChainObj>();
		ICFBamChainObj cur = null;
		Iterator<ICFBamChainObj> iter = members.values().iterator();
		while( iter.hasNext() ) {
			cur = iter.next();
			toForget.add( cur );
		}
		iter = toForget.iterator();
		while( iter.hasNext() ) {
			cur = iter.next();
			cur.forget();
		}
	}
	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFBamChainObj.
	 */
	public ICFBamChainObj newInstance() {
		ICFBamChainObj inst = new CFBamChainObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFBamChainObj.
	 */
	public ICFBamChainEditObj newEditInstance( ICFBamChainObj orig ) {
		ICFBamChainEditObj edit = new CFBamChainEditObj( orig );
		return( edit );
	}

	public ICFBamChainObj realiseChain( ICFBamChainObj Obj ) {
		ICFBamChainObj obj = Obj;
		CFBamChainPKey pkey = obj.getPKey();
		ICFBamChainObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFBamChainObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				CFBamChainByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamChainPKey, ICFBamChainObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.remove( keepObj.getPKey() );
					if( mapTenantIdx.size() <= 0 ) {
						indexByTenantIdx.remove( keyTenantIdx );
					}
				}
			}

			if( indexByChainTableIdx != null ) {
				CFBamChainByChainTableIdxKey keyChainTableIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newChainTableIdxKey();
				keyChainTableIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyChainTableIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<CFBamChainPKey, ICFBamChainObj > mapChainTableIdx = indexByChainTableIdx.get( keyChainTableIdx );
				if( mapChainTableIdx != null ) {
					mapChainTableIdx.remove( keepObj.getPKey() );
					if( mapChainTableIdx.size() <= 0 ) {
						indexByChainTableIdx.remove( keyChainTableIdx );
					}
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamChainByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamChainPKey, ICFBamChainObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.remove( keepObj.getPKey() );
					if( mapDefSchemaIdx.size() <= 0 ) {
						indexByDefSchemaIdx.remove( keyDefSchemaIdx );
					}
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamChainByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			if( indexByPrevRelIdx != null ) {
				CFBamChainByPrevRelIdxKey keyPrevRelIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newPrevRelIdxKey();
				keyPrevRelIdx.setRequiredPrevRelationTenantId( keepObj.getRequiredPrevRelationTenantId() );
				keyPrevRelIdx.setRequiredPrevRelationId( keepObj.getRequiredPrevRelationId() );
				Map<CFBamChainPKey, ICFBamChainObj > mapPrevRelIdx = indexByPrevRelIdx.get( keyPrevRelIdx );
				if( mapPrevRelIdx != null ) {
					mapPrevRelIdx.remove( keepObj.getPKey() );
					if( mapPrevRelIdx.size() <= 0 ) {
						indexByPrevRelIdx.remove( keyPrevRelIdx );
					}
				}
			}

			if( indexByNextRelIdx != null ) {
				CFBamChainByNextRelIdxKey keyNextRelIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newNextRelIdxKey();
				keyNextRelIdx.setRequiredNextRelationTenantId( keepObj.getRequiredNextRelationTenantId() );
				keyNextRelIdx.setRequiredNextRelationId( keepObj.getRequiredNextRelationId() );
				Map<CFBamChainPKey, ICFBamChainObj > mapNextRelIdx = indexByNextRelIdx.get( keyNextRelIdx );
				if( mapNextRelIdx != null ) {
					mapNextRelIdx.remove( keepObj.getPKey() );
					if( mapNextRelIdx.size() <= 0 ) {
						indexByNextRelIdx.remove( keyNextRelIdx );
					}
				}
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				CFBamChainByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamChainPKey, ICFBamChainObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByChainTableIdx != null ) {
				CFBamChainByChainTableIdxKey keyChainTableIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newChainTableIdxKey();
				keyChainTableIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyChainTableIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<CFBamChainPKey, ICFBamChainObj > mapChainTableIdx = indexByChainTableIdx.get( keyChainTableIdx );
				if( mapChainTableIdx != null ) {
					mapChainTableIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamChainByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamChainPKey, ICFBamChainObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamChainByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByPrevRelIdx != null ) {
				CFBamChainByPrevRelIdxKey keyPrevRelIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newPrevRelIdxKey();
				keyPrevRelIdx.setRequiredPrevRelationTenantId( keepObj.getRequiredPrevRelationTenantId() );
				keyPrevRelIdx.setRequiredPrevRelationId( keepObj.getRequiredPrevRelationId() );
				Map<CFBamChainPKey, ICFBamChainObj > mapPrevRelIdx = indexByPrevRelIdx.get( keyPrevRelIdx );
				if( mapPrevRelIdx != null ) {
					mapPrevRelIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNextRelIdx != null ) {
				CFBamChainByNextRelIdxKey keyNextRelIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newNextRelIdxKey();
				keyNextRelIdx.setRequiredNextRelationTenantId( keepObj.getRequiredNextRelationTenantId() );
				keyNextRelIdx.setRequiredNextRelationId( keepObj.getRequiredNextRelationId() );
				Map<CFBamChainPKey, ICFBamChainObj > mapNextRelIdx = indexByNextRelIdx.get( keyNextRelIdx );
				if( mapNextRelIdx != null ) {
					mapNextRelIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allChain != null ) {
				allChain.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allChain != null ) {
				allChain.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				CFBamChainByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamChainPKey, ICFBamChainObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByChainTableIdx != null ) {
				CFBamChainByChainTableIdxKey keyChainTableIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newChainTableIdxKey();
				keyChainTableIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyChainTableIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				Map<CFBamChainPKey, ICFBamChainObj > mapChainTableIdx = indexByChainTableIdx.get( keyChainTableIdx );
				if( mapChainTableIdx != null ) {
					mapChainTableIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamChainByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamChainPKey, ICFBamChainObj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamChainByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newUNameIdxKey();
				keyUNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUNameIdx.setRequiredTableId( keepObj.getRequiredTableId() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( indexByPrevRelIdx != null ) {
				CFBamChainByPrevRelIdxKey keyPrevRelIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newPrevRelIdxKey();
				keyPrevRelIdx.setRequiredPrevRelationTenantId( keepObj.getRequiredPrevRelationTenantId() );
				keyPrevRelIdx.setRequiredPrevRelationId( keepObj.getRequiredPrevRelationId() );
				Map<CFBamChainPKey, ICFBamChainObj > mapPrevRelIdx = indexByPrevRelIdx.get( keyPrevRelIdx );
				if( mapPrevRelIdx != null ) {
					mapPrevRelIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNextRelIdx != null ) {
				CFBamChainByNextRelIdxKey keyNextRelIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newNextRelIdxKey();
				keyNextRelIdx.setRequiredNextRelationTenantId( keepObj.getRequiredNextRelationTenantId() );
				keyNextRelIdx.setRequiredNextRelationId( keepObj.getRequiredNextRelationId() );
				Map<CFBamChainPKey, ICFBamChainObj > mapNextRelIdx = indexByNextRelIdx.get( keyNextRelIdx );
				if( mapNextRelIdx != null ) {
					mapNextRelIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public ICFBamChainObj createChain( ICFBamChainObj Obj ) {
		ICFBamChainObj obj = Obj;
		CFBamChainBuff buff = obj.getChainBuff();
		((ICFBamSchema)schema.getBackingStore()).getTableChain().createChain(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public ICFBamChainObj readChain( CFBamChainPKey pkey ) {
		return( readChain( pkey, false ) );
	}

	public ICFBamChainObj readChain( CFBamChainPKey pkey, boolean forceRead ) {
		ICFBamChainObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFBamChainBuff readBuff = ((ICFBamSchema)schema.getBackingStore()).getTableChain().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = schema.getChainTableObj().newInstance();
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFBamChainObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFBamChainObj readCachedChain( CFBamChainPKey pkey ) {
		ICFBamChainObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeChain( ICFBamChainObj obj )
	{
		final String S_ProcName = "CFBamChainTableObj.reallyDeepDisposeChain() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFBamChainPKey pkey = obj.getPKey();
		ICFBamChainObj existing = readCachedChain( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFBamChainByTenantIdxKey keyTenantIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		CFBamChainByChainTableIdxKey keyChainTableIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newChainTableIdxKey();
		keyChainTableIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyChainTableIdx.setRequiredTableId( existing.getRequiredTableId() );

		CFBamChainByDefSchemaIdxKey keyDefSchemaIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );

		CFBamChainByUNameIdxKey keyUNameIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUNameIdx.setRequiredTableId( existing.getRequiredTableId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		CFBamChainByPrevRelIdxKey keyPrevRelIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newPrevRelIdxKey();
		keyPrevRelIdx.setRequiredPrevRelationTenantId( existing.getRequiredPrevRelationTenantId() );
		keyPrevRelIdx.setRequiredPrevRelationId( existing.getRequiredPrevRelationId() );

		CFBamChainByNextRelIdxKey keyNextRelIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newNextRelIdxKey();
		keyNextRelIdx.setRequiredNextRelationTenantId( existing.getRequiredNextRelationTenantId() );
		keyNextRelIdx.setRequiredNextRelationId( existing.getRequiredNextRelationId() );



		if( indexByTenantIdx != null ) {
			if( indexByTenantIdx.containsKey( keyTenantIdx ) ) {
				indexByTenantIdx.get( keyTenantIdx ).remove( pkey );
				if( indexByTenantIdx.get( keyTenantIdx ).size() <= 0 ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}
		}

		if( indexByChainTableIdx != null ) {
			if( indexByChainTableIdx.containsKey( keyChainTableIdx ) ) {
				indexByChainTableIdx.get( keyChainTableIdx ).remove( pkey );
				if( indexByChainTableIdx.get( keyChainTableIdx ).size() <= 0 ) {
					indexByChainTableIdx.remove( keyChainTableIdx );
				}
			}
		}

		if( indexByDefSchemaIdx != null ) {
			if( indexByDefSchemaIdx.containsKey( keyDefSchemaIdx ) ) {
				indexByDefSchemaIdx.get( keyDefSchemaIdx ).remove( pkey );
				if( indexByDefSchemaIdx.get( keyDefSchemaIdx ).size() <= 0 ) {
					indexByDefSchemaIdx.remove( keyDefSchemaIdx );
				}
			}
		}

		if( indexByUNameIdx != null ) {
			indexByUNameIdx.remove( keyUNameIdx );
		}

		if( indexByPrevRelIdx != null ) {
			if( indexByPrevRelIdx.containsKey( keyPrevRelIdx ) ) {
				indexByPrevRelIdx.get( keyPrevRelIdx ).remove( pkey );
				if( indexByPrevRelIdx.get( keyPrevRelIdx ).size() <= 0 ) {
					indexByPrevRelIdx.remove( keyPrevRelIdx );
				}
			}
		}

		if( indexByNextRelIdx != null ) {
			if( indexByNextRelIdx.containsKey( keyNextRelIdx ) ) {
				indexByNextRelIdx.get( keyNextRelIdx ).remove( pkey );
				if( indexByNextRelIdx.get( keyNextRelIdx ).size() <= 0 ) {
					indexByNextRelIdx.remove( keyNextRelIdx );
				}
			}
		}


	}
	public void deepDisposeChain( CFBamChainPKey pkey ) {
		ICFBamChainObj obj = readCachedChain( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFBamChainObj lockChain( CFBamChainPKey pkey ) {
		ICFBamChainObj locked = null;
		CFBamChainBuff lockBuff = ((ICFBamSchema)schema.getBackingStore()).getTableChain().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getChainTableObj().newInstance();
			locked.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFBamChainObj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockChain", pkey );
		}
		return( locked );
	}

	public List<ICFBamChainObj> readAllChain() {
		return( readAllChain( false ) );
	}

	public List<ICFBamChainObj> readAllChain( boolean forceRead ) {
		final String S_ProcName = "readAllChain";
		if( ( allChain == null ) || forceRead ) {
			Map<CFBamChainPKey, ICFBamChainObj> map = new HashMap<CFBamChainPKey,ICFBamChainObj>();
			allChain = map;
			CFBamChainBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableChain().readAllDerived( schema.getAuthorization() );
			CFBamChainBuff buff;
			ICFBamChainObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newPKey() );
				obj.setBuff( buff );
				ICFBamChainObj realised = (ICFBamChainObj)obj.realise();
			}
		}
		int len = allChain.size();
		ICFBamChainObj arr[] = new ICFBamChainObj[len];
		Iterator<ICFBamChainObj> valIter = allChain.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamChainObj> arrayList = new ArrayList<ICFBamChainObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamChainObj> cmp = new Comparator<ICFBamChainObj>() {
			public int compare( ICFBamChainObj lhs, ICFBamChainObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamChainPKey lhsPKey = lhs.getPKey();
					CFBamChainPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamChainObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamChainObj> readCachedAllChain() {
		final String S_ProcName = "readCachedAllChain";
		ArrayList<ICFBamChainObj> arrayList = new ArrayList<ICFBamChainObj>();
		if( allChain != null ) {
			int len = allChain.size();
			ICFBamChainObj arr[] = new ICFBamChainObj[len];
			Iterator<ICFBamChainObj> valIter = allChain.values().iterator();
			int idx = 0;
			while( ( idx < len ) && valIter.hasNext() ) {
				arr[idx++] = valIter.next();
			}
			if( idx < len ) {
				throw new CFLibArgumentUnderflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
			}
			else if( valIter.hasNext() ) {
				throw new CFLibArgumentOverflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
			}
			for( idx = 0; idx < len; idx ++ ) {
				arrayList.add( arr[idx] );
			}
		}
		Comparator<ICFBamChainObj> cmp = new Comparator<ICFBamChainObj>() {
			public int compare( ICFBamChainObj lhs, ICFBamChainObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamChainPKey lhsPKey = lhs.getPKey();
					CFBamChainPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFBamChainObj readChainByIdIdx( long TenantId,
		long Id )
	{
		return( readChainByIdIdx( TenantId,
			Id,
			false ) );
	}

	public ICFBamChainObj readChainByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		CFBamChainPKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamChainObj obj = readChain( pkey, forceRead );
		return( obj );
	}

	public List<ICFBamChainObj> readChainByTenantIdx( long TenantId )
	{
		return( readChainByTenantIdx( TenantId,
			false ) );
	}

	public List<ICFBamChainObj> readChainByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readChainByTenantIdx";
		CFBamChainByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<CFBamChainPKey, ICFBamChainObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFBamChainByTenantIdxKey,
				Map< CFBamChainPKey, ICFBamChainObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamChainPKey, ICFBamChainObj>();
			ICFBamChainObj obj;
			CFBamChainBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableChain().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			CFBamChainBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getChainTableObj().newInstance();
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newPKey() );
				obj.setBuff( buff );
				ICFBamChainObj realised = (ICFBamChainObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamChainObj arr[] = new ICFBamChainObj[len];
		Iterator<ICFBamChainObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamChainObj> arrayList = new ArrayList<ICFBamChainObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamChainObj> cmp = new Comparator<ICFBamChainObj>() {
			public int compare( ICFBamChainObj lhs, ICFBamChainObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamChainPKey lhsPKey = lhs.getPKey();
					CFBamChainPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamChainObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamChainObj> readChainByChainTableIdx( long TenantId,
		long TableId )
	{
		return( readChainByChainTableIdx( TenantId,
			TableId,
			false ) );
	}

	public List<ICFBamChainObj> readChainByChainTableIdx( long TenantId,
		long TableId,
		boolean forceRead )
	{
		final String S_ProcName = "readChainByChainTableIdx";
		CFBamChainByChainTableIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newChainTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		Map<CFBamChainPKey, ICFBamChainObj> dict;
		if( indexByChainTableIdx == null ) {
			indexByChainTableIdx = new HashMap< CFBamChainByChainTableIdxKey,
				Map< CFBamChainPKey, ICFBamChainObj > >();
		}
		if( ( ! forceRead ) && indexByChainTableIdx.containsKey( key ) ) {
			dict = indexByChainTableIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamChainPKey, ICFBamChainObj>();
			ICFBamChainObj obj;
			CFBamChainBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableChain().readDerivedByChainTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
			CFBamChainBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getChainTableObj().newInstance();
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newPKey() );
				obj.setBuff( buff );
				ICFBamChainObj realised = (ICFBamChainObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByChainTableIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamChainObj arr[] = new ICFBamChainObj[len];
		Iterator<ICFBamChainObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamChainObj> arrayList = new ArrayList<ICFBamChainObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamChainObj> cmp = new Comparator<ICFBamChainObj>() {
			public int compare( ICFBamChainObj lhs, ICFBamChainObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamChainPKey lhsPKey = lhs.getPKey();
					CFBamChainPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamChainObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamChainObj> readChainByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readChainByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<ICFBamChainObj> readChainByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readChainByDefSchemaIdx";
		CFBamChainByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<CFBamChainPKey, ICFBamChainObj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< CFBamChainByDefSchemaIdxKey,
				Map< CFBamChainPKey, ICFBamChainObj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamChainPKey, ICFBamChainObj>();
			ICFBamChainObj obj;
			CFBamChainBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableChain().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			CFBamChainBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getChainTableObj().newInstance();
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newPKey() );
				obj.setBuff( buff );
				ICFBamChainObj realised = (ICFBamChainObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamChainObj arr[] = new ICFBamChainObj[len];
		Iterator<ICFBamChainObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamChainObj> arrayList = new ArrayList<ICFBamChainObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamChainObj> cmp = new Comparator<ICFBamChainObj>() {
			public int compare( ICFBamChainObj lhs, ICFBamChainObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamChainPKey lhsPKey = lhs.getPKey();
					CFBamChainPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamChainObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFBamChainObj readChainByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		return( readChainByUNameIdx( TenantId,
			TableId,
			Name,
			false ) );
	}

	public ICFBamChainObj readChainByUNameIdx( long TenantId,
		long TableId,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< CFBamChainByUNameIdxKey,
				ICFBamChainObj >();
		}
		CFBamChainByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		ICFBamChainObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			CFBamChainBuff buff = ((ICFBamSchema)schema.getBackingStore()).getTableChain().readDerivedByUNameIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				Name );
			if( buff != null ) {
				obj = schema.getChainTableObj().newInstance();
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newPKey() );
				obj.setBuff( buff );
				obj = (ICFBamChainObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<ICFBamChainObj> readChainByPrevRelIdx( long PrevRelationTenantId,
		long PrevRelationId )
	{
		return( readChainByPrevRelIdx( PrevRelationTenantId,
			PrevRelationId,
			false ) );
	}

	public List<ICFBamChainObj> readChainByPrevRelIdx( long PrevRelationTenantId,
		long PrevRelationId,
		boolean forceRead )
	{
		final String S_ProcName = "readChainByPrevRelIdx";
		CFBamChainByPrevRelIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newPrevRelIdxKey();
		key.setRequiredPrevRelationTenantId( PrevRelationTenantId );
		key.setRequiredPrevRelationId( PrevRelationId );
		Map<CFBamChainPKey, ICFBamChainObj> dict;
		if( indexByPrevRelIdx == null ) {
			indexByPrevRelIdx = new HashMap< CFBamChainByPrevRelIdxKey,
				Map< CFBamChainPKey, ICFBamChainObj > >();
		}
		if( ( ! forceRead ) && indexByPrevRelIdx.containsKey( key ) ) {
			dict = indexByPrevRelIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamChainPKey, ICFBamChainObj>();
			ICFBamChainObj obj;
			CFBamChainBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableChain().readDerivedByPrevRelIdx( schema.getAuthorization(),
				PrevRelationTenantId,
				PrevRelationId );
			CFBamChainBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getChainTableObj().newInstance();
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newPKey() );
				obj.setBuff( buff );
				ICFBamChainObj realised = (ICFBamChainObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByPrevRelIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamChainObj arr[] = new ICFBamChainObj[len];
		Iterator<ICFBamChainObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamChainObj> arrayList = new ArrayList<ICFBamChainObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamChainObj> cmp = new Comparator<ICFBamChainObj>() {
			public int compare( ICFBamChainObj lhs, ICFBamChainObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamChainPKey lhsPKey = lhs.getPKey();
					CFBamChainPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamChainObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamChainObj> readChainByNextRelIdx( long NextRelationTenantId,
		long NextRelationId )
	{
		return( readChainByNextRelIdx( NextRelationTenantId,
			NextRelationId,
			false ) );
	}

	public List<ICFBamChainObj> readChainByNextRelIdx( long NextRelationTenantId,
		long NextRelationId,
		boolean forceRead )
	{
		final String S_ProcName = "readChainByNextRelIdx";
		CFBamChainByNextRelIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newNextRelIdxKey();
		key.setRequiredNextRelationTenantId( NextRelationTenantId );
		key.setRequiredNextRelationId( NextRelationId );
		Map<CFBamChainPKey, ICFBamChainObj> dict;
		if( indexByNextRelIdx == null ) {
			indexByNextRelIdx = new HashMap< CFBamChainByNextRelIdxKey,
				Map< CFBamChainPKey, ICFBamChainObj > >();
		}
		if( ( ! forceRead ) && indexByNextRelIdx.containsKey( key ) ) {
			dict = indexByNextRelIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamChainPKey, ICFBamChainObj>();
			ICFBamChainObj obj;
			CFBamChainBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableChain().readDerivedByNextRelIdx( schema.getAuthorization(),
				NextRelationTenantId,
				NextRelationId );
			CFBamChainBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getChainTableObj().newInstance();
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newPKey() );
				obj.setBuff( buff );
				ICFBamChainObj realised = (ICFBamChainObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByNextRelIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamChainObj arr[] = new ICFBamChainObj[len];
		Iterator<ICFBamChainObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamChainObj> arrayList = new ArrayList<ICFBamChainObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamChainObj> cmp = new Comparator<ICFBamChainObj>() {
			public int compare( ICFBamChainObj lhs, ICFBamChainObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamChainPKey lhsPKey = lhs.getPKey();
					CFBamChainPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamChainObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFBamChainObj readCachedChainByIdIdx( long TenantId,
		long Id )
	{
		ICFBamChainObj obj = null;
		CFBamChainPKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedChain( pkey );
		return( obj );
	}

	public List<ICFBamChainObj> readCachedChainByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedChainByTenantIdx";
		CFBamChainByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<ICFBamChainObj> arrayList = new ArrayList<ICFBamChainObj>();
		if( indexByTenantIdx != null ) {
			Map<CFBamChainPKey, ICFBamChainObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				ICFBamChainObj arr[] = new ICFBamChainObj[len];
				Iterator<ICFBamChainObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
							S_ProcName,
							0,
							"idx",
							idx,
							len );
				}
				for( idx = 0; idx < len; idx ++ ) {
					arrayList.add( arr[idx] );
				}
			}
		}
		else {
			ICFBamChainObj obj;
			Iterator<ICFBamChainObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamChainObj> cmp = new Comparator<ICFBamChainObj>() {
			public int compare( ICFBamChainObj lhs, ICFBamChainObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamChainPKey lhsPKey = lhs.getPKey();
					CFBamChainPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamChainObj> readCachedChainByChainTableIdx( long TenantId,
		long TableId )
	{
		final String S_ProcName = "readCachedChainByChainTableIdx";
		CFBamChainByChainTableIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newChainTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		ArrayList<ICFBamChainObj> arrayList = new ArrayList<ICFBamChainObj>();
		if( indexByChainTableIdx != null ) {
			Map<CFBamChainPKey, ICFBamChainObj> dict;
			if( indexByChainTableIdx.containsKey( key ) ) {
				dict = indexByChainTableIdx.get( key );
				int len = dict.size();
				ICFBamChainObj arr[] = new ICFBamChainObj[len];
				Iterator<ICFBamChainObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
							S_ProcName,
							0,
							"idx",
							idx,
							len );
				}
				for( idx = 0; idx < len; idx ++ ) {
					arrayList.add( arr[idx] );
				}
			}
		}
		else {
			ICFBamChainObj obj;
			Iterator<ICFBamChainObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamChainObj> cmp = new Comparator<ICFBamChainObj>() {
			public int compare( ICFBamChainObj lhs, ICFBamChainObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamChainPKey lhsPKey = lhs.getPKey();
					CFBamChainPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamChainObj> readCachedChainByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedChainByDefSchemaIdx";
		CFBamChainByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<ICFBamChainObj> arrayList = new ArrayList<ICFBamChainObj>();
		if( indexByDefSchemaIdx != null ) {
			Map<CFBamChainPKey, ICFBamChainObj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				ICFBamChainObj arr[] = new ICFBamChainObj[len];
				Iterator<ICFBamChainObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
							S_ProcName,
							0,
							"idx",
							idx,
							len );
				}
				for( idx = 0; idx < len; idx ++ ) {
					arrayList.add( arr[idx] );
				}
			}
		}
		else {
			ICFBamChainObj obj;
			Iterator<ICFBamChainObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamChainObj> cmp = new Comparator<ICFBamChainObj>() {
			public int compare( ICFBamChainObj lhs, ICFBamChainObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamChainPKey lhsPKey = lhs.getPKey();
					CFBamChainPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFBamChainObj readCachedChainByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		ICFBamChainObj obj = null;
		CFBamChainByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<ICFBamChainObj> valIter = members.values().iterator();
				while( ( obj == null ) && valIter.hasNext() ) {
					obj = valIter.next();
					if( obj != null ) {
						if( obj.getBuff().compareTo( key ) != 0 ) {
							obj = null;
						}
					}
				}
			}
		}
		else {
			Iterator<ICFBamChainObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) != 0 ) {
						obj = null;
					}
				}
			}
		}
		return( obj );
	}

	public List<ICFBamChainObj> readCachedChainByPrevRelIdx( long PrevRelationTenantId,
		long PrevRelationId )
	{
		final String S_ProcName = "readCachedChainByPrevRelIdx";
		CFBamChainByPrevRelIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newPrevRelIdxKey();
		key.setRequiredPrevRelationTenantId( PrevRelationTenantId );
		key.setRequiredPrevRelationId( PrevRelationId );
		ArrayList<ICFBamChainObj> arrayList = new ArrayList<ICFBamChainObj>();
		if( indexByPrevRelIdx != null ) {
			Map<CFBamChainPKey, ICFBamChainObj> dict;
			if( indexByPrevRelIdx.containsKey( key ) ) {
				dict = indexByPrevRelIdx.get( key );
				int len = dict.size();
				ICFBamChainObj arr[] = new ICFBamChainObj[len];
				Iterator<ICFBamChainObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
							S_ProcName,
							0,
							"idx",
							idx,
							len );
				}
				for( idx = 0; idx < len; idx ++ ) {
					arrayList.add( arr[idx] );
				}
			}
		}
		else {
			ICFBamChainObj obj;
			Iterator<ICFBamChainObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamChainObj> cmp = new Comparator<ICFBamChainObj>() {
			public int compare( ICFBamChainObj lhs, ICFBamChainObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamChainPKey lhsPKey = lhs.getPKey();
					CFBamChainPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamChainObj> readCachedChainByNextRelIdx( long NextRelationTenantId,
		long NextRelationId )
	{
		final String S_ProcName = "readCachedChainByNextRelIdx";
		CFBamChainByNextRelIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newNextRelIdxKey();
		key.setRequiredNextRelationTenantId( NextRelationTenantId );
		key.setRequiredNextRelationId( NextRelationId );
		ArrayList<ICFBamChainObj> arrayList = new ArrayList<ICFBamChainObj>();
		if( indexByNextRelIdx != null ) {
			Map<CFBamChainPKey, ICFBamChainObj> dict;
			if( indexByNextRelIdx.containsKey( key ) ) {
				dict = indexByNextRelIdx.get( key );
				int len = dict.size();
				ICFBamChainObj arr[] = new ICFBamChainObj[len];
				Iterator<ICFBamChainObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
							S_ProcName,
							0,
							"idx",
							idx,
							len );
				}
				for( idx = 0; idx < len; idx ++ ) {
					arrayList.add( arr[idx] );
				}
			}
		}
		else {
			ICFBamChainObj obj;
			Iterator<ICFBamChainObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamChainObj> cmp = new Comparator<ICFBamChainObj>() {
			public int compare( ICFBamChainObj lhs, ICFBamChainObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamChainPKey lhsPKey = lhs.getPKey();
					CFBamChainPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public void deepDisposeChainByIdIdx( long TenantId,
		long Id )
	{
		ICFBamChainObj obj = readCachedChainByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeChainByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeChainByTenantIdx";
		ICFBamChainObj obj;
		List<ICFBamChainObj> arrayList = readCachedChainByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<ICFBamChainObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeChainByChainTableIdx( long TenantId,
		long TableId )
	{
		final String S_ProcName = "deepDisposeChainByChainTableIdx";
		ICFBamChainObj obj;
		List<ICFBamChainObj> arrayList = readCachedChainByChainTableIdx( TenantId,
				TableId );
		if( arrayList != null )  {
			Iterator<ICFBamChainObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeChainByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposeChainByDefSchemaIdx";
		ICFBamChainObj obj;
		List<ICFBamChainObj> arrayList = readCachedChainByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<ICFBamChainObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeChainByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		ICFBamChainObj obj = readCachedChainByUNameIdx( TenantId,
				TableId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeChainByPrevRelIdx( long PrevRelationTenantId,
		long PrevRelationId )
	{
		final String S_ProcName = "deepDisposeChainByPrevRelIdx";
		ICFBamChainObj obj;
		List<ICFBamChainObj> arrayList = readCachedChainByPrevRelIdx( PrevRelationTenantId,
				PrevRelationId );
		if( arrayList != null )  {
			Iterator<ICFBamChainObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeChainByNextRelIdx( long NextRelationTenantId,
		long NextRelationId )
	{
		final String S_ProcName = "deepDisposeChainByNextRelIdx";
		ICFBamChainObj obj;
		List<ICFBamChainObj> arrayList = readCachedChainByNextRelIdx( NextRelationTenantId,
				NextRelationId );
		if( arrayList != null )  {
			Iterator<ICFBamChainObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public ICFBamChainObj updateChain( ICFBamChainObj Obj ) {
		ICFBamChainObj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTableChain().updateChain( schema.getAuthorization(),
			Obj.getChainBuff() );
		obj = (ICFBamChainObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteChain( ICFBamChainObj Obj ) {
		ICFBamChainObj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTableChain().deleteChain( schema.getAuthorization(),
			obj.getChainBuff() );
		Obj.forget();
	}

	public void deleteChainByIdIdx( long TenantId,
		long Id )
	{
		CFBamChainPKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamChainObj obj = readChain( pkey );
		if( obj != null ) {
			ICFBamChainEditObj editObj = (ICFBamChainEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFBamChainEditObj)obj.beginEdit();
				if( editObj != null ) {
					editStarted = true;
				}
				else {
					editStarted = false;
				}
			}
			else {
				editStarted = false;
			}
			if( editObj != null ) {
				editObj.deleteInstance();
				if( editStarted ) {
					editObj.endEdit();
				}
			}
			obj.forget();
		}
		deepDisposeChainByIdIdx( TenantId,
				Id );
	}

	public void deleteChainByTenantIdx( long TenantId )
	{
		CFBamChainByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFBamChainByTenantIdxKey,
				Map< CFBamChainPKey, ICFBamChainObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<CFBamChainPKey, ICFBamChainObj> dict = indexByTenantIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableChain().deleteChainByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<ICFBamChainObj> iter = dict.values().iterator();
			ICFBamChainObj obj;
			List<ICFBamChainObj> toForget = new LinkedList<ICFBamChainObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByTenantIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableChain().deleteChainByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeChainByTenantIdx( TenantId );
	}

	public void deleteChainByChainTableIdx( long TenantId,
		long TableId )
	{
		CFBamChainByChainTableIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newChainTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		if( indexByChainTableIdx == null ) {
			indexByChainTableIdx = new HashMap< CFBamChainByChainTableIdxKey,
				Map< CFBamChainPKey, ICFBamChainObj > >();
		}
		if( indexByChainTableIdx.containsKey( key ) ) {
			Map<CFBamChainPKey, ICFBamChainObj> dict = indexByChainTableIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableChain().deleteChainByChainTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
			Iterator<ICFBamChainObj> iter = dict.values().iterator();
			ICFBamChainObj obj;
			List<ICFBamChainObj> toForget = new LinkedList<ICFBamChainObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByChainTableIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableChain().deleteChainByChainTableIdx( schema.getAuthorization(),
				TenantId,
				TableId );
		}
		deepDisposeChainByChainTableIdx( TenantId,
				TableId );
	}

	public void deleteChainByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		CFBamChainByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< CFBamChainByDefSchemaIdxKey,
				Map< CFBamChainPKey, ICFBamChainObj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<CFBamChainPKey, ICFBamChainObj> dict = indexByDefSchemaIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableChain().deleteChainByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<ICFBamChainObj> iter = dict.values().iterator();
			ICFBamChainObj obj;
			List<ICFBamChainObj> toForget = new LinkedList<ICFBamChainObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByDefSchemaIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableChain().deleteChainByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposeChainByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deleteChainByUNameIdx( long TenantId,
		long TableId,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< CFBamChainByUNameIdxKey,
				ICFBamChainObj >();
		}
		CFBamChainByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );
		ICFBamChainObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableChain().deleteChainByUNameIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				Name );
			obj.forget();
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableChain().deleteChainByUNameIdx( schema.getAuthorization(),
				TenantId,
				TableId,
				Name );
		}
		deepDisposeChainByUNameIdx( TenantId,
				TableId,
				Name );
	}

	public void deleteChainByPrevRelIdx( long PrevRelationTenantId,
		long PrevRelationId )
	{
		CFBamChainByPrevRelIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newPrevRelIdxKey();
		key.setRequiredPrevRelationTenantId( PrevRelationTenantId );
		key.setRequiredPrevRelationId( PrevRelationId );
		if( indexByPrevRelIdx == null ) {
			indexByPrevRelIdx = new HashMap< CFBamChainByPrevRelIdxKey,
				Map< CFBamChainPKey, ICFBamChainObj > >();
		}
		if( indexByPrevRelIdx.containsKey( key ) ) {
			Map<CFBamChainPKey, ICFBamChainObj> dict = indexByPrevRelIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableChain().deleteChainByPrevRelIdx( schema.getAuthorization(),
				PrevRelationTenantId,
				PrevRelationId );
			Iterator<ICFBamChainObj> iter = dict.values().iterator();
			ICFBamChainObj obj;
			List<ICFBamChainObj> toForget = new LinkedList<ICFBamChainObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByPrevRelIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableChain().deleteChainByPrevRelIdx( schema.getAuthorization(),
				PrevRelationTenantId,
				PrevRelationId );
		}
		deepDisposeChainByPrevRelIdx( PrevRelationTenantId,
				PrevRelationId );
	}

	public void deleteChainByNextRelIdx( long NextRelationTenantId,
		long NextRelationId )
	{
		CFBamChainByNextRelIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryChain().newNextRelIdxKey();
		key.setRequiredNextRelationTenantId( NextRelationTenantId );
		key.setRequiredNextRelationId( NextRelationId );
		if( indexByNextRelIdx == null ) {
			indexByNextRelIdx = new HashMap< CFBamChainByNextRelIdxKey,
				Map< CFBamChainPKey, ICFBamChainObj > >();
		}
		if( indexByNextRelIdx.containsKey( key ) ) {
			Map<CFBamChainPKey, ICFBamChainObj> dict = indexByNextRelIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTableChain().deleteChainByNextRelIdx( schema.getAuthorization(),
				NextRelationTenantId,
				NextRelationId );
			Iterator<ICFBamChainObj> iter = dict.values().iterator();
			ICFBamChainObj obj;
			List<ICFBamChainObj> toForget = new LinkedList<ICFBamChainObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByNextRelIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTableChain().deleteChainByNextRelIdx( schema.getAuthorization(),
				NextRelationTenantId,
				NextRelationId );
		}
		deepDisposeChainByNextRelIdx( NextRelationTenantId,
				NextRelationId );
	}
}