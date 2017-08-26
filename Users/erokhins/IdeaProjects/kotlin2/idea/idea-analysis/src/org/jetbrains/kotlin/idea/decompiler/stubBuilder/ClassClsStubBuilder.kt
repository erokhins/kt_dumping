'ClassClsStubBuilder' @ [53:5] ==> public constructor ClassClsStubBuilder(parentStub: StubElement<out PsiElement>, classProto: ProtoBuf.Class, nameResolver: NameResolver, classId: ClassId, source: SourceElement?, outerContext: ClsStubBuilderContext) defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[ClassConstructorDescriptorImpl]

'parent' @ [53:25] ==> value-parameter parent: StubElement<out PsiElement> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.createClassStub[ValueParameterDescriptorImpl]

'classProto' @ [53:33] ==> value-parameter classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.createClassStub[ValueParameterDescriptorImpl]

'nameResolver' @ [53:45] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.createClassStub[ValueParameterDescriptorImpl]

'classId' @ [53:59] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.createClassStub[ValueParameterDescriptorImpl]

'source' @ [53:68] ==> value-parameter source: SourceElement? defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.createClassStub[ValueParameterDescriptorImpl]

'context' @ [53:76] ==> value-parameter context: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.createClassStub[ValueParameterDescriptorImpl]

'build' @ [53:85] ==> public final fun build(): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[SimpleFunctionDescriptorImpl]

'Class' @ [64:55] ==> public constructor Class(classProto: ProtoBuf.Class, nameResolver: NameResolver, typeTable: TypeTable, source: SourceElement?, outerClass: ProtoContainer.Class?) defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class[DeserializedClassConstructorDescriptor]

'classProto' @ [65:13] ==> private final val classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'nameResolver' @ [65:25] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.<init>[ValueParameterDescriptorImpl]

'TypeTable' @ [65:39] ==> public constructor TypeTable(typeTable: ProtoBuf.TypeTable) defined in org.jetbrains.kotlin.serialization.deserialization.TypeTable[DeserializedClassConstructorDescriptor]

'classProto' @ [65:49] ==> private final val classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'typeTable' @ [65:60] ==> public final val ProtoBuf.Class.typeTable: (ProtoBuf.TypeTable..ProtoBuf.TypeTable?)[MyPropertyDescriptor]

'source' @ [65:72] ==> value-parameter source: SourceElement? defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.<init>[ValueParameterDescriptorImpl]

'outerContext' @ [65:80] ==> value-parameter outerContext: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.<init>[ValueParameterDescriptorImpl]

'protoContainer' @ [65:93] ==> public final val protoContainer: ProtoContainer.Class? defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'thisAsProtoContainer' @ [67:29] ==> private final val thisAsProtoContainer: ProtoContainer.Class defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'kind' @ [67:50] ==> public final val kind: ProtoBuf.Class.Kind defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class[DeserializedPropertyDescriptor]

'outerContext' @ [69:21] ==> value-parameter outerContext: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.<init>[ValueParameterDescriptorImpl]

'child' @ [69:34] ==> internal fun ClsStubBuilderContext.child(typeParameterList: List<ProtoBuf.TypeParameter>, name: Name? = ..., nameResolver: NameResolver = ..., typeTable: TypeTable = ..., protoContainer: ProtoContainer.Class? = ...): ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder in file ClsStubBuilderContext.kt[SimpleFunctionDescriptorImpl]

'classProto' @ [70:13] ==> private final val classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'typeParameterList' @ [70:24] ==> public final val ProtoBuf.Class.typeParameterList: (MutableList<(ProtoBuf.TypeParameter..ProtoBuf.TypeParameter?)>..List<(ProtoBuf.TypeParameter..ProtoBuf.TypeParameter?)>?)[MyPropertyDescriptor]

'classId' @ [70:43] ==> private final val classId: ClassId defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'shortClassName' @ [70:51] ==> public final val ClassId.shortClassName: Name[MyPropertyDescriptor]

'nameResolver' @ [70:67] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.<init>[ValueParameterDescriptorImpl]

'thisAsProtoContainer' @ [70:81] ==> private final val thisAsProtoContainer: ProtoContainer.Class defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'typeTable' @ [70:102] ==> public final val typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class[DeserializedPropertyDescriptor]

'thisAsProtoContainer' @ [70:113] ==> private final val thisAsProtoContainer: ProtoContainer.Class defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'TypeClsStubBuilder' @ [72:35] ==> public constructor TypeClsStubBuilder(c: ClsStubBuilderContext) defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[ClassConstructorDescriptorImpl]

'c' @ [72:54] ==> private final val c: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'run' @ [73:32] ==> @InlineOnly public inline fun <T, R> ClassClsStubBuilder.run(block: ClassClsStubBuilder.() -> List<ClassId>): List<ClassId> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassClsStubBuilder
    <R> -> List<ClassId>

'classProto' @ [74:28] ==> private final val classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'supertypes' @ [74:39] ==> public fun ProtoBuf.Class.supertypes(typeTable: TypeTable): List<ProtoBuf.Type> defined in org.jetbrains.kotlin.serialization.deserialization[DeserializedSimpleFunctionDescriptor]

'c' @ [74:50] ==> private final val c: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'typeTable' @ [74:52] ==> public final val typeTable: TypeTable defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'map' @ [74:63] ==> public inline fun <T, R> Iterable<ProtoBuf.Type>.map(transform: (ProtoBuf.Type) -> ClassId): List<ClassId> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type
    <R> -> ClassId

'c' @ [74:69] ==> private final val c: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'nameResolver' @ [74:71] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'getClassId' @ [74:84] ==> @NotNull public abstract fun getClassId(p0: Int): ClassId defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'it' @ [74:95] ==> value-parameter it: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.supertypeIds.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'className' @ [74:98] ==> public final val ProtoBuf.Type.className: Int[MyPropertyDescriptor]

'if (supertypeIds.singleOrNull()?.let { KotlinBuiltIns.FQ_NAMES.any == it.asSingleFqName().toUnsafe() } ?: false) {
            listOf()
        }
        else {
            supertypeIds
        }' @ [76:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<ClassId>, elseBranch: List<ClassId>): List<ClassId>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<ClassId>

'supertypeIds' @ [76:13] ==> val supertypeIds: List<ClassId> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.supertypeIds.<anonymous>[LocalVariableDescriptor]

'singleOrNull' @ [76:26] ==> public fun <T> List<ClassId>.singleOrNull(): ClassId? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassId

