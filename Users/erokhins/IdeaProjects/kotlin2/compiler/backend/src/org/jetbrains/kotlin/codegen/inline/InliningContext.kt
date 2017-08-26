'InliningContext' @ [30:5] ==> public constructor InliningContext(parent: InliningContext?, expressionMap: Map<Int, LambdaInfo>, state: GenerationState, nameGenerator: NameGenerator, typeRemapper: TypeRemapper, lambdaInfo: LambdaInfo?, classRegeneration: Boolean) defined in org.jetbrains.kotlin.codegen.inline.InliningContext[ClassConstructorDescriptorImpl]

'expressionMap' @ [31:15] ==> value-parameter expressionMap: Map<Int, LambdaInfo> defined in org.jetbrains.kotlin.codegen.inline.RootInliningContext.<init>[ValueParameterDescriptorImpl]

'state' @ [31:30] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.codegen.inline.RootInliningContext.<init>[ValueParameterDescriptorImpl]

'nameGenerator' @ [31:37] ==> value-parameter nameGenerator: NameGenerator defined in org.jetbrains.kotlin.codegen.inline.RootInliningContext.<init>[ValueParameterDescriptorImpl]

'TypeRemapper' @ [31:52] ==> public companion object defined in org.jetbrains.kotlin.codegen.inline.TypeRemapper[FakeCallableDescriptorForObject]

'createRoot' @ [31:65] ==> @JvmStatic public final fun createRoot(formalTypeParameters: TypeParameterMappings?): TypeRemapper defined in org.jetbrains.kotlin.codegen.inline.TypeRemapper.Companion[SimpleFunctionDescriptorImpl]

'typeParameterMappings' @ [31:76] ==> value-parameter typeParameterMappings: TypeParameterMappings defined in org.jetbrains.kotlin.codegen.inline.RootInliningContext.<init>[ValueParameterDescriptorImpl]

'InliningContext' @ [42:5] ==> public constructor InliningContext(parent: InliningContext?, expressionMap: Map<Int, LambdaInfo>, state: GenerationState, nameGenerator: NameGenerator, typeRemapper: TypeRemapper, lambdaInfo: LambdaInfo?, classRegeneration: Boolean) defined in org.jetbrains.kotlin.codegen.inline.InliningContext[ClassConstructorDescriptorImpl]

'parent' @ [43:9] ==> value-parameter parent: InliningContext defined in org.jetbrains.kotlin.codegen.inline.RegeneratedClassContext.<init>[ValueParameterDescriptorImpl]

'expressionMap' @ [43:17] ==> value-parameter expressionMap: Map<Int, LambdaInfo> defined in org.jetbrains.kotlin.codegen.inline.RegeneratedClassContext.<init>[ValueParameterDescriptorImpl]

'state' @ [43:32] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.codegen.inline.RegeneratedClassContext.<init>[ValueParameterDescriptorImpl]

'nameGenerator' @ [43:39] ==> value-parameter nameGenerator: NameGenerator defined in org.jetbrains.kotlin.codegen.inline.RegeneratedClassContext.<init>[ValueParameterDescriptorImpl]

'typeRemapper' @ [43:54] ==> value-parameter typeRemapper: TypeRemapper defined in org.jetbrains.kotlin.codegen.inline.RegeneratedClassContext.<init>[ValueParameterDescriptorImpl]

'lambdaInfo' @ [43:68] ==> value-parameter lambdaInfo: LambdaInfo? defined in org.jetbrains.kotlin.codegen.inline.RegeneratedClassContext.<init>[ValueParameterDescriptorImpl]

