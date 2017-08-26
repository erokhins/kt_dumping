'inliningContext' @ [51:30] ==> private final val inliningContext: InliningContext defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'state' @ [51:46] ==> public final val state: GenerationState defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'typeMapper' @ [51:52] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'ArrayList' @ [52:31] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> InvokeCall

'ArrayList' @ [54:35] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TransformationInfo

'HashMap' @ [56:38] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> String
    <V : (Any..Any?)> -> String

'InlineResult' @ [57:26] ==> public companion object defined in org.jetbrains.kotlin.codegen.inline.InlineResult[FakeCallableDescriptorForObject]

'create' @ [57:39] ==> @JvmStatic public final fun create(): InlineResult defined in org.jetbrains.kotlin.codegen.inline.InlineResult.Companion[SimpleFunctionDescriptorImpl]

'doInline' @ [66:16] ==> private final fun doInline(adapter: MethodVisitor, remapper: LocalVarRemapper, remapReturn: Boolean, labelOwner: LabelOwner, finallyDeepShift: Int): InlineResult defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[SimpleFunctionDescriptorImpl]

'adapter' @ [66:25] ==> value-parameter adapter: MethodVisitor defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[ValueParameterDescriptorImpl]

'remapper' @ [66:34] ==> value-parameter remapper: LocalVarRemapper defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[ValueParameterDescriptorImpl]

'remapReturn' @ [66:44] ==> value-parameter remapReturn: Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[ValueParameterDescriptorImpl]

'labelOwner' @ [66:57] ==> value-parameter labelOwner: LabelOwner defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[ValueParameterDescriptorImpl]

'markPlacesForInlineAndRemoveInlinable' @ [77:31] ==> private final fun markPlacesForInlineAndRemoveInlinable(node: MethodNode, labelOwner: LabelOwner, finallyDeepShift: Int): MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[SimpleFunctionDescriptorImpl]

'node' @ [77:69] ==> private final val node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'labelOwner' @ [77:75] ==> value-parameter labelOwner: LabelOwner defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[ValueParameterDescriptorImpl]

'finallyDeepShift' @ [77:87] ==> value-parameter finallyDeepShift: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[ValueParameterDescriptorImpl]

'inliningContext' @ [78:13] ==> private final val inliningContext: InliningContext defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'isInliningLambda' @ [78:29] ==> public final val isInliningLambda: Boolean defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'isDefaultLambdaWithReification' @ [78:49] ==> private final fun isDefaultLambdaWithReification(lambdaInfo: LambdaInfo): Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[SimpleFunctionDescriptorImpl]

'inliningContext' @ [78:80] ==> private final val inliningContext: InliningContext defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'lambdaInfo' @ [78:96] ==> public final val lambdaInfo: LambdaInfo? defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'inliningContext' @ [80:13] ==> private final val inliningContext: InliningContext defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'root' @ [80:29] ==> public final val root: RootInliningContext defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'inlineMethodReifier' @ [80:34] ==> public final val inlineMethodReifier: ReifiedTypeInliner defined in org.jetbrains.kotlin.codegen.inline.RootInliningContext[PropertyDescriptorImpl]

'reifyInstructions' @ [80:54] ==> public final fun reifyInstructions(node: MethodNode): ReifiedTypeParametersUsages defined in org.jetbrains.kotlin.codegen.inline.ReifiedTypeInliner[SimpleFunctionDescriptorImpl]

'transformedNode' @ [80:72] ==> var transformedNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[LocalVariableDescriptor]

'Label' @ [84:19] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'transformedNode' @ [85:9] ==> var transformedNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[LocalVariableDescriptor]

'doInline' @ [85:27] ==> private final fun doInline(node: MethodNode): MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[SimpleFunctionDescriptorImpl]

'transformedNode' @ [85:36] ==> var transformedNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[LocalVariableDescriptor]

'removeClosureAssertions' @ [86:9] ==> private final fun removeClosureAssertions(node: MethodNode): Unit defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion[SimpleFunctionDescriptorImpl]

'transformedNode' @ [86:33] ==> var transformedNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[LocalVariableDescriptor]

'transformedNode' @ [87:9] ==> var transformedNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[LocalVariableDescriptor]

'instructions' @ [87:25] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'resetLabels' @ [87:38] ==> public open fun resetLabels(): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'MethodNode' @ [89:26] ==> public constructor MethodNode(p0: Int, p1: Int, p2: (String..String?), p3: (String..String?), p4: (String..String?), p5: (Array<(String..String?)>..Array<out (String..String?)>?)) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaClassConstructorDescriptor]

'API' @ [90:17] ==> public const val API: Int defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[PropertyDescriptorImpl]

'transformedNode' @ [90:22] ==> var transformedNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[LocalVariableDescriptor]

'access' @ [90:38] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'transformedNode' @ [90:46] ==> var transformedNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[LocalVariableDescriptor]

'name' @ [90:62] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'transformedNode' @ [90:68] ==> var transformedNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[LocalVariableDescriptor]

'desc' @ [90:84] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'transformedNode' @ [91:17] ==> var transformedNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[LocalVariableDescriptor]

'signature' @ [91:33] ==> public final var signature: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'transformedNode' @ [91:44] ==> var transformedNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[LocalVariableDescriptor]