'let' @ [76:42] ==> @InlineOnly public inline fun <T, R> ClassId.let(block: (ClassId) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassId
    <R> -> Boolean

'==' @ [76:48] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'FQ_NAMES' @ [76:63] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'any' @ [76:72] ==> public final val any: (FqNameUnsafe..FqNameUnsafe?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'it' @ [76:79] ==> value-parameter it: ClassId defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.supertypeIds.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'asSingleFqName' @ [76:82] ==> @NotNull public open fun asSingleFqName(): FqName defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'toUnsafe' @ [76:99] ==> @NotNull public open fun toUnsafe(): FqNameUnsafe defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'listOf' @ [77:13] ==> @InlineOnly public inline fun <T> listOf(): List<ClassId> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassId

'supertypeIds' @ [80:13] ==> val supertypeIds: List<ClassId> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.supertypeIds.<anonymous>[LocalVariableDescriptor]

'if (classProto.hasCompanionObjectName()) c.nameResolver.getName(classProto.companionObjectName) else null' @ [85:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Name?, elseBranch: Name?): Name?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Name?

'classProto' @ [85:17] ==> private final val classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'hasCompanionObjectName' @ [85:28] ==> public open fun hasCompanionObjectName(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class[JavaMethodDescriptor]

'c' @ [85:54] ==> private final val c: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'nameResolver' @ [85:56] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'getName' @ [85:69] ==> @NotNull public abstract fun getName(p0: Int): Name defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'classProto' @ [85:77] ==> private final val classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'companionObjectName' @ [85:88] ==> public final val ProtoBuf.Class.companionObjectName: Int[MyPropertyDescriptor]

'createClassOrObjectStubAndModifierListStub' @ [87:37] ==> private final fun createClassOrObjectStubAndModifierListStub(): StubElement<out PsiElement> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[SimpleFunctionDescriptorImpl]

'typeStubBuilder' @ [90:38] ==> private final val typeStubBuilder: TypeClsStubBuilder defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'createTypeParameterListStub' @ [90:54] ==> public final fun createTypeParameterListStub(parent: StubElement<out PsiElement>, typeParameterProtoList: List<ProtoBuf.TypeParameter>): List<Pair<Name, ProtoBuf.Type>> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[SimpleFunctionDescriptorImpl]

'classOrObjectStub' @ [90:82] ==> private final val classOrObjectStub: StubElement<out PsiElement> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'classProto' @ [90:101] ==> private final val classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'typeParameterList' @ [90:112] ==> public final val ProtoBuf.Class.typeParameterList: (MutableList<(ProtoBuf.TypeParameter..ProtoBuf.TypeParameter?)>..List<(ProtoBuf.TypeParameter..ProtoBuf.TypeParameter?)>?)[MyPropertyDescriptor]

'createConstructorStub' @ [91:9] ==> private final fun createConstructorStub(): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[SimpleFunctionDescriptorImpl]

'createDelegationSpecifierList' @ [92:9] ==> private final fun createDelegationSpecifierList(): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[SimpleFunctionDescriptorImpl]

'typeStubBuilder' @ [93:9] ==> private final val typeStubBuilder: TypeClsStubBuilder defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'createTypeConstraintListStub' @ [93:25] ==> public final fun createTypeConstraintListStub(parent: StubElement<out PsiElement>, protosForTypeConstraintList: List<Pair<Name, ProtoBuf.Type>>): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[SimpleFunctionDescriptorImpl]

'classOrObjectStub' @ [93:54] ==> private final val classOrObjectStub: StubElement<out PsiElement> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'typeConstraintListData' @ [93:73] ==> val typeConstraintListData: List<Pair<Name, ProtoBuf.Type>> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.build[LocalVariableDescriptor]

'createClassBodyAndMemberStubs' @ [94:9] ==> private final fun createClassBodyAndMemberStubs(): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[SimpleFunctionDescriptorImpl]

'doCreateClassOrObjectStub' @ [98:33] ==> private final fun doCreateClassOrObjectStub(): StubElement<out PsiElement> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[SimpleFunctionDescriptorImpl]

'createModifierListForClass' @ [99:28] ==> private final fun createModifierListForClass(parent: StubElement<out PsiElement>): KotlinModifierListStubImpl defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[SimpleFunctionDescriptorImpl]

'classOrObjectStub' @ [99:55] ==> val classOrObjectStub: StubElement<out PsiElement> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createClassOrObjectStubAndModifierListStub[LocalVariableDescriptor]

'HAS_ANNOTATIONS' @ [100:19] ==> public final val HAS_ANNOTATIONS: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [100:35] ==> @NotNull public open fun get(p0: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'classProto' @ [100:39] ==> private final val classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'flags' @ [100:50] ==> public final val ProtoBuf.Class.flags: Int[MyPropertyDescriptor]

'createAnnotationStubs' @ [101:13] ==> public fun createAnnotationStubs(annotationIds: List<ClassId>, parent: KotlinStubBaseImpl<*>): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder in file clsStubBuilding.kt[SimpleFunctionDescriptorImpl]

'c' @ [101:35] ==> private final val c: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'components' @ [101:37] ==> public final val components: ClsStubBuilderComponents defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'annotationLoader' @ [101:48] ==> public final val annotationLoader: AnnotationAndConstantLoader<ClassId, Unit, ClassIdWithTarget> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderComponents[PropertyDescriptorImpl]

'loadClassAnnotations' @ [101:65] ==> public abstract fun loadClassAnnotations(container: ProtoContainer.Class): List<ClassId> defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoader[DeserializedSimpleFunctionDescriptor]

'thisAsProtoContainer' @ [101:86] ==> private final val thisAsProtoContainer: ProtoContainer.Class defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'modifierList' @ [101:109] ==> val modifierList: KotlinModifierListStubImpl defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createClassOrObjectStubAndModifierListStub[LocalVariableDescriptor]

'classOrObjectStub' @ [103:16] ==> val classOrObjectStub: StubElement<out PsiElement> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createClassOrObjectStubAndModifierListStub[LocalVariableDescriptor]

'arrayListOf' @ [107:29] ==> public fun <T> arrayListOf(vararg elements: FlagsToModifiers): ArrayList<FlagsToModifiers> /* = ArrayList<FlagsToModifiers> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FlagsToModifiers

'VISIBILITY' @ [107:41] ==> public val VISIBILITY: FlagsToModifiers defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.flags in file flags.kt[PropertyDescriptorImpl]

'relevantFlags' @ [108:9] ==> val relevantFlags: ArrayList<FlagsToModifiers> /* = ArrayList<FlagsToModifiers> */ defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createModifierListForClass[LocalVariableDescriptor]

'add' @ [108:23] ==> public open fun add(element: FlagsToModifiers): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'EXTERNAL_CLASS' @ [108:27] ==> public val EXTERNAL_CLASS: FlagsToModifiers defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.flags in file flags.kt[PropertyDescriptorImpl]

'isClass' @ [109:13] ==> private final fun isClass(): Boolean defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[SimpleFunctionDescriptorImpl]

'relevantFlags' @ [110:13] ==> val relevantFlags: ArrayList<FlagsToModifiers> /* = ArrayList<FlagsToModifiers> */ defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createModifierListForClass[LocalVariableDescriptor]

'add' @ [110:27] ==> public open fun add(element: FlagsToModifiers): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'INNER' @ [110:31] ==> public val INNER: FlagsToModifiers defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.flags in file flags.kt[PropertyDescriptorImpl]

'relevantFlags' @ [111:13] ==> val relevantFlags: ArrayList<FlagsToModifiers> /* = ArrayList<FlagsToModifiers> */ defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createModifierListForClass[LocalVariableDescriptor]

'add' @ [111:27] ==> public open fun add(element: FlagsToModifiers): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'DATA' @ [111:31] ==> public val DATA: FlagsToModifiers defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.flags in file flags.kt[PropertyDescriptorImpl]

'relevantFlags' @ [112:13] ==> val relevantFlags: ArrayList<FlagsToModifiers> /* = ArrayList<FlagsToModifiers> */ defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createModifierListForClass[LocalVariableDescriptor]

'add' @ [112:27] ==> public open fun add(element: FlagsToModifiers): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'MODALITY' @ [112:31] ==> public val MODALITY: FlagsToModifiers defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.flags in file flags.kt[PropertyDescriptorImpl]

'when (classKind) {
            ProtoBuf.Class.Kind.ENUM_CLASS -> listOf(KtTokens.ENUM_KEYWORD)
            ProtoBuf.Class.Kind.COMPANION_OBJECT -> listOf(KtTokens.COMPANION_KEYWORD)
            ProtoBuf.Class.Kind.ANNOTATION_CLASS -> listOf(KtTokens.ANNOTATION_KEYWORD)
            else -> listOf<KtModifierKeywordToken>()
        }' @ [114:35] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<(KtModifierKeywordToken..KtModifierKeywordToken?)>, entry1: List<(KtModifierKeywordToken..KtModifierKeywordToken?)>, entry2: List<(KtModifierKeywordToken..KtModifierKeywordToken?)>, entry3: List<(KtModifierKeywordToken..KtModifierKeywordToken?)>): List<(KtModifierKeywordToken..KtModifierKeywordToken?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<(org.jetbrains.kotlin.lexer.KtModifierKeywordToken..org.jetbrains.kotlin.lexer.KtModifierKeywordToken?)>

'classKind' @ [114:41] ==> private final val classKind: ProtoBuf.Class.Kind defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'ENUM_CLASS' @ [115:33] ==> enum entry ENUM_CLASS defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class.Kind[FakeCallableDescriptorForObject]

'listOf' @ [115:47] ==> public fun <T> listOf(element: (KtModifierKeywordToken..KtModifierKeywordToken?)): List<(KtModifierKeywordToken..KtModifierKeywordToken?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.lexer.KtModifierKeywordToken..org.jetbrains.kotlin.lexer.KtModifierKeywordToken?)

'ENUM_KEYWORD' @ [115:63] ==> public final val ENUM_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'COMPANION_OBJECT' @ [116:33] ==> enum entry COMPANION_OBJECT defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class.Kind[FakeCallableDescriptorForObject]

'listOf' @ [116:53] ==> public fun <T> listOf(element: (KtModifierKeywordToken..KtModifierKeywordToken?)): List<(KtModifierKeywordToken..KtModifierKeywordToken?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.lexer.KtModifierKeywordToken..org.jetbrains.kotlin.lexer.KtModifierKeywordToken?)

'COMPANION_KEYWORD' @ [116:69] ==> public final val COMPANION_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'ANNOTATION_CLASS' @ [117:33] ==> enum entry ANNOTATION_CLASS defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class.Kind[FakeCallableDescriptorForObject]

'listOf' @ [117:53] ==> public fun <T> listOf(element: (KtModifierKeywordToken..KtModifierKeywordToken?)): List<(KtModifierKeywordToken..KtModifierKeywordToken?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.lexer.KtModifierKeywordToken..org.jetbrains.kotlin.lexer.KtModifierKeywordToken?)

'ANNOTATION_KEYWORD' @ [117:69] ==> public final val ANNOTATION_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'listOf' @ [118:21] ==> @InlineOnly public inline fun <T> listOf(): List<KtModifierKeywordToken> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtModifierKeywordToken

'createModifierListStubForDeclaration' @ [120:16] ==> public fun createModifierListStubForDeclaration(parent: StubElement<out PsiElement>, flags: Int, flagsToTranslate: List<FlagsToModifiers> = ..., additionalModifiers: List<KtModifierKeywordToken> = ...): KotlinModifierListStubImpl defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder in file clsStubBuilding.kt[SimpleFunctionDescriptorImpl]

'parent' @ [120:53] ==> value-parameter parent: StubElement<out PsiElement> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createModifierListForClass[ValueParameterDescriptorImpl]

'classProto' @ [120:61] ==> private final val classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'flags' @ [120:72] ==> public final val ProtoBuf.Class.flags: Int[MyPropertyDescriptor]

'relevantFlags' @ [120:79] ==> val relevantFlags: ArrayList<FlagsToModifiers> /* = ArrayList<FlagsToModifiers> */ defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createModifierListForClass[LocalVariableDescriptor]

'additionalModifiers' @ [120:94] ==> val additionalModifiers: List<(KtModifierKeywordToken..KtModifierKeywordToken?)> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createModifierListForClass[LocalVariableDescriptor]

'classKind' @ [124:33] ==> private final val classKind: ProtoBuf.Class.Kind defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'COMPANION_OBJECT' @ [124:66] ==> enum entry COMPANION_OBJECT defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class.Kind[FakeCallableDescriptorForObject]

'classId' @ [125:22] ==> private final val classId: ClassId defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'asSingleFqName' @ [125:30] ==> @NotNull public open fun asSingleFqName(): FqName defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'fqName' @ [126:25] ==> val fqName: FqName defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.doCreateClassOrObjectStub[LocalVariableDescriptor]

'shortName' @ [126:32] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'ref' @ [126:44] ==> public fun Name.ref(): StringRef defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder in file clsStubBuilding.kt[SimpleFunctionDescriptorImpl]

'supertypeIds' @ [127:29] ==> private final val supertypeIds: List<ClassId> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'filterNot' @ [127:42] ==> public inline fun <T> Iterable<ClassId>.filterNot(predicate: (ClassId) -> Boolean): List<ClassId> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassId

'isNumberedFunctionClassFqName' @ [129:13] ==> public fun isNumberedFunctionClassFqName(fqName: FqNameUnsafe): Boolean defined in org.jetbrains.kotlin.builtins[DeserializedSimpleFunctionDescriptor]

'it' @ [129:43] ==> value-parameter it: ClassId defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.doCreateClassOrObjectStub.<anonymous>[ValueParameterDescriptorImpl]

'asSingleFqName' @ [129:46] ==> @NotNull public open fun asSingleFqName(): FqName defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'toUnsafe' @ [129:63] ==> @NotNull public open fun toUnsafe(): FqNameUnsafe defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'map' @ [130:11] ==> public inline fun <T, R> Iterable<ClassId>.map(transform: (ClassId) -> StringRef): List<StringRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassId
    <R> -> StringRef

'it' @ [130:17] ==> value-parameter it: ClassId defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.doCreateClassOrObjectStub.<anonymous>[ValueParameterDescriptorImpl]

'shortClassName' @ [130:20] ==> public final val ClassId.shortClassName: Name[MyPropertyDescriptor]

'ref' @ [130:35] ==> public fun Name.ref(): StringRef defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder in file clsStubBuilding.kt[SimpleFunctionDescriptorImpl]

'toTypedArray' @ [130:43] ==> public inline fun <reified T> Collection<StringRef>.toTypedArray(): Array<StringRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> StringRef

'when (classKind) {
            ProtoBuf.Class.Kind.OBJECT, ProtoBuf.Class.Kind.COMPANION_OBJECT -> {
                KotlinObjectStubImpl(
                        parentStub, shortName, fqName, superTypeRefs,
                        isTopLevel = !classId.isNestedClass,
                        isDefault = isCompanionObject,
                        isLocal = false,
                        isObjectLiteral = false
                )
            }
            else -> {
                KotlinClassStubImpl(
                        KtClassElementType.getStubType(classKind == ProtoBuf.Class.Kind.ENUM_ENTRY),
                        parentStub,
                        fqName.ref(),
                        shortName,
                        superTypeRefs,
                        isInterface = classKind == ProtoBuf.Class.Kind.INTERFACE,
                        isEnumEntry = classKind == ProtoBuf.Class.Kind.ENUM_ENTRY,
                        isLocal = false,
                        isTopLevel = !classId.isNestedClass
                )
            }
        }' @ [131:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: StubElement<out PsiElement>, entry1: StubElement<out PsiElement>): StubElement<out PsiElement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> StubElement<out PsiElement>

'classKind' @ [131:22] ==> private final val classKind: ProtoBuf.Class.Kind defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'OBJECT' @ [132:33] ==> enum entry OBJECT defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class.Kind[FakeCallableDescriptorForObject]

'COMPANION_OBJECT' @ [132:61] ==> enum entry COMPANION_OBJECT defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class.Kind[FakeCallableDescriptorForObject]

'KotlinObjectStubImpl' @ [133:17] ==> public constructor KotlinObjectStubImpl(parent: StubElement<out PsiElement>?, name: StringRef?, fqName: FqName?, superNames: Array<StringRef>, isTopLevel: Boolean, isDefault: Boolean, isLocal: Boolean, isObjectLiteral: Boolean) defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinObjectStubImpl[DeserializedClassConstructorDescriptor]

'parentStub' @ [134:25] ==> private final val parentStub: StubElement<out PsiElement> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'shortName' @ [134:37] ==> val shortName: StringRef defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.doCreateClassOrObjectStub[LocalVariableDescriptor]

'fqName' @ [134:48] ==> val fqName: FqName defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.doCreateClassOrObjectStub[LocalVariableDescriptor]

'superTypeRefs' @ [134:56] ==> val superTypeRefs: Array<StringRef> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.doCreateClassOrObjectStub[LocalVariableDescriptor]

'!' @ [135:38] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'classId' @ [135:39] ==> private final val classId: ClassId defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'isNestedClass' @ [135:47] ==> public final val ClassId.isNestedClass: Boolean[MyPropertyDescriptor]

'isCompanionObject' @ [136:37] ==> val isCompanionObject: Boolean defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.doCreateClassOrObjectStub[LocalVariableDescriptor]

'KotlinClassStubImpl' @ [142:17] ==> public constructor KotlinClassStubImpl(type: KtClassElementType, parent: StubElement<out PsiElement>?, qualifiedName: StringRef?, name: StringRef?, superNames: Array<StringRef>, isInterface: Boolean, isEnumEntry: Boolean, isLocal: Boolean, isTopLevel: Boolean) defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinClassStubImpl[DeserializedClassConstructorDescriptor]

'getStubType' @ [143:44] ==> public open fun getStubType(p0: Boolean): (KtClassElementType..KtClassElementType?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtClassElementType[JavaMethodDescriptor]

'classKind' @ [143:56] ==> private final val classKind: ProtoBuf.Class.Kind defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'ENUM_ENTRY' @ [143:89] ==> enum entry ENUM_ENTRY defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class.Kind[FakeCallableDescriptorForObject]

'parentStub' @ [144:25] ==> private final val parentStub: StubElement<out PsiElement> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'fqName' @ [145:25] ==> val fqName: FqName defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.doCreateClassOrObjectStub[LocalVariableDescriptor]

'ref' @ [145:32] ==> public fun FqName.ref(): StringRef defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder in file clsStubBuilding.kt[SimpleFunctionDescriptorImpl]

'shortName' @ [146:25] ==> val shortName: StringRef defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.doCreateClassOrObjectStub[LocalVariableDescriptor]

'superTypeRefs' @ [147:25] ==> val superTypeRefs: Array<StringRef> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.doCreateClassOrObjectStub[LocalVariableDescriptor]

'classKind' @ [148:39] ==> private final val classKind: ProtoBuf.Class.Kind defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'INTERFACE' @ [148:72] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class.Kind[FakeCallableDescriptorForObject]

'classKind' @ [149:39] ==> private final val classKind: ProtoBuf.Class.Kind defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'ENUM_ENTRY' @ [149:72] ==> enum entry ENUM_ENTRY defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class.Kind[FakeCallableDescriptorForObject]

'!' @ [151:38] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'classId' @ [151:39] ==> private final val classId: ClassId defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'isNestedClass' @ [151:47] ==> public final val ClassId.isNestedClass: Boolean[MyPropertyDescriptor]

'!' @ [158:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isClass' @ [158:14] ==> private final fun isClass(): Boolean defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[SimpleFunctionDescriptorImpl]

'classProto' @ [160:39] ==> private final val classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'constructorList' @ [160:50] ==> public final val ProtoBuf.Class.constructorList: (MutableList<(ProtoBuf.Constructor..ProtoBuf.Constructor?)>..List<(ProtoBuf.Constructor..ProtoBuf.Constructor?)>?)[MyPropertyDescriptor]

'find' @ [160:66] ==> @InlineOnly public inline fun <T> Iterable<(ProtoBuf.Constructor..ProtoBuf.Constructor?)>.find(predicate: ((ProtoBuf.Constructor..ProtoBuf.Constructor?)) -> Boolean): ProtoBuf.Constructor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.ProtoBuf.Constructor..org.jetbrains.kotlin.serialization.ProtoBuf.Constructor?)

'!' @ [160:73] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'IS_SECONDARY' @ [160:80] ==> public final val IS_SECONDARY: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [160:93] ==> @NotNull public open fun get(p0: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'it' @ [160:97] ==> value-parameter it: (ProtoBuf.Constructor..ProtoBuf.Constructor?) defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createConstructorStub.<anonymous>[ValueParameterDescriptorImpl]

'flags' @ [160:100] ==> public final val ProtoBuf.Constructor.flags: Int[MyPropertyDescriptor]

'createConstructorStub' @ [162:9] ==> public fun createConstructorStub(parentStub: StubElement<out PsiElement>, constructorProto: ProtoBuf.Constructor, outerContext: ClsStubBuilderContext, protoContainer: ProtoContainer): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder in file CallableClsStubBuilder.kt[SimpleFunctionDescriptorImpl]

'classOrObjectStub' @ [162:31] ==> private final val classOrObjectStub: StubElement<out PsiElement> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'primaryConstructorProto' @ [162:50] ==> val primaryConstructorProto: ProtoBuf.Constructor defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createConstructorStub[LocalVariableDescriptor]

'c' @ [162:75] ==> private final val c: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'thisAsProtoContainer' @ [162:78] ==> private final val thisAsProtoContainer: ProtoContainer.Class defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'supertypeIds' @ [167:13] ==> private final val supertypeIds: List<ClassId> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'isEmpty' @ [167:26] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'KotlinPlaceHolderStubImpl' @ [170:17] ==> public constructor KotlinPlaceHolderStubImpl<T : (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>(p0: raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?), p1: raw (IStubElementType<(StubElement<*>..StubElement<*>?), (PsiElement..PsiElement?)>..IStubElementType<out (StubElement<*>..StubElement<*>?), *>?)) defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinPlaceHolderStubImpl[JavaClassConstructorDescriptor]
Inferred types:
    <T : (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)> -> KtSuperTypeList

'classOrObjectStub' @ [170:60] ==> private final val classOrObjectStub: StubElement<out PsiElement> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'SUPER_TYPE_LIST' @ [170:98] ==> public final val SUPER_TYPE_LIST: (KtPlaceHolderStubElementType<(KtSuperTypeList..KtSuperTypeList?)>..KtPlaceHolderStubElementType<(KtSuperTypeList..KtSuperTypeList?)>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'classProto' @ [172:9] ==> private final val classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'supertypes' @ [172:20] ==> public fun ProtoBuf.Class.supertypes(typeTable: TypeTable): List<ProtoBuf.Type> defined in org.jetbrains.kotlin.serialization.deserialization[DeserializedSimpleFunctionDescriptor]

'c' @ [172:31] ==> private final val c: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'typeTable' @ [172:33] ==> public final val typeTable: TypeTable defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'forEach' @ [172:44] ==> @HidesMembers public inline fun <T> Iterable<ProtoBuf.Type>.forEach(action: (ProtoBuf.Type) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type

'KotlinPlaceHolderStubImpl' @ [173:34] ==> public constructor KotlinPlaceHolderStubImpl<T : (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>(p0: raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?), p1: raw (IStubElementType<(StubElement<*>..StubElement<*>?), (PsiElement..PsiElement?)>..IStubElementType<out (StubElement<*>..StubElement<*>?), *>?)) defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinPlaceHolderStubImpl[JavaClassConstructorDescriptor]
Inferred types:
    <T : (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)> -> KtSuperTypeEntry

'delegationSpecifierListStub' @ [174:21] ==> val delegationSpecifierListStub: KotlinPlaceHolderStubImpl<KtSuperTypeList> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createDelegationSpecifierList[LocalVariableDescriptor]

'SUPER_TYPE_ENTRY' @ [174:69] ==> public final val SUPER_TYPE_ENTRY: (KtPlaceHolderStubElementType<(KtSuperTypeEntry..KtSuperTypeEntry?)>..KtPlaceHolderStubElementType<(KtSuperTypeEntry..KtSuperTypeEntry?)>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'typeStubBuilder' @ [176:13] ==> private final val typeStubBuilder: TypeClsStubBuilder defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'createTypeReferenceStub' @ [176:29] ==> public final fun createTypeReferenceStub(parent: StubElement<out PsiElement>, type: ProtoBuf.Type, additionalAnnotations: () -> List<ClassIdWithTarget> = ...): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeClsStubBuilder[SimpleFunctionDescriptorImpl]

'superClassStub' @ [176:53] ==> val superClassStub: KotlinPlaceHolderStubImpl<KtSuperTypeEntry> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createDelegationSpecifierList.<anonymous>[LocalVariableDescriptor]

'type' @ [176:69] ==> value-parameter type: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createDelegationSpecifierList.<anonymous>[ValueParameterDescriptorImpl]

'KotlinPlaceHolderStubImpl' @ [181:25] ==> public constructor KotlinPlaceHolderStubImpl<T : (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>(p0: raw (StubElement<(PsiElement..PsiElement?)>..StubElement<*>?), p1: raw (IStubElementType<(StubElement<*>..StubElement<*>?), (PsiElement..PsiElement?)>..IStubElementType<out (StubElement<*>..StubElement<*>?), *>?)) defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinPlaceHolderStubImpl[JavaClassConstructorDescriptor]
Inferred types:
    <T : (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)> -> KtClassBody

'classOrObjectStub' @ [181:64] ==> private final val classOrObjectStub: StubElement<out PsiElement> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'CLASS_BODY' @ [181:102] ==> public final val CLASS_BODY: (KtPlaceHolderStubElementType<(KtClassBody..KtClassBody?)>..KtPlaceHolderStubElementType<(KtClassBody..KtClassBody?)>?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'createEnumEntryStubs' @ [182:9] ==> private final fun createEnumEntryStubs(classBody: KotlinPlaceHolderStubImpl<KtClassBody>): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[SimpleFunctionDescriptorImpl]

'classBody' @ [182:30] ==> val classBody: KotlinPlaceHolderStubImpl<KtClassBody> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createClassBodyAndMemberStubs[LocalVariableDescriptor]

'createCompanionObjectStub' @ [183:9] ==> private final fun createCompanionObjectStub(classBody: KotlinPlaceHolderStubImpl<KtClassBody>): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[SimpleFunctionDescriptorImpl]

'classBody' @ [183:35] ==> val classBody: KotlinPlaceHolderStubImpl<KtClassBody> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createClassBodyAndMemberStubs[LocalVariableDescriptor]

'createCallableMemberStubs' @ [184:9] ==> private final fun createCallableMemberStubs(classBody: KotlinPlaceHolderStubImpl<KtClassBody>): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[SimpleFunctionDescriptorImpl]

'classBody' @ [184:35] ==> val classBody: KotlinPlaceHolderStubImpl<KtClassBody> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createClassBodyAndMemberStubs[LocalVariableDescriptor]

'createInnerAndNestedClasses' @ [185:9] ==> private final fun createInnerAndNestedClasses(classBody: KotlinPlaceHolderStubImpl<KtClassBody>): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[SimpleFunctionDescriptorImpl]

'classBody' @ [185:37] ==> val classBody: KotlinPlaceHolderStubImpl<KtClassBody> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createClassBodyAndMemberStubs[LocalVariableDescriptor]

'companionObjectName' @ [189:13] ==> private final val companionObjectName: Name? defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'classId' @ [193:33] ==> private final val classId: ClassId defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'createNestedClassId' @ [193:41] ==> @NotNull public open fun createNestedClassId(@NotNull p0: Name): ClassId defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'companionObjectName' @ [193:61] ==> private final val companionObjectName: Name? defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'createNestedClassStub' @ [194:9] ==> private final fun createNestedClassStub(classBody: StubElement<out PsiElement>, nestedClassId: ClassId): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[SimpleFunctionDescriptorImpl]

'classBody' @ [194:31] ==> value-parameter classBody: KotlinPlaceHolderStubImpl<KtClassBody> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createCompanionObjectStub[ValueParameterDescriptorImpl]

'companionObjectId' @ [194:42] ==> val companionObjectId: ClassId defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createCompanionObjectStub[LocalVariableDescriptor]

'classKind' @ [198:13] ==> private final val classKind: ProtoBuf.Class.Kind defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'ENUM_CLASS' @ [198:46] ==> enum entry ENUM_CLASS defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class.Kind[FakeCallableDescriptorForObject]

'classProto' @ [200:9] ==> private final val classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'enumEntryList' @ [200:20] ==> public final val ProtoBuf.Class.enumEntryList: (MutableList<(ProtoBuf.EnumEntry..ProtoBuf.EnumEntry?)>..List<(ProtoBuf.EnumEntry..ProtoBuf.EnumEntry?)>?)[MyPropertyDescriptor]

'forEach' @ [200:34] ==> @HidesMembers public inline fun <T> Iterable<(ProtoBuf.EnumEntry..ProtoBuf.EnumEntry?)>.forEach(action: ((ProtoBuf.EnumEntry..ProtoBuf.EnumEntry?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.ProtoBuf.EnumEntry..org.jetbrains.kotlin.serialization.ProtoBuf.EnumEntry?)

'c' @ [201:24] ==> private final val c: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'nameResolver' @ [201:26] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'getName' @ [201:39] ==> @NotNull public abstract fun getName(p0: Int): Name defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'entry' @ [201:47] ==> value-parameter entry: (ProtoBuf.EnumEntry..ProtoBuf.EnumEntry?) defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createEnumEntryStubs.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [201:53] ==> public final val ProtoBuf.EnumEntry.name: Int[MyPropertyDescriptor]

'c' @ [202:31] ==> private final val c: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'components' @ [202:33] ==> public final val components: ClsStubBuilderComponents defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'annotationLoader' @ [202:44] ==> public final val annotationLoader: AnnotationAndConstantLoader<ClassId, Unit, ClassIdWithTarget> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderComponents[PropertyDescriptorImpl]

'loadEnumEntryAnnotations' @ [202:61] ==> public abstract fun loadEnumEntryAnnotations(container: ProtoContainer, proto: ProtoBuf.EnumEntry): List<ClassId> defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoader[DeserializedSimpleFunctionDescriptor]

'thisAsProtoContainer' @ [202:86] ==> private final val thisAsProtoContainer: ProtoContainer.Class defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'entry' @ [202:108] ==> value-parameter entry: (ProtoBuf.EnumEntry..ProtoBuf.EnumEntry?) defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createEnumEntryStubs.<anonymous>[ValueParameterDescriptorImpl]

'KotlinClassStubImpl' @ [203:33] ==> public constructor KotlinClassStubImpl(type: KtClassElementType, parent: StubElement<out PsiElement>?, qualifiedName: StringRef?, name: StringRef?, superNames: Array<StringRef>, isInterface: Boolean, isEnumEntry: Boolean, isLocal: Boolean, isTopLevel: Boolean) defined in org.jetbrains.kotlin.psi.stubs.impl.KotlinClassStubImpl[DeserializedClassConstructorDescriptor]

'ENUM_ENTRY' @ [204:40] ==> public final val ENUM_ENTRY: (KtClassElementType..KtClassElementType?) defined in org.jetbrains.kotlin.psi.stubs.elements.KtStubElementTypes[JavaPropertyDescriptor]

'classBody' @ [205:21] ==> value-parameter classBody: KotlinPlaceHolderStubImpl<KtClassBody> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createEnumEntryStubs[ValueParameterDescriptorImpl]

'c' @ [206:37] ==> private final val c: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'containerFqName' @ [206:39] ==> public final val containerFqName: FqName defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'child' @ [206:55] ==> @NotNull public open fun child(@NotNull p0: Name): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'name' @ [206:61] ==> val name: Name defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createEnumEntryStubs.<anonymous>[LocalVariableDescriptor]

'ref' @ [206:67] ==> public fun FqName.ref(): StringRef defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder in file clsStubBuilding.kt[SimpleFunctionDescriptorImpl]

'name' @ [207:28] ==> val name: Name defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createEnumEntryStubs.<anonymous>[LocalVariableDescriptor]

'ref' @ [207:33] ==> public fun Name.ref(): StringRef defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder in file clsStubBuilding.kt[SimpleFunctionDescriptorImpl]

'arrayOf' @ [208:34] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: StringRef): Array<StringRef> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> StringRef

'annotations' @ [214:17] ==> val annotations: List<ClassId> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createEnumEntryStubs.<anonymous>[LocalVariableDescriptor]

'isNotEmpty' @ [214:29] ==> @InlineOnly public inline fun <T> Collection<ClassId>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassId

'createAnnotationStubs' @ [215:17] ==> public fun createAnnotationStubs(annotationIds: List<ClassId>, parent: KotlinStubBaseImpl<*>): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder in file clsStubBuilding.kt[SimpleFunctionDescriptorImpl]

'annotations' @ [215:39] ==> val annotations: List<ClassId> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createEnumEntryStubs.<anonymous>[LocalVariableDescriptor]

'createEmptyModifierListStub' @ [215:52] ==> public fun createEmptyModifierListStub(parent: KotlinStubBaseImpl<*>): KotlinModifierListStubImpl defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder in file clsStubBuilding.kt[SimpleFunctionDescriptorImpl]

'enumEntryStub' @ [215:80] ==> val enumEntryStub: KotlinClassStubImpl defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createEnumEntryStubs.<anonymous>[LocalVariableDescriptor]

'classProto' @ [221:43] ==> private final val classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'constructorList' @ [221:54] ==> public final val ProtoBuf.Class.constructorList: (MutableList<(ProtoBuf.Constructor..ProtoBuf.Constructor?)>..List<(ProtoBuf.Constructor..ProtoBuf.Constructor?)>?)[MyPropertyDescriptor]

'IS_SECONDARY' @ [222:23] ==> public final val IS_SECONDARY: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [222:36] ==> @NotNull public open fun get(p0: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'secondaryConstructorProto' @ [222:40] ==> val secondaryConstructorProto: (ProtoBuf.Constructor..ProtoBuf.Constructor?) defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createCallableMemberStubs[LocalVariableDescriptor]

'flags' @ [222:66] ==> public final val ProtoBuf.Constructor.flags: Int[MyPropertyDescriptor]

'createConstructorStub' @ [223:17] ==> public fun createConstructorStub(parentStub: StubElement<out PsiElement>, constructorProto: ProtoBuf.Constructor, outerContext: ClsStubBuilderContext, protoContainer: ProtoContainer): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder in file CallableClsStubBuilder.kt[SimpleFunctionDescriptorImpl]

'classBody' @ [223:39] ==> value-parameter classBody: KotlinPlaceHolderStubImpl<KtClassBody> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createCallableMemberStubs[ValueParameterDescriptorImpl]

'secondaryConstructorProto' @ [223:50] ==> val secondaryConstructorProto: (ProtoBuf.Constructor..ProtoBuf.Constructor?) defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createCallableMemberStubs[LocalVariableDescriptor]

'c' @ [223:77] ==> private final val c: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'thisAsProtoContainer' @ [223:80] ==> private final val thisAsProtoContainer: ProtoContainer.Class defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'createDeclarationsStubs' @ [227:9] ==> public fun createDeclarationsStubs(parentStub: StubElement<out PsiElement>, outerContext: ClsStubBuilderContext, protoContainer: ProtoContainer, functionProtos: List<ProtoBuf.Function>, propertyProtos: List<ProtoBuf.Property>, typeAliasesProtos: List<ProtoBuf.TypeAlias>): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder in file CallableClsStubBuilder.kt[SimpleFunctionDescriptorImpl]

'classBody' @ [228:17] ==> value-parameter classBody: KotlinPlaceHolderStubImpl<KtClassBody> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createCallableMemberStubs[ValueParameterDescriptorImpl]

'c' @ [228:28] ==> private final val c: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'thisAsProtoContainer' @ [228:31] ==> private final val thisAsProtoContainer: ProtoContainer.Class defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'classProto' @ [228:53] ==> private final val classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'functionList' @ [228:64] ==> public final val ProtoBuf.Class.functionList: (MutableList<(ProtoBuf.Function..ProtoBuf.Function?)>..List<(ProtoBuf.Function..ProtoBuf.Function?)>?)[MyPropertyDescriptor]

'classProto' @ [228:78] ==> private final val classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'propertyList' @ [228:89] ==> public final val ProtoBuf.Class.propertyList: (MutableList<(ProtoBuf.Property..ProtoBuf.Property?)>..List<(ProtoBuf.Property..ProtoBuf.Property?)>?)[MyPropertyDescriptor]

'classProto' @ [228:103] ==> private final val classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'typeAliasList' @ [228:114] ==> public final val ProtoBuf.Class.typeAliasList: (MutableList<(ProtoBuf.TypeAlias..ProtoBuf.TypeAlias?)>..List<(ProtoBuf.TypeAlias..ProtoBuf.TypeAlias?)>?)[MyPropertyDescriptor]

'classKind' @ [232:16] ==> private final val classKind: ProtoBuf.Class.Kind defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'CLASS' @ [232:49] ==> enum entry CLASS defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class.Kind[FakeCallableDescriptorForObject]

'classKind' @ [233:16] ==> private final val classKind: ProtoBuf.Class.Kind defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'ENUM_CLASS' @ [233:49] ==> enum entry ENUM_CLASS defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class.Kind[FakeCallableDescriptorForObject]

'classKind' @ [234:16] ==> private final val classKind: ProtoBuf.Class.Kind defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'ANNOTATION_CLASS' @ [234:49] ==> enum entry ANNOTATION_CLASS defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class.Kind[FakeCallableDescriptorForObject]

'classProto' @ [238:9] ==> private final val classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'nestedClassNameList' @ [238:20] ==> public final val ProtoBuf.Class.nestedClassNameList: (MutableList<(Int..Int?)>..List<(Int..Int?)>?)[MyPropertyDescriptor]

'forEach' @ [238:40] ==> @HidesMembers public inline fun <T> Iterable<(Int..Int?)>.forEach(action: ((Int..Int?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Int..kotlin.Int?)

'c' @ [239:35] ==> private final val c: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'nameResolver' @ [239:37] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'getName' @ [239:50] ==> @NotNull public abstract fun getName(p0: Int): Name defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'id' @ [239:58] ==> value-parameter id: (Int..Int?) defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createInnerAndNestedClasses.<anonymous>[ValueParameterDescriptorImpl]

'nestedClassName' @ [240:17] ==> val nestedClassName: Name defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createInnerAndNestedClasses.<anonymous>[LocalVariableDescriptor]

'companionObjectName' @ [240:36] ==> private final val companionObjectName: Name? defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'classId' @ [241:37] ==> private final val classId: ClassId defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'createNestedClassId' @ [241:45] ==> @NotNull public open fun createNestedClassId(@NotNull p0: Name): ClassId defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'nestedClassName' @ [241:65] ==> val nestedClassName: Name defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createInnerAndNestedClasses.<anonymous>[LocalVariableDescriptor]

'createNestedClassStub' @ [242:17] ==> private final fun createNestedClassStub(classBody: StubElement<out PsiElement>, nestedClassId: ClassId): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[SimpleFunctionDescriptorImpl]

'classBody' @ [242:39] ==> value-parameter classBody: KotlinPlaceHolderStubImpl<KtClassBody> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createInnerAndNestedClasses[ValueParameterDescriptorImpl]

'nestedClassId' @ [242:50] ==> val nestedClassId: ClassId defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createInnerAndNestedClasses.<anonymous>[LocalVariableDescriptor]

'c' @ [248:35] ==> private final val c: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'components' @ [248:37] ==> public final val components: ClsStubBuilderComponents defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'classDataFinder' @ [248:48] ==> public final val classDataFinder: ClassDataFinder defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderComponents[PropertyDescriptorImpl]

'findClassData' @ [248:64] ==> @Nullable public abstract fun findClassData(@NotNull p0: ClassId): ClassDataWithSource? defined in org.jetbrains.kotlin.serialization.deserialization.ClassDataFinder[JavaMethodDescriptor]

'nestedClassId' @ [248:78] ==> value-parameter nestedClassId: ClassId defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createNestedClassStub[ValueParameterDescriptorImpl]

'classDataWithSource' @ [249:13] ==> val classDataWithSource: ClassDataWithSource? defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createNestedClassStub[LocalVariableDescriptor]

'c' @ [250:28] ==> private final val c: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'components' @ [250:30] ==> public final val components: ClsStubBuilderComponents defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'virtualFileForDebug' @ [250:41] ==> public final val virtualFileForDebug: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderComponents[PropertyDescriptorImpl]

'LOG' @ [251:13] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.Companion[PropertyDescriptorImpl]

'error' @ [251:17] ==> public open fun error(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'+' @ [252:21] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'nestedClassId' @ [252:66] ==> value-parameter nestedClassId: ClassId defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createNestedClassStub[ValueParameterDescriptorImpl]

'nestedClassId' @ [252:91] ==> value-parameter nestedClassId: ClassId defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createNestedClassStub[ValueParameterDescriptorImpl]

'outerClassId' @ [252:105] ==> public final val ClassId.outerClassId: ClassId?[MyPropertyDescriptor]

'rootFile' @ [253:35] ==> val rootFile: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createNestedClassStub[LocalVariableDescriptor]

'canonicalPath' @ [253:44] ==> public final val VirtualFile.canonicalPath: String?[MyPropertyDescriptor]

'rootFile' @ [254:29] ==> val rootFile: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createNestedClassStub[LocalVariableDescriptor]

'parent' @ [254:38] ==> public final val VirtualFile.parent: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'canonicalPath' @ [254:45] ==> public final val VirtualFile.canonicalPath: String?[MyPropertyDescriptor]

'rootFile' @ [256:21] ==> val rootFile: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createNestedClassStub[LocalVariableDescriptor]

'parent' @ [256:30] ==> public final val VirtualFile.parent: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'children' @ [256:37] ==> public final val VirtualFile.children: (Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>?)[MyPropertyDescriptor]

'sortedBy' @ [256:46] ==> public inline fun <T, R : Comparable<String>> Array<out (VirtualFile..VirtualFile?)>.sortedBy(crossinline selector: ((VirtualFile..VirtualFile?)) -> String?): List<(VirtualFile..VirtualFile?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)
    <R : Comparable<R>> -> String

'it' @ [256:57] ==> value-parameter it: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createNestedClassStub.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [256:60] ==> public final val VirtualFile.name: String[MyPropertyDescriptor]

'joinToString' @ [256:67] ==> public fun <T> Iterable<(VirtualFile..VirtualFile?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((VirtualFile..VirtualFile?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)

'it' @ [257:28] ==> value-parameter it: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createNestedClassStub.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [257:31] ==> public final val VirtualFile.name: String[MyPropertyDescriptor]

'it' @ [257:47] ==> value-parameter it: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createNestedClassStub.<anonymous>[ValueParameterDescriptorImpl]

'isValid' @ [257:50] ==> public final val VirtualFile.isValid: Boolean[MyPropertyDescriptor]

'component1' @ [262:14] ==> public final operator fun component1(): NameResolver defined in org.jetbrains.kotlin.serialization.ClassData[DeserializedSimpleFunctionDescriptor]

'component2' @ [262:28] ==> public final operator fun component2(): ProtoBuf.Class defined in org.jetbrains.kotlin.serialization.ClassData[DeserializedSimpleFunctionDescriptor]

'classDataWithSource' @ [262:42] ==> val classDataWithSource: ClassDataWithSource? defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createNestedClassStub[LocalVariableDescriptor]

'classData' @ [262:62] ==> public final val classData: ClassData defined in org.jetbrains.kotlin.serialization.ClassDataWithSource[DeserializedPropertyDescriptor]

'createClassStub' @ [263:9] ==> public fun createClassStub(parent: StubElement<out PsiElement>, classProto: ProtoBuf.Class, nameResolver: NameResolver, classId: ClassId, source: SourceElement?, context: ClsStubBuilderContext): Unit defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder in file ClassClsStubBuilder.kt[SimpleFunctionDescriptorImpl]

'classBody' @ [263:25] ==> value-parameter classBody: StubElement<out PsiElement> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createNestedClassStub[ValueParameterDescriptorImpl]

'classProto' @ [263:36] ==> val classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createNestedClassStub[LocalVariableDescriptor]

'nameResolver' @ [263:48] ==> val nameResolver: NameResolver defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createNestedClassStub[LocalVariableDescriptor]

'nestedClassId' @ [263:62] ==> value-parameter nestedClassId: ClassId defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createNestedClassStub[ValueParameterDescriptorImpl]

'classDataWithSource' @ [263:77] ==> val classDataWithSource: ClassDataWithSource? defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder.createNestedClassStub[LocalVariableDescriptor]

'sourceElement' @ [263:97] ==> public final val sourceElement: SourceElement defined in org.jetbrains.kotlin.serialization.ClassDataWithSource[DeserializedPropertyDescriptor]

'c' @ [263:112] ==> private final val c: ClsStubBuilderContext defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[PropertyDescriptorImpl]

'getInstance' @ [267:34] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'ClassClsStubBuilder' @ [267:46] ==> public companion object defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassClsStubBuilder[FakeCallableDescriptorForObject]

'java' @ [267:73] ==> public val <T> KClass<ClassClsStubBuilder>.java: Class<ClassClsStubBuilder> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ClassClsStubBuilder