'lambdaInfo' @ [56:28] ==> public final val lambdaInfo: LambdaInfo? defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'hashMapOf' @ [58:59] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<String, AnonymousObjectTransformationInfo> /* = HashMap<String, AnonymousObjectTransformationInfo> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> AnonymousObjectTransformationInfo

'parent' @ [62:27] ==> public final val parent: InliningContext? defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'if (isRoot) this as RootInliningContext else parent!!.root' @ [65:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: RootInliningContext, elseBranch: RootInliningContext): RootInliningContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> RootInliningContext

'isRoot' @ [65:21] ==> public final val isRoot: Boolean defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'this' @ [65:29] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.InliningContext[LazyClassReceiverParameterDescriptor]

'parent' @ [65:62] ==> public final val parent: InliningContext? defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'root' @ [65:71] ==> public final val root: RootInliningContext defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'subInline' @ [68:13] ==> @JvmOverloads public final fun subInline(generator: NameGenerator, additionalTypeMappings: Map<String, String?> = ..., lambdaInfo: LambdaInfo? = ...): InliningContext defined in org.jetbrains.kotlin.codegen.inline.InliningContext[SimpleFunctionDescriptorImpl]

'nameGenerator' @ [69:21] ==> public final val nameGenerator: NameGenerator defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'subGenerator' @ [69:35] ==> public open fun subGenerator(inliningMethod: (String..String?)): (NameGenerator..NameGenerator?) defined in org.jetbrains.kotlin.codegen.inline.NameGenerator[JavaMethodDescriptor]

'hashMapOf' @ [71:21] ==> public fun <K, V> hashMapOf(vararg pairs: Pair<String, Nothing?>): HashMap<String, Nothing?> /* = HashMap<String, Nothing?> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Nothing?

'lambdaInfo' @ [71:31] ==> value-parameter lambdaInfo: LambdaInfo defined in org.jetbrains.kotlin.codegen.inline.InliningContext.subInlineLambda[ValueParameterDescriptorImpl]

'lambdaClassType' @ [71:42] ==> public abstract val lambdaClassType: Type defined in org.jetbrains.kotlin.codegen.inline.LambdaInfo[PropertyDescriptorImpl]

'internalName' @ [71:58] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'lambdaInfo' @ [72:21] ==> value-parameter lambdaInfo: LambdaInfo defined in org.jetbrains.kotlin.codegen.inline.InliningContext.subInlineLambda[ValueParameterDescriptorImpl]

'RegeneratedClassContext' @ [79:26] ==> public constructor RegeneratedClassContext(parent: InliningContext, expressionMap: Map<Int, LambdaInfo>, state: GenerationState, nameGenerator: NameGenerator, typeRemapper: TypeRemapper, lambdaInfo: LambdaInfo?, callSiteInfo: InlineCallSiteInfo) defined in org.jetbrains.kotlin.codegen.inline.RegeneratedClassContext[ClassConstructorDescriptorImpl]

'this' @ [80:13] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.InliningContext[LazyClassReceiverParameterDescriptor]

'expressionMap' @ [80:19] ==> private final val expressionMap: Map<Int, LambdaInfo> defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'state' @ [80:34] ==> public final val state: GenerationState defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'generator' @ [80:41] ==> value-parameter generator: NameGenerator defined in org.jetbrains.kotlin.codegen.inline.InliningContext.subInlineWithClassRegeneration[ValueParameterDescriptorImpl]

'TypeRemapper' @ [80:52] ==> public companion object defined in org.jetbrains.kotlin.codegen.inline.TypeRemapper[FakeCallableDescriptorForObject]

'createFrom' @ [80:65] ==> @JvmStatic @JvmOverloads public final fun createFrom(parentRemapper: TypeRemapper, mappings: Map<String, String?>, isRootInlineLambda: Boolean = ...): TypeRemapper defined in org.jetbrains.kotlin.codegen.inline.TypeRemapper.Companion[SimpleFunctionDescriptorImpl]

'typeRemapper' @ [80:76] ==> public final val typeRemapper: TypeRemapper defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'newTypeMappings' @ [80:90] ==> value-parameter newTypeMappings: MutableMap<String, String> defined in org.jetbrains.kotlin.codegen.inline.InliningContext.subInlineWithClassRegeneration[ValueParameterDescriptorImpl]

'lambdaInfo' @ [81:13] ==> public final val lambdaInfo: LambdaInfo? defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'callSiteInfo' @ [81:25] ==> value-parameter callSiteInfo: InlineCallSiteInfo defined in org.jetbrains.kotlin.codegen.inline.InliningContext.subInlineWithClassRegeneration[ValueParameterDescriptorImpl]

'JvmOverloads' @ [84:5] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'emptyMap' @ [87:60] ==> public fun <K, V> emptyMap(): Map<String, String?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String?

'this' @ [88:39] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.InliningContext[LazyClassReceiverParameterDescriptor]

'lambdaInfo' @ [88:44] ==> public final val lambdaInfo: LambdaInfo? defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'lambdaInfo' @ [90:32] ==> value-parameter lambdaInfo: LambdaInfo? = ... defined in org.jetbrains.kotlin.codegen.inline.InliningContext.subInline[ValueParameterDescriptorImpl]

'InliningContext' @ [91:16] ==> public constructor InliningContext(parent: InliningContext?, expressionMap: Map<Int, LambdaInfo>, state: GenerationState, nameGenerator: NameGenerator, typeRemapper: TypeRemapper, lambdaInfo: LambdaInfo?, classRegeneration: Boolean) defined in org.jetbrains.kotlin.codegen.inline.InliningContext[ClassConstructorDescriptorImpl]

'this' @ [92:17] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.InliningContext[LazyClassReceiverParameterDescriptor]

'expressionMap' @ [92:23] ==> private final val expressionMap: Map<Int, LambdaInfo> defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'state' @ [92:38] ==> public final val state: GenerationState defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'generator' @ [92:45] ==> value-parameter generator: NameGenerator defined in org.jetbrains.kotlin.codegen.inline.InliningContext.subInline[ValueParameterDescriptorImpl]

'TypeRemapper' @ [93:17] ==> public companion object defined in org.jetbrains.kotlin.codegen.inline.TypeRemapper[FakeCallableDescriptorForObject]

'createFrom' @ [93:30] ==> @JvmStatic @JvmOverloads public final fun createFrom(parentRemapper: TypeRemapper, mappings: Map<String, String?>, isRootInlineLambda: Boolean = ...): TypeRemapper defined in org.jetbrains.kotlin.codegen.inline.TypeRemapper.Companion[SimpleFunctionDescriptorImpl]

'typeRemapper' @ [94:25] ==> public final val typeRemapper: TypeRemapper defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'additionalTypeMappings' @ [95:25] ==> value-parameter additionalTypeMappings: Map<String, String?> = ... defined in org.jetbrains.kotlin.codegen.inline.InliningContext.subInline[ValueParameterDescriptorImpl]

'isInliningLambda' @ [97:25] ==> val isInliningLambda: Boolean defined in org.jetbrains.kotlin.codegen.inline.InliningContext.subInline[LocalVariableDescriptor]

'!' @ [97:45] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'this' @ [97:46] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.InliningContext[LazyClassReceiverParameterDescriptor]

'isInliningLambda' @ [97:51] ==> public final val isInliningLambda: Boolean defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'lambdaInfo' @ [99:17] ==> value-parameter lambdaInfo: LambdaInfo? = ... defined in org.jetbrains.kotlin.codegen.inline.InliningContext.subInline[ValueParameterDescriptorImpl]

'classRegeneration' @ [99:29] ==> public final val classRegeneration: Boolean defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'parent' @ [105:20] ==> public final val parent: InliningContext? defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'callSiteInfo' @ [105:29] ==> public open val callSiteInfo: InlineCallSiteInfo defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'root' @ [109:16] ==> public final val root: RootInliningContext defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'internalNameToAnonymousObjectTransformationInfo' @ [109:21] ==> public final val internalNameToAnonymousObjectTransformationInfo: HashMap<String, AnonymousObjectTransformationInfo> /* = HashMap<String, AnonymousObjectTransformationInfo> */ defined in org.jetbrains.kotlin.codegen.inline.RootInliningContext[PropertyDescriptorImpl]

'internalName' @ [109:69] ==> value-parameter internalName: String defined in org.jetbrains.kotlin.codegen.inline.InliningContext.findAnonymousObjectTransformationInfo[ValueParameterDescriptorImpl]