'exceptions' @ [91:60] ==> public final var exceptions: (MutableList<(String..String?)>..List<(String..String?)>?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'toTypedArray' @ [91:72] ==> public inline fun <reified T> Collection<(String..String?)>.toTypedArray(): Array<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (kotlin.String..kotlin.String?)

'RemapVisitor' @ [93:23] ==> public constructor RemapVisitor(@NotNull mv: MethodVisitor, @NotNull remapper: LocalVarRemapper, @NotNull nodeRemapper: FieldRemapper, copyAnnotationsAndAttributes: Boolean) defined in org.jetbrains.kotlin.codegen.inline.RemapVisitor[JavaClassConstructorDescriptor]

'resultNode' @ [94:17] ==> val resultNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[LocalVariableDescriptor]

'remapper' @ [94:29] ==> value-parameter remapper: LocalVarRemapper defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[ValueParameterDescriptorImpl]

'nodeRemapper' @ [94:39] ==> private final val nodeRemapper: FieldRemapper defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'nodeRemapper' @ [96:17] ==> private final val nodeRemapper: FieldRemapper defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'transformedNode' @ [99:13] ==> var transformedNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[LocalVariableDescriptor]

'accept' @ [99:29] ==> public open fun accept(p0: (MethodVisitor..MethodVisitor?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaMethodDescriptor]

'visitor' @ [99:36] ==> val visitor: RemapVisitor defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[LocalVariableDescriptor]

'wrapException' @ [102:19] ==> private final fun wrapException(originalException: Throwable, node: MethodNode, errorSuffix: String): RuntimeException /* = RuntimeException */ defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[SimpleFunctionDescriptorImpl]

'e' @ [102:33] ==> val e: Throwable defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[LocalVariableDescriptor]

'transformedNode' @ [102:36] ==> var transformedNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[LocalVariableDescriptor]

'resultNode' @ [105:9] ==> val resultNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[LocalVariableDescriptor]

'visitLabel' @ [105:20] ==> public open fun visitLabel(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaMethodDescriptor]

'end' @ [105:31] ==> val end: Label defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[LocalVariableDescriptor]

'inliningContext' @ [107:13] ==> private final val inliningContext: InliningContext defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'isRoot' @ [107:29] ==> public final val isRoot: Boolean defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'remapper' @ [108:30] ==> value-parameter remapper: LocalVarRemapper defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[ValueParameterDescriptorImpl]

'remap' @ [108:39] ==> public final fun remap(index: Int): LocalVarRemapper.RemapInfo defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper[SimpleFunctionDescriptorImpl]

'parameters' @ [108:45] ==> private final val parameters: Parameters defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'argsSizeOnStack' @ [108:56] ==> public final val argsSizeOnStack: Int defined in org.jetbrains.kotlin.codegen.inline.Parameters[PropertyDescriptorImpl]

'value' @ [108:77] ==> @JvmField public final val value: StackValue? defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.RemapInfo[PropertyDescriptorImpl]

'processInlineFunFinallyBlocks' @ [109:41] ==> public open fun processInlineFunFinallyBlocks(@NotNull inlineFun: MethodNode, lambdaTryCatchBlockNodes: Int, finallyParamOffset: Int): Unit defined in org.jetbrains.kotlin.codegen.inline.InternalFinallyBlockInliner[JavaMethodDescriptor]

'resultNode' @ [110:21] ==> val resultNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[LocalVariableDescriptor]

'lambdasFinallyBlocks' @ [110:33] ==> private final var lambdasFinallyBlocks: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'remapValue' @ [110:56] ==> val remapValue: StackValue? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[LocalVariableDescriptor]

'index' @ [110:88] ==> public final val index: Int defined in org.jetbrains.kotlin.codegen.StackValue.Local[JavaPropertyDescriptor]

'processReturns' @ [114:9] ==> @JvmStatic public final fun processReturns(node: MethodNode, labelOwner: LabelOwner, remapReturn: Boolean, endLabel: Label?): List<MethodInliner.PointForExternalFinallyBlocks> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion[SimpleFunctionDescriptorImpl]

'resultNode' @ [114:24] ==> val resultNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[LocalVariableDescriptor]

'labelOwner' @ [114:36] ==> value-parameter labelOwner: LabelOwner defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[ValueParameterDescriptorImpl]

'remapReturn' @ [114:48] ==> value-parameter remapReturn: Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[ValueParameterDescriptorImpl]

'end' @ [114:61] ==> val end: Label defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[LocalVariableDescriptor]

'resultNode' @ [116:9] ==> val resultNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[LocalVariableDescriptor]

'accept' @ [116:20] ==> public open fun accept(p0: (MethodVisitor..MethodVisitor?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaMethodDescriptor]

'MethodBodyVisitor' @ [116:27] ==> public constructor MethodBodyVisitor(mv: MethodVisitor, visitAnnotationsAndAttributes: Boolean = ...) defined in org.jetbrains.kotlin.codegen.inline.MethodBodyVisitor[ClassConstructorDescriptorImpl]

'adapter' @ [116:45] ==> value-parameter adapter: MethodVisitor defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[ValueParameterDescriptorImpl]

'sourceMapper' @ [118:9] ==> private final val sourceMapper: SourceMapper defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'endMapping' @ [118:22] ==> public open fun endMapping(): Unit defined in org.jetbrains.kotlin.codegen.inline.SourceMapper[SimpleFunctionDescriptorImpl]

'result' @ [119:16] ==> private final val result: InlineResult defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'LinkedList' @ [123:30] ==> public constructor LinkedList<E : (Any..Any?)>(p0: (MutableCollection<out (InvokeCall..InvokeCall?)>..Collection<(InvokeCall..InvokeCall?)>?)) defined in java.util.LinkedList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (org.jetbrains.kotlin.codegen.inline.InvokeCall..org.jetbrains.kotlin.codegen.inline.InvokeCall?)

'invokeCalls' @ [123:41] ==> private final val invokeCalls: ArrayList<InvokeCall> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'MethodNode' @ [125:26] ==> public constructor MethodNode(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: (Array<(String..String?)>..Array<out (String..String?)>?)) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaClassConstructorDescriptor]

'node' @ [125:37] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[ValueParameterDescriptorImpl]

'access' @ [125:42] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'node' @ [125:50] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[ValueParameterDescriptorImpl]

'name' @ [125:55] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'node' @ [125:61] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[ValueParameterDescriptorImpl]

'desc' @ [125:66] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'node' @ [125:72] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[ValueParameterDescriptorImpl]

'signature' @ [125:77] ==> public final var signature: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'transformations' @ [127:24] ==> private final val transformations: ArrayList<TransformationInfo> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'iterator' @ [127:40] ==> public open fun iterator(): MutableIterator<TransformationInfo> defined in java.util.ArrayList[JavaMethodDescriptor]

'TypeRemapper' @ [129:24] ==> public companion object defined in org.jetbrains.kotlin.codegen.inline.TypeRemapper[FakeCallableDescriptorForObject]

'createFrom' @ [129:37] ==> @JvmStatic public final fun createFrom(mappings: MutableMap<String, String>): TypeRemapper defined in org.jetbrains.kotlin.codegen.inline.TypeRemapper.Companion[SimpleFunctionDescriptorImpl]

'currentTypeMapping' @ [129:48] ==> private final val currentTypeMapping: HashMap<String, String> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'RemappingMethodAdapter' @ [130:38] ==> public constructor RemappingMethodAdapter(p0: Int, p1: (String..String?), p2: (MethodVisitor..MethodVisitor?), p3: (Remapper..Remapper?)) defined in org.jetbrains.org.objectweb.asm.commons.RemappingMethodAdapter[JavaClassConstructorDescriptor]

'resultNode' @ [131:17] ==> val resultNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[LocalVariableDescriptor]

'access' @ [131:28] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'resultNode' @ [132:17] ==> val resultNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[LocalVariableDescriptor]

'desc' @ [132:28] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'resultNode' @ [133:17] ==> val resultNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[LocalVariableDescriptor]

'AsmTypeRemapper' @ [134:17] ==> public constructor AsmTypeRemapper(typeRemapper: TypeRemapper, result: InlineResult) defined in org.jetbrains.kotlin.codegen.inline.AsmTypeRemapper[ClassConstructorDescriptorImpl]

'remapper' @ [134:33] ==> val remapper: TypeRemapper defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[LocalVariableDescriptor]

'result' @ [134:43] ==> private final val result: InlineResult defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'calcMarkerShift' @ [137:27] ==> internal fun calcMarkerShift(parameters: Parameters, node: MethodNode): Int defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'parameters' @ [137:43] ==> private final val parameters: Parameters defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'node' @ [137:55] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[ValueParameterDescriptorImpl]

'InlineAdapter' @ [138:38] ==> public constructor InlineAdapter(@NotNull mv: MethodVisitor, localsSize: Int, @NotNull sourceMapper: SourceMapper) defined in org.jetbrains.kotlin.codegen.inline.InlineAdapter[JavaClassConstructorDescriptor]

'remappingMethodAdapter' @ [138:52] ==> val remappingMethodAdapter: RemappingMethodAdapter defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[LocalVariableDescriptor]

'parameters' @ [138:76] ==> private final val parameters: Parameters defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'argsSizeOnStack' @ [138:87] ==> public final val argsSizeOnStack: Int defined in org.jetbrains.kotlin.codegen.inline.Parameters[PropertyDescriptorImpl]

'sourceMapper' @ [138:104] ==> private final val sourceMapper: SourceMapper defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'transformationInfo' @ [142:17] ==> private final var transformationInfo: TransformationInfo? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>[PropertyDescriptorImpl]

'iterator' @ [142:38] ==> val iterator: MutableIterator<TransformationInfo> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[LocalVariableDescriptor]

'next' @ [142:47] ==> public abstract fun next(): TransformationInfo defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'transformationInfo' @ [144:36] ==> private final var transformationInfo: TransformationInfo? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>[PropertyDescriptorImpl]

'oldClassName' @ [144:57] ==> public abstract val oldClassName: String defined in org.jetbrains.kotlin.codegen.inline.TransformationInfo[PropertyDescriptorImpl]

'if (transformationInfo!!.shouldRegenerate(isSameModule)) {
                    //TODO: need poping of type but what to do with local funs???
                    val newClassName = transformationInfo!!.newClassName
                    remapper.addMapping(oldClassName, newClassName)

                    val childInliningContext = inliningContext.subInlineWithClassRegeneration(
                            inliningContext.nameGenerator,
                            currentTypeMapping,
                            inlineCallSiteInfo
                    )
                    val transformer = transformationInfo!!.createTransformer(childInliningContext, isSameModule)

                    val transformResult = transformer.doTransform(nodeRemapper)
                    result.merge(transformResult)
                    result.addChangedType(oldClassName, newClassName)

                    if (inliningContext.isInliningLambda && transformationInfo!!.canRemoveAfterTransformation()) {
                        // this class is transformed and original not used so we should remove original one after inlining
                        result.addClassToRemove(oldClassName)
                    }

                    if (transformResult.reifiedTypeParametersUsages.wereUsedReifiedParameters()) {
                        ReifiedTypeInliner.putNeedClassReificationMarker(mv)
                        result.reifiedTypeParametersUsages.mergeAll(transformResult.reifiedTypeParametersUsages)
                    }
                }
                else if (!transformationInfo!!.wasAlreadyRegenerated) {
                    result.addNotChangedClass(oldClassName)
                }' @ [145:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'transformationInfo' @ [145:21] ==> private final var transformationInfo: TransformationInfo? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>[PropertyDescriptorImpl]

'shouldRegenerate' @ [145:42] ==> public abstract fun shouldRegenerate(sameModule: Boolean): Boolean defined in org.jetbrains.kotlin.codegen.inline.TransformationInfo[SimpleFunctionDescriptorImpl]

'isSameModule' @ [145:59] ==> private final val isSameModule: Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'transformationInfo' @ [147:40] ==> private final var transformationInfo: TransformationInfo? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>[PropertyDescriptorImpl]

'newClassName' @ [147:61] ==> public open val newClassName: String defined in org.jetbrains.kotlin.codegen.inline.TransformationInfo[PropertyDescriptorImpl]

'remapper' @ [148:21] ==> val remapper: TypeRemapper defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[LocalVariableDescriptor]

'addMapping' @ [148:30] ==> public final fun addMapping(type: String, newType: String): Unit defined in org.jetbrains.kotlin.codegen.inline.TypeRemapper[SimpleFunctionDescriptorImpl]

'oldClassName' @ [148:41] ==> val oldClassName: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.handleAnonymousObjectRegeneration[LocalVariableDescriptor]

'newClassName' @ [148:55] ==> val newClassName: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.handleAnonymousObjectRegeneration[LocalVariableDescriptor]

'inliningContext' @ [150:48] ==> private final val inliningContext: InliningContext defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'subInlineWithClassRegeneration' @ [150:64] ==> public final fun subInlineWithClassRegeneration(generator: NameGenerator, newTypeMappings: MutableMap<String, String>, callSiteInfo: InlineCallSiteInfo): InliningContext defined in org.jetbrains.kotlin.codegen.inline.InliningContext[SimpleFunctionDescriptorImpl]

'inliningContext' @ [151:29] ==> private final val inliningContext: InliningContext defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'nameGenerator' @ [151:45] ==> public final val nameGenerator: NameGenerator defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'currentTypeMapping' @ [152:29] ==> private final val currentTypeMapping: HashMap<String, String> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'inlineCallSiteInfo' @ [153:29] ==> private final val inlineCallSiteInfo: InlineCallSiteInfo defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'transformationInfo' @ [155:39] ==> private final var transformationInfo: TransformationInfo? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>[PropertyDescriptorImpl]

'createTransformer' @ [155:60] ==> public abstract fun createTransformer(inliningContext: InliningContext, sameModule: Boolean): ObjectTransformer<*> defined in org.jetbrains.kotlin.codegen.inline.TransformationInfo[SimpleFunctionDescriptorImpl]

'childInliningContext' @ [155:78] ==> val childInliningContext: InliningContext defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.handleAnonymousObjectRegeneration[LocalVariableDescriptor]

'isSameModule' @ [155:100] ==> private final val isSameModule: Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'transformer' @ [157:43] ==> val transformer: ObjectTransformer<*> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.handleAnonymousObjectRegeneration[LocalVariableDescriptor]

'doTransform' @ [157:55] ==> public abstract fun doTransform(parentRemapper: FieldRemapper): InlineResult defined in org.jetbrains.kotlin.codegen.inline.ObjectTransformer[SimpleFunctionDescriptorImpl]

'nodeRemapper' @ [157:67] ==> private final val nodeRemapper: FieldRemapper defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'result' @ [158:21] ==> private final val result: InlineResult defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'merge' @ [158:28] ==> public final fun merge(child: InlineResult): Unit defined in org.jetbrains.kotlin.codegen.inline.InlineResult[SimpleFunctionDescriptorImpl]

'transformResult' @ [158:34] ==> val transformResult: InlineResult defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.handleAnonymousObjectRegeneration[LocalVariableDescriptor]

'result' @ [159:21] ==> private final val result: InlineResult defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'addChangedType' @ [159:28] ==> public final fun addChangedType(oldClassInternalName: String, newClassInternalName: String): Unit defined in org.jetbrains.kotlin.codegen.inline.InlineResult[SimpleFunctionDescriptorImpl]

'oldClassName' @ [159:43] ==> val oldClassName: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.handleAnonymousObjectRegeneration[LocalVariableDescriptor]

'newClassName' @ [159:57] ==> val newClassName: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.handleAnonymousObjectRegeneration[LocalVariableDescriptor]

'inliningContext' @ [161:25] ==> private final val inliningContext: InliningContext defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'isInliningLambda' @ [161:41] ==> public final val isInliningLambda: Boolean defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'transformationInfo' @ [161:61] ==> private final var transformationInfo: TransformationInfo? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>[PropertyDescriptorImpl]

'canRemoveAfterTransformation' @ [161:82] ==> public abstract fun canRemoveAfterTransformation(): Boolean defined in org.jetbrains.kotlin.codegen.inline.TransformationInfo[SimpleFunctionDescriptorImpl]

'result' @ [163:25] ==> private final val result: InlineResult defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'addClassToRemove' @ [163:32] ==> public final fun addClassToRemove(classInternalName: String): Unit defined in org.jetbrains.kotlin.codegen.inline.InlineResult[SimpleFunctionDescriptorImpl]

'oldClassName' @ [163:49] ==> val oldClassName: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.handleAnonymousObjectRegeneration[LocalVariableDescriptor]

'transformResult' @ [166:25] ==> val transformResult: InlineResult defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.handleAnonymousObjectRegeneration[LocalVariableDescriptor]

'reifiedTypeParametersUsages' @ [166:41] ==> public final val reifiedTypeParametersUsages: ReifiedTypeParametersUsages defined in org.jetbrains.kotlin.codegen.inline.InlineResult[PropertyDescriptorImpl]

'wereUsedReifiedParameters' @ [166:69] ==> public final fun wereUsedReifiedParameters(): Boolean defined in org.jetbrains.kotlin.codegen.inline.ReifiedTypeParametersUsages[SimpleFunctionDescriptorImpl]

'ReifiedTypeInliner' @ [167:25] ==> public companion object defined in org.jetbrains.kotlin.codegen.inline.ReifiedTypeInliner[FakeCallableDescriptorForObject]

'putNeedClassReificationMarker' @ [167:44] ==> @JvmStatic public final fun putNeedClassReificationMarker(v: MethodVisitor): Unit defined in org.jetbrains.kotlin.codegen.inline.ReifiedTypeInliner.Companion[SimpleFunctionDescriptorImpl]

'mv' @ [167:74] ==> protected/*protected and package*/ final var mv: (MethodVisitor..MethodVisitor?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>[JavaPropertyDescriptor]

'result' @ [168:25] ==> private final val result: InlineResult defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'reifiedTypeParametersUsages' @ [168:32] ==> public final val reifiedTypeParametersUsages: ReifiedTypeParametersUsages defined in org.jetbrains.kotlin.codegen.inline.InlineResult[PropertyDescriptorImpl]

'mergeAll' @ [168:60] ==> public final fun mergeAll(other: ReifiedTypeParametersUsages): Unit defined in org.jetbrains.kotlin.codegen.inline.ReifiedTypeParametersUsages[SimpleFunctionDescriptorImpl]

'transformResult' @ [168:69] ==> val transformResult: InlineResult defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.handleAnonymousObjectRegeneration[LocalVariableDescriptor]

'reifiedTypeParametersUsages' @ [168:85] ==> public final val reifiedTypeParametersUsages: ReifiedTypeParametersUsages defined in org.jetbrains.kotlin.codegen.inline.InlineResult[PropertyDescriptorImpl]

'!' @ [171:26] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'transformationInfo' @ [171:27] ==> private final var transformationInfo: TransformationInfo? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>[PropertyDescriptorImpl]

'wasAlreadyRegenerated' @ [171:48] ==> public open val wasAlreadyRegenerated: Boolean defined in org.jetbrains.kotlin.codegen.inline.TransformationInfo[PropertyDescriptorImpl]

'result' @ [172:21] ==> private final val result: InlineResult defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'addNotChangedClass' @ [172:28] ==> public final fun addNotChangedClass(classInternalName: String): Unit defined in org.jetbrains.kotlin.codegen.inline.InlineResult[SimpleFunctionDescriptorImpl]

'oldClassName' @ [172:47] ==> val oldClassName: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.handleAnonymousObjectRegeneration[LocalVariableDescriptor]

'isAnonymousClass' @ [177:21] ==> internal fun isAnonymousClass(internalName: String): Boolean defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'type' @ [177:38] ==> value-parameter type: Type defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.anew[ValueParameterDescriptorImpl]

'internalName' @ [177:43] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'handleAnonymousObjectRegeneration' @ [178:21] ==> private final fun handleAnonymousObjectRegeneration(): Unit defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>[SimpleFunctionDescriptorImpl]

'super' @ [182:17] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>[LazyClassReceiverParameterDescriptor]

'anew' @ [182:23] ==> public open fun anew(p0: (Type..Type?)): Unit defined in org.jetbrains.kotlin.codegen.inline.InlineAdapter[JavaMethodDescriptor]

'type' @ [182:28] ==> value-parameter type: Type defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.anew[ValueParameterDescriptorImpl]

'if (/*INLINE_RUNTIME.equals(owner) &&*/ isInvokeOnLambda(owner, name)) { //TODO add method
                    assert(!currentInvokes.isEmpty())
                    val invokeCall = currentInvokes.remove()
                    val info = invokeCall.lambdaInfo

                    if (info == null) {
                        //noninlinable lambda
                        super.visitMethodInsn(opcode, owner, name, desc, itf)
                        return
                    }

                    val valueParamShift = Math.max(nextLocalIndex, markerShift)//NB: don't inline cause it changes
                    putStackValuesIntoLocals(listOf(*info.invokeMethod.argumentTypes), valueParamShift, this, desc)

                    if (invokeCall.lambdaInfo.invokeMethodDescriptor.valueParameters.isEmpty()) {
                        // There won't be no parameters processing and line call can be left without actual instructions.
                        // Note: if function is called on the line with other instructions like 1 + foo(), 'nop' will still be generated.
                        visitInsn(Opcodes.NOP)
                    }

                    addInlineMarker(this, true)
                    val lambdaParameters = info.addAllParameters(nodeRemapper)

                    val newCapturedRemapper = InlinedLambdaRemapper(
                            info.lambdaClassType.internalName, nodeRemapper, lambdaParameters,
                            info is DefaultLambda && info.isBoundCallableReference
                    )

                    setLambdaInlining(true)
                    val lambdaSMAP = info.node.classSMAP

                    val sourceMapper = if (inliningContext.classRegeneration && !inliningContext.isInliningLambda)
                        NestedSourceMapper(sourceMapper, lambdaSMAP.intervals, lambdaSMAP.sourceInfo)
                    else
                        InlineLambdaSourceMapper(sourceMapper.parent!!, info.node)
                    val inliner = MethodInliner(
                            info.node.node, lambdaParameters, inliningContext.subInlineLambda(info),
                            newCapturedRemapper, true /*cause all calls in same module as lambda*/,
                            "Lambda inlining " + info.lambdaClassType.internalName,
                            sourceMapper, inlineCallSiteInfo, null
                    )

                    val varRemapper = LocalVarRemapper(lambdaParameters, valueParamShift)
                    //TODO add skipped this and receiver
                    val lambdaResult = inliner.doInline(this.mv, varRemapper, true, info, invokeCall.finallyDepthShift)
                    result.mergeWithNotChangeInfo(lambdaResult)
                    result.reifiedTypeParametersUsages.mergeAll(lambdaResult.reifiedTypeParametersUsages)

                    //return value boxing/unboxing
                    val bridge = typeMapper.mapAsmMethod(ClosureCodegen.getErasedInvokeFunction(info.invokeMethodDescriptor))
                    StackValue.onStack(info.invokeMethod.returnType).put(bridge.returnType, this)
                    setLambdaInlining(false)
                    addInlineMarker(this, false)
                    sourceMapper.endMapping()
                    inlineOnlySmapSkipper?.markCallSiteLineNumber(remappingMethodAdapter)
                }
                else if (isAnonymousConstructorCall(owner, name)) { //TODO add method
                    //TODO add proper message
                    assert(transformationInfo is AnonymousObjectTransformationInfo) {
                        "<init> call doesn't correspond to object transformation info for '$owner.$name': $transformationInfo"
                    }
                    val parent = inliningContext.parent
                    val shouldRegenerate = transformationInfo!!.shouldRegenerate(isSameModule)
                    val isContinuation = parent != null && parent.isContinuation
                    if (shouldRegenerate || isContinuation) {
                        assert(shouldRegenerate || inlineCallSiteInfo.ownerClassName == transformationInfo!!.oldClassName) { "Only coroutines can call their own constructors" }

                        //put additional captured parameters on stack
                        var info = transformationInfo as AnonymousObjectTransformationInfo

                        val oldInfo = inliningContext.findAnonymousObjectTransformationInfo(owner)
                        if (oldInfo != null && isContinuation) {
                            info = oldInfo
                        }

                        for (capturedParamDesc in info.allRecapturedParameters) {
                            visitFieldInsn(
                                    Opcodes.GETSTATIC, capturedParamDesc.containingLambdaName,
                                    CAPTURED_FIELD_FOLD_PREFIX + capturedParamDesc.fieldName, capturedParamDesc.type.descriptor
                            )
                        }
                        super.visitMethodInsn(opcode, info.newClassName, name, info.newConstructorDescriptor, itf)

                        //TODO: add new inner class also for other contexts
                        if (inliningContext.parent is RegeneratedClassContext) {
                            inliningContext.parent.typeRemapper.addAdditionalMappings(
                                    transformationInfo!!.oldClassName, transformationInfo!!.newClassName
                            )
                        }

                        transformationInfo = null
                    }
                    else {
                        super.visitMethodInsn(opcode, owner, name, desc, itf)
                    }
                }
                else if ((!inliningContext.isInliningLambda || isDefaultLambdaWithReification(inliningContext.lambdaInfo!!)) &&
                         ReifiedTypeInliner.isNeedClassReificationMarker(MethodInsnNode(opcode, owner, name, desc, false))) {
                    //we shouldn't process here content of inlining lambda it should be reified at external level except default lambdas
                }
                else {
                    super.visitMethodInsn(opcode, owner, name, desc, itf)
                }' @ [186:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit?, elseBranch: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit?

'isInvokeOnLambda' @ [186:57] ==> internal fun isInvokeOnLambda(owner: String, name: String): Boolean defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'owner' @ [186:74] ==> value-parameter owner: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[ValueParameterDescriptorImpl]

'name' @ [186:81] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[ValueParameterDescriptorImpl]

'assert' @ [187:21] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [187:28] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'currentInvokes' @ [187:29] ==> val currentInvokes: LinkedList<(InvokeCall..InvokeCall?)> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[LocalVariableDescriptor]

'isEmpty' @ [187:44] ==> public open fun isEmpty(): Boolean defined in java.util.LinkedList[JavaMethodDescriptor]

'currentInvokes' @ [188:38] ==> val currentInvokes: LinkedList<(InvokeCall..InvokeCall?)> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[LocalVariableDescriptor]

'remove' @ [188:53] ==> public open fun remove(): (InvokeCall..InvokeCall?) defined in java.util.LinkedList[JavaMethodDescriptor]

'invokeCall' @ [189:32] ==> val invokeCall: (InvokeCall..InvokeCall?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'lambdaInfo' @ [189:43] ==> public final val lambdaInfo: (LambdaInfo..LambdaInfo?) defined in org.jetbrains.kotlin.codegen.inline.InvokeCall[JavaPropertyDescriptor]

'info' @ [191:25] ==> val info: (LambdaInfo..LambdaInfo?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'super' @ [193:25] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitMethodInsn' @ [193:31] ==> public open fun visitMethodInsn(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: Boolean): Unit defined in org.jetbrains.kotlin.codegen.inline.InlineAdapter[JavaMethodDescriptor]

'opcode' @ [193:47] ==> value-parameter opcode: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[ValueParameterDescriptorImpl]

'owner' @ [193:55] ==> value-parameter owner: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[ValueParameterDescriptorImpl]

'name' @ [193:62] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[ValueParameterDescriptorImpl]

'desc' @ [193:68] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[ValueParameterDescriptorImpl]

'itf' @ [193:74] ==> value-parameter itf: Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[ValueParameterDescriptorImpl]

'max' @ [197:48] ==> public open fun max(p0: Int, p1: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'nextLocalIndex' @ [197:52] ==> public final val <no name provided>.nextLocalIndex: Int[MyPropertyDescriptor]

'markerShift' @ [197:68] ==> val markerShift: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[LocalVariableDescriptor]

'putStackValuesIntoLocals' @ [198:21] ==> private final fun putStackValuesIntoLocals(directOrder: List<Type>, shift: Int, iv: InstructionAdapter, descriptor: String): Unit defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion[SimpleFunctionDescriptorImpl]

'listOf' @ [198:46] ==> public fun <T> listOf(vararg elements: (Type..Type?)): List<(Type..Type?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.Type..org.jetbrains.org.objectweb.asm.Type?)

'info' @ [198:54] ==> val info: (LambdaInfo..LambdaInfo?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'invokeMethod' @ [198:59] ==> public abstract val invokeMethod: Method defined in org.jetbrains.kotlin.codegen.inline.LambdaInfo[PropertyDescriptorImpl]

'argumentTypes' @ [198:72] ==> public final val Method.argumentTypes: (Array<(Type..Type?)>..Array<out (Type..Type?)>?)[MyPropertyDescriptor]

'valueParamShift' @ [198:88] ==> val valueParamShift: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'this' @ [198:105] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>[LazyClassReceiverParameterDescriptor]

'desc' @ [198:111] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[ValueParameterDescriptorImpl]

'invokeCall' @ [200:25] ==> val invokeCall: (InvokeCall..InvokeCall?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'lambdaInfo' @ [200:36] ==> public final val lambdaInfo: (LambdaInfo..LambdaInfo?) defined in org.jetbrains.kotlin.codegen.inline.InvokeCall[JavaPropertyDescriptor]

'invokeMethodDescriptor' @ [200:47] ==> public abstract val invokeMethodDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.LambdaInfo[PropertyDescriptorImpl]

'valueParameters' @ [200:70] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'isEmpty' @ [200:86] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'visitInsn' @ [203:25] ==> public open fun visitInsn(p0: Int): Unit defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>[JavaMethodDescriptor]

'NOP' @ [203:43] ==> public const final val NOP: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'addInlineMarker' @ [206:21] ==> internal fun addInlineMarker(v: InstructionAdapter, isStartNotEnd: Boolean): Unit defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [206:37] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>[LazyClassReceiverParameterDescriptor]

'info' @ [207:44] ==> val info: (LambdaInfo..LambdaInfo?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'addAllParameters' @ [207:49] ==> public final fun addAllParameters(remapper: FieldRemapper): Parameters defined in org.jetbrains.kotlin.codegen.inline.LambdaInfo[SimpleFunctionDescriptorImpl]

'nodeRemapper' @ [207:66] ==> private final val nodeRemapper: FieldRemapper defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'InlinedLambdaRemapper' @ [209:47] ==> public constructor InlinedLambdaRemapper(originalLambdaInternalName: String, parent: FieldRemapper, methodParams: Parameters, isDefaultBoundCallableReference: Boolean) defined in org.jetbrains.kotlin.codegen.inline.InlinedLambdaRemapper[ClassConstructorDescriptorImpl]

'info' @ [210:29] ==> val info: (LambdaInfo..LambdaInfo?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'lambdaClassType' @ [210:34] ==> public abstract val lambdaClassType: Type defined in org.jetbrains.kotlin.codegen.inline.LambdaInfo[PropertyDescriptorImpl]

'internalName' @ [210:50] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'nodeRemapper' @ [210:64] ==> private final val nodeRemapper: FieldRemapper defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'lambdaParameters' @ [210:78] ==> val lambdaParameters: Parameters defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'info' @ [211:29] ==> val info: (LambdaInfo..LambdaInfo?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'info' @ [211:54] ==> val info: (LambdaInfo..LambdaInfo?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'isBoundCallableReference' @ [211:59] ==> public open var isBoundCallableReference: Boolean defined in org.jetbrains.kotlin.codegen.inline.DefaultLambda[PropertyDescriptorImpl]

'setLambdaInlining' @ [214:21] ==> public open fun setLambdaInlining(isInlining: Boolean): Unit defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>[JavaMethodDescriptor]

'info' @ [215:38] ==> val info: (LambdaInfo..LambdaInfo?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'node' @ [215:43] ==> public final lateinit var node: SMAPAndMethodNode defined in org.jetbrains.kotlin.codegen.inline.LambdaInfo[PropertyDescriptorImpl]

'classSMAP' @ [215:48] ==> public final val classSMAP: SMAP defined in org.jetbrains.kotlin.codegen.inline.SMAPAndMethodNode[PropertyDescriptorImpl]

'if (inliningContext.classRegeneration && !inliningContext.isInliningLambda)
                        NestedSourceMapper(sourceMapper, lambdaSMAP.intervals, lambdaSMAP.sourceInfo)
                    else
                        InlineLambdaSourceMapper(sourceMapper.parent!!, info.node)' @ [217:40] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: NestedSourceMapper, elseBranch: NestedSourceMapper): NestedSourceMapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> NestedSourceMapper

'inliningContext' @ [217:44] ==> private final val inliningContext: InliningContext defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'classRegeneration' @ [217:60] ==> public final val classRegeneration: Boolean defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'!' @ [217:81] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'inliningContext' @ [217:82] ==> private final val inliningContext: InliningContext defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'isInliningLambda' @ [217:98] ==> public final val isInliningLambda: Boolean defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'NestedSourceMapper' @ [218:25] ==> public constructor NestedSourceMapper(parent: SourceMapper, ranges: List<RangeMapping>, sourceInfo: SourceInfo) defined in org.jetbrains.kotlin.codegen.inline.NestedSourceMapper[ClassConstructorDescriptorImpl]

'sourceMapper' @ [218:44] ==> private final val sourceMapper: SourceMapper defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'lambdaSMAP' @ [218:58] ==> val lambdaSMAP: SMAP defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'intervals' @ [218:69] ==> public final val intervals: List<RangeMapping> defined in org.jetbrains.kotlin.codegen.inline.SMAP[PropertyDescriptorImpl]

'lambdaSMAP' @ [218:80] ==> val lambdaSMAP: SMAP defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'sourceInfo' @ [218:91] ==> public final val sourceInfo: SourceInfo defined in org.jetbrains.kotlin.codegen.inline.SMAP[PropertyDescriptorImpl]

'InlineLambdaSourceMapper' @ [220:25] ==> public constructor InlineLambdaSourceMapper(parent: SourceMapper, smap: SMAPAndMethodNode) defined in org.jetbrains.kotlin.codegen.inline.InlineLambdaSourceMapper[ClassConstructorDescriptorImpl]

'sourceMapper' @ [220:50] ==> private final val sourceMapper: SourceMapper defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'parent' @ [220:63] ==> public open val parent: SourceMapper? defined in org.jetbrains.kotlin.codegen.inline.SourceMapper[PropertyDescriptorImpl]

'info' @ [220:73] ==> val info: (LambdaInfo..LambdaInfo?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'node' @ [220:78] ==> public final lateinit var node: SMAPAndMethodNode defined in org.jetbrains.kotlin.codegen.inline.LambdaInfo[PropertyDescriptorImpl]

'MethodInliner' @ [221:35] ==> public constructor MethodInliner(node: MethodNode, parameters: Parameters, inliningContext: InliningContext, nodeRemapper: FieldRemapper, isSameModule: Boolean, errorPrefix: String, sourceMapper: SourceMapper, inlineCallSiteInfo: InlineCallSiteInfo, inlineOnlySmapSkipper: InlineOnlySmapSkipper?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[ClassConstructorDescriptorImpl]

'info' @ [222:29] ==> val info: (LambdaInfo..LambdaInfo?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'node' @ [222:34] ==> public final lateinit var node: SMAPAndMethodNode defined in org.jetbrains.kotlin.codegen.inline.LambdaInfo[PropertyDescriptorImpl]

'node' @ [222:39] ==> public final val node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.SMAPAndMethodNode[PropertyDescriptorImpl]

'lambdaParameters' @ [222:45] ==> val lambdaParameters: Parameters defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'inliningContext' @ [222:63] ==> private final val inliningContext: InliningContext defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'subInlineLambda' @ [222:79] ==> public final fun subInlineLambda(lambdaInfo: LambdaInfo): InliningContext defined in org.jetbrains.kotlin.codegen.inline.InliningContext[SimpleFunctionDescriptorImpl]

'info' @ [222:95] ==> val info: (LambdaInfo..LambdaInfo?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'newCapturedRemapper' @ [223:29] ==> val newCapturedRemapper: InlinedLambdaRemapper defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'+' @ [224:29] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'info' @ [224:50] ==> val info: (LambdaInfo..LambdaInfo?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'lambdaClassType' @ [224:55] ==> public abstract val lambdaClassType: Type defined in org.jetbrains.kotlin.codegen.inline.LambdaInfo[PropertyDescriptorImpl]

'internalName' @ [224:71] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'sourceMapper' @ [225:29] ==> val sourceMapper: NestedSourceMapper defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'inlineCallSiteInfo' @ [225:43] ==> private final val inlineCallSiteInfo: InlineCallSiteInfo defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'LocalVarRemapper' @ [228:39] ==> public constructor LocalVarRemapper(params: Parameters, additionalShift: Int) defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper[ClassConstructorDescriptorImpl]

'lambdaParameters' @ [228:56] ==> val lambdaParameters: Parameters defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'valueParamShift' @ [228:74] ==> val valueParamShift: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'inliner' @ [230:40] ==> val inliner: MethodInliner defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'doInline' @ [230:48] ==> private final fun doInline(adapter: MethodVisitor, remapper: LocalVarRemapper, remapReturn: Boolean, labelOwner: LabelOwner, finallyDeepShift: Int): InlineResult defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[SimpleFunctionDescriptorImpl]

'this' @ [230:57] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>[LazyClassReceiverParameterDescriptor]

'mv' @ [230:62] ==> protected/*protected and package*/ final var mv: (MethodVisitor..MethodVisitor?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>[JavaPropertyDescriptor]

'varRemapper' @ [230:66] ==> val varRemapper: LocalVarRemapper defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'info' @ [230:85] ==> val info: (LambdaInfo..LambdaInfo?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'invokeCall' @ [230:91] ==> val invokeCall: (InvokeCall..InvokeCall?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'finallyDepthShift' @ [230:102] ==> public final val finallyDepthShift: Int defined in org.jetbrains.kotlin.codegen.inline.InvokeCall[JavaPropertyDescriptor]

'result' @ [231:21] ==> private final val result: InlineResult defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'mergeWithNotChangeInfo' @ [231:28] ==> public final fun mergeWithNotChangeInfo(child: InlineResult): Unit defined in org.jetbrains.kotlin.codegen.inline.InlineResult[SimpleFunctionDescriptorImpl]

'lambdaResult' @ [231:51] ==> val lambdaResult: InlineResult defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'result' @ [232:21] ==> private final val result: InlineResult defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'reifiedTypeParametersUsages' @ [232:28] ==> public final val reifiedTypeParametersUsages: ReifiedTypeParametersUsages defined in org.jetbrains.kotlin.codegen.inline.InlineResult[PropertyDescriptorImpl]

'mergeAll' @ [232:56] ==> public final fun mergeAll(other: ReifiedTypeParametersUsages): Unit defined in org.jetbrains.kotlin.codegen.inline.ReifiedTypeParametersUsages[SimpleFunctionDescriptorImpl]

'lambdaResult' @ [232:65] ==> val lambdaResult: InlineResult defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'reifiedTypeParametersUsages' @ [232:78] ==> public final val reifiedTypeParametersUsages: ReifiedTypeParametersUsages defined in org.jetbrains.kotlin.codegen.inline.InlineResult[PropertyDescriptorImpl]

'typeMapper' @ [235:34] ==> private final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'mapAsmMethod' @ [235:45] ==> @NotNull public open fun mapAsmMethod(@NotNull descriptor: FunctionDescriptor): Method defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'getErasedInvokeFunction' @ [235:73] ==> @NotNull public open fun getErasedInvokeFunction(@NotNull function: FunctionDescriptor): FunctionDescriptor defined in org.jetbrains.kotlin.codegen.ClosureCodegen[JavaMethodDescriptor]

'info' @ [235:97] ==> val info: (LambdaInfo..LambdaInfo?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'invokeMethodDescriptor' @ [235:102] ==> public abstract val invokeMethodDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.LambdaInfo[PropertyDescriptorImpl]

'onStack' @ [236:32] ==> @NotNull public open fun onStack(@NotNull type: Type): StackValue defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'info' @ [236:40] ==> val info: (LambdaInfo..LambdaInfo?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'invokeMethod' @ [236:45] ==> public abstract val invokeMethod: Method defined in org.jetbrains.kotlin.codegen.inline.LambdaInfo[PropertyDescriptorImpl]

'returnType' @ [236:58] ==> public final val Method.returnType: (Type..Type?)[MyPropertyDescriptor]

'put' @ [236:70] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'bridge' @ [236:74] ==> val bridge: Method defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'returnType' @ [236:81] ==> public final val Method.returnType: (Type..Type?)[MyPropertyDescriptor]

'this' @ [236:93] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>[LazyClassReceiverParameterDescriptor]

'setLambdaInlining' @ [237:21] ==> public open fun setLambdaInlining(isInlining: Boolean): Unit defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>[JavaMethodDescriptor]

'addInlineMarker' @ [238:21] ==> internal fun addInlineMarker(v: InstructionAdapter, isStartNotEnd: Boolean): Unit defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [238:37] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>[LazyClassReceiverParameterDescriptor]

'sourceMapper' @ [239:21] ==> val sourceMapper: NestedSourceMapper defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'endMapping' @ [239:34] ==> public open fun endMapping(): Unit defined in org.jetbrains.kotlin.codegen.inline.NestedSourceMapper[SimpleFunctionDescriptorImpl]

'inlineOnlySmapSkipper' @ [240:21] ==> private final val inlineOnlySmapSkipper: InlineOnlySmapSkipper? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'markCallSiteLineNumber' @ [240:44] ==> public final fun markCallSiteLineNumber(mv: MethodVisitor): Unit defined in org.jetbrains.kotlin.codegen.inline.InlineOnlySmapSkipper[SimpleFunctionDescriptorImpl]

'remappingMethodAdapter' @ [240:67] ==> val remappingMethodAdapter: RemappingMethodAdapter defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[LocalVariableDescriptor]

'if (isAnonymousConstructorCall(owner, name)) { //TODO add method
                    //TODO add proper message
                    assert(transformationInfo is AnonymousObjectTransformationInfo) {
                        "<init> call doesn't correspond to object transformation info for '$owner.$name': $transformationInfo"
                    }
                    val parent = inliningContext.parent
                    val shouldRegenerate = transformationInfo!!.shouldRegenerate(isSameModule)
                    val isContinuation = parent != null && parent.isContinuation
                    if (shouldRegenerate || isContinuation) {
                        assert(shouldRegenerate || inlineCallSiteInfo.ownerClassName == transformationInfo!!.oldClassName) { "Only coroutines can call their own constructors" }

                        //put additional captured parameters on stack
                        var info = transformationInfo as AnonymousObjectTransformationInfo

                        val oldInfo = inliningContext.findAnonymousObjectTransformationInfo(owner)
                        if (oldInfo != null && isContinuation) {
                            info = oldInfo
                        }

                        for (capturedParamDesc in info.allRecapturedParameters) {
                            visitFieldInsn(
                                    Opcodes.GETSTATIC, capturedParamDesc.containingLambdaName,
                                    CAPTURED_FIELD_FOLD_PREFIX + capturedParamDesc.fieldName, capturedParamDesc.type.descriptor
                            )
                        }
                        super.visitMethodInsn(opcode, info.newClassName, name, info.newConstructorDescriptor, itf)

                        //TODO: add new inner class also for other contexts
                        if (inliningContext.parent is RegeneratedClassContext) {
                            inliningContext.parent.typeRemapper.addAdditionalMappings(
                                    transformationInfo!!.oldClassName, transformationInfo!!.newClassName
                            )
                        }

                        transformationInfo = null
                    }
                    else {
                        super.visitMethodInsn(opcode, owner, name, desc, itf)
                    }
                }
                else if ((!inliningContext.isInliningLambda || isDefaultLambdaWithReification(inliningContext.lambdaInfo!!)) &&
                         ReifiedTypeInliner.isNeedClassReificationMarker(MethodInsnNode(opcode, owner, name, desc, false))) {
                    //we shouldn't process here content of inlining lambda it should be reified at external level except default lambdas
                }
                else {
                    super.visitMethodInsn(opcode, owner, name, desc, itf)
                }' @ [242:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isAnonymousConstructorCall' @ [242:26] ==> internal fun isAnonymousConstructorCall(internalName: String, methodName: String): Boolean defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'owner' @ [242:53] ==> value-parameter owner: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[ValueParameterDescriptorImpl]

'name' @ [242:60] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[ValueParameterDescriptorImpl]

'assert' @ [244:21] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'transformationInfo' @ [244:28] ==> private final var transformationInfo: TransformationInfo? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>[PropertyDescriptorImpl]

'owner' @ [245:93] ==> value-parameter owner: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[ValueParameterDescriptorImpl]

'name' @ [245:100] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[ValueParameterDescriptorImpl]

'transformationInfo' @ [245:108] ==> private final var transformationInfo: TransformationInfo? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>[PropertyDescriptorImpl]

'inliningContext' @ [247:34] ==> private final val inliningContext: InliningContext defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'parent' @ [247:50] ==> public final val parent: InliningContext? defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'transformationInfo' @ [248:44] ==> private final var transformationInfo: TransformationInfo? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>[PropertyDescriptorImpl]

'shouldRegenerate' @ [248:65] ==> public abstract fun shouldRegenerate(sameModule: Boolean): Boolean defined in org.jetbrains.kotlin.codegen.inline.TransformationInfo[SimpleFunctionDescriptorImpl]

'isSameModule' @ [248:82] ==> private final val isSameModule: Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'parent' @ [249:42] ==> val parent: InliningContext? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'parent' @ [249:60] ==> val parent: InliningContext? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'isContinuation' @ [249:67] ==> public final var isContinuation: Boolean defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'if (shouldRegenerate || isContinuation) {
                        assert(shouldRegenerate || inlineCallSiteInfo.ownerClassName == transformationInfo!!.oldClassName) { "Only coroutines can call their own constructors" }

                        //put additional captured parameters on stack
                        var info = transformationInfo as AnonymousObjectTransformationInfo

                        val oldInfo = inliningContext.findAnonymousObjectTransformationInfo(owner)
                        if (oldInfo != null && isContinuation) {
                            info = oldInfo
                        }

                        for (capturedParamDesc in info.allRecapturedParameters) {
                            visitFieldInsn(
                                    Opcodes.GETSTATIC, capturedParamDesc.containingLambdaName,
                                    CAPTURED_FIELD_FOLD_PREFIX + capturedParamDesc.fieldName, capturedParamDesc.type.descriptor
                            )
                        }
                        super.visitMethodInsn(opcode, info.newClassName, name, info.newConstructorDescriptor, itf)

                        //TODO: add new inner class also for other contexts
                        if (inliningContext.parent is RegeneratedClassContext) {
                            inliningContext.parent.typeRemapper.addAdditionalMappings(
                                    transformationInfo!!.oldClassName, transformationInfo!!.newClassName
                            )
                        }

                        transformationInfo = null
                    }
                    else {
                        super.visitMethodInsn(opcode, owner, name, desc, itf)
                    }' @ [250:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'shouldRegenerate' @ [250:25] ==> val shouldRegenerate: Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'isContinuation' @ [250:45] ==> val isContinuation: Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'assert' @ [251:25] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'shouldRegenerate' @ [251:32] ==> val shouldRegenerate: Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'inlineCallSiteInfo' @ [251:52] ==> private final val inlineCallSiteInfo: InlineCallSiteInfo defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'ownerClassName' @ [251:71] ==> public final val ownerClassName: String defined in org.jetbrains.kotlin.codegen.inline.InlineCallSiteInfo[PropertyDescriptorImpl]

'transformationInfo' @ [251:89] ==> private final var transformationInfo: TransformationInfo? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>[PropertyDescriptorImpl]

'oldClassName' @ [251:110] ==> public abstract val oldClassName: String defined in org.jetbrains.kotlin.codegen.inline.TransformationInfo[PropertyDescriptorImpl]

'transformationInfo' @ [254:36] ==> private final var transformationInfo: TransformationInfo? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>[PropertyDescriptorImpl]

'inliningContext' @ [256:39] ==> private final val inliningContext: InliningContext defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'findAnonymousObjectTransformationInfo' @ [256:55] ==> public final fun findAnonymousObjectTransformationInfo(internalName: String): AnonymousObjectTransformationInfo? defined in org.jetbrains.kotlin.codegen.inline.InliningContext[SimpleFunctionDescriptorImpl]

'owner' @ [256:93] ==> value-parameter owner: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[ValueParameterDescriptorImpl]

'oldInfo' @ [257:29] ==> val oldInfo: AnonymousObjectTransformationInfo? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'isContinuation' @ [257:48] ==> val isContinuation: Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'info' @ [258:29] ==> var info: AnonymousObjectTransformationInfo defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'oldInfo' @ [258:36] ==> val oldInfo: AnonymousObjectTransformationInfo? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'info' @ [261:51] ==> var info: AnonymousObjectTransformationInfo defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'allRecapturedParameters' @ [261:56] ==> public final lateinit var allRecapturedParameters: List<CapturedParamDesc> defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformationInfo[PropertyDescriptorImpl]

'visitFieldInsn' @ [262:29] ==> public open fun visitFieldInsn(opcode: Int, owner: String, name: String, desc: String): Unit defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>[SimpleFunctionDescriptorImpl]

'GETSTATIC' @ [263:45] ==> public const final val GETSTATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'capturedParamDesc' @ [263:56] ==> val capturedParamDesc: CapturedParamDesc defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'containingLambdaName' @ [263:74] ==> public final val CapturedParamDesc.containingLambdaName: String[MyPropertyDescriptor]

'CAPTURED_FIELD_FOLD_PREFIX' @ [264:37] ==> internal const val CAPTURED_FIELD_FOLD_PREFIX: String defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[PropertyDescriptorImpl]

'capturedParamDesc' @ [264:66] ==> val capturedParamDesc: CapturedParamDesc defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'fieldName' @ [264:84] ==> public final val CapturedParamDesc.fieldName: String[MyPropertyDescriptor]

'capturedParamDesc' @ [264:95] ==> val capturedParamDesc: CapturedParamDesc defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'type' @ [264:113] ==> public final val CapturedParamDesc.type: Type[MyPropertyDescriptor]

'descriptor' @ [264:118] ==> public final val Type.descriptor: (String..String?)[MyPropertyDescriptor]

'super' @ [267:25] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitMethodInsn' @ [267:31] ==> public open fun visitMethodInsn(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: Boolean): Unit defined in org.jetbrains.kotlin.codegen.inline.InlineAdapter[JavaMethodDescriptor]

'opcode' @ [267:47] ==> value-parameter opcode: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[ValueParameterDescriptorImpl]

'info' @ [267:55] ==> var info: AnonymousObjectTransformationInfo defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'newClassName' @ [267:60] ==> public open val newClassName: String defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformationInfo[PropertyDescriptorImpl]

'name' @ [267:74] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[ValueParameterDescriptorImpl]

'info' @ [267:80] ==> var info: AnonymousObjectTransformationInfo defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'newConstructorDescriptor' @ [267:85] ==> public final lateinit var newConstructorDescriptor: String defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformationInfo[PropertyDescriptorImpl]

'itf' @ [267:111] ==> value-parameter itf: Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[ValueParameterDescriptorImpl]

'inliningContext' @ [270:29] ==> private final val inliningContext: InliningContext defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'parent' @ [270:45] ==> public final val parent: InliningContext? defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'inliningContext' @ [271:29] ==> private final val inliningContext: InliningContext defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'parent' @ [271:45] ==> public final val parent: InliningContext? defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'typeRemapper' @ [271:52] ==> public final val typeRemapper: TypeRemapper defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'addAdditionalMappings' @ [271:65] ==> public final fun addAdditionalMappings(oldName: String, newName: String): Unit defined in org.jetbrains.kotlin.codegen.inline.TypeRemapper[SimpleFunctionDescriptorImpl]

'transformationInfo' @ [272:37] ==> private final var transformationInfo: TransformationInfo? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>[PropertyDescriptorImpl]

'oldClassName' @ [272:58] ==> public abstract val oldClassName: String defined in org.jetbrains.kotlin.codegen.inline.TransformationInfo[PropertyDescriptorImpl]

'transformationInfo' @ [272:72] ==> private final var transformationInfo: TransformationInfo? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>[PropertyDescriptorImpl]

'newClassName' @ [272:93] ==> public open val newClassName: String defined in org.jetbrains.kotlin.codegen.inline.TransformationInfo[PropertyDescriptorImpl]

'transformationInfo' @ [276:25] ==> private final var transformationInfo: TransformationInfo? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>[PropertyDescriptorImpl]

'super' @ [279:25] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitMethodInsn' @ [279:31] ==> public open fun visitMethodInsn(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: Boolean): Unit defined in org.jetbrains.kotlin.codegen.inline.InlineAdapter[JavaMethodDescriptor]

'opcode' @ [279:47] ==> value-parameter opcode: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[ValueParameterDescriptorImpl]

'owner' @ [279:55] ==> value-parameter owner: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[ValueParameterDescriptorImpl]

'name' @ [279:62] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[ValueParameterDescriptorImpl]

'desc' @ [279:68] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[ValueParameterDescriptorImpl]

'itf' @ [279:74] ==> value-parameter itf: Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[ValueParameterDescriptorImpl]

'if ((!inliningContext.isInliningLambda || isDefaultLambdaWithReification(inliningContext.lambdaInfo!!)) &&
                         ReifiedTypeInliner.isNeedClassReificationMarker(MethodInsnNode(opcode, owner, name, desc, false))) {
                    //we shouldn't process here content of inlining lambda it should be reified at external level except default lambdas
                }
                else {
                    super.visitMethodInsn(opcode, owner, name, desc, itf)
                }' @ [282:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [282:27] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'inliningContext' @ [282:28] ==> private final val inliningContext: InliningContext defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'isInliningLambda' @ [282:44] ==> public final val isInliningLambda: Boolean defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'isDefaultLambdaWithReification' @ [282:64] ==> private final fun isDefaultLambdaWithReification(lambdaInfo: LambdaInfo): Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[SimpleFunctionDescriptorImpl]

'inliningContext' @ [282:95] ==> private final val inliningContext: InliningContext defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'lambdaInfo' @ [282:111] ==> public final val lambdaInfo: LambdaInfo? defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'ReifiedTypeInliner' @ [283:26] ==> public companion object defined in org.jetbrains.kotlin.codegen.inline.ReifiedTypeInliner[FakeCallableDescriptorForObject]

'isNeedClassReificationMarker' @ [283:45] ==> @JvmStatic public final fun isNeedClassReificationMarker(insn: AbstractInsnNode): Boolean defined in org.jetbrains.kotlin.codegen.inline.ReifiedTypeInliner.Companion[SimpleFunctionDescriptorImpl]

'MethodInsnNode' @ [283:74] ==> public constructor MethodInsnNode(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: Boolean) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaClassConstructorDescriptor]

'opcode' @ [283:89] ==> value-parameter opcode: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[ValueParameterDescriptorImpl]

'owner' @ [283:97] ==> value-parameter owner: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[ValueParameterDescriptorImpl]

'name' @ [283:104] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[ValueParameterDescriptorImpl]

'desc' @ [283:110] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[ValueParameterDescriptorImpl]

'super' @ [287:21] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitMethodInsn' @ [287:27] ==> public open fun visitMethodInsn(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: Boolean): Unit defined in org.jetbrains.kotlin.codegen.inline.InlineAdapter[JavaMethodDescriptor]

'opcode' @ [287:43] ==> value-parameter opcode: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[ValueParameterDescriptorImpl]

'owner' @ [287:51] ==> value-parameter owner: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[ValueParameterDescriptorImpl]

'name' @ [287:58] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[ValueParameterDescriptorImpl]

'desc' @ [287:64] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[ValueParameterDescriptorImpl]

'itf' @ [287:70] ==> value-parameter itf: Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMethodInsn[ValueParameterDescriptorImpl]

'opcode' @ [292:21] ==> value-parameter opcode: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitFieldInsn[ValueParameterDescriptorImpl]

'GETSTATIC' @ [292:39] ==> public const final val GETSTATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'isAnonymousSingletonLoad' @ [292:53] ==> internal fun isAnonymousSingletonLoad(internalName: String, fieldName: String): Boolean defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'owner' @ [292:78] ==> value-parameter owner: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitFieldInsn[ValueParameterDescriptorImpl]

'name' @ [292:85] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitFieldInsn[ValueParameterDescriptorImpl]

'isWhenMappingAccess' @ [292:94] ==> internal fun isWhenMappingAccess(internalName: String, fieldName: String): Boolean defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'owner' @ [292:114] ==> value-parameter owner: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitFieldInsn[ValueParameterDescriptorImpl]

'name' @ [292:121] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitFieldInsn[ValueParameterDescriptorImpl]

'handleAnonymousObjectRegeneration' @ [293:21] ==> private final fun handleAnonymousObjectRegeneration(): Unit defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>[SimpleFunctionDescriptorImpl]

'super' @ [295:17] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitFieldInsn' @ [295:23] ==> public open fun visitFieldInsn(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?)): Unit defined in org.jetbrains.kotlin.codegen.inline.InlineAdapter[JavaMethodDescriptor]

'opcode' @ [295:38] ==> value-parameter opcode: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitFieldInsn[ValueParameterDescriptorImpl]

'owner' @ [295:46] ==> value-parameter owner: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitFieldInsn[ValueParameterDescriptorImpl]

'name' @ [295:53] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitFieldInsn[ValueParameterDescriptorImpl]

'desc' @ [295:59] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitFieldInsn[ValueParameterDescriptorImpl]

'lambdasFinallyBlocks' @ [299:17] ==> private final var lambdasFinallyBlocks: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'resultNode' @ [299:40] ==> val resultNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[LocalVariableDescriptor]

'tryCatchBlocks' @ [299:51] ==> public final var tryCatchBlocks: (MutableList<(TryCatchBlockNode..TryCatchBlockNode?)>..List<(TryCatchBlockNode..TryCatchBlockNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'size' @ [299:66] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'super' @ [300:17] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitMaxs' @ [300:23] ==> @Override public open fun visitMaxs(stack: Int, locals: Int): Unit defined in org.jetbrains.kotlin.codegen.inline.InlineAdapter[JavaMethodDescriptor]

'stack' @ [300:33] ==> value-parameter stack: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMaxs[ValueParameterDescriptorImpl]

'locals' @ [300:40] ==> value-parameter locals: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline.<no name provided>.visitMaxs[ValueParameterDescriptorImpl]

'node' @ [304:9] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[ValueParameterDescriptorImpl]

'accept' @ [304:14] ==> public open fun accept(p0: (MethodVisitor..MethodVisitor?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaMethodDescriptor]

'lambdaInliner' @ [304:21] ==> val lambdaInliner: <no name provided> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[LocalVariableDescriptor]

'resultNode' @ [306:16] ==> val resultNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.doInline[LocalVariableDescriptor]

'lambdaInfo' @ [310:13] ==> value-parameter lambdaInfo: LambdaInfo defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.isDefaultLambdaWithReification[ValueParameterDescriptorImpl]

'lambdaInfo' @ [310:44] ==> value-parameter lambdaInfo: LambdaInfo defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.isDefaultLambdaWithReification[ValueParameterDescriptorImpl]

'needReification' @ [310:55] ==> public final val needReification: Boolean defined in org.jetbrains.kotlin.codegen.inline.DefaultLambda[PropertyDescriptorImpl]

'node' @ [313:9] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode[ValueParameterDescriptorImpl]

'instructions' @ [313:14] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'resetLabels' @ [313:27] ==> public open fun resetLabels(): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'parameters' @ [315:34] ==> private final val parameters: Parameters defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'capturedParametersSizeOnStack' @ [315:45] ==> public final val capturedParametersSizeOnStack: Int defined in org.jetbrains.kotlin.codegen.inline.Parameters[PropertyDescriptorImpl]

'parameters' @ [316:34] ==> private final val parameters: Parameters defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'realParametersSizeOnStack' @ [316:45] ==> public final val realParametersSizeOnStack: Int defined in org.jetbrains.kotlin.codegen.inline.Parameters[PropertyDescriptorImpl]

'MethodNode' @ [318:40] ==> public constructor MethodNode(p0: Int, p1: Int, p2: (String..String?), p3: (String..String?), p4: (String..String?), p5: (Array<(String..String?)>..Array<out (String..String?)>?)) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaClassConstructorDescriptor]

'API' @ [319:17] ==> public const val API: Int defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[PropertyDescriptorImpl]

'node' @ [319:22] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode[ValueParameterDescriptorImpl]

'access' @ [319:27] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'node' @ [319:35] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode[ValueParameterDescriptorImpl]

'name' @ [319:40] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'getMethodDescriptor' @ [320:22] ==> public open fun getMethodDescriptor(p0: (Type..Type?), vararg p1: (Type..Type?)): (String..String?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'getReturnType' @ [320:47] ==> public open fun getReturnType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'node' @ [320:61] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode[ValueParameterDescriptorImpl]

'desc' @ [320:66] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'+' @ [320:75] ==> public operator fun <T> Array<(Type..Type?)>.plus(elements: Collection<(Type..Type?)>): Array<(Type..Type?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.Type..org.jetbrains.org.objectweb.asm.Type?)

'getArgumentTypes' @ [320:80] ==> public open fun getArgumentTypes(p0: (String..String?)): (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'node' @ [320:97] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode[ValueParameterDescriptorImpl]

'desc' @ [320:102] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'parameters' @ [320:110] ==> private final val parameters: Parameters defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'capturedTypes' @ [320:121] ==> public final val capturedTypes: List<Type> defined in org.jetbrains.kotlin.codegen.inline.Parameters[PropertyDescriptorImpl]

'node' @ [321:17] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode[ValueParameterDescriptorImpl]

'signature' @ [321:22] ==> public final var signature: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'node' @ [321:33] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode[ValueParameterDescriptorImpl]

'exceptions' @ [321:38] ==> public final var exceptions: (MutableList<(String..String?)>..List<(String..String?)>?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'toTypedArray' @ [321:50] ==> public inline fun <reified T> Collection<(String..String?)>.toTypedArray(): Array<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (kotlin.String..kotlin.String?)

'GENERATE_SMAP' @ [323:47] ==> public const val GENERATE_SMAP: Boolean defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[PropertyDescriptorImpl]

'inlineOnlySmapSkipper' @ [323:64] ==> private final val inlineOnlySmapSkipper: InlineOnlySmapSkipper? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'nodeRemapper' @ [325:44] ==> private final val nodeRemapper: FieldRemapper defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'isInsideInliningLambda' @ [325:57] ==> public open val isInsideInliningLambda: Boolean defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper[PropertyDescriptorImpl]

'`var`' @ [328:24] ==> value-parameter `var`: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>.getNewIndex[ValueParameterDescriptorImpl]

'if (`var` < realParametersSize) 0 else capturedParamsSize' @ [328:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'`var`' @ [328:36] ==> value-parameter `var`: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>.getNewIndex[ValueParameterDescriptorImpl]

'realParametersSize' @ [328:44] ==> val realParametersSize: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode[LocalVariableDescriptor]

'capturedParamsSize' @ [328:71] ==> val capturedParamsSize: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode[LocalVariableDescriptor]

'super' @ [332:17] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitVarInsn' @ [332:23] ==> public open fun visitVarInsn(p0: Int, p1: Int): Unit defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaMethodDescriptor]

'opcode' @ [332:36] ==> value-parameter opcode: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>.visitVarInsn[ValueParameterDescriptorImpl]

'getNewIndex' @ [332:44] ==> private final fun getNewIndex(`var`: Int): Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>[SimpleFunctionDescriptorImpl]

'`var`' @ [332:56] ==> value-parameter `var`: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>.visitVarInsn[ValueParameterDescriptorImpl]

'super' @ [336:17] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitIincInsn' @ [336:23] ==> public open fun visitIincInsn(p0: Int, p1: Int): Unit defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaMethodDescriptor]

'getNewIndex' @ [336:37] ==> private final fun getNewIndex(`var`: Int): Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>[SimpleFunctionDescriptorImpl]

'`var`' @ [336:49] ==> value-parameter `var`: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>.visitIincInsn[ValueParameterDescriptorImpl]

'increment' @ [336:57] ==> value-parameter increment: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>.visitIincInsn[ValueParameterDescriptorImpl]

'super' @ [340:17] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitMaxs' @ [340:23] ==> public open fun visitMaxs(p0: Int, p1: Int): Unit defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaMethodDescriptor]

'maxStack' @ [340:33] ==> value-parameter maxStack: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>.visitMaxs[ValueParameterDescriptorImpl]

'maxLocals' @ [340:43] ==> value-parameter maxLocals: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>.visitMaxs[ValueParameterDescriptorImpl]

'capturedParamsSize' @ [340:55] ==> val capturedParamsSize: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode[LocalVariableDescriptor]

'isInliningLambda' @ [344:21] ==> private final val isInliningLambda: Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>[PropertyDescriptorImpl]

'GENERATE_DEBUG_INFO' @ [344:41] ==> private final val GENERATE_DEBUG_INFO: Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>[PropertyDescriptorImpl]

'super' @ [345:21] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitLineNumber' @ [345:27] ==> public open fun visitLineNumber(p0: Int, p1: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaMethodDescriptor]

'line' @ [345:43] ==> value-parameter line: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>.visitLineNumber[ValueParameterDescriptorImpl]

'start' @ [345:49] ==> value-parameter start: Label defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>.visitLineNumber[ValueParameterDescriptorImpl]

'if (DEFAULT_LAMBDA_FAKE_CALL == owner) {
                    val index = name.substringAfter(DEFAULT_LAMBDA_FAKE_CALL).toInt()
                    val lambda = getLambdaIfExists(index) as DefaultLambda
                    lambda.parameterOffsetsInDefault.zip(lambda.capturedVars).asReversed().forEach {
                        (_, captured) ->
                        val originalBoundReceiverType = lambda.originalBoundReceiverType
                        if (lambda.isBoundCallableReference && AsmUtil.isPrimitive(originalBoundReceiverType)) {
                            StackValue.onStack(originalBoundReceiverType!!).put(captured.type, InstructionAdapter(this))
                        }
                        super.visitFieldInsn(
                                Opcodes.PUTSTATIC, captured.containingLambdaName, CAPTURED_FIELD_FOLD_PREFIX + captured.fieldName, captured.type.descriptor
                        )
                    }
                }
                else {
                    super.visitMethodInsn(opcode, owner, name, desc, itf)
                }' @ [350:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'DEFAULT_LAMBDA_FAKE_CALL' @ [350:21] ==> internal const val DEFAULT_LAMBDA_FAKE_CALL: String defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[PropertyDescriptorImpl]

'owner' @ [350:49] ==> value-parameter owner: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>.visitMethodInsn[ValueParameterDescriptorImpl]

'name' @ [351:33] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>.visitMethodInsn[ValueParameterDescriptorImpl]

'substringAfter' @ [351:38] ==> public fun String.substringAfter(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'DEFAULT_LAMBDA_FAKE_CALL' @ [351:53] ==> internal const val DEFAULT_LAMBDA_FAKE_CALL: String defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[PropertyDescriptorImpl]

'toInt' @ [351:79] ==> @InlineOnly public inline fun String.toInt(): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'getLambdaIfExists' @ [352:34] ==> private final fun getLambdaIfExists(varIndex: Int): LambdaInfo? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[SimpleFunctionDescriptorImpl]

'index' @ [352:52] ==> val index: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'lambda' @ [353:21] ==> val lambda: DefaultLambda defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'parameterOffsetsInDefault' @ [353:28] ==> public final val parameterOffsetsInDefault: MutableList<Int> defined in org.jetbrains.kotlin.codegen.inline.DefaultLambda[PropertyDescriptorImpl]

'zip' @ [353:54] ==> public infix fun <T, R> Iterable<Int>.zip(other: Iterable<CapturedParamDesc>): List<Pair<Int, CapturedParamDesc>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> CapturedParamDesc

'lambda' @ [353:58] ==> val lambda: DefaultLambda defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'capturedVars' @ [353:65] ==> public open lateinit var capturedVars: List<CapturedParamDesc> defined in org.jetbrains.kotlin.codegen.inline.DefaultLambda[PropertyDescriptorImpl]

'asReversed' @ [353:79] ==> public fun <T> List<Pair<Int, CapturedParamDesc>>.asReversed(): List<Pair<Int, CapturedParamDesc>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Int, CapturedParamDesc>

'forEach' @ [353:92] ==> @HidesMembers public inline fun <T> Iterable<Pair<Int, CapturedParamDesc>>.forEach(action: (Pair<Int, CapturedParamDesc>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Int, CapturedParamDesc>

'component1' @ [354:26] ==> public final operator fun component1(): Int defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [354:29] ==> public final operator fun component2(): CapturedParamDesc defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'lambda' @ [355:57] ==> val lambda: DefaultLambda defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'originalBoundReceiverType' @ [355:64] ==> public final var originalBoundReceiverType: Type? defined in org.jetbrains.kotlin.codegen.inline.DefaultLambda[PropertyDescriptorImpl]

'lambda' @ [356:29] ==> val lambda: DefaultLambda defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>.visitMethodInsn[LocalVariableDescriptor]

'isBoundCallableReference' @ [356:36] ==> public open var isBoundCallableReference: Boolean defined in org.jetbrains.kotlin.codegen.inline.DefaultLambda[PropertyDescriptorImpl]

'isPrimitive' @ [356:72] ==> public open fun isPrimitive(type: (Type..Type?)): Boolean defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'originalBoundReceiverType' @ [356:84] ==> val originalBoundReceiverType: Type? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>.visitMethodInsn.<anonymous>[LocalVariableDescriptor]

'onStack' @ [357:40] ==> @NotNull public open fun onStack(@NotNull type: Type): StackValue defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'originalBoundReceiverType' @ [357:48] ==> val originalBoundReceiverType: Type? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>.visitMethodInsn.<anonymous>[LocalVariableDescriptor]

'put' @ [357:77] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'captured' @ [357:81] ==> val captured: CapturedParamDesc defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>.visitMethodInsn.<anonymous>[LocalVariableDescriptor]

'type' @ [357:90] ==> public final val CapturedParamDesc.type: Type[MyPropertyDescriptor]

'InstructionAdapter' @ [357:96] ==> public constructor InstructionAdapter(p0: (MethodVisitor..MethodVisitor?)) defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaClassConstructorDescriptor]

'this' @ [357:115] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>[LazyClassReceiverParameterDescriptor]

'super' @ [359:25] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitFieldInsn' @ [359:31] ==> public open fun visitFieldInsn(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaMethodDescriptor]

'PUTSTATIC' @ [360:41] ==> public const final val PUTSTATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'captured' @ [360:52] ==> val captured: CapturedParamDesc defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>.visitMethodInsn.<anonymous>[LocalVariableDescriptor]

'containingLambdaName' @ [360:61] ==> public final val CapturedParamDesc.containingLambdaName: String[MyPropertyDescriptor]

'CAPTURED_FIELD_FOLD_PREFIX' @ [360:83] ==> internal const val CAPTURED_FIELD_FOLD_PREFIX: String defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[PropertyDescriptorImpl]

'captured' @ [360:112] ==> val captured: CapturedParamDesc defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>.visitMethodInsn.<anonymous>[LocalVariableDescriptor]

'fieldName' @ [360:121] ==> public final val CapturedParamDesc.fieldName: String[MyPropertyDescriptor]

'captured' @ [360:132] ==> val captured: CapturedParamDesc defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>.visitMethodInsn.<anonymous>[LocalVariableDescriptor]

'type' @ [360:141] ==> public final val CapturedParamDesc.type: Type[MyPropertyDescriptor]

'descriptor' @ [360:146] ==> public final val Type.descriptor: (String..String?)[MyPropertyDescriptor]

'super' @ [365:21] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitMethodInsn' @ [365:27] ==> public open fun visitMethodInsn(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaMethodDescriptor]

'opcode' @ [365:43] ==> value-parameter opcode: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>.visitMethodInsn[ValueParameterDescriptorImpl]

'owner' @ [365:51] ==> value-parameter owner: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>.visitMethodInsn[ValueParameterDescriptorImpl]

'name' @ [365:58] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>.visitMethodInsn[ValueParameterDescriptorImpl]

'desc' @ [365:64] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>.visitMethodInsn[ValueParameterDescriptorImpl]

'itf' @ [365:70] ==> value-parameter itf: Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>.visitMethodInsn[ValueParameterDescriptorImpl]

'isInliningLambda' @ [372:21] ==> private final val isInliningLambda: Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>[PropertyDescriptorImpl]

'GENERATE_DEBUG_INFO' @ [372:41] ==> private final val GENERATE_DEBUG_INFO: Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>[PropertyDescriptorImpl]

'if (inliningContext.isRoot && !isFakeLocalVariableForInline(name)) INLINE_FUN_VAR_SUFFIX else ""' @ [373:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'inliningContext' @ [373:41] ==> private final val inliningContext: InliningContext defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'isRoot' @ [373:57] ==> public final val isRoot: Boolean defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'!' @ [373:67] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isFakeLocalVariableForInline' @ [373:68] ==> public fun isFakeLocalVariableForInline(name: String): Boolean defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'name' @ [373:97] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>.visitLocalVariable[ValueParameterDescriptorImpl]

'INLINE_FUN_VAR_SUFFIX' @ [373:104] ==> public const val INLINE_FUN_VAR_SUFFIX: String defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[PropertyDescriptorImpl]

'if (!varSuffix.isEmpty() && name == "this") name + "_" else name' @ [374:35] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'!' @ [374:39] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'varSuffix' @ [374:40] ==> val varSuffix: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>.visitLocalVariable[LocalVariableDescriptor]

'isEmpty' @ [374:50] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'name' @ [374:63] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>.visitLocalVariable[ValueParameterDescriptorImpl]

'name' @ [374:79] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>.visitLocalVariable[ValueParameterDescriptorImpl]

'name' @ [374:95] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>.visitLocalVariable[ValueParameterDescriptorImpl]

'super' @ [375:21] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitLocalVariable' @ [375:27] ==> public open fun visitLocalVariable(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: (Label..Label?), p4: (Label..Label?), p5: Int): Unit defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaMethodDescriptor]

'varName' @ [375:46] ==> val varName: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>.visitLocalVariable[LocalVariableDescriptor]

'varSuffix' @ [375:56] ==> val varSuffix: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>.visitLocalVariable[LocalVariableDescriptor]

'desc' @ [375:67] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>.visitLocalVariable[ValueParameterDescriptorImpl]

'signature' @ [375:73] ==> value-parameter signature: String? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>.visitLocalVariable[ValueParameterDescriptorImpl]

'start' @ [375:84] ==> value-parameter start: Label defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>.visitLocalVariable[ValueParameterDescriptorImpl]

'end' @ [375:91] ==> value-parameter end: Label defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>.visitLocalVariable[ValueParameterDescriptorImpl]

'getNewIndex' @ [375:96] ==> private final fun getNewIndex(`var`: Int): Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>[SimpleFunctionDescriptorImpl]

'index' @ [375:108] ==> value-parameter index: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode.<no name provided>.visitLocalVariable[ValueParameterDescriptorImpl]

'node' @ [380:9] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode[ValueParameterDescriptorImpl]

'accept' @ [380:14] ==> public open fun accept(p0: (MethodVisitor..MethodVisitor?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaMethodDescriptor]

'transformedNode' @ [380:21] ==> val transformedNode: <no name provided> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode[LocalVariableDescriptor]

'transformCaptured' @ [382:9] ==> private final fun transformCaptured(node: MethodNode): Unit defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[SimpleFunctionDescriptorImpl]

'transformedNode' @ [382:27] ==> val transformedNode: <no name provided> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode[LocalVariableDescriptor]

'transformFinallyDeepIndex' @ [383:9] ==> private final fun transformFinallyDeepIndex(node: MethodNode, finallyDeepShift: Int): Unit defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion[SimpleFunctionDescriptorImpl]

'transformedNode' @ [383:35] ==> val transformedNode: <no name provided> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode[LocalVariableDescriptor]

'finallyDeepShift' @ [383:52] ==> value-parameter finallyDeepShift: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode[ValueParameterDescriptorImpl]

'transformedNode' @ [385:16] ==> val transformedNode: <no name provided> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.prepareNode[LocalVariableDescriptor]

'prepareNode' @ [391:30] ==> private final fun prepareNode(node: MethodNode, finallyDeepShift: Int): MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[SimpleFunctionDescriptorImpl]

'node' @ [391:42] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable[ValueParameterDescriptorImpl]

'finallyDeepShift' @ [391:48] ==> value-parameter finallyDeepShift: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable[ValueParameterDescriptorImpl]

'normalizeLocalReturns' @ [393:9] ==> private final fun normalizeLocalReturns(node: MethodNode, labelOwner: LabelOwner): Unit defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[SimpleFunctionDescriptorImpl]

'processingNode' @ [393:31] ==> val processingNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable[LocalVariableDescriptor]

'labelOwner' @ [393:47] ==> value-parameter labelOwner: LabelOwner defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable[ValueParameterDescriptorImpl]

'analyzeMethodNodeWithoutMandatoryTransformations' @ [395:23] ==> private final fun analyzeMethodNodeWithoutMandatoryTransformations(node: MethodNode): Array<Frame<SourceValue>?> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion[SimpleFunctionDescriptorImpl]

'processingNode' @ [395:72] ==> val processingNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable[LocalVariableDescriptor]

'SmartSet' @ [397:24] ==> public companion object defined in org.jetbrains.kotlin.utils.SmartSet[FakeCallableDescriptorForObject]

'create' @ [397:33] ==> @JvmStatic public final fun <T> create(): SmartSet<AbstractInsnNode> defined in org.jetbrains.kotlin.utils.SmartSet.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'processingNode' @ [398:28] ==> val processingNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable[LocalVariableDescriptor]

'instructions' @ [398:43] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'InsnSequence' @ [403:9] ==> public constructor InsnSequence(insnList: InsnList) defined in org.jetbrains.kotlin.codegen.optimization.common.InsnSequence[ClassConstructorDescriptorImpl]

'instructions' @ [403:22] ==> val instructions: (InsnList..InsnList?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable[LocalVariableDescriptor]

'forEach' @ [403:36] ==> public inline fun <T> Sequence<AbstractInsnNode>.forEach(action: (AbstractInsnNode) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'sources' @ [404:25] ==> val sources: Array<Frame<SourceValue>?> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable[LocalVariableDescriptor]

'instructions' @ [404:33] ==> val instructions: (InsnList..InsnList?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable[LocalVariableDescriptor]

'indexOf' @ [404:46] ==> public open fun indexOf(p0: (AbstractInsnNode..AbstractInsnNode?)): Int defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'cur' @ [404:54] ==> value-parameter cur: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[ValueParameterDescriptorImpl]

'if (frame != null) {
                if (ReifiedTypeInliner.isNeedClassReificationMarker(cur)) {
                    awaitClassReification = true
                }
                else if (cur is MethodInsnNode) {
                    if (isFinallyStart(cur)) {
                        //TODO deep index calc could be more precise
                        currentFinallyDeep = getConstant(cur.previous)
                    }

                    val owner = cur.owner
                    val name = cur.name
                    //TODO check closure
                    val argTypes = Type.getArgumentTypes(cur.desc)
                    val paramCount = argTypes.size + 1//non static
                    val firstParameterIndex = frame.stackSize - paramCount
                    if (isInvokeOnLambda(owner, name) /*&& methodInsnNode.owner.equals(INLINE_RUNTIME)*/) {
                        val sourceValue = frame.getStack(firstParameterIndex)
                        val lambdaInfo = getLambdaIfExistsAndMarkInstructions(sourceValue, true, instructions, sources, toDelete)
                        invokeCalls.add(InvokeCall(lambdaInfo, currentFinallyDeep))
                    }
                    else if (isAnonymousConstructorCall(owner, name)) {
                        val lambdaMapping = HashMap<Int, LambdaInfo>()

                        var offset = 0
                        var capturesAnonymousObjectThatMustBeRegenerated = false
                        for (i in 0..paramCount - 1) {
                            val sourceValue = frame.getStack(firstParameterIndex + i)
                            val lambdaInfo = getLambdaIfExistsAndMarkInstructions(sourceValue, false, instructions, sources, toDelete
                            )
                            if (lambdaInfo != null) {
                                lambdaMapping.put(offset, lambdaInfo)
                            }
                            else if (i < argTypes.size && isAnonymousClassThatMustBeRegenerated(argTypes[i])) {
                                capturesAnonymousObjectThatMustBeRegenerated = true
                            }

                            offset += if (i == 0) 1 else argTypes[i - 1].size
                        }

                        transformations.add(
                                buildConstructorInvocation(
                                        owner, cur.desc, lambdaMapping, awaitClassReification, capturesAnonymousObjectThatMustBeRegenerated
                                )
                        )
                        awaitClassReification = false
                    }
                    else if (inliningContext.isInliningLambda && ReifiedTypeInliner.isOperationReifiedMarker(cur)) {
                        val reificationArgument = cur.reificationArgument
                        val parameterName = reificationArgument!!.parameterName
                        result.reifiedTypeParametersUsages.addUsedReifiedParameter(parameterName)
                    }
                }
                else if (cur.opcode == Opcodes.GETSTATIC) {
                    val fieldInsnNode = cur as FieldInsnNode?
                    val className = fieldInsnNode!!.owner
                    if (isAnonymousSingletonLoad(className, fieldInsnNode.name)) {
                        transformations.add(
                                AnonymousObjectTransformationInfo(
                                        className, awaitClassReification, isAlreadyRegenerated(className), true,
                                        inliningContext.nameGenerator
                                )
                        )
                        awaitClassReification = false
                    }
                    else if (isWhenMappingAccess(className, fieldInsnNode.name)) {
                        transformations.add(
                                WhenMappingTransformationInfo(
                                        className, inliningContext.nameGenerator, isAlreadyRegenerated(className), fieldInsnNode
                                )
                        )
                    }
                }
                else if (cur.opcode == Opcodes.POP) {
                    getLambdaIfExistsAndMarkInstructions(frame.top()!!, true, instructions, sources, toDelete)?.let {
                        toDelete.add(cur)
                    }
                }
            }
            else {
                //given frame is <tt>null</tt> if and only if the corresponding instruction cannot be reached (dead code).
                //clean dead code otherwise there is problems in unreachable finally block, don't touch label it cause try/catch/finally problems
                if (cur.type == AbstractInsnNode.LABEL) {
                    //NB: Cause we generate exception table for default handler using gaps (see ExpressionCodegen.visitTryExpression)
                    //it may occurs that interval for default handler starts before catch start label, so this label seems as dead,
                    //but as result all this labels will be merged into one (see KT-5863)
                }
                else {
                    toDelete.add(cur)
                }
            }' @ [406:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'frame' @ [406:17] ==> val frame: Frame<SourceValue>? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'if (ReifiedTypeInliner.isNeedClassReificationMarker(cur)) {
                    awaitClassReification = true
                }
                else if (cur is MethodInsnNode) {
                    if (isFinallyStart(cur)) {
                        //TODO deep index calc could be more precise
                        currentFinallyDeep = getConstant(cur.previous)
                    }

                    val owner = cur.owner
                    val name = cur.name
                    //TODO check closure
                    val argTypes = Type.getArgumentTypes(cur.desc)
                    val paramCount = argTypes.size + 1//non static
                    val firstParameterIndex = frame.stackSize - paramCount
                    if (isInvokeOnLambda(owner, name) /*&& methodInsnNode.owner.equals(INLINE_RUNTIME)*/) {
                        val sourceValue = frame.getStack(firstParameterIndex)
                        val lambdaInfo = getLambdaIfExistsAndMarkInstructions(sourceValue, true, instructions, sources, toDelete)
                        invokeCalls.add(InvokeCall(lambdaInfo, currentFinallyDeep))
                    }
                    else if (isAnonymousConstructorCall(owner, name)) {
                        val lambdaMapping = HashMap<Int, LambdaInfo>()

                        var offset = 0
                        var capturesAnonymousObjectThatMustBeRegenerated = false
                        for (i in 0..paramCount - 1) {
                            val sourceValue = frame.getStack(firstParameterIndex + i)
                            val lambdaInfo = getLambdaIfExistsAndMarkInstructions(sourceValue, false, instructions, sources, toDelete
                            )
                            if (lambdaInfo != null) {
                                lambdaMapping.put(offset, lambdaInfo)
                            }
                            else if (i < argTypes.size && isAnonymousClassThatMustBeRegenerated(argTypes[i])) {
                                capturesAnonymousObjectThatMustBeRegenerated = true
                            }

                            offset += if (i == 0) 1 else argTypes[i - 1].size
                        }

                        transformations.add(
                                buildConstructorInvocation(
                                        owner, cur.desc, lambdaMapping, awaitClassReification, capturesAnonymousObjectThatMustBeRegenerated
                                )
                        )
                        awaitClassReification = false
                    }
                    else if (inliningContext.isInliningLambda && ReifiedTypeInliner.isOperationReifiedMarker(cur)) {
                        val reificationArgument = cur.reificationArgument
                        val parameterName = reificationArgument!!.parameterName
                        result.reifiedTypeParametersUsages.addUsedReifiedParameter(parameterName)
                    }
                }
                else if (cur.opcode == Opcodes.GETSTATIC) {
                    val fieldInsnNode = cur as FieldInsnNode?
                    val className = fieldInsnNode!!.owner
                    if (isAnonymousSingletonLoad(className, fieldInsnNode.name)) {
                        transformations.add(
                                AnonymousObjectTransformationInfo(
                                        className, awaitClassReification, isAlreadyRegenerated(className), true,
                                        inliningContext.nameGenerator
                                )
                        )
                        awaitClassReification = false
                    }
                    else if (isWhenMappingAccess(className, fieldInsnNode.name)) {
                        transformations.add(
                                WhenMappingTransformationInfo(
                                        className, inliningContext.nameGenerator, isAlreadyRegenerated(className), fieldInsnNode
                                )
                        )
                    }
                }
                else if (cur.opcode == Opcodes.POP) {
                    getLambdaIfExistsAndMarkInstructions(frame.top()!!, true, instructions, sources, toDelete)?.let {
                        toDelete.add(cur)
                    }
                }' @ [407:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'ReifiedTypeInliner' @ [407:21] ==> public companion object defined in org.jetbrains.kotlin.codegen.inline.ReifiedTypeInliner[FakeCallableDescriptorForObject]

'isNeedClassReificationMarker' @ [407:40] ==> @JvmStatic public final fun isNeedClassReificationMarker(insn: AbstractInsnNode): Boolean defined in org.jetbrains.kotlin.codegen.inline.ReifiedTypeInliner.Companion[SimpleFunctionDescriptorImpl]

'cur' @ [407:69] ==> value-parameter cur: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[ValueParameterDescriptorImpl]

'awaitClassReification' @ [408:21] ==> var awaitClassReification: Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable[LocalVariableDescriptor]

'if (cur is MethodInsnNode) {
                    if (isFinallyStart(cur)) {
                        //TODO deep index calc could be more precise
                        currentFinallyDeep = getConstant(cur.previous)
                    }

                    val owner = cur.owner
                    val name = cur.name
                    //TODO check closure
                    val argTypes = Type.getArgumentTypes(cur.desc)
                    val paramCount = argTypes.size + 1//non static
                    val firstParameterIndex = frame.stackSize - paramCount
                    if (isInvokeOnLambda(owner, name) /*&& methodInsnNode.owner.equals(INLINE_RUNTIME)*/) {
                        val sourceValue = frame.getStack(firstParameterIndex)
                        val lambdaInfo = getLambdaIfExistsAndMarkInstructions(sourceValue, true, instructions, sources, toDelete)
                        invokeCalls.add(InvokeCall(lambdaInfo, currentFinallyDeep))
                    }
                    else if (isAnonymousConstructorCall(owner, name)) {
                        val lambdaMapping = HashMap<Int, LambdaInfo>()

                        var offset = 0
                        var capturesAnonymousObjectThatMustBeRegenerated = false
                        for (i in 0..paramCount - 1) {
                            val sourceValue = frame.getStack(firstParameterIndex + i)
                            val lambdaInfo = getLambdaIfExistsAndMarkInstructions(sourceValue, false, instructions, sources, toDelete
                            )
                            if (lambdaInfo != null) {
                                lambdaMapping.put(offset, lambdaInfo)
                            }
                            else if (i < argTypes.size && isAnonymousClassThatMustBeRegenerated(argTypes[i])) {
                                capturesAnonymousObjectThatMustBeRegenerated = true
                            }

                            offset += if (i == 0) 1 else argTypes[i - 1].size
                        }

                        transformations.add(
                                buildConstructorInvocation(
                                        owner, cur.desc, lambdaMapping, awaitClassReification, capturesAnonymousObjectThatMustBeRegenerated
                                )
                        )
                        awaitClassReification = false
                    }
                    else if (inliningContext.isInliningLambda && ReifiedTypeInliner.isOperationReifiedMarker(cur)) {
                        val reificationArgument = cur.reificationArgument
                        val parameterName = reificationArgument!!.parameterName
                        result.reifiedTypeParametersUsages.addUsedReifiedParameter(parameterName)
                    }
                }
                else if (cur.opcode == Opcodes.GETSTATIC) {
                    val fieldInsnNode = cur as FieldInsnNode?
                    val className = fieldInsnNode!!.owner
                    if (isAnonymousSingletonLoad(className, fieldInsnNode.name)) {
                        transformations.add(
                                AnonymousObjectTransformationInfo(
                                        className, awaitClassReification, isAlreadyRegenerated(className), true,
                                        inliningContext.nameGenerator
                                )
                        )
                        awaitClassReification = false
                    }
                    else if (isWhenMappingAccess(className, fieldInsnNode.name)) {
                        transformations.add(
                                WhenMappingTransformationInfo(
                                        className, inliningContext.nameGenerator, isAlreadyRegenerated(className), fieldInsnNode
                                )
                        )
                    }
                }
                else if (cur.opcode == Opcodes.POP) {
                    getLambdaIfExistsAndMarkInstructions(frame.top()!!, true, instructions, sources, toDelete)?.let {
                        toDelete.add(cur)
                    }
                }' @ [410:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'cur' @ [410:26] ==> value-parameter cur: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[ValueParameterDescriptorImpl]

'isFinallyStart' @ [411:25] ==> internal fun isFinallyStart(node: AbstractInsnNode): Boolean defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'cur' @ [411:40] ==> value-parameter cur: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[ValueParameterDescriptorImpl]

'currentFinallyDeep' @ [413:25] ==> var currentFinallyDeep: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable[LocalVariableDescriptor]

'getConstant' @ [413:46] ==> internal fun getConstant(ins: AbstractInsnNode): Int defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'cur' @ [413:58] ==> value-parameter cur: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[ValueParameterDescriptorImpl]

'previous' @ [413:62] ==> public final val MethodInsnNode.previous: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'cur' @ [416:33] ==> value-parameter cur: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[ValueParameterDescriptorImpl]

'owner' @ [416:37] ==> public final var owner: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'cur' @ [417:32] ==> value-parameter cur: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [417:36] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'getArgumentTypes' @ [419:41] ==> public open fun getArgumentTypes(p0: (String..String?)): (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'cur' @ [419:58] ==> value-parameter cur: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[ValueParameterDescriptorImpl]

'desc' @ [419:62] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'argTypes' @ [420:38] ==> val argTypes: (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'size' @ [420:47] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'frame' @ [421:47] ==> val frame: Frame<SourceValue>? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'stackSize' @ [421:53] ==> public final val <V : (Value..Value?)> Frame<SourceValue>.stackSize: Int[MyPropertyDescriptor]
Inferred types:
    <V : (Value..Value?)> -> SourceValue

'paramCount' @ [421:65] ==> val paramCount: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'if (isInvokeOnLambda(owner, name) /*&& methodInsnNode.owner.equals(INLINE_RUNTIME)*/) {
                        val sourceValue = frame.getStack(firstParameterIndex)
                        val lambdaInfo = getLambdaIfExistsAndMarkInstructions(sourceValue, true, instructions, sources, toDelete)
                        invokeCalls.add(InvokeCall(lambdaInfo, currentFinallyDeep))
                    }
                    else if (isAnonymousConstructorCall(owner, name)) {
                        val lambdaMapping = HashMap<Int, LambdaInfo>()

                        var offset = 0
                        var capturesAnonymousObjectThatMustBeRegenerated = false
                        for (i in 0..paramCount - 1) {
                            val sourceValue = frame.getStack(firstParameterIndex + i)
                            val lambdaInfo = getLambdaIfExistsAndMarkInstructions(sourceValue, false, instructions, sources, toDelete
                            )
                            if (lambdaInfo != null) {
                                lambdaMapping.put(offset, lambdaInfo)
                            }
                            else if (i < argTypes.size && isAnonymousClassThatMustBeRegenerated(argTypes[i])) {
                                capturesAnonymousObjectThatMustBeRegenerated = true
                            }

                            offset += if (i == 0) 1 else argTypes[i - 1].size
                        }

                        transformations.add(
                                buildConstructorInvocation(
                                        owner, cur.desc, lambdaMapping, awaitClassReification, capturesAnonymousObjectThatMustBeRegenerated
                                )
                        )
                        awaitClassReification = false
                    }
                    else if (inliningContext.isInliningLambda && ReifiedTypeInliner.isOperationReifiedMarker(cur)) {
                        val reificationArgument = cur.reificationArgument
                        val parameterName = reificationArgument!!.parameterName
                        result.reifiedTypeParametersUsages.addUsedReifiedParameter(parameterName)
                    }' @ [422:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'isInvokeOnLambda' @ [422:25] ==> internal fun isInvokeOnLambda(owner: String, name: String): Boolean defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'owner' @ [422:42] ==> val owner: (String..String?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'name' @ [422:49] ==> val name: (String..String?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'frame' @ [423:43] ==> val frame: Frame<SourceValue>? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'getStack' @ [423:49] ==> public open fun getStack(p0: Int): (SourceValue..SourceValue?) defined in org.jetbrains.org.objectweb.asm.tree.analysis.Frame[JavaMethodDescriptor]

'firstParameterIndex' @ [423:58] ==> val firstParameterIndex: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'getLambdaIfExistsAndMarkInstructions' @ [424:42] ==> public fun MethodInliner.getLambdaIfExistsAndMarkInstructions(sourceValue: SourceValue, processSwap: Boolean, insnList: InsnList, frames: Array<Frame<SourceValue>?>, toDelete: MutableSet<AbstractInsnNode>): LambdaInfo? defined in org.jetbrains.kotlin.codegen.inline in file MethodInlinerUtil.kt[SimpleFunctionDescriptorImpl]

'sourceValue' @ [424:79] ==> val sourceValue: (SourceValue..SourceValue?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'instructions' @ [424:98] ==> val instructions: (InsnList..InsnList?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable[LocalVariableDescriptor]

'sources' @ [424:112] ==> val sources: Array<Frame<SourceValue>?> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable[LocalVariableDescriptor]

'toDelete' @ [424:121] ==> val toDelete: SmartSet<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable[LocalVariableDescriptor]

'invokeCalls' @ [425:25] ==> private final val invokeCalls: ArrayList<InvokeCall> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'add' @ [425:37] ==> public open fun add(element: InvokeCall): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'InvokeCall' @ [425:41] ==> public/*package*/ constructor InvokeCall(@Nullable lambdaInfo: LambdaInfo?, finallyDepthShift: Int) defined in org.jetbrains.kotlin.codegen.inline.InvokeCall[JavaClassConstructorDescriptor]

'lambdaInfo' @ [425:52] ==> val lambdaInfo: LambdaInfo? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'currentFinallyDeep' @ [425:64] ==> var currentFinallyDeep: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable[LocalVariableDescriptor]

'if (isAnonymousConstructorCall(owner, name)) {
                        val lambdaMapping = HashMap<Int, LambdaInfo>()

                        var offset = 0
                        var capturesAnonymousObjectThatMustBeRegenerated = false
                        for (i in 0..paramCount - 1) {
                            val sourceValue = frame.getStack(firstParameterIndex + i)
                            val lambdaInfo = getLambdaIfExistsAndMarkInstructions(sourceValue, false, instructions, sources, toDelete
                            )
                            if (lambdaInfo != null) {
                                lambdaMapping.put(offset, lambdaInfo)
                            }
                            else if (i < argTypes.size && isAnonymousClassThatMustBeRegenerated(argTypes[i])) {
                                capturesAnonymousObjectThatMustBeRegenerated = true
                            }

                            offset += if (i == 0) 1 else argTypes[i - 1].size
                        }

                        transformations.add(
                                buildConstructorInvocation(
                                        owner, cur.desc, lambdaMapping, awaitClassReification, capturesAnonymousObjectThatMustBeRegenerated
                                )
                        )
                        awaitClassReification = false
                    }
                    else if (inliningContext.isInliningLambda && ReifiedTypeInliner.isOperationReifiedMarker(cur)) {
                        val reificationArgument = cur.reificationArgument
                        val parameterName = reificationArgument!!.parameterName
                        result.reifiedTypeParametersUsages.addUsedReifiedParameter(parameterName)
                    }' @ [427:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isAnonymousConstructorCall' @ [427:30] ==> internal fun isAnonymousConstructorCall(internalName: String, methodName: String): Boolean defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'owner' @ [427:57] ==> val owner: (String..String?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'name' @ [427:64] ==> val name: (String..String?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'HashMap' @ [428:45] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Int
    <V : (Any..Any?)> -> LambdaInfo

'..' @ [432:35] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'paramCount' @ [432:38] ==> val paramCount: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'frame' @ [433:47] ==> val frame: Frame<SourceValue>? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'getStack' @ [433:53] ==> public open fun getStack(p0: Int): (SourceValue..SourceValue?) defined in org.jetbrains.org.objectweb.asm.tree.analysis.Frame[JavaMethodDescriptor]

'firstParameterIndex' @ [433:62] ==> val firstParameterIndex: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'i' @ [433:84] ==> val i: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'getLambdaIfExistsAndMarkInstructions' @ [434:46] ==> public fun MethodInliner.getLambdaIfExistsAndMarkInstructions(sourceValue: SourceValue, processSwap: Boolean, insnList: InsnList, frames: Array<Frame<SourceValue>?>, toDelete: MutableSet<AbstractInsnNode>): LambdaInfo? defined in org.jetbrains.kotlin.codegen.inline in file MethodInlinerUtil.kt[SimpleFunctionDescriptorImpl]

'sourceValue' @ [434:83] ==> val sourceValue: (SourceValue..SourceValue?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'instructions' @ [434:103] ==> val instructions: (InsnList..InsnList?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable[LocalVariableDescriptor]

'sources' @ [434:117] ==> val sources: Array<Frame<SourceValue>?> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable[LocalVariableDescriptor]

'toDelete' @ [434:126] ==> val toDelete: SmartSet<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable[LocalVariableDescriptor]

'if (lambdaInfo != null) {
                                lambdaMapping.put(offset, lambdaInfo)
                            }
                            else if (i < argTypes.size && isAnonymousClassThatMustBeRegenerated(argTypes[i])) {
                                capturesAnonymousObjectThatMustBeRegenerated = true
                            }' @ [436:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any?, elseBranch: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any?

'lambdaInfo' @ [436:33] ==> val lambdaInfo: LambdaInfo? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'lambdaMapping' @ [437:33] ==> val lambdaMapping: HashMap<Int, LambdaInfo> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'put' @ [437:47] ==> public open fun put(key: Int, value: LambdaInfo): LambdaInfo? defined in java.util.HashMap[JavaMethodDescriptor]

'offset' @ [437:51] ==> var offset: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'lambdaInfo' @ [437:59] ==> val lambdaInfo: LambdaInfo? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'i' @ [439:38] ==> val i: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'argTypes' @ [439:42] ==> val argTypes: (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'size' @ [439:51] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'isAnonymousClassThatMustBeRegenerated' @ [439:59] ==> private final fun isAnonymousClassThatMustBeRegenerated(type: Type?): Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[SimpleFunctionDescriptorImpl]

'argTypes' @ [439:97] ==> val argTypes: (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'i' @ [439:106] ==> val i: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'capturesAnonymousObjectThatMustBeRegenerated' @ [440:33] ==> var capturesAnonymousObjectThatMustBeRegenerated: Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'offset' @ [443:29] ==> var offset: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'if (i == 0) 1 else argTypes[i - 1].size' @ [443:39] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'i' @ [443:43] ==> val i: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'argTypes' @ [443:58] ==> val argTypes: (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'i' @ [443:67] ==> val i: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'size' @ [443:74] ==> public final val Type.size: Int[MyPropertyDescriptor]

'transformations' @ [446:25] ==> private final val transformations: ArrayList<TransformationInfo> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'add' @ [446:41] ==> public open fun add(element: TransformationInfo): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'buildConstructorInvocation' @ [447:33] ==> private final fun buildConstructorInvocation(anonymousType: String, desc: String, lambdaMapping: Map<Int, LambdaInfo>, needReification: Boolean, capturesAnonymousObjectThatMustBeRegenerated: Boolean): AnonymousObjectTransformationInfo defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[SimpleFunctionDescriptorImpl]

'owner' @ [448:41] ==> val owner: (String..String?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'cur' @ [448:48] ==> value-parameter cur: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[ValueParameterDescriptorImpl]

'desc' @ [448:52] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'lambdaMapping' @ [448:58] ==> val lambdaMapping: HashMap<Int, LambdaInfo> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'awaitClassReification' @ [448:73] ==> var awaitClassReification: Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable[LocalVariableDescriptor]

'capturesAnonymousObjectThatMustBeRegenerated' @ [448:96] ==> var capturesAnonymousObjectThatMustBeRegenerated: Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'awaitClassReification' @ [451:25] ==> var awaitClassReification: Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable[LocalVariableDescriptor]

'inliningContext' @ [453:30] ==> private final val inliningContext: InliningContext defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'isInliningLambda' @ [453:46] ==> public final val isInliningLambda: Boolean defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'ReifiedTypeInliner' @ [453:66] ==> public companion object defined in org.jetbrains.kotlin.codegen.inline.ReifiedTypeInliner[FakeCallableDescriptorForObject]

'isOperationReifiedMarker' @ [453:85] ==> public final fun isOperationReifiedMarker(insn: AbstractInsnNode): Boolean defined in org.jetbrains.kotlin.codegen.inline.ReifiedTypeInliner.Companion[SimpleFunctionDescriptorImpl]

'cur' @ [453:110] ==> value-parameter cur: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[ValueParameterDescriptorImpl]

'cur' @ [454:51] ==> value-parameter cur: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[ValueParameterDescriptorImpl]

'reificationArgument' @ [454:55] ==> public val MethodInsnNode.reificationArgument: ReificationArgument? defined in org.jetbrains.kotlin.codegen.inline in file ReifiedTypeInliner.kt[PropertyDescriptorImpl]

'reificationArgument' @ [455:45] ==> val reificationArgument: ReificationArgument? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'parameterName' @ [455:67] ==> public final val parameterName: String defined in org.jetbrains.kotlin.codegen.inline.ReificationArgument[PropertyDescriptorImpl]

'result' @ [456:25] ==> private final val result: InlineResult defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'reifiedTypeParametersUsages' @ [456:32] ==> public final val reifiedTypeParametersUsages: ReifiedTypeParametersUsages defined in org.jetbrains.kotlin.codegen.inline.InlineResult[PropertyDescriptorImpl]

'addUsedReifiedParameter' @ [456:60] ==> public final fun addUsedReifiedParameter(name: String): Unit defined in org.jetbrains.kotlin.codegen.inline.ReifiedTypeParametersUsages[SimpleFunctionDescriptorImpl]

'parameterName' @ [456:84] ==> val parameterName: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'if (cur.opcode == Opcodes.GETSTATIC) {
                    val fieldInsnNode = cur as FieldInsnNode?
                    val className = fieldInsnNode!!.owner
                    if (isAnonymousSingletonLoad(className, fieldInsnNode.name)) {
                        transformations.add(
                                AnonymousObjectTransformationInfo(
                                        className, awaitClassReification, isAlreadyRegenerated(className), true,
                                        inliningContext.nameGenerator
                                )
                        )
                        awaitClassReification = false
                    }
                    else if (isWhenMappingAccess(className, fieldInsnNode.name)) {
                        transformations.add(
                                WhenMappingTransformationInfo(
                                        className, inliningContext.nameGenerator, isAlreadyRegenerated(className), fieldInsnNode
                                )
                        )
                    }
                }
                else if (cur.opcode == Opcodes.POP) {
                    getLambdaIfExistsAndMarkInstructions(frame.top()!!, true, instructions, sources, toDelete)?.let {
                        toDelete.add(cur)
                    }
                }' @ [459:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'cur' @ [459:26] ==> value-parameter cur: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[ValueParameterDescriptorImpl]

'opcode' @ [459:30] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'GETSTATIC' @ [459:48] ==> public const final val GETSTATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'cur' @ [460:41] ==> value-parameter cur: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[ValueParameterDescriptorImpl]

'fieldInsnNode' @ [461:37] ==> val fieldInsnNode: FieldInsnNode? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'owner' @ [461:53] ==> public final var owner: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.FieldInsnNode[JavaPropertyDescriptor]

'if (isAnonymousSingletonLoad(className, fieldInsnNode.name)) {
                        transformations.add(
                                AnonymousObjectTransformationInfo(
                                        className, awaitClassReification, isAlreadyRegenerated(className), true,
                                        inliningContext.nameGenerator
                                )
                        )
                        awaitClassReification = false
                    }
                    else if (isWhenMappingAccess(className, fieldInsnNode.name)) {
                        transformations.add(
                                WhenMappingTransformationInfo(
                                        className, inliningContext.nameGenerator, isAlreadyRegenerated(className), fieldInsnNode
                                )
                        )
                    }' @ [462:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isAnonymousSingletonLoad' @ [462:25] ==> internal fun isAnonymousSingletonLoad(internalName: String, fieldName: String): Boolean defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'className' @ [462:50] ==> val className: (String..String?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'fieldInsnNode' @ [462:61] ==> val fieldInsnNode: FieldInsnNode? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'name' @ [462:75] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.FieldInsnNode[JavaPropertyDescriptor]

'transformations' @ [463:25] ==> private final val transformations: ArrayList<TransformationInfo> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'add' @ [463:41] ==> public open fun add(element: TransformationInfo): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'AnonymousObjectTransformationInfo' @ [464:33] ==> public constructor AnonymousObjectTransformationInfo(ownerInternalName: String, needReification: Boolean, alreadyRegenerated: Boolean, isStaticOrigin: Boolean, nameGenerator: NameGenerator) defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformationInfo[ClassConstructorDescriptorImpl]

'className' @ [465:41] ==> val className: (String..String?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'awaitClassReification' @ [465:52] ==> var awaitClassReification: Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable[LocalVariableDescriptor]

'isAlreadyRegenerated' @ [465:75] ==> private final fun isAlreadyRegenerated(owner: String): Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[SimpleFunctionDescriptorImpl]

'className' @ [465:96] ==> val className: (String..String?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'inliningContext' @ [466:41] ==> private final val inliningContext: InliningContext defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'nameGenerator' @ [466:57] ==> public final val nameGenerator: NameGenerator defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'awaitClassReification' @ [469:25] ==> var awaitClassReification: Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable[LocalVariableDescriptor]

'isWhenMappingAccess' @ [471:30] ==> internal fun isWhenMappingAccess(internalName: String, fieldName: String): Boolean defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'className' @ [471:50] ==> val className: (String..String?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'fieldInsnNode' @ [471:61] ==> val fieldInsnNode: FieldInsnNode? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'name' @ [471:75] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.FieldInsnNode[JavaPropertyDescriptor]

'transformations' @ [472:25] ==> private final val transformations: ArrayList<TransformationInfo> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'add' @ [472:41] ==> public open fun add(element: TransformationInfo): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'WhenMappingTransformationInfo' @ [473:33] ==> public constructor WhenMappingTransformationInfo(oldClassName: String, parentNameGenerator: NameGenerator, alreadyRegenerated: Boolean, fieldNode: FieldInsnNode) defined in org.jetbrains.kotlin.codegen.inline.WhenMappingTransformationInfo[ClassConstructorDescriptorImpl]

'className' @ [474:41] ==> val className: (String..String?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'inliningContext' @ [474:52] ==> private final val inliningContext: InliningContext defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'nameGenerator' @ [474:68] ==> public final val nameGenerator: NameGenerator defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'isAlreadyRegenerated' @ [474:83] ==> private final fun isAlreadyRegenerated(owner: String): Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[SimpleFunctionDescriptorImpl]

'className' @ [474:104] ==> val className: (String..String?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'fieldInsnNode' @ [474:116] ==> val fieldInsnNode: FieldInsnNode? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'cur' @ [479:26] ==> value-parameter cur: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[ValueParameterDescriptorImpl]

'opcode' @ [479:30] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'POP' @ [479:48] ==> public const final val POP: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'getLambdaIfExistsAndMarkInstructions' @ [480:21] ==> public fun MethodInliner.getLambdaIfExistsAndMarkInstructions(sourceValue: SourceValue, processSwap: Boolean, insnList: InsnList, frames: Array<Frame<SourceValue>?>, toDelete: MutableSet<AbstractInsnNode>): LambdaInfo? defined in org.jetbrains.kotlin.codegen.inline in file MethodInlinerUtil.kt[SimpleFunctionDescriptorImpl]

'frame' @ [480:58] ==> val frame: Frame<SourceValue>? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[LocalVariableDescriptor]

'top' @ [480:64] ==> public fun <V : Value> Frame<SourceValue>.top(): SourceValue? defined in org.jetbrains.kotlin.codegen.optimization.fixStack[SimpleFunctionDescriptorImpl]
Inferred types:
    <V : Value> -> SourceValue

'instructions' @ [480:79] ==> val instructions: (InsnList..InsnList?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable[LocalVariableDescriptor]

'sources' @ [480:93] ==> val sources: Array<Frame<SourceValue>?> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable[LocalVariableDescriptor]

'toDelete' @ [480:102] ==> val toDelete: SmartSet<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable[LocalVariableDescriptor]

'let' @ [480:113] ==> @InlineOnly public inline fun <T, R> LambdaInfo.let(block: (LambdaInfo) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LambdaInfo
    <R> -> Boolean

'toDelete' @ [481:25] ==> val toDelete: SmartSet<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable[LocalVariableDescriptor]

'add' @ [481:34] ==> public open fun add(element: AbstractInsnNode): Boolean defined in org.jetbrains.kotlin.utils.SmartSet[DeserializedSimpleFunctionDescriptor]

'cur' @ [481:38] ==> value-parameter cur: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[ValueParameterDescriptorImpl]

'if (cur.type == AbstractInsnNode.LABEL) {
                    //NB: Cause we generate exception table for default handler using gaps (see ExpressionCodegen.visitTryExpression)
                    //it may occurs that interval for default handler starts before catch start label, so this label seems as dead,
                    //but as result all this labels will be merged into one (see KT-5863)
                }
                else {
                    toDelete.add(cur)
                }' @ [488:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'cur' @ [488:21] ==> value-parameter cur: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [488:25] ==> public final val AbstractInsnNode.type: Int[MyPropertyDescriptor]

'LABEL' @ [488:50] ==> public const final val LABEL: Int defined in org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode[JavaPropertyDescriptor]

'toDelete' @ [494:21] ==> val toDelete: SmartSet<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable[LocalVariableDescriptor]

'add' @ [494:30] ==> public open fun add(element: AbstractInsnNode): Boolean defined in org.jetbrains.kotlin.utils.SmartSet[DeserializedSimpleFunctionDescriptor]

'cur' @ [494:34] ==> value-parameter cur: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[ValueParameterDescriptorImpl]

'processingNode' @ [499:9] ==> val processingNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable[LocalVariableDescriptor]

'remove' @ [499:24] ==> public fun MethodNode.remove(instructions: Collection<AbstractInsnNode>): Unit defined in org.jetbrains.kotlin.codegen.inline in file MethodInlinerUtil.kt[SimpleFunctionDescriptorImpl]

'toDelete' @ [499:31] ==> val toDelete: SmartSet<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable[LocalVariableDescriptor]

'processingNode' @ [502:9] ==> val processingNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable[LocalVariableDescriptor]

'tryCatchBlocks' @ [502:24] ==> public final var tryCatchBlocks: (MutableList<(TryCatchBlockNode..TryCatchBlockNode?)>..List<(TryCatchBlockNode..TryCatchBlockNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'removeIf' @ [502:39] ==> public final fun removeIf(p0: ((TryCatchBlockNode..TryCatchBlockNode?)) -> Boolean): Boolean defined in kotlin.collections.MutableList[MyFunctionDescriptor]

'it' @ [502:50] ==> value-parameter it: (TryCatchBlockNode..TryCatchBlockNode?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable.<anonymous>[ValueParameterDescriptorImpl]

'isMeaningless' @ [502:53] ==> public fun TryCatchBlockNode.isMeaningless(): Boolean defined in org.jetbrains.kotlin.codegen.inline in file CoveringTryCatchNodeProcessor.kt[SimpleFunctionDescriptorImpl]

'processingNode' @ [504:16] ==> val processingNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.markPlacesForInlineAndRemoveInlinable[LocalVariableDescriptor]

'analyzeMethodNodeBeforeInline' @ [508:22] ==> private final fun analyzeMethodNodeBeforeInline(node: MethodNode): Array<Frame<SourceValue>?> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[SimpleFunctionDescriptorImpl]

'node' @ [508:52] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.normalizeLocalReturns[ValueParameterDescriptorImpl]

'LocalReturnsNormalizer' @ [510:38] ==> public constructor LocalReturnsNormalizer() defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer[ClassConstructorDescriptorImpl]

'component1' @ [512:15] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [512:22] ==> public final operator fun component2(): (AbstractInsnNode..AbstractInsnNode?) defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'node' @ [512:35] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.normalizeLocalReturns[ValueParameterDescriptorImpl]

'instructions' @ [512:40] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'toArray' @ [512:53] ==> public open fun toArray(): (Array<(AbstractInsnNode..AbstractInsnNode?)>..Array<out (AbstractInsnNode..AbstractInsnNode?)>?) defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'withIndex' @ [512:63] ==> public fun <T> Array<out (AbstractInsnNode..AbstractInsnNode?)>.withIndex(): Iterable<IndexedValue<(AbstractInsnNode..AbstractInsnNode?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode..org.jetbrains.org.objectweb.asm.tree.AbstractInsnNode?)

'frames' @ [513:25] ==> val frames: Array<Frame<SourceValue>?> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.normalizeLocalReturns[LocalVariableDescriptor]

'index' @ [513:32] ==> val index: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.normalizeLocalReturns[LocalVariableDescriptor]

'!' @ [516:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isReturnOpcode' @ [516:18] ==> internal fun isReturnOpcode(opcode: Int): Boolean defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'insnNode' @ [516:33] ==> val insnNode: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.normalizeLocalReturns[LocalVariableDescriptor]

'opcode' @ [516:42] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'insnNode' @ [518:36] ==> val insnNode: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.normalizeLocalReturns[LocalVariableDescriptor]

'getMarkedReturnLabelOrNull' @ [521:29] ==> internal fun getMarkedReturnLabelOrNull(returnInsn: AbstractInsnNode): String? defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'insnNode' @ [521:56] ==> val insnNode: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.normalizeLocalReturns[LocalVariableDescriptor]

'labelName' @ [522:17] ==> val labelName: String? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.normalizeLocalReturns[LocalVariableDescriptor]

'!' @ [523:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'labelOwner' @ [523:22] ==> value-parameter labelOwner: LabelOwner defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.normalizeLocalReturns[ValueParameterDescriptorImpl]

'isMyLabel' @ [523:33] ==> public abstract fun isMyLabel(@NotNull name: String): Boolean defined in org.jetbrains.kotlin.codegen.inline.LabelOwner[JavaMethodDescriptor]

'labelName' @ [523:43] ==> val labelName: String? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.normalizeLocalReturns[LocalVariableDescriptor]

'insertBeforeInsn' @ [524:17] ==> var insertBeforeInsn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.normalizeLocalReturns[LocalVariableDescriptor]

'insnNode' @ [524:36] ==> val insnNode: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.normalizeLocalReturns[LocalVariableDescriptor]

'previous' @ [524:45] ==> public final val AbstractInsnNode.previous: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'localReturnsNormalizer' @ [527:13] ==> val localReturnsNormalizer: MethodInliner.LocalReturnsNormalizer defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.normalizeLocalReturns[LocalVariableDescriptor]

'addLocalReturnToTransform' @ [527:36] ==> internal final fun addLocalReturnToTransform(returnInsn: AbstractInsnNode, insertBeforeInsn: AbstractInsnNode, sourceValueFrame: Frame<SourceValue>): Unit defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer[SimpleFunctionDescriptorImpl]

'insnNode' @ [527:62] ==> val insnNode: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.normalizeLocalReturns[LocalVariableDescriptor]

'insertBeforeInsn' @ [527:72] ==> var insertBeforeInsn: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.normalizeLocalReturns[LocalVariableDescriptor]

'frame' @ [527:90] ==> val frame: Frame<SourceValue> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.normalizeLocalReturns[LocalVariableDescriptor]

'localReturnsNormalizer' @ [530:9] ==> val localReturnsNormalizer: MethodInliner.LocalReturnsNormalizer defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.normalizeLocalReturns[LocalVariableDescriptor]

'transform' @ [530:32] ==> public final fun transform(methodNode: MethodNode): Unit defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer[SimpleFunctionDescriptorImpl]

'node' @ [530:42] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.normalizeLocalReturns[ValueParameterDescriptorImpl]

'type' @ [534:13] ==> value-parameter type: Type? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.isAnonymousClassThatMustBeRegenerated[ValueParameterDescriptorImpl]

'type' @ [534:29] ==> value-parameter type: Type? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.isAnonymousClassThatMustBeRegenerated[ValueParameterDescriptorImpl]

'sort' @ [534:34] ==> public final val Type.sort: Int[MyPropertyDescriptor]

'OBJECT' @ [534:47] ==> public const final val OBJECT: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'inliningContext' @ [535:20] ==> private final val inliningContext: InliningContext defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'findAnonymousObjectTransformationInfo' @ [535:36] ==> public final fun findAnonymousObjectTransformationInfo(internalName: String): AnonymousObjectTransformationInfo? defined in org.jetbrains.kotlin.codegen.inline.InliningContext[SimpleFunctionDescriptorImpl]

'type' @ [535:74] ==> value-parameter type: Type? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.isAnonymousClassThatMustBeRegenerated[ValueParameterDescriptorImpl]

'internalName' @ [535:79] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'info' @ [536:16] ==> val info: AnonymousObjectTransformationInfo? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.isAnonymousClassThatMustBeRegenerated[LocalVariableDescriptor]

'info' @ [536:32] ==> val info: AnonymousObjectTransformationInfo? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.isAnonymousClassThatMustBeRegenerated[LocalVariableDescriptor]

'shouldRegenerate' @ [536:37] ==> public open fun shouldRegenerate(sameModule: Boolean): Boolean defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformationInfo[SimpleFunctionDescriptorImpl]

'FixStackWithLabelNormalizationMethodTransformer' @ [541:13] ==> public constructor FixStackWithLabelNormalizationMethodTransformer() defined in org.jetbrains.kotlin.codegen.optimization.FixStackWithLabelNormalizationMethodTransformer[ClassConstructorDescriptorImpl]

'transform' @ [541:63] ==> public open fun transform(internalClassName: String, methodNode: MethodNode): Unit defined in org.jetbrains.kotlin.codegen.optimization.FixStackWithLabelNormalizationMethodTransformer[SimpleFunctionDescriptorImpl]

'node' @ [541:81] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.analyzeMethodNodeBeforeInline[ValueParameterDescriptorImpl]

'wrapException' @ [544:19] ==> private final fun wrapException(originalException: Throwable, node: MethodNode, errorSuffix: String): RuntimeException /* = RuntimeException */ defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[SimpleFunctionDescriptorImpl]

'e' @ [544:33] ==> val e: Throwable defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.analyzeMethodNodeBeforeInline[LocalVariableDescriptor]

'node' @ [544:36] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.analyzeMethodNodeBeforeInline[ValueParameterDescriptorImpl]

'analyzeMethodNodeWithoutMandatoryTransformations' @ [547:16] ==> private final fun analyzeMethodNodeWithoutMandatoryTransformations(node: MethodNode): Array<Frame<SourceValue>?> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion[SimpleFunctionDescriptorImpl]

'node' @ [547:65] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.analyzeMethodNodeBeforeInline[ValueParameterDescriptorImpl]

'inliningContext' @ [557:38] ==> private final val inliningContext: InliningContext defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'findAnonymousObjectTransformationInfo' @ [557:54] ==> public final fun findAnonymousObjectTransformationInfo(internalName: String): AnonymousObjectTransformationInfo? defined in org.jetbrains.kotlin.codegen.inline.InliningContext[SimpleFunctionDescriptorImpl]

'anonymousType' @ [557:92] ==> value-parameter anonymousType: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.buildConstructorInvocation[ValueParameterDescriptorImpl]

'AnonymousObjectTransformationInfo' @ [559:20] ==> internal constructor AnonymousObjectTransformationInfo(oldClassName: String, needReification: Boolean, lambdasToInline: Map<Int, LambdaInfo>, capturedOuterRegenerated: Boolean, alreadyRegenerated: Boolean, constructorDesc: String?, isStaticOrigin: Boolean, parentNameGenerator: NameGenerator, capturesAnonymousObjectThatMustBeRegenerated: Boolean = ...) defined in org.jetbrains.kotlin.codegen.inline.AnonymousObjectTransformationInfo[ClassConstructorDescriptorImpl]

'anonymousType' @ [560:17] ==> value-parameter anonymousType: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.buildConstructorInvocation[ValueParameterDescriptorImpl]

'needReification' @ [560:32] ==> value-parameter needReification: Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.buildConstructorInvocation[ValueParameterDescriptorImpl]

'lambdaMapping' @ [560:49] ==> value-parameter lambdaMapping: Map<Int, LambdaInfo> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.buildConstructorInvocation[ValueParameterDescriptorImpl]

'inliningContext' @ [561:17] ==> private final val inliningContext: InliningContext defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'classRegeneration' @ [561:33] ==> public final val classRegeneration: Boolean defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'isAlreadyRegenerated' @ [562:17] ==> private final fun isAlreadyRegenerated(owner: String): Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[SimpleFunctionDescriptorImpl]

'anonymousType' @ [562:38] ==> value-parameter anonymousType: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.buildConstructorInvocation[ValueParameterDescriptorImpl]

'desc' @ [563:17] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.buildConstructorInvocation[ValueParameterDescriptorImpl]

'inliningContext' @ [565:17] ==> private final val inliningContext: InliningContext defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'nameGenerator' @ [565:33] ==> public final val nameGenerator: NameGenerator defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'capturesAnonymousObjectThatMustBeRegenerated' @ [566:17] ==> value-parameter capturesAnonymousObjectThatMustBeRegenerated: Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.buildConstructorInvocation[ValueParameterDescriptorImpl]

'memoizeAnonymousObject' @ [569:13] ==> val memoizeAnonymousObject: Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.buildConstructorInvocation[LocalVariableDescriptor]

'inliningContext' @ [570:13] ==> private final val inliningContext: InliningContext defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'root' @ [570:29] ==> public final val root: RootInliningContext defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'internalNameToAnonymousObjectTransformationInfo' @ [570:34] ==> public final val internalNameToAnonymousObjectTransformationInfo: HashMap<String, AnonymousObjectTransformationInfo> /* = HashMap<String, AnonymousObjectTransformationInfo> */ defined in org.jetbrains.kotlin.codegen.inline.RootInliningContext[PropertyDescriptorImpl]

'put' @ [570:82] ==> public open fun put(key: String, value: AnonymousObjectTransformationInfo): AnonymousObjectTransformationInfo? defined in java.util.HashMap[JavaMethodDescriptor]

'anonymousType' @ [570:86] ==> value-parameter anonymousType: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.buildConstructorInvocation[ValueParameterDescriptorImpl]

'info' @ [570:101] ==> val info: AnonymousObjectTransformationInfo defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.buildConstructorInvocation[LocalVariableDescriptor]

'info' @ [572:16] ==> val info: AnonymousObjectTransformationInfo defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.buildConstructorInvocation[LocalVariableDescriptor]

'inliningContext' @ [576:16] ==> private final val inliningContext: InliningContext defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'typeRemapper' @ [576:32] ==> public final val typeRemapper: TypeRemapper defined in org.jetbrains.kotlin.codegen.inline.InliningContext[PropertyDescriptorImpl]

'hasNoAdditionalMapping' @ [576:45] ==> public final fun hasNoAdditionalMapping(type: String): Boolean defined in org.jetbrains.kotlin.codegen.inline.TypeRemapper[SimpleFunctionDescriptorImpl]

'owner' @ [576:68] ==> value-parameter owner: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.isAlreadyRegenerated[ValueParameterDescriptorImpl]

'when {
            insnNode.opcode == Opcodes.ALOAD ->
                getLambdaIfExists((insnNode as VarInsnNode).`var`)
            insnNode is FieldInsnNode && insnNode.name.startsWith(CAPTURED_FIELD_FOLD_PREFIX) ->
                findCapturedField(insnNode, nodeRemapper).lambda
            else ->
                null
        }' @ [580:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: LambdaInfo?, entry1: LambdaInfo?, entry2: LambdaInfo?): LambdaInfo?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> LambdaInfo?

'insnNode' @ [581:13] ==> value-parameter insnNode: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.getLambdaIfExists[ValueParameterDescriptorImpl]

'opcode' @ [581:22] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'ALOAD' @ [581:40] ==> public const final val ALOAD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'getLambdaIfExists' @ [582:17] ==> private final fun getLambdaIfExists(varIndex: Int): LambdaInfo? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[SimpleFunctionDescriptorImpl]

'insnNode' @ [582:36] ==> value-parameter insnNode: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.getLambdaIfExists[ValueParameterDescriptorImpl]

'`var`' @ [582:61] ==> public final var `var`: Int defined in org.jetbrains.org.objectweb.asm.tree.VarInsnNode[JavaPropertyDescriptor]

'insnNode' @ [583:13] ==> value-parameter insnNode: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.getLambdaIfExists[ValueParameterDescriptorImpl]

'insnNode' @ [583:42] ==> value-parameter insnNode: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.getLambdaIfExists[ValueParameterDescriptorImpl]

'name' @ [583:51] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.FieldInsnNode[JavaPropertyDescriptor]

'startsWith' @ [583:56] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'CAPTURED_FIELD_FOLD_PREFIX' @ [583:67] ==> internal const val CAPTURED_FIELD_FOLD_PREFIX: String defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[PropertyDescriptorImpl]

'findCapturedField' @ [584:17] ==> @JvmStatic public final fun findCapturedField(node: FieldInsnNode, fieldRemapper: FieldRemapper): CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion[SimpleFunctionDescriptorImpl]

'insnNode' @ [584:35] ==> value-parameter insnNode: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.getLambdaIfExists[ValueParameterDescriptorImpl]

'nodeRemapper' @ [584:45] ==> private final val nodeRemapper: FieldRemapper defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'lambda' @ [584:59] ==> public final var CapturedParamInfo.lambda: LambdaInfo?[MyPropertyDescriptor]

'varIndex' @ [591:13] ==> value-parameter varIndex: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.getLambdaIfExists[ValueParameterDescriptorImpl]

'parameters' @ [591:24] ==> private final val parameters: Parameters defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'argsSizeOnStack' @ [591:35] ==> public final val argsSizeOnStack: Int defined in org.jetbrains.kotlin.codegen.inline.Parameters[PropertyDescriptorImpl]

'parameters' @ [592:20] ==> private final val parameters: Parameters defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'getParameterByDeclarationSlot' @ [592:31] ==> public final fun getParameterByDeclarationSlot(index: Int): ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.Parameters[SimpleFunctionDescriptorImpl]

'varIndex' @ [592:61] ==> value-parameter varIndex: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.getLambdaIfExists[ValueParameterDescriptorImpl]

'lambda' @ [592:71] ==> public final var ParameterInfo.lambda: LambdaInfo?[MyPropertyDescriptor]

'nodeRemapper' @ [598:13] ==> private final val nodeRemapper: FieldRemapper defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'isRoot' @ [598:26] ==> public final val isRoot: Boolean defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper[PropertyDescriptorImpl]

'node' @ [609:38] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.transformCaptured[ValueParameterDescriptorImpl]

'instructions' @ [609:43] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'first' @ [609:56] ==> public final val InsnList.first: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'cur' @ [610:16] ==> var cur: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.transformCaptured[LocalVariableDescriptor]

'cur' @ [611:17] ==> var cur: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.transformCaptured[LocalVariableDescriptor]

'cur' @ [611:39] ==> var cur: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.transformCaptured[LocalVariableDescriptor]

'opcode' @ [611:43] ==> public final var VarInsnNode.opcode: Int[MyPropertyDescriptor]

'ALOAD' @ [611:61] ==> public const final val ALOAD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'cur' @ [612:32] ==> var cur: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.transformCaptured[LocalVariableDescriptor]

'`var`' @ [612:36] ==> public final var `var`: Int defined in org.jetbrains.org.objectweb.asm.tree.VarInsnNode[JavaPropertyDescriptor]

'varIndex' @ [613:21] ==> val varIndex: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.transformCaptured[LocalVariableDescriptor]

'nodeRemapper' @ [613:38] ==> private final val nodeRemapper: FieldRemapper defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'shouldProcessNonAload0FieldAccessChains' @ [613:51] ==> public open fun shouldProcessNonAload0FieldAccessChains(): Boolean defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper[SimpleFunctionDescriptorImpl]

'getCapturedFieldAccessChain' @ [614:39] ==> private final fun getCapturedFieldAccessChain(aload0: VarInsnNode): List<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion[SimpleFunctionDescriptorImpl]

'!!' @ [614:67] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: VarInsnNode?): VarInsnNode[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> VarInsnNode

'cur' @ [614:68] ==> var cur: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.transformCaptured[LocalVariableDescriptor]

'nodeRemapper' @ [615:36] ==> private final val nodeRemapper: FieldRemapper defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'foldFieldAccessChainIfNeeded' @ [615:49] ==> public final fun foldFieldAccessChainIfNeeded(capturedFieldAccess: List<AbstractInsnNode>, node: MethodNode): AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper[SimpleFunctionDescriptorImpl]

'accessChain' @ [615:78] ==> val accessChain: List<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.transformCaptured[LocalVariableDescriptor]

'node' @ [615:91] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.transformCaptured[ValueParameterDescriptorImpl]

'insnNode' @ [616:25] ==> val insnNode: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.transformCaptured[LocalVariableDescriptor]

'cur' @ [617:25] ==> var cur: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.transformCaptured[LocalVariableDescriptor]

'insnNode' @ [617:31] ==> val insnNode: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.transformCaptured[LocalVariableDescriptor]

'cur' @ [621:13] ==> var cur: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.transformCaptured[LocalVariableDescriptor]

'cur' @ [621:19] ==> var cur: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.transformCaptured[LocalVariableDescriptor]

'next' @ [621:23] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'if (originalException is InlineException) {
            InlineException("$errorPrefix: $errorSuffix", originalException)
        }
        else {
            InlineException("$errorPrefix: $errorSuffix\nCause: ${node.nodeText}", originalException)
        }' @ [626:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: RuntimeException /* = RuntimeException */, elseBranch: RuntimeException /* = RuntimeException */): RuntimeException /* = RuntimeException */[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> RuntimeException

'originalException' @ [626:20] ==> value-parameter originalException: Throwable defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.wrapException[ValueParameterDescriptorImpl]

'InlineException' @ [627:13] ==> public constructor InlineException(message: (String..String?), cause: (Throwable..Throwable?)) defined in org.jetbrains.kotlin.codegen.inline.InlineException[JavaClassConstructorDescriptor]

'errorPrefix' @ [627:31] ==> private final val errorPrefix: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'errorSuffix' @ [627:45] ==> value-parameter errorSuffix: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.wrapException[ValueParameterDescriptorImpl]

'originalException' @ [627:59] ==> value-parameter originalException: Throwable defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.wrapException[ValueParameterDescriptorImpl]

'InlineException' @ [630:13] ==> public constructor InlineException(message: (String..String?), cause: (Throwable..Throwable?)) defined in org.jetbrains.kotlin.codegen.inline.InlineException[JavaClassConstructorDescriptor]

'errorPrefix' @ [630:31] ==> private final val errorPrefix: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[PropertyDescriptorImpl]

'errorSuffix' @ [630:45] ==> value-parameter errorSuffix: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.wrapException[ValueParameterDescriptorImpl]

'node' @ [630:67] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.wrapException[ValueParameterDescriptorImpl]

'nodeText' @ [630:72] ==> internal val MethodNode?.nodeText: String defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[PropertyDescriptorImpl]

'originalException' @ [630:84] ==> value-parameter originalException: Throwable defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.wrapException[ValueParameterDescriptorImpl]

'returnInsn' @ [642:41] ==> private final val returnInsn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.LocalReturn[PropertyDescriptorImpl]

'opcode' @ [642:52] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'RETURN' @ [642:70] ==> public const final val RETURN: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'if (isReturnWithValue) 1 else 0' @ [644:41] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'isReturnWithValue' @ [644:45] ==> val isReturnWithValue: Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.LocalReturn.transform[LocalVariableDescriptor]

'frame' @ [645:39] ==> private final val frame: Frame<SourceValue> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.LocalReturn[PropertyDescriptorImpl]

'stackSize' @ [645:45] ==> public final val <V : (Value..Value?)> Frame<SourceValue>.stackSize: Int[MyPropertyDescriptor]
Inferred types:
    <V : (Value..Value?)> -> SourceValue

'expectedStackSize' @ [646:21] ==> val expectedStackSize: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.LocalReturn.transform[LocalVariableDescriptor]

'actualStackSize' @ [646:42] ==> val actualStackSize: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.LocalReturn.transform[LocalVariableDescriptor]

'actualStackSize' @ [648:33] ==> val actualStackSize: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.LocalReturn.transform[LocalVariableDescriptor]

'isReturnWithValue' @ [649:21] ==> val isReturnWithValue: Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.LocalReturn.transform[LocalVariableDescriptor]

'+' @ [650:39] ==> public final operator fun plus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'ISTORE' @ [650:47] ==> public const final val ISTORE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'returnInsn' @ [650:56] ==> private final val returnInsn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.LocalReturn[PropertyDescriptorImpl]

'opcode' @ [650:67] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'IRETURN' @ [650:84] ==> public const final val IRETURN: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'insnList' @ [651:21] ==> value-parameter insnList: InsnList defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.LocalReturn.transform[ValueParameterDescriptorImpl]

'insertBefore' @ [651:30] ==> public open fun insertBefore(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insertBeforeInsn' @ [651:43] ==> private final val insertBeforeInsn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.LocalReturn[PropertyDescriptorImpl]

'VarInsnNode' @ [651:61] ==> public constructor VarInsnNode(p0: Int, p1: Int) defined in org.jetbrains.org.objectweb.asm.tree.VarInsnNode[JavaClassConstructorDescriptor]

'storeOpcode' @ [651:73] ==> val storeOpcode: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.LocalReturn.transform[LocalVariableDescriptor]

'returnVariableIndex' @ [651:86] ==> value-parameter returnVariableIndex: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.LocalReturn.transform[ValueParameterDescriptorImpl]

'stackSize' @ [652:21] ==> var stackSize: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.LocalReturn.transform[LocalVariableDescriptor]

'stackSize' @ [655:24] ==> var stackSize: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.LocalReturn.transform[LocalVariableDescriptor]

'frame' @ [656:44] ==> private final val frame: Frame<SourceValue> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.LocalReturn[PropertyDescriptorImpl]

'getStack' @ [656:50] ==> public open fun getStack(p0: Int): (SourceValue..SourceValue?) defined in org.jetbrains.org.objectweb.asm.tree.analysis.Frame[JavaMethodDescriptor]

'stackSize' @ [656:59] ==> var stackSize: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.LocalReturn.transform[LocalVariableDescriptor]

'getSize' @ [656:74] ==> public open fun getSize(): Int defined in org.jetbrains.org.objectweb.asm.tree.analysis.SourceValue[JavaMethodDescriptor]

'if (stackElementSize == 1) Opcodes.POP else Opcodes.POP2' @ [657:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'stackElementSize' @ [657:41] ==> val stackElementSize: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.LocalReturn.transform[LocalVariableDescriptor]

'POP' @ [657:72] ==> public const final val POP: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'POP2' @ [657:89] ==> public const final val POP2: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'insnList' @ [658:21] ==> value-parameter insnList: InsnList defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.LocalReturn.transform[ValueParameterDescriptorImpl]

'insertBefore' @ [658:30] ==> public open fun insertBefore(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insertBeforeInsn' @ [658:43] ==> private final val insertBeforeInsn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.LocalReturn[PropertyDescriptorImpl]

'InsnNode' @ [658:61] ==> public constructor InsnNode(p0: Int) defined in org.jetbrains.org.objectweb.asm.tree.InsnNode[JavaClassConstructorDescriptor]

'popOpcode' @ [658:70] ==> val popOpcode: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.LocalReturn.transform[LocalVariableDescriptor]

'stackSize' @ [659:21] ==> var stackSize: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.LocalReturn.transform[LocalVariableDescriptor]

'isReturnWithValue' @ [662:21] ==> val isReturnWithValue: Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.LocalReturn.transform[LocalVariableDescriptor]

'+' @ [663:38] ==> public final operator fun plus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'ILOAD' @ [663:46] ==> public const final val ILOAD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'returnInsn' @ [663:54] ==> private final val returnInsn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.LocalReturn[PropertyDescriptorImpl]

'opcode' @ [663:65] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'IRETURN' @ [663:82] ==> public const final val IRETURN: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'insnList' @ [664:21] ==> value-parameter insnList: InsnList defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.LocalReturn.transform[ValueParameterDescriptorImpl]

'insertBefore' @ [664:30] ==> public open fun insertBefore(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insertBeforeInsn' @ [664:43] ==> private final val insertBeforeInsn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.LocalReturn[PropertyDescriptorImpl]

'VarInsnNode' @ [664:61] ==> public constructor VarInsnNode(p0: Int, p1: Int) defined in org.jetbrains.org.objectweb.asm.tree.VarInsnNode[JavaClassConstructorDescriptor]

'loadOpcode' @ [664:73] ==> val loadOpcode: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.LocalReturn.transform[LocalVariableDescriptor]

'returnVariableIndex' @ [664:85] ==> value-parameter returnVariableIndex: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.LocalReturn.transform[ValueParameterDescriptorImpl]

'SmartList' @ [669:36] ==> public constructor SmartList<E : (Any..Any?)>() defined in org.jetbrains.kotlin.utils.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> LocalReturn

'-' @ [672:36] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'assert' @ [679:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'isReturnOpcode' @ [679:20] ==> internal fun isReturnOpcode(opcode: Int): Boolean defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'returnInsn' @ [679:35] ==> value-parameter returnInsn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.addLocalReturnToTransform[ValueParameterDescriptorImpl]

'opcode' @ [679:46] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'assert' @ [680:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'returnOpcode' @ [680:20] ==> private final var returnOpcode: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer[PropertyDescriptorImpl]

'returnOpcode' @ [680:40] ==> private final var returnOpcode: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer[PropertyDescriptorImpl]

'returnInsn' @ [680:56] ==> value-parameter returnInsn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.addLocalReturnToTransform[ValueParameterDescriptorImpl]

'opcode' @ [680:67] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'+' @ [680:77] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'Printer.OPCODES[returnOpcode]' @ [680:102] ==> public final operator fun get(index: Int): (String..String?) defined in kotlin.Array[DeserializedSimpleFunctionDescriptor]

'OPCODES' @ [680:110] ==> public final val OPCODES: (Array<(String..String?)>..Array<out (String..String?)>?) defined in org.jetbrains.org.objectweb.asm.util.Printer[JavaPropertyDescriptor]

'returnOpcode' @ [680:118] ==> private final var returnOpcode: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer[PropertyDescriptorImpl]

'Printer.OPCODES[returnInsn.opcode]' @ [680:145] ==> public final operator fun get(index: Int): (String..String?) defined in kotlin.Array[DeserializedSimpleFunctionDescriptor]

'OPCODES' @ [680:153] ==> public final val OPCODES: (Array<(String..String?)>..Array<out (String..String?)>?) defined in org.jetbrains.org.objectweb.asm.util.Printer[JavaPropertyDescriptor]

'returnInsn' @ [680:161] ==> value-parameter returnInsn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.addLocalReturnToTransform[ValueParameterDescriptorImpl]

'opcode' @ [680:172] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'returnOpcode' @ [681:13] ==> private final var returnOpcode: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer[PropertyDescriptorImpl]

'returnInsn' @ [681:28] ==> value-parameter returnInsn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.addLocalReturnToTransform[ValueParameterDescriptorImpl]

'opcode' @ [681:39] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'localReturns' @ [683:13] ==> private final val localReturns: SmartList<MethodInliner.LocalReturnsNormalizer.LocalReturn> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer[PropertyDescriptorImpl]

'add' @ [683:26] ==> public open fun add(element: (MethodInliner.LocalReturnsNormalizer.LocalReturn..MethodInliner.LocalReturnsNormalizer.LocalReturn?)): Boolean defined in org.jetbrains.kotlin.utils.SmartList[JavaMethodDescriptor]

'LocalReturn' @ [683:30] ==> public constructor LocalReturn(returnInsn: AbstractInsnNode, insertBeforeInsn: AbstractInsnNode, frame: Frame<SourceValue>) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.LocalReturn[ClassConstructorDescriptorImpl]

'returnInsn' @ [683:42] ==> value-parameter returnInsn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.addLocalReturnToTransform[ValueParameterDescriptorImpl]

'insertBeforeInsn' @ [683:54] ==> value-parameter insertBeforeInsn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.addLocalReturnToTransform[ValueParameterDescriptorImpl]

'sourceValueFrame' @ [683:72] ==> value-parameter sourceValueFrame: Frame<SourceValue> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.addLocalReturnToTransform[ValueParameterDescriptorImpl]

'returnInsn' @ [685:17] ==> value-parameter returnInsn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.addLocalReturnToTransform[ValueParameterDescriptorImpl]

'opcode' @ [685:28] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'RETURN' @ [685:46] ==> public const final val RETURN: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'returnVariableSize' @ [686:17] ==> private final var returnVariableSize: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer[PropertyDescriptorImpl]

'if (returnInsn.opcode == Opcodes.LRETURN || returnInsn.opcode == Opcodes.DRETURN) {
                    2
                }
                else {
                    1
                }' @ [686:38] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'returnInsn' @ [686:42] ==> value-parameter returnInsn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.addLocalReturnToTransform[ValueParameterDescriptorImpl]

'opcode' @ [686:53] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'LRETURN' @ [686:71] ==> public const final val LRETURN: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'returnInsn' @ [686:82] ==> value-parameter returnInsn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.addLocalReturnToTransform[ValueParameterDescriptorImpl]

'opcode' @ [686:93] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'DRETURN' @ [686:111] ==> public const final val DRETURN: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'-' @ [696:39] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'returnVariableSize' @ [697:17] ==> private final var returnVariableSize: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer[PropertyDescriptorImpl]

'returnVariableIndex' @ [698:17] ==> var returnVariableIndex: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.transform[LocalVariableDescriptor]

'methodNode' @ [698:39] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.transform[ValueParameterDescriptorImpl]

'maxLocals' @ [698:50] ==> public final var maxLocals: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'methodNode' @ [699:17] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.transform[ValueParameterDescriptorImpl]

'maxLocals' @ [699:28] ==> public final var maxLocals: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'returnVariableSize' @ [699:41] ==> private final var returnVariableSize: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer[PropertyDescriptorImpl]

'localReturns' @ [702:33] ==> private final val localReturns: SmartList<MethodInliner.LocalReturnsNormalizer.LocalReturn> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer[PropertyDescriptorImpl]

'localReturn' @ [703:17] ==> val localReturn: (MethodInliner.LocalReturnsNormalizer.LocalReturn..MethodInliner.LocalReturnsNormalizer.LocalReturn?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.transform[LocalVariableDescriptor]

'transform' @ [703:29] ==> public final fun transform(insnList: InsnList, returnVariableIndex: Int): Unit defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.LocalReturn[SimpleFunctionDescriptorImpl]

'methodNode' @ [703:39] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.transform[ValueParameterDescriptorImpl]

'instructions' @ [703:50] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'returnVariableIndex' @ [703:64] ==> var returnVariableIndex: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.LocalReturnsNormalizer.transform[LocalVariableDescriptor]

'JvmField' @ [710:13] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'JvmField' @ [711:13] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'JvmField' @ [712:13] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'JvmStatic' @ [717:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'assert' @ [719:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'node' @ [719:20] ==> value-parameter node: FieldInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.findCapturedField[ValueParameterDescriptorImpl]

'name' @ [719:25] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.FieldInsnNode[JavaPropertyDescriptor]

'startsWith' @ [719:30] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'CAPTURED_FIELD_FOLD_PREFIX' @ [719:41] ==> internal const val CAPTURED_FIELD_FOLD_PREFIX: String defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[PropertyDescriptorImpl]

'CAPTURED_FIELD_FOLD_PREFIX' @ [720:61] ==> internal const val CAPTURED_FIELD_FOLD_PREFIX: String defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[PropertyDescriptorImpl]

'FieldInsnNode' @ [722:23] ==> public constructor FieldInsnNode(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?)) defined in org.jetbrains.org.objectweb.asm.tree.FieldInsnNode[JavaClassConstructorDescriptor]

'node' @ [722:37] ==> value-parameter node: FieldInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.findCapturedField[ValueParameterDescriptorImpl]

'opcode' @ [722:42] ==> public final var FieldInsnNode.opcode: Int[MyPropertyDescriptor]

'node' @ [722:50] ==> value-parameter node: FieldInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.findCapturedField[ValueParameterDescriptorImpl]

'owner' @ [722:55] ==> public final var owner: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.FieldInsnNode[JavaPropertyDescriptor]

'node' @ [722:62] ==> value-parameter node: FieldInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.findCapturedField[ValueParameterDescriptorImpl]

'name' @ [722:67] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.FieldInsnNode[JavaPropertyDescriptor]

'substring' @ [722:72] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'node' @ [722:86] ==> value-parameter node: FieldInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.findCapturedField[ValueParameterDescriptorImpl]

'desc' @ [722:91] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.FieldInsnNode[JavaPropertyDescriptor]

'fieldRemapper' @ [723:20] ==> value-parameter fieldRemapper: FieldRemapper defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.findCapturedField[ValueParameterDescriptorImpl]

'findField' @ [723:34] ==> @JvmOverloads public open fun findField(fieldInsnNode: FieldInsnNode, captured: Collection<CapturedParamInfo> = ...): CapturedParamInfo? defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper[SimpleFunctionDescriptorImpl]

'fin' @ [723:44] ==> val fin: FieldInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.findCapturedField[LocalVariableDescriptor]

'IllegalStateException' @ [723:58] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'node' @ [724:53] ==> value-parameter node: FieldInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.findCapturedField[ValueParameterDescriptorImpl]

'owner' @ [724:58] ==> public final var owner: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.FieldInsnNode[JavaPropertyDescriptor]

'node' @ [724:67] ==> value-parameter node: FieldInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.findCapturedField[ValueParameterDescriptorImpl]

'name' @ [724:72] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.FieldInsnNode[JavaPropertyDescriptor]

'fieldRemapper' @ [724:83] ==> value-parameter fieldRemapper: FieldRemapper defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.findCapturedField[ValueParameterDescriptorImpl]

'originalLambdaInternalName' @ [724:97] ==> public final val originalLambdaInternalName: String? defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper[PropertyDescriptorImpl]

'Analyzer<SourceValue>' @ [729:37] ==> public constructor Analyzer<V : (Value..Value?)>(p0: (Interpreter<(SourceValue..SourceValue?)>..Interpreter<(SourceValue..SourceValue?)>?)) defined in org.jetbrains.org.objectweb.asm.tree.analysis.Analyzer[JavaClassConstructorDescriptor]
Inferred types:
    <V : (Value..Value?)> -> SourceValue

'SourceInterpreter' @ [729:59] ==> public constructor SourceInterpreter() defined in org.jetbrains.org.objectweb.asm.tree.analysis.SourceInterpreter[JavaClassConstructorDescriptor]

'Frame<SourceValue>' @ [731:37] ==> public constructor Frame<V : (Value..Value?)>(p0: Int, p1: Int) defined in org.jetbrains.org.objectweb.asm.tree.analysis.Frame[JavaClassConstructorDescriptor]
Inferred types:
    <V : (Value..Value?)> -> SourceValue

'nLocals' @ [731:56] ==> value-parameter nLocals: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.analyzeMethodNodeWithoutMandatoryTransformations.<no name provided>.newFrame[ValueParameterDescriptorImpl]

'nStack' @ [731:65] ==> value-parameter nStack: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.analyzeMethodNodeWithoutMandatoryTransformations.<no name provided>.newFrame[ValueParameterDescriptorImpl]

'Throws' @ [732:25] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'insn' @ [735:33] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.analyzeMethodNodeWithoutMandatoryTransformations.<no name provided>.newFrame.<no name provided>.execute[ValueParameterDescriptorImpl]

'opcode' @ [735:38] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'RETURN' @ [735:56] ==> public const final val RETURN: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'super' @ [736:29] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.analyzeMethodNodeWithoutMandatoryTransformations.<no name provided>.newFrame.<no name provided>[LazyClassReceiverParameterDescriptor]

'execute' @ [736:35] ==> public open fun execute(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (Interpreter<(SourceValue..SourceValue?)>..Interpreter<(SourceValue..SourceValue?)>?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.analysis.Frame[JavaMethodDescriptor]

'insn' @ [736:43] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.analyzeMethodNodeWithoutMandatoryTransformations.<no name provided>.newFrame.<no name provided>.execute[ValueParameterDescriptorImpl]

'interpreter' @ [736:49] ==> value-parameter interpreter: Interpreter<SourceValue> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.analyzeMethodNodeWithoutMandatoryTransformations.<no name provided>.newFrame.<no name provided>.execute[ValueParameterDescriptorImpl]

'analyzer' @ [743:24] ==> val analyzer: <no name provided> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.analyzeMethodNodeWithoutMandatoryTransformations[LocalVariableDescriptor]

'analyze' @ [743:33] ==> public open fun analyze(p0: (String..String?), p1: (MethodNode..MethodNode?)): (Array<(Frame<(SourceValue..SourceValue?)>..Frame<(SourceValue..SourceValue?)>?)>..Array<out (Frame<(SourceValue..SourceValue?)>..Frame<(SourceValue..SourceValue?)>?)>?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.analyzeMethodNodeWithoutMandatoryTransformations.<no name provided>[JavaMethodDescriptor]

'node' @ [743:49] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.analyzeMethodNodeWithoutMandatoryTransformations[ValueParameterDescriptorImpl]

'RuntimeException' @ [746:23] ==> public final fun <init>(p0: (Throwable..Throwable?)): RuntimeException /* = RuntimeException */ defined in kotlin.RuntimeException[TypeAliasConstructorDescriptorImpl]

'e' @ [746:40] ==> val e: AnalyzerException defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.analyzeMethodNodeWithoutMandatoryTransformations[LocalVariableDescriptor]

'arrayListOf' @ [756:28] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<AbstractInsnNode> /* = ArrayList<AbstractInsnNode> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'InsnSequence' @ [757:13] ==> public constructor InsnSequence(insnList: InsnList) defined in org.jetbrains.kotlin.codegen.optimization.common.InsnSequence[ClassConstructorDescriptorImpl]

'node' @ [757:26] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.removeClosureAssertions[ValueParameterDescriptorImpl]

'instructions' @ [757:31] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'filterIsInstance' @ [757:45] ==> public inline fun <reified R> Sequence<*>.filterIsInstance(): Sequence<MethodInsnNode> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> MethodInsnNode

'forEach' @ [757:80] ==> public inline fun <T> Sequence<MethodInsnNode>.forEach(action: (MethodInsnNode) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MethodInsnNode

'methodInsnNode' @ [759:21] ==> value-parameter methodInsnNode: MethodInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.removeClosureAssertions.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [759:36] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'methodInsnNode' @ [759:73] ==> value-parameter methodInsnNode: MethodInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.removeClosureAssertions.<anonymous>[ValueParameterDescriptorImpl]

'owner' @ [759:88] ==> public final var owner: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodInsnNode[JavaPropertyDescriptor]

'INTRINSICS_CLASS_NAME' @ [759:114] ==> public const final val INTRINSICS_CLASS_NAME: String defined in org.jetbrains.kotlin.codegen.intrinsics.IntrinsicMethods[JavaPropertyDescriptor]

'methodInsnNode' @ [760:32] ==> value-parameter methodInsnNode: MethodInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.removeClosureAssertions.<anonymous>[ValueParameterDescriptorImpl]

'previous' @ [760:47] ==> public final val MethodInsnNode.previous: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'assert' @ [761:21] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'==' @ [761:28] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'LDC' @ [761:36] ==> public const final val LDC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'prev' @ [761:43] ==> val prev: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.removeClosureAssertions.<anonymous>[LocalVariableDescriptor]

'opcode' @ [761:49] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'prev' @ [761:111] ==> val prev: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.removeClosureAssertions.<anonymous>[LocalVariableDescriptor]

'methodInsnNode' @ [762:35] ==> value-parameter methodInsnNode: MethodInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.removeClosureAssertions.<anonymous>[ValueParameterDescriptorImpl]

'previous' @ [762:50] ==> public final val MethodInsnNode.previous: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'previous' @ [762:59] ==> public final val AbstractInsnNode.previous: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'assert' @ [763:21] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'==' @ [763:28] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'ALOAD' @ [763:36] ==> public const final val ALOAD: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'prevPev' @ [763:45] ==> val prevPev: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.removeClosureAssertions.<anonymous>[LocalVariableDescriptor]

'opcode' @ [763:54] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'prev' @ [763:128] ==> val prev: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.removeClosureAssertions.<anonymous>[LocalVariableDescriptor]

'toDelete' @ [765:21] ==> val toDelete: ArrayList<AbstractInsnNode> /* = ArrayList<AbstractInsnNode> */ defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.removeClosureAssertions[LocalVariableDescriptor]

'add' @ [765:30] ==> public open fun add(element: AbstractInsnNode): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'prevPev' @ [765:34] ==> val prevPev: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.removeClosureAssertions.<anonymous>[LocalVariableDescriptor]

'toDelete' @ [766:21] ==> val toDelete: ArrayList<AbstractInsnNode> /* = ArrayList<AbstractInsnNode> */ defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.removeClosureAssertions[LocalVariableDescriptor]

'add' @ [766:30] ==> public open fun add(element: AbstractInsnNode): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'prev' @ [766:34] ==> val prev: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.removeClosureAssertions.<anonymous>[LocalVariableDescriptor]

'toDelete' @ [767:21] ==> val toDelete: ArrayList<AbstractInsnNode> /* = ArrayList<AbstractInsnNode> */ defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.removeClosureAssertions[LocalVariableDescriptor]

'add' @ [767:30] ==> public open fun add(element: AbstractInsnNode): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'methodInsnNode' @ [767:34] ==> value-parameter methodInsnNode: MethodInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.removeClosureAssertions.<anonymous>[ValueParameterDescriptorImpl]

'node' @ [771:13] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.removeClosureAssertions[ValueParameterDescriptorImpl]

'remove' @ [771:18] ==> public fun MethodNode.remove(instructions: Collection<AbstractInsnNode>): Unit defined in org.jetbrains.kotlin.codegen.inline in file MethodInlinerUtil.kt[SimpleFunctionDescriptorImpl]

'toDelete' @ [771:25] ==> val toDelete: ArrayList<AbstractInsnNode> /* = ArrayList<AbstractInsnNode> */ defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.removeClosureAssertions[LocalVariableDescriptor]

'finallyDeepShift' @ [775:17] ==> value-parameter finallyDeepShift: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.transformFinallyDeepIndex[ValueParameterDescriptorImpl]

'node' @ [779:42] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.transformFinallyDeepIndex[ValueParameterDescriptorImpl]

'instructions' @ [779:47] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'first' @ [779:60] ==> public final val InsnList.first: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'cur' @ [780:20] ==> var cur: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.transformFinallyDeepIndex[LocalVariableDescriptor]

'cur' @ [781:21] ==> var cur: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.transformFinallyDeepIndex[LocalVariableDescriptor]

'isFinallyMarker' @ [781:46] ==> internal fun isFinallyMarker(node: AbstractInsnNode?): Boolean defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'cur' @ [781:62] ==> var cur: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.transformFinallyDeepIndex[LocalVariableDescriptor]

'cur' @ [782:36] ==> var cur: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.transformFinallyDeepIndex[LocalVariableDescriptor]

'previous' @ [782:40] ==> public final val MethodInsnNode.previous: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'getConstant' @ [783:35] ==> internal fun getConstant(ins: AbstractInsnNode): Int defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'constant' @ [783:47] ==> val constant: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.transformFinallyDeepIndex[LocalVariableDescriptor]

'node' @ [784:21] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.transformFinallyDeepIndex[ValueParameterDescriptorImpl]

'instructions' @ [784:26] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'insert' @ [784:39] ==> public open fun insert(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'constant' @ [784:46] ==> val constant: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.transformFinallyDeepIndex[LocalVariableDescriptor]

'LdcInsnNode' @ [784:56] ==> public constructor LdcInsnNode(p0: (Any..Any?)) defined in org.jetbrains.org.objectweb.asm.tree.LdcInsnNode[JavaClassConstructorDescriptor]

'curDeep' @ [784:68] ==> val curDeep: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.transformFinallyDeepIndex[LocalVariableDescriptor]

'finallyDeepShift' @ [784:78] ==> value-parameter finallyDeepShift: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.transformFinallyDeepIndex[ValueParameterDescriptorImpl]

'node' @ [785:21] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.transformFinallyDeepIndex[ValueParameterDescriptorImpl]

'instructions' @ [785:26] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'remove' @ [785:39] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'constant' @ [785:46] ==> val constant: (AbstractInsnNode..AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.transformFinallyDeepIndex[LocalVariableDescriptor]

'cur' @ [787:17] ==> var cur: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.transformFinallyDeepIndex[LocalVariableDescriptor]

'cur' @ [787:23] ==> var cur: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.transformFinallyDeepIndex[LocalVariableDescriptor]

'next' @ [787:27] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'mutableListOf' @ [792:37] ==> public fun <T> mutableListOf(vararg elements: AbstractInsnNode): MutableList<AbstractInsnNode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'aload0' @ [792:69] ==> value-parameter aload0: VarInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.getCapturedFieldAccessChain[ValueParameterDescriptorImpl]

'apply' @ [792:77] ==> @InlineOnly public inline fun <T> MutableList<AbstractInsnNode>.apply(block: MutableList<AbstractInsnNode>.() -> Unit): MutableList<AbstractInsnNode> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableList<AbstractInsnNode>

'addAll' @ [793:17] ==> public abstract fun addAll(elements: Collection<AbstractInsnNode>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'InsnSequence' @ [793:24] ==> public constructor InsnSequence(from: AbstractInsnNode, to: AbstractInsnNode?) defined in org.jetbrains.kotlin.codegen.optimization.common.InsnSequence[ClassConstructorDescriptorImpl]

'aload0' @ [793:37] ==> value-parameter aload0: VarInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.getCapturedFieldAccessChain[ValueParameterDescriptorImpl]

'next' @ [793:44] ==> public final val VarInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'filter' @ [793:56] ==> public fun <T> Sequence<AbstractInsnNode>.filter(predicate: (AbstractInsnNode) -> Boolean): Sequence<AbstractInsnNode> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'it' @ [793:65] ==> value-parameter it: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.getCapturedFieldAccessChain.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isMeaningful' @ [793:68] ==> public val AbstractInsnNode.isMeaningful: Boolean defined in org.jetbrains.kotlin.codegen.optimization.common in file Util.kt[PropertyDescriptorImpl]

'takeWhile' @ [793:83] ==> public fun <T> Sequence<AbstractInsnNode>.takeWhile(predicate: (AbstractInsnNode) -> Boolean): Sequence<AbstractInsnNode> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'insnNode' @ [795:21] ==> value-parameter insnNode: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.getCapturedFieldAccessChain.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'==' @ [795:50] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'insnNode' @ [795:62] ==> value-parameter insnNode: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.getCapturedFieldAccessChain.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [795:71] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.FieldInsnNode[JavaPropertyDescriptor]

'toList' @ [796:19] ==> public fun <T> Sequence<AbstractInsnNode>.toList(): List<AbstractInsnNode> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'lambdaAccessChain' @ [799:20] ==> val lambdaAccessChain: MutableList<AbstractInsnNode> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.getCapturedFieldAccessChain[LocalVariableDescriptor]

'apply' @ [799:38] ==> @InlineOnly public inline fun <T> MutableList<AbstractInsnNode>.apply(block: MutableList<AbstractInsnNode>.() -> Unit): MutableList<AbstractInsnNode> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableList<AbstractInsnNode>

'last' @ [800:17] ==> public fun <T> List<AbstractInsnNode>.last(): AbstractInsnNode defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'getNextMeaningful' @ [800:24] ==> public fun AbstractInsnNode.getNextMeaningful(): AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline in file MethodInlinerUtil.kt[SimpleFunctionDescriptorImpl]

'takeIf' @ [800:44] ==> @InlineOnly @SinceKotlin public inline fun <T> AbstractInsnNode?.takeIf(predicate: (AbstractInsnNode?) -> Boolean): AbstractInsnNode? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode?

'insn' @ [800:61] ==> value-parameter insn: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.getCapturedFieldAccessChain.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'also' @ [800:86] ==> @InlineOnly @SinceKotlin public inline fun <T> AbstractInsnNode.also(block: (AbstractInsnNode) -> Unit): AbstractInsnNode defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractInsnNode

'add' @ [802:29] ==> public abstract fun add(element: AbstractInsnNode): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'insn' @ [802:33] ==> value-parameter insn: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.getCapturedFieldAccessChain.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getArgumentTypes' @ [810:37] ==> public open fun getArgumentTypes(p0: (String..String?)): (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'descriptor' @ [810:54] ==> value-parameter descriptor: String defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.putStackValuesIntoLocals[ValueParameterDescriptorImpl]

'assert' @ [811:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'actualParams' @ [811:20] ==> val actualParams: (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.putStackValuesIntoLocals[LocalVariableDescriptor]

'size' @ [811:33] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'directOrder' @ [811:41] ==> value-parameter directOrder: List<Type> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.putStackValuesIntoLocals[ValueParameterDescriptorImpl]

'size' @ [811:53] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'actualParams' @ [812:79] ==> val actualParams: (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.putStackValuesIntoLocals[LocalVariableDescriptor]

'size' @ [812:92] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'directOrder' @ [812:103] ==> value-parameter directOrder: List<Type> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.putStackValuesIntoLocals[ValueParameterDescriptorImpl]

'size' @ [812:115] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'shift' @ [815:32] ==> value-parameter shift: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.putStackValuesIntoLocals[ValueParameterDescriptorImpl]

'directOrder' @ [815:40] ==> value-parameter directOrder: List<Type> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.putStackValuesIntoLocals[ValueParameterDescriptorImpl]

'sumBy' @ [815:52] ==> public inline fun <T> Iterable<Type>.sumBy(selector: (Type) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type

'it' @ [815:60] ==> value-parameter it: Type defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.putStackValuesIntoLocals.<anonymous>[ValueParameterDescriptorImpl]

'size' @ [815:63] ==> public final val Type.size: Int[MyPropertyDescriptor]

'directOrder' @ [817:13] ==> value-parameter directOrder: List<Type> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.putStackValuesIntoLocals[ValueParameterDescriptorImpl]

'asReversed' @ [817:25] ==> public fun <T> List<Type>.asReversed(): List<Type> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type

'forEachIndexed' @ [817:38] ==> public inline fun <T> Iterable<Type>.forEachIndexed(action: (index: Int, Type) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type

'currentShift' @ [818:17] ==> var currentShift: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.putStackValuesIntoLocals[LocalVariableDescriptor]

'type' @ [818:33] ==> value-parameter type: Type defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.putStackValuesIntoLocals.<anonymous>[ValueParameterDescriptorImpl]

'size' @ [818:38] ==> public final val Type.size: Int[MyPropertyDescriptor]

'actualParams' @ [819:35] ==> val actualParams: (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.putStackValuesIntoLocals[LocalVariableDescriptor]

'index' @ [819:48] ==> value-parameter index: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.putStackValuesIntoLocals.<anonymous>[ValueParameterDescriptorImpl]

'typeOnStack' @ [820:21] ==> val typeOnStack: (Type..Type?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.putStackValuesIntoLocals.<anonymous>[LocalVariableDescriptor]

'type' @ [820:36] ==> value-parameter type: Type defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.putStackValuesIntoLocals.<anonymous>[ValueParameterDescriptorImpl]

'onStack' @ [821:32] ==> @NotNull public open fun onStack(@NotNull type: Type): StackValue defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'typeOnStack' @ [821:40] ==> val typeOnStack: (Type..Type?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.putStackValuesIntoLocals.<anonymous>[LocalVariableDescriptor]

'put' @ [821:53] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'type' @ [821:57] ==> value-parameter type: Type defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.putStackValuesIntoLocals.<anonymous>[ValueParameterDescriptorImpl]

'iv' @ [821:63] ==> value-parameter iv: InstructionAdapter defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.putStackValuesIntoLocals[ValueParameterDescriptorImpl]

'iv' @ [823:17] ==> value-parameter iv: InstructionAdapter defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.putStackValuesIntoLocals[ValueParameterDescriptorImpl]

'store' @ [823:20] ==> public open fun store(p0: Int, p1: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'currentShift' @ [823:26] ==> var currentShift: Int defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.putStackValuesIntoLocals[LocalVariableDescriptor]

'type' @ [823:40] ==> value-parameter type: Type defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.putStackValuesIntoLocals.<anonymous>[ValueParameterDescriptorImpl]

'JvmStatic' @ [828:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'!' @ [832:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'remapReturn' @ [832:18] ==> value-parameter remapReturn: Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.processReturns[ValueParameterDescriptorImpl]

'emptyList' @ [833:24] ==> public fun <T> emptyList(): List<MethodInliner.PointForExternalFinallyBlocks> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PointForExternalFinallyBlocks

'ArrayList' @ [835:26] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PointForExternalFinallyBlocks

'node' @ [836:32] ==> value-parameter node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.processReturns[ValueParameterDescriptorImpl]

'instructions' @ [836:37] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'instructions' @ [837:47] ==> val instructions: (InsnList..InsnList?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.processReturns[LocalVariableDescriptor]

'first' @ [837:60] ==> public final val InsnList.first: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'insnNode' @ [838:20] ==> var insnNode: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.processReturns[LocalVariableDescriptor]

'isReturnOpcode' @ [839:21] ==> internal fun isReturnOpcode(opcode: Int): Boolean defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'insnNode' @ [839:36] ==> var insnNode: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.processReturns[LocalVariableDescriptor]

'opcode' @ [839:45] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'getMarkedReturnLabelOrNull' @ [841:37] ==> internal fun getMarkedReturnLabelOrNull(returnInsn: AbstractInsnNode): String? defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'insnNode' @ [841:64] ==> var insnNode: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.processReturns[LocalVariableDescriptor]

'labelName' @ [843:25] ==> val labelName: String? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.processReturns[LocalVariableDescriptor]

'isLocalReturn' @ [844:25] ==> var isLocalReturn: Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.processReturns[LocalVariableDescriptor]

'labelOwner' @ [844:41] ==> value-parameter labelOwner: LabelOwner defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.processReturns[ValueParameterDescriptorImpl]

'isMyLabel' @ [844:52] ==> public abstract fun isMyLabel(@NotNull name: String): Boolean defined in org.jetbrains.kotlin.codegen.inline.LabelOwner[JavaMethodDescriptor]

'labelName' @ [844:62] ==> val labelName: String? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.processReturns[LocalVariableDescriptor]

'isLocalReturn' @ [846:29] ==> var isLocalReturn: Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.processReturns[LocalVariableDescriptor]

'instructions' @ [847:29] ==> val instructions: (InsnList..InsnList?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.processReturns[LocalVariableDescriptor]

'remove' @ [847:42] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insnNode' @ [847:49] ==> var insnNode: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.processReturns[LocalVariableDescriptor]

'previous' @ [847:58] ==> public final val AbstractInsnNode.previous: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'isLocalReturn' @ [851:25] ==> var isLocalReturn: Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.processReturns[LocalVariableDescriptor]

'endLabel' @ [851:42] ==> value-parameter endLabel: Label? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.processReturns[ValueParameterDescriptorImpl]

'InsnNode' @ [852:35] ==> public constructor InsnNode(p0: Int) defined in org.jetbrains.org.objectweb.asm.tree.InsnNode[JavaClassConstructorDescriptor]

'NOP' @ [852:52] ==> public const final val NOP: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'instructions' @ [853:25] ==> val instructions: (InsnList..InsnList?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.processReturns[LocalVariableDescriptor]

'insert' @ [853:38] ==> public open fun insert(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insnNode' @ [853:45] ==> var insnNode: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.processReturns[LocalVariableDescriptor]

'nop' @ [853:55] ==> val nop: InsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.processReturns[LocalVariableDescriptor]

'endLabel' @ [855:41] ==> value-parameter endLabel: Label? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.processReturns[ValueParameterDescriptorImpl]

'info' @ [855:50] ==> public final var info: (Any..Any?) defined in org.jetbrains.org.objectweb.asm.Label[JavaPropertyDescriptor]

'JumpInsnNode' @ [856:44] ==> public constructor JumpInsnNode(p0: Int, p1: (LabelNode..LabelNode?)) defined in org.jetbrains.org.objectweb.asm.tree.JumpInsnNode[JavaClassConstructorDescriptor]

'GOTO' @ [856:65] ==> public const final val GOTO: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'labelNode' @ [856:71] ==> val labelNode: LabelNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.processReturns[LocalVariableDescriptor]

'instructions' @ [857:25] ==> val instructions: (InsnList..InsnList?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.processReturns[LocalVariableDescriptor]

'insert' @ [857:38] ==> public open fun insert(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'nop' @ [857:45] ==> val nop: InsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.processReturns[LocalVariableDescriptor]

'jumpInsnNode' @ [857:50] ==> val jumpInsnNode: JumpInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.processReturns[LocalVariableDescriptor]

'instructions' @ [859:25] ==> val instructions: (InsnList..InsnList?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.processReturns[LocalVariableDescriptor]

'remove' @ [859:38] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insnNode' @ [859:45] ==> var insnNode: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.processReturns[LocalVariableDescriptor]

'insnNode' @ [860:25] ==> var insnNode: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.processReturns[LocalVariableDescriptor]

'jumpInsnNode' @ [860:36] ==> val jumpInsnNode: JumpInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.processReturns[LocalVariableDescriptor]

'LabelNode' @ [864:33] ==> public constructor LabelNode() defined in org.jetbrains.org.objectweb.asm.tree.LabelNode[JavaClassConstructorDescriptor]

'instructions' @ [865:21] ==> val instructions: (InsnList..InsnList?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.processReturns[LocalVariableDescriptor]

'insert' @ [865:34] ==> public open fun insert(p0: (AbstractInsnNode..AbstractInsnNode?), p1: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'insnNode' @ [865:41] ==> var insnNode: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.processReturns[LocalVariableDescriptor]

'label' @ [865:51] ==> val label: LabelNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.processReturns[LocalVariableDescriptor]

'result' @ [866:21] ==> val result: ArrayList<MethodInliner.PointForExternalFinallyBlocks> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.processReturns[LocalVariableDescriptor]

'add' @ [866:28] ==> public open fun add(element: MethodInliner.PointForExternalFinallyBlocks): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'PointForExternalFinallyBlocks' @ [866:32] ==> public constructor PointForExternalFinallyBlocks(beforeIns: AbstractInsnNode, returnType: Type, finallyIntervalEnd: LabelNode) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.PointForExternalFinallyBlocks[ClassConstructorDescriptorImpl]

'getInstructionToInsertFinallyBefore' @ [867:29] ==> private final fun getInstructionToInsertFinallyBefore(nonLocalReturnOrJump: AbstractInsnNode, isLocal: Boolean): AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion[SimpleFunctionDescriptorImpl]

'insnNode' @ [867:65] ==> var insnNode: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.processReturns[LocalVariableDescriptor]

'isLocalReturn' @ [867:75] ==> var isLocalReturn: Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.processReturns[LocalVariableDescriptor]

'getReturnType' @ [867:91] ==> internal fun getReturnType(opcode: Int): Type defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'insnNode' @ [867:105] ==> var insnNode: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.processReturns[LocalVariableDescriptor]

'opcode' @ [867:114] ==> public final val AbstractInsnNode.opcode: Int[MyPropertyDescriptor]

'label' @ [867:123] ==> val label: LabelNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.processReturns[LocalVariableDescriptor]

'insnNode' @ [870:17] ==> var insnNode: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.processReturns[LocalVariableDescriptor]

'insnNode' @ [870:28] ==> var insnNode: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.processReturns[LocalVariableDescriptor]

'next' @ [870:37] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'result' @ [872:20] ==> val result: ArrayList<MethodInliner.PointForExternalFinallyBlocks> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.processReturns[LocalVariableDescriptor]

'if (isLocal) nonLocalReturnOrJump else nonLocalReturnOrJump.previous' @ [876:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: AbstractInsnNode, elseBranch: AbstractInsnNode): AbstractInsnNode[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> AbstractInsnNode

'isLocal' @ [876:24] ==> value-parameter isLocal: Boolean defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.getInstructionToInsertFinallyBefore[ValueParameterDescriptorImpl]

'nonLocalReturnOrJump' @ [876:33] ==> value-parameter nonLocalReturnOrJump: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.getInstructionToInsertFinallyBefore[ValueParameterDescriptorImpl]

'nonLocalReturnOrJump' @ [876:59] ==> value-parameter nonLocalReturnOrJump: AbstractInsnNode defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion.getInstructionToInsertFinallyBefore[ValueParameterDescriptorImpl]

'previous' @ [876:80] ==> public final val AbstractInsnNode.previous: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

