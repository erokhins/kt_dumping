'codegen' @ [39:46] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody.<init>[ValueParameterDescriptorImpl]

'parentCodegen' @ [39:54] ==> public final val ExpressionCodegen.parentCodegen: MemberCodegen<*>[MyPropertyDescriptor]

'orCreateSourceMapper' @ [39:68] ==> public final val <T : (KtPureElement..KtPureElement?)> MemberCodegen<out (KtPureElement..KtPureElement?)>.orCreateSourceMapper: DefaultSourceMapper[MyPropertyDescriptor]
Inferred types:
    <T : (KtPureElement..KtPureElement?)> -> (org.jetbrains.kotlin.psi.KtPureElement..org.jetbrains.kotlin.psi.KtPureElement?)

'if (InlineUtil.isArrayConstructorWithLambda(function))
                FictitiousArrayConstructor.create(function as ConstructorDescriptor)
            else
                function.original' @ [42:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FunctionDescriptor, elseBranch: FunctionDescriptor): FunctionDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FunctionDescriptor

'isArrayConstructorWithLambda' @ [42:28] ==> public open fun isArrayConstructorWithLambda(@NotNull p0: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineUtil[JavaMethodDescriptor]

'function' @ [42:57] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody.<init>[ValueParameterDescriptorImpl]

'FictitiousArrayConstructor' @ [43:17] ==> public companion object Factory defined in org.jetbrains.kotlin.codegen.inline.FictitiousArrayConstructor[FakeCallableDescriptorForObject]

'create' @ [43:44] ==> @JvmStatic public final fun create(arrayConstructor: ConstructorDescriptor): FictitiousArrayConstructor defined in org.jetbrains.kotlin.codegen.inline.FictitiousArrayConstructor.Factory[SimpleFunctionDescriptorImpl]

'function' @ [43:51] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody.<init>[ValueParameterDescriptorImpl]

'function' @ [45:17] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody.<init>[ValueParameterDescriptorImpl]

'original' @ [45:26] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'sourceCompilerForInline' @ [49:9] ==> private final val sourceCompilerForInline: SourceCompilerForInline defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody[PropertyDescriptorImpl]

'initializeInlineFunctionContext' @ [49:33] ==> public abstract fun initializeInlineFunctionContext(functionDescriptor: FunctionDescriptor): Unit defined in org.jetbrains.kotlin.codegen.inline.SourceCompilerForInline[SimpleFunctionDescriptorImpl]

'functionDescriptor' @ [49:65] ==> private final val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody[PropertyDescriptorImpl]

'Label' @ [55:36] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'assert' @ [58:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'isInline' @ [58:27] ==> public open fun isInline(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineUtil[JavaMethodDescriptor]

'function' @ [58:36] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody.<init>[ValueParameterDescriptorImpl]

'+' @ [59:13] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'function' @ [59:89] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody.<init>[ValueParameterDescriptorImpl]

'sourceCompilerForInline' @ [61:9] ==> private final val sourceCompilerForInline: SourceCompilerForInline defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody[PropertyDescriptorImpl]

'initializeInlineFunctionContext' @ [61:33] ==> public abstract fun initializeInlineFunctionContext(functionDescriptor: FunctionDescriptor): Unit defined in org.jetbrains.kotlin.codegen.inline.SourceCompilerForInline[SimpleFunctionDescriptorImpl]

'functionDescriptor' @ [61:65] ==> private final val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody[PropertyDescriptorImpl]

'jvmSignature' @ [62:9] ==> private final val jvmSignature: JvmMethodGenericSignature defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody[PropertyDescriptorImpl]

'state' @ [62:24] ==> public final val state: GenerationState defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody[PropertyDescriptorImpl]

'typeMapper' @ [62:30] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'mapSignatureWithGeneric' @ [62:41] ==> @NotNull public open fun mapSignatureWithGeneric(@NotNull f: FunctionDescriptor, @NotNull kind: OwnerKind): JvmMethodGenericSignature defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'functionDescriptor' @ [62:65] ==> private final val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody[PropertyDescriptorImpl]

'sourceCompilerForInline' @ [62:85] ==> private final val sourceCompilerForInline: SourceCompilerForInline defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody[PropertyDescriptorImpl]

'contextKind' @ [62:109] ==> public abstract val contextKind: OwnerKind defined in org.jetbrains.kotlin.codegen.inline.SourceCompilerForInline[PropertyDescriptorImpl]

'codegen' @ [65:9] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody.<init>[ValueParameterDescriptorImpl]

'v' @ [65:17] ==> public final val v: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaPropertyDescriptor]

'visitLabel' @ [65:19] ==> public open fun visitLabel(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'methodStartLabel' @ [65:30] ==> private final val methodStartLabel: Label defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody[PropertyDescriptorImpl]

'InlineCodegen' @ [69:27] ==> public companion object defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[FakeCallableDescriptorForObject]

'createInlineMethodNode' @ [69:41] ==> internal final fun createInlineMethodNode(functionDescriptor: FunctionDescriptor, jvmSignature: JvmMethodSignature, codegen: BaseExpressionCodegen, callDefault: Boolean, resolvedCall: ResolvedCall<*>?, state: GenerationState, sourceCompilerForInline: SourceCompilerForInline): SMAPAndMethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion[SimpleFunctionDescriptorImpl]

'functionDescriptor' @ [69:64] ==> private final val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody[PropertyDescriptorImpl]

'jvmSignature' @ [69:84] ==> private final val jvmSignature: JvmMethodGenericSignature defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody[PropertyDescriptorImpl]

'codegen' @ [69:98] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody.genCallInner[ValueParameterDescriptorImpl]

'callDefault' @ [69:107] ==> value-parameter callDefault: Boolean defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody.genCallInner[ValueParameterDescriptorImpl]

'state' @ [69:126] ==> public final val state: GenerationState defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody[PropertyDescriptorImpl]

'sourceCompilerForInline' @ [69:133] ==> private final val sourceCompilerForInline: SourceCompilerForInline defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody[PropertyDescriptorImpl]

'InlineCodegen' @ [70:33] ==> public companion object defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[FakeCallableDescriptorForObject]

'createNestedSourceMapper' @ [70:47] ==> public final fun createNestedSourceMapper(nodeAndSmap: SMAPAndMethodNode, parent: SourceMapper): SourceMapper defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion[SimpleFunctionDescriptorImpl]

'nodeAndSmap' @ [70:72] ==> val nodeAndSmap: SMAPAndMethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody.genCallInner[LocalVariableDescriptor]

'sourceMapper' @ [70:85] ==> private final val sourceMapper: SourceMapper defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody[PropertyDescriptorImpl]

'nodeAndSmap' @ [72:20] ==> val nodeAndSmap: SMAPAndMethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody.genCallInner[LocalVariableDescriptor]

'node' @ [72:32] ==> public final val node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.SMAPAndMethodNode[PropertyDescriptorImpl]

'MethodNode' @ [73:33] ==> public constructor MethodNode(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: (Array<(String..String?)>..Array<out (String..String?)>?)) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaClassConstructorDescriptor]

'node' @ [74:17] ==> val node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody.genCallInner[LocalVariableDescriptor]

'access' @ [74:22] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'node' @ [75:17] ==> val node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody.genCallInner[LocalVariableDescriptor]

'name' @ [75:22] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'node' @ [76:17] ==> val node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody.genCallInner[LocalVariableDescriptor]

'desc' @ [76:22] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'node' @ [77:17] ==> val node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody.genCallInner[LocalVariableDescriptor]

'signature' @ [77:22] ==> public final var signature: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'node' @ [78:17] ==> val node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody.genCallInner[LocalVariableDescriptor]

'exceptions' @ [78:22] ==> public final var exceptions: (MutableList<(String..String?)>..List<(String..String?)>?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'toTypedArray' @ [78:33] ==> public inline fun <reified T> Collection<(String..String?)>.toTypedArray(): Array<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (kotlin.String..kotlin.String?)

'-' @ [80:24] ==> public final operator fun minus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'ushr' @ [80:25] ==> public final infix fun ushr(bitCount: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'getArgumentsAndReturnSizes' @ [80:30] ==> public open fun getArgumentsAndReturnSizes(p0: (String..String?)): Int defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'jvmSignature' @ [80:57] ==> private final val jvmSignature: JvmMethodGenericSignature defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody[PropertyDescriptorImpl]

'asmMethod' @ [80:70] ==> public final val JvmMethodGenericSignature.asmMethod: Method[MyPropertyDescriptor]

'descriptor' @ [80:80] ==> public final val Method.descriptor: (String..String?)[MyPropertyDescriptor]

'if (callableMethod.isStaticCall()) 1 else 0' @ [80:103] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'callableMethod' @ [80:107] ==> value-parameter callableMethod: Callable defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody.genCallInner[ValueParameterDescriptorImpl]

'isStaticCall' @ [80:122] ==> public abstract fun isStaticCall(): Boolean defined in org.jetbrains.kotlin.codegen.Callable[SimpleFunctionDescriptorImpl]

'node' @ [81:9] ==> val node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody.genCallInner[LocalVariableDescriptor]

'accept' @ [81:14] ==> public open fun accept(p0: (MethodVisitor..MethodVisitor?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaMethodDescriptor]

'InlineAdapter' @ [81:30] ==> public constructor InlineAdapter(@NotNull mv: MethodVisitor, localsSize: Int, @NotNull sourceMapper: SourceMapper) defined in org.jetbrains.kotlin.codegen.inline.InlineAdapter[JavaClassConstructorDescriptor]

'transformedMethod' @ [81:44] ==> val transformedMethod: MethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody.genCallInner[LocalVariableDescriptor]

'childSourceMapper' @ [81:66] ==> val childSourceMapper: SourceMapper defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody.genCallInner[LocalVariableDescriptor]

'if (index < argsSize) methodStartLabel else start' @ [83:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Label, elseBranch: Label): Label[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Label

'index' @ [83:38] ==> value-parameter index: Int defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody.genCallInner.<no name provided>.visitLocalVariable[ValueParameterDescriptorImpl]

'argsSize' @ [83:46] ==> val argsSize: Int defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody.genCallInner[LocalVariableDescriptor]

'methodStartLabel' @ [83:56] ==> private final val methodStartLabel: Label defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody[PropertyDescriptorImpl]

'start' @ [83:78] ==> value-parameter start: Label defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody.genCallInner.<no name provided>.visitLocalVariable[ValueParameterDescriptorImpl]

'super' @ [84:17] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody.genCallInner.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitLocalVariable' @ [84:23] ==> public open fun visitLocalVariable(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: (Label..Label?), p4: (Label..Label?), p5: Int): Unit defined in org.jetbrains.kotlin.codegen.inline.InlineAdapter[JavaMethodDescriptor]

'name' @ [84:42] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody.genCallInner.<no name provided>.visitLocalVariable[ValueParameterDescriptorImpl]

'desc' @ [84:48] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody.genCallInner.<no name provided>.visitLocalVariable[ValueParameterDescriptorImpl]

'signature' @ [84:54] ==> value-parameter signature: String? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody.genCallInner.<no name provided>.visitLocalVariable[ValueParameterDescriptorImpl]

'startLabel' @ [84:65] ==> val startLabel: Label defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody.genCallInner.<no name provided>.visitLocalVariable[LocalVariableDescriptor]

'end' @ [84:77] ==> value-parameter end: Label defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody.genCallInner.<no name provided>.visitLocalVariable[ValueParameterDescriptorImpl]

'index' @ [84:82] ==> value-parameter index: Int defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody.genCallInner.<no name provided>.visitLocalVariable[ValueParameterDescriptorImpl]

'transformedMethod' @ [88:9] ==> val transformedMethod: MethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody.genCallInner[LocalVariableDescriptor]

'accept' @ [88:27] ==> public open fun accept(p0: (MethodVisitor..MethodVisitor?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaMethodDescriptor]

'MethodBodyVisitor' @ [88:34] ==> public constructor MethodBodyVisitor(mv: MethodVisitor, visitAnnotationsAndAttributes: Boolean = ...) defined in org.jetbrains.kotlin.codegen.inline.MethodBodyVisitor[ClassConstructorDescriptorImpl]

'codegen' @ [88:52] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.inline.InlineCodegenForDefaultBody.genCallInner[ValueParameterDescriptorImpl]

'visitor' @ [88:60] ==> public open val visitor: InstructionAdapter defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaPropertyDescriptor]

'UnsupportedOperationException' @ [92:15] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [101:15] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [105:15] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [109:15] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [113:15] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

