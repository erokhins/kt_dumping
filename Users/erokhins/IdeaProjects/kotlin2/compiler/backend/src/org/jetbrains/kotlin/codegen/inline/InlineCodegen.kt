'assert' @ [66:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'isInline' @ [66:27] ==> public open fun isInline(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineUtil[JavaMethodDescriptor]

'function' @ [66:36] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.<init>[ValueParameterDescriptorImpl]

'isArrayConstructorWithLambda' @ [66:60] ==> public open fun isArrayConstructorWithLambda(@NotNull p0: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineUtil[JavaMethodDescriptor]

'function' @ [66:89] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.<init>[ValueParameterDescriptorImpl]

'+' @ [67:13] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'function' @ [67:89] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.<init>[ValueParameterDescriptorImpl]

'state' @ [74:32] ==> protected final val state: GenerationState defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'typeMapper' @ [74:38] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'codegen' @ [76:36] ==> protected final val codegen: T defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'frameMap' @ [76:44] ==> public abstract val frameMap: FrameMap defined in org.jetbrains.kotlin.codegen.BaseExpressionCodegen[PropertyDescriptorImpl]

'currentSize' @ [76:53] ==> public final val FrameMap.currentSize: Int[MyPropertyDescriptor]

'ReifiedTypeInliner' @ [78:38] ==> public constructor ReifiedTypeInliner(parametersMapping: TypeParameterMappings?) defined in org.jetbrains.kotlin.codegen.inline.ReifiedTypeInliner[ClassConstructorDescriptorImpl]

'typeParameterMappings' @ [78:57] ==> private final val typeParameterMappings: TypeParameterMappings defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'if (InlineUtil.isArrayConstructorWithLambda(function))
                FictitiousArrayConstructor.create(function as ConstructorDescriptor)
            else
                function.original' @ [81:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FunctionDescriptor, elseBranch: FunctionDescriptor): FunctionDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FunctionDescriptor

'isArrayConstructorWithLambda' @ [81:28] ==> public open fun isArrayConstructorWithLambda(@NotNull p0: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineUtil[JavaMethodDescriptor]

'function' @ [81:57] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.<init>[ValueParameterDescriptorImpl]

'create' @ [82:44] ==> @JvmStatic public final fun create(arrayConstructor: ConstructorDescriptor): FictitiousArrayConstructor defined in org.jetbrains.kotlin.codegen.inline.FictitiousArrayConstructor.Factory[SimpleFunctionDescriptorImpl]

'function' @ [82:51] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.<init>[ValueParameterDescriptorImpl]

'function' @ [84:17] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.<init>[ValueParameterDescriptorImpl]

'original' @ [84:26] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'ParametersBuilder' @ [90:44] ==> public companion object defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[FakeCallableDescriptorForObject]

'newBuilder' @ [90:62] ==> @JvmStatic public final fun newBuilder(): ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder.Companion[SimpleFunctionDescriptorImpl]

'linkedMapOf' @ [92:35] ==> @SinceKotlin @InlineOnly public inline fun <K, V> linkedMapOf(): LinkedHashMap<Int, LambdaInfo> /* = LinkedHashMap<Int, LambdaInfo> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> LambdaInfo

'sourceCompiler' @ [96:39] ==> protected final val sourceCompiler: SourceCompilerForInline defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'lazySourceMapper' @ [96:54] ==> public abstract val lazySourceMapper: DefaultSourceMapper defined in org.jetbrains.kotlin.codegen.inline.SourceCompilerForInline[PropertyDescriptorImpl]

'ArrayList' @ [100:32] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Int

'-' @ [101:36] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [102:54] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'sourceCompiler' @ [105:9] ==> protected final val sourceCompiler: SourceCompilerForInline defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'initializeInlineFunctionContext' @ [105:24] ==> public abstract fun initializeInlineFunctionContext(functionDescriptor: FunctionDescriptor): Unit defined in org.jetbrains.kotlin.codegen.inline.SourceCompilerForInline[SimpleFunctionDescriptorImpl]

'functionDescriptor' @ [105:56] ==> protected final val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'jvmSignature' @ [106:9] ==> protected final val jvmSignature: JvmMethodGenericSignature defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'typeMapper' @ [106:24] ==> protected final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'mapSignatureWithGeneric' @ [106:35] ==> @NotNull public open fun mapSignatureWithGeneric(@NotNull f: FunctionDescriptor, @NotNull kind: OwnerKind): JvmMethodGenericSignature defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'functionDescriptor' @ [106:59] ==> protected final val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'sourceCompiler' @ [106:79] ==> protected final val sourceCompiler: SourceCompilerForInline defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'contextKind' @ [106:94] ==> public abstract val contextKind: OwnerKind defined in org.jetbrains.kotlin.codegen.inline.SourceCompilerForInline[PropertyDescriptorImpl]

'isSameModule' @ [107:9] ==> private final val isSameModule: Boolean defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'sourceCompiler' @ [107:24] ==> protected final val sourceCompiler: SourceCompilerForInline defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'isCallInsideSameModuleAsDeclared' @ [107:39] ==> public abstract fun isCallInsideSameModuleAsDeclared(functionDescriptor: FunctionDescriptor): Boolean defined in org.jetbrains.kotlin.codegen.inline.SourceCompilerForInline[SimpleFunctionDescriptorImpl]

'functionDescriptor' @ [107:72] ==> protected final val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'functionDescriptor' @ [109:13] ==> protected final val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'typeMapper' @ [110:42] ==> protected final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'mapAsmMethod' @ [110:53] ==> @NotNull public open fun mapAsmMethod(@NotNull descriptor: FunctionDescriptor): Method defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'function' @ [110:66] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.<init>[ValueParameterDescriptorImpl]

'name' @ [110:76] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'functionOrAccessorName' @ [112:17] ==> val functionOrAccessorName: (String..String?) defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.<init>[LocalVariableDescriptor]

'functionDescriptor' @ [112:43] ==> protected final val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'name' @ [112:62] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [112:67] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'getMemberScope' @ [113:29] ==> private final fun getMemberScope(functionOrAccessor: FunctionDescriptor): MemberScope? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion[SimpleFunctionDescriptorImpl]

'functionDescriptor' @ [113:44] ==> protected final val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'scope' @ [115:17] ==> val scope: MemberScope? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.<init>[LocalVariableDescriptor]

'getContributedFunctions' @ [115:24] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'identifier' @ [115:53] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'functionOrAccessorName' @ [115:64] ==> val functionOrAccessorName: (String..String?) defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.<init>[LocalVariableDescriptor]

'sourceCompiler' @ [115:89] ==> protected final val sourceCompiler: SourceCompilerForInline defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'lookupLocation' @ [115:104] ==> public abstract val lookupLocation: LookupLocation defined in org.jetbrains.kotlin.codegen.inline.SourceCompilerForInline[PropertyDescriptorImpl]

'sourceCompiler' @ [124:33] ==> protected final val sourceCompiler: SourceCompilerForInline defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'compilationContextDescriptor' @ [124:48] ==> public abstract val compilationContextDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.codegen.inline.SourceCompilerForInline[PropertyDescriptorImpl]

'DescriptorToSourceUtils' @ [125:23] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [125:47] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'contextDescriptor' @ [125:71] ==> val contextDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.throwCompilationException[LocalVariableDescriptor]

'nodeAndSmap' @ [126:20] ==> value-parameter nodeAndSmap: SMAPAndMethodNode? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.throwCompilationException[ValueParameterDescriptorImpl]

'node' @ [126:33] ==> public final val node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.SMAPAndMethodNode[PropertyDescriptorImpl]

'CompilationException' @ [127:15] ==> public constructor CompilationException(@NotNull message: String, @Nullable cause: Throwable?, @Nullable element: PsiElement?) defined in org.jetbrains.kotlin.codegen.CompilationException[JavaClassConstructorDescriptor]

'+' @ [128:17] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'functionDescriptor' @ [128:51] ==> protected final val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'name' @ [128:70] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'DEBUG_TEXT' @ [129:36] ==> @field:JvmField public final val DEBUG_TEXT: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'render' @ [129:47] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'contextDescriptor' @ [129:54] ==> val contextDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.throwCompilationException[LocalVariableDescriptor]

'element' @ [130:18] ==> val element: PsiElement? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.throwCompilationException[LocalVariableDescriptor]

'text' @ [130:27] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'if (generateNodeText) "\nCause: " + node.nodeText else ""' @ [131:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'generateNodeText' @ [131:21] ==> value-parameter generateNodeText: Boolean defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.throwCompilationException[ValueParameterDescriptorImpl]

'+' @ [131:39] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'node' @ [131:53] ==> val node: MethodNode? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.throwCompilationException[LocalVariableDescriptor]

'nodeText' @ [131:58] ==> internal val MethodNode?.nodeText: String defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[PropertyDescriptorImpl]

'e' @ [132:17] ==> value-parameter e: Exception /* = Exception */ defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.throwCompilationException[ValueParameterDescriptorImpl]

'sourceCompiler' @ [132:20] ==> protected final val sourceCompiler: SourceCompilerForInline defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'callElement' @ [132:35] ==> public abstract val callElement: Any defined in org.jetbrains.kotlin.codegen.inline.SourceCompilerForInline[PropertyDescriptorImpl]

'leaveTemps' @ [137:9] ==> private final fun leaveTemps(): Unit defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[SimpleFunctionDescriptorImpl]

'assert' @ [138:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [138:16] ==> value-parameter resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.generateStub[ValueParameterDescriptorImpl]

'+' @ [139:23] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [139:58] ==> value-parameter resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.generateStub[ValueParameterDescriptorImpl]

'call' @ [139:73] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'callElement' @ [139:78] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'text' @ [139:90] ==> public final val KtElement.text: (String..String?)[MyPropertyDescriptor]

'genThrow' @ [140:17] ==> public open fun genThrow(@NotNull v: InstructionAdapter, @NotNull exception: String, @Nullable message: String?): Unit defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'codegen' @ [140:26] ==> value-parameter codegen: BaseExpressionCodegen defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.generateStub[ValueParameterDescriptorImpl]

'v' @ [140:34] ==> public val BaseExpressionCodegen.v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.inline in file InlineCodegen.kt[PropertyDescriptorImpl]

'message' @ [140:80] ==> val message: String defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.generateStub[LocalVariableDescriptor]

'leaveTemps' @ [144:9] ==> private final fun leaveTemps(): Unit defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[SimpleFunctionDescriptorImpl]

'codegen' @ [146:9] ==> protected final val codegen: T defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'propagateChildReifiedTypeParametersUsages' @ [146:17] ==> public abstract fun propagateChildReifiedTypeParametersUsages(reifiedTypeParametersUsages: ReifiedTypeParametersUsages): Unit defined in org.jetbrains.kotlin.codegen.BaseExpressionCodegen[SimpleFunctionDescriptorImpl]

'result' @ [146:59] ==> value-parameter result: InlineResult defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.endCall[ValueParameterDescriptorImpl]

'reifiedTypeParametersUsages' @ [146:66] ==> public final val reifiedTypeParametersUsages: ReifiedTypeParametersUsages defined in org.jetbrains.kotlin.codegen.inline.InlineResult[PropertyDescriptorImpl]

'state' @ [148:9] ==> protected final val state: GenerationState defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'factory' @ [148:15] ==> public final val factory: ClassFileFactory defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'removeClasses' @ [148:23] ==> public open fun removeClasses(classNamesToRemove: (MutableSet<(String..String?)>..Set<(String..String?)>?)): Unit defined in org.jetbrains.kotlin.codegen.ClassFileFactory[JavaMethodDescriptor]

'result' @ [148:37] ==> value-parameter result: InlineResult defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.endCall[ValueParameterDescriptorImpl]

'calcClassesToRemove' @ [148:44] ==> public final fun calcClassesToRemove(): Set<String> defined in org.jetbrains.kotlin.codegen.inline.InlineResult[SimpleFunctionDescriptorImpl]

'codegen' @ [150:9] ==> protected final val codegen: T defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'markLineNumberAfterInlineIfNeeded' @ [150:17] ==> public abstract fun markLineNumberAfterInlineIfNeeded(): Unit defined in org.jetbrains.kotlin.codegen.BaseExpressionCodegen[SimpleFunctionDescriptorImpl]

'!' @ [158:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'state' @ [158:14] ==> protected final val state: GenerationState defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'inlineCycleReporter' @ [158:20] ==> public final val inlineCycleReporter: InlineCycleReporter defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'enterIntoInlining' @ [158:40] ==> public final fun enterIntoInlining(call: ResolvedCall<*>?): Boolean defined in org.jetbrains.kotlin.codegen.InlineCycleReporter[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [158:58] ==> value-parameter resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.performInline[ValueParameterDescriptorImpl]

'generateStub' @ [159:13] ==> protected final fun generateStub(resolvedCall: ResolvedCall<*>?, codegen: BaseExpressionCodegen): Unit defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [159:26] ==> value-parameter resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.performInline[ValueParameterDescriptorImpl]

'codegen' @ [159:40] ==> value-parameter codegen: BaseExpressionCodegen defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.performInline[ValueParameterDescriptorImpl]

'nodeAndSmap' @ [165:13] ==> var nodeAndSmap: SMAPAndMethodNode? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.performInline[LocalVariableDescriptor]

'createInlineMethodNode' @ [165:27] ==> internal final fun createInlineMethodNode(functionDescriptor: FunctionDescriptor, jvmSignature: JvmMethodSignature, codegen: BaseExpressionCodegen, callDefault: Boolean, resolvedCall: ResolvedCall<*>?, state: GenerationState, sourceCompilerForInline: SourceCompilerForInline): SMAPAndMethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion[SimpleFunctionDescriptorImpl]

'functionDescriptor' @ [165:50] ==> protected final val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'jvmSignature' @ [165:70] ==> protected final val jvmSignature: JvmMethodGenericSignature defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'codegen' @ [165:84] ==> value-parameter codegen: BaseExpressionCodegen defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.performInline[ValueParameterDescriptorImpl]

'callDefault' @ [165:93] ==> value-parameter callDefault: Boolean defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.performInline[ValueParameterDescriptorImpl]

'resolvedCall' @ [165:106] ==> value-parameter resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.performInline[ValueParameterDescriptorImpl]

'state' @ [165:120] ==> protected final val state: GenerationState defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'sourceCompiler' @ [165:127] ==> protected final val sourceCompiler: SourceCompilerForInline defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'endCall' @ [166:13] ==> protected final fun endCall(result: InlineResult): Unit defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[SimpleFunctionDescriptorImpl]

'inlineCall' @ [166:21] ==> protected final fun inlineCall(nodeAndSmap: SMAPAndMethodNode, callDefault: Boolean): InlineResult defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[SimpleFunctionDescriptorImpl]

'nodeAndSmap' @ [166:32] ==> var nodeAndSmap: SMAPAndMethodNode? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.performInline[LocalVariableDescriptor]

'callDefault' @ [166:45] ==> value-parameter callDefault: Boolean defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.performInline[ValueParameterDescriptorImpl]

'e' @ [169:19] ==> val e: CompilationException defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.performInline[LocalVariableDescriptor]

'throwCompilationException' @ [172:19] ==> protected final fun throwCompilationException(nodeAndSmap: SMAPAndMethodNode?, e: Exception /* = Exception */, generateNodeText: Boolean): CompilationException defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[SimpleFunctionDescriptorImpl]

'nodeAndSmap' @ [172:45] ==> var nodeAndSmap: SMAPAndMethodNode? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.performInline[LocalVariableDescriptor]

'e' @ [172:58] ==> val e: InlineException defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.performInline[LocalVariableDescriptor]

'throwCompilationException' @ [175:19] ==> protected final fun throwCompilationException(nodeAndSmap: SMAPAndMethodNode?, e: Exception /* = Exception */, generateNodeText: Boolean): CompilationException defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[SimpleFunctionDescriptorImpl]

'nodeAndSmap' @ [175:45] ==> var nodeAndSmap: SMAPAndMethodNode? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.performInline[LocalVariableDescriptor]

'e' @ [175:58] ==> val e: Exception /* = Exception */ defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.performInline[LocalVariableDescriptor]

'state' @ [178:13] ==> protected final val state: GenerationState defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'inlineCycleReporter' @ [178:19] ==> public final val inlineCycleReporter: InlineCycleReporter defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'exitFromInliningOf' @ [178:39] ==> public final fun exitFromInliningOf(call: ResolvedCall<*>?): Unit defined in org.jetbrains.kotlin.codegen.InlineCycleReporter[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [178:58] ==> value-parameter resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.performInline[ValueParameterDescriptorImpl]

'assert' @ [184:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'delayedHiddenWriting' @ [184:16] ==> protected final var delayedHiddenWriting: (() -> Unit)? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'defaultSourceMapper' @ [185:9] ==> private final val defaultSourceMapper: DefaultSourceMapper defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'callSiteMarker' @ [185:29] ==> public final var callSiteMarker: CallSiteMarker? defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper[PropertyDescriptorImpl]

'CallSiteMarker' @ [185:46] ==> public constructor CallSiteMarker(lineNumber: Int) defined in org.jetbrains.kotlin.codegen.inline.CallSiteMarker[ClassConstructorDescriptorImpl]

'codegen' @ [185:61] ==> protected final val codegen: T defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'lastLineNumber' @ [185:69] ==> public abstract val lastLineNumber: Int defined in org.jetbrains.kotlin.codegen.BaseExpressionCodegen[PropertyDescriptorImpl]

'nodeAndSmap' @ [186:20] ==> value-parameter nodeAndSmap: SMAPAndMethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.inlineCall[ValueParameterDescriptorImpl]

'node' @ [186:32] ==> public final val node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.SMAPAndMethodNode[PropertyDescriptorImpl]

'callDefault' @ [187:13] ==> value-parameter callDefault: Boolean defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.inlineCall[ValueParameterDescriptorImpl]

'expandMaskConditionsAndUpdateVariableNodes' @ [188:34] ==> public fun expandMaskConditionsAndUpdateVariableNodes(node: MethodNode, maskStartIndex: Int, masks: List<Int>, methodHandlerIndex: Int, defaultLambdas: Map<Int, ValueParameterDescriptor>): List<DefaultLambda> defined in org.jetbrains.kotlin.codegen.inline in file defaultMethodUtil.kt[SimpleFunctionDescriptorImpl]

'node' @ [189:21] ==> val node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.inlineCall[LocalVariableDescriptor]

'maskStartIndex' @ [189:27] ==> protected final var maskStartIndex: Int defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'maskValues' @ [189:43] ==> protected final val maskValues: ArrayList<Int> defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'methodHandleInDefaultMethodIndex' @ [189:55] ==> protected final var methodHandleInDefaultMethodIndex: Int defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'extractDefaultLambdaOffsetAndDescriptor' @ [190:21] ==> public fun extractDefaultLambdaOffsetAndDescriptor(jvmSignature: JvmMethodSignature, functionDescriptor: FunctionDescriptor): Map<Int, ValueParameterDescriptor> defined in org.jetbrains.kotlin.codegen.inline in file defaultMethodUtil.kt[SimpleFunctionDescriptorImpl]

'jvmSignature' @ [190:61] ==> protected final val jvmSignature: JvmMethodGenericSignature defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'functionDescriptor' @ [190:75] ==> protected final val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'defaultLambdas' @ [192:28] ==> val defaultLambdas: List<DefaultLambda> defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.inlineCall[LocalVariableDescriptor]

'invocationParamBuilder' @ [193:17] ==> protected final val invocationParamBuilder: ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'buildParameters' @ [193:40] ==> public final fun buildParameters(): Parameters defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[SimpleFunctionDescriptorImpl]

'getParameterByDeclarationSlot' @ [193:58] ==> public final fun getParameterByDeclarationSlot(index: Int): ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.Parameters[SimpleFunctionDescriptorImpl]

'lambda' @ [193:88] ==> val lambda: DefaultLambda defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.inlineCall[LocalVariableDescriptor]

'offset' @ [193:95] ==> public final val offset: Int defined in org.jetbrains.kotlin.codegen.inline.DefaultLambda[PropertyDescriptorImpl]

'lambda' @ [193:103] ==> public final var ParameterInfo.lambda: LambdaInfo?[MyPropertyDescriptor]

'lambda' @ [193:112] ==> val lambda: DefaultLambda defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.inlineCall[LocalVariableDescriptor]

'expressionMap' @ [194:28] ==> protected final val expressionMap: LinkedHashMap<Int, LambdaInfo> /* = LinkedHashMap<Int, LambdaInfo> */ defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'put' @ [194:42] ==> public open fun put(key: Int, value: LambdaInfo): LambdaInfo? defined in java.util.LinkedHashMap[JavaMethodDescriptor]

'lambda' @ [194:46] ==> val lambda: DefaultLambda defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.inlineCall[LocalVariableDescriptor]

'offset' @ [194:53] ==> public final val offset: Int defined in org.jetbrains.kotlin.codegen.inline.DefaultLambda[PropertyDescriptorImpl]

'lambda' @ [194:61] ==> val lambda: DefaultLambda defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.inlineCall[LocalVariableDescriptor]

'assert' @ [195:17] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'prev' @ [195:24] ==> val prev: LambdaInfo? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.inlineCall[LocalVariableDescriptor]

'lambda' @ [195:62] ==> val lambda: DefaultLambda defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.inlineCall[LocalVariableDescriptor]

'offset' @ [195:69] ==> public final val offset: Int defined in org.jetbrains.kotlin.codegen.inline.DefaultLambda[PropertyDescriptorImpl]

'prev' @ [195:94] ==> val prev: LambdaInfo? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.inlineCall[LocalVariableDescriptor]

'reifiedTypeInliner' @ [198:33] ==> private final val reifiedTypeInliner: ReifiedTypeInliner defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'reifyInstructions' @ [198:52] ==> public final fun reifyInstructions(node: MethodNode): ReifiedTypeParametersUsages defined in org.jetbrains.kotlin.codegen.inline.ReifiedTypeInliner[SimpleFunctionDescriptorImpl]

'node' @ [198:70] ==> val node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.inlineCall[LocalVariableDescriptor]

'generateClosuresBodies' @ [199:9] ==> private final fun generateClosuresBodies(): Unit defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[SimpleFunctionDescriptorImpl]

'putClosureParametersOnStack' @ [202:9] ==> private final fun putClosureParametersOnStack(): Unit defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[SimpleFunctionDescriptorImpl]

'addInlineMarker' @ [204:9] ==> internal fun addInlineMarker(v: InstructionAdapter, isStartNotEnd: Boolean): Unit defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'codegen' @ [204:25] ==> protected final val codegen: T defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'v' @ [204:33] ==> public val BaseExpressionCodegen.v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.inline in file InlineCodegen.kt[PropertyDescriptorImpl]

'invocationParamBuilder' @ [206:26] ==> protected final val invocationParamBuilder: ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'buildParameters' @ [206:49] ==> public final fun buildParameters(): Parameters defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[SimpleFunctionDescriptorImpl]

'RootInliningContext' @ [208:20] ==> public constructor RootInliningContext(expressionMap: Map<Int, LambdaInfo>, state: GenerationState, nameGenerator: NameGenerator, sourceCompilerForInline: SourceCompilerForInline, callSiteInfo: InlineCallSiteInfo, inlineMethodReifier: ReifiedTypeInliner, typeParameterMappings: TypeParameterMappings) defined in org.jetbrains.kotlin.codegen.inline.RootInliningContext[ClassConstructorDescriptorImpl]

'expressionMap' @ [209:17] ==> protected final val expressionMap: LinkedHashMap<Int, LambdaInfo> /* = LinkedHashMap<Int, LambdaInfo> */ defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'state' @ [209:32] ==> protected final val state: GenerationState defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'codegen' @ [209:39] ==> protected final val codegen: T defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'inlineNameGenerator' @ [209:47] ==> public abstract val inlineNameGenerator: NameGenerator defined in org.jetbrains.kotlin.codegen.BaseExpressionCodegen[PropertyDescriptorImpl]

'subGenerator' @ [209:67] ==> public open fun subGenerator(inliningMethod: (String..String?)): (NameGenerator..NameGenerator?) defined in org.jetbrains.kotlin.codegen.inline.NameGenerator[JavaMethodDescriptor]

'jvmSignature' @ [209:80] ==> protected final val jvmSignature: JvmMethodGenericSignature defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'asmMethod' @ [209:93] ==> public final val JvmMethodGenericSignature.asmMethod: Method[MyPropertyDescriptor]

'name' @ [209:103] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'sourceCompiler' @ [210:17] ==> protected final val sourceCompiler: SourceCompilerForInline defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'sourceCompiler' @ [210:33] ==> protected final val sourceCompiler: SourceCompilerForInline defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'inlineCallSiteInfo' @ [210:48] ==> public abstract val inlineCallSiteInfo: InlineCallSiteInfo defined in org.jetbrains.kotlin.codegen.inline.SourceCompilerForInline[PropertyDescriptorImpl]

'reifiedTypeInliner' @ [210:68] ==> private final val reifiedTypeInliner: ReifiedTypeInliner defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'typeParameterMappings' @ [210:88] ==> private final val typeParameterMappings: TypeParameterMappings defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'MethodInliner' @ [213:23] ==> public constructor MethodInliner(node: MethodNode, parameters: Parameters, inliningContext: InliningContext, nodeRemapper: FieldRemapper, isSameModule: Boolean, errorPrefix: String, sourceMapper: SourceMapper, inlineCallSiteInfo: InlineCallSiteInfo, inlineOnlySmapSkipper: InlineOnlySmapSkipper?) defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[ClassConstructorDescriptorImpl]

'node' @ [214:17] ==> val node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.inlineCall[LocalVariableDescriptor]

'parameters' @ [214:23] ==> val parameters: Parameters defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.inlineCall[LocalVariableDescriptor]

'info' @ [214:35] ==> val info: RootInliningContext defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.inlineCall[LocalVariableDescriptor]

'FieldRemapper' @ [214:41] ==> public constructor FieldRemapper(originalLambdaInternalName: String?, parent: FieldRemapper?, parameters: Parameters) defined in org.jetbrains.kotlin.codegen.inline.FieldRemapper[ClassConstructorDescriptorImpl]

'parameters' @ [214:67] ==> val parameters: Parameters defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.inlineCall[LocalVariableDescriptor]

'isSameModule' @ [214:80] ==> private final val isSameModule: Boolean defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'+' @ [215:17] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'sourceCompiler' @ [215:38] ==> protected final val sourceCompiler: SourceCompilerForInline defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'callElementText' @ [215:53] ==> public abstract val callElementText: String defined in org.jetbrains.kotlin.codegen.inline.SourceCompilerForInline[PropertyDescriptorImpl]

'createNestedSourceMapper' @ [216:17] ==> public final fun createNestedSourceMapper(nodeAndSmap: SMAPAndMethodNode, parent: SourceMapper): SourceMapper defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion[SimpleFunctionDescriptorImpl]

'nodeAndSmap' @ [216:42] ==> value-parameter nodeAndSmap: SMAPAndMethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.inlineCall[ValueParameterDescriptorImpl]

'defaultSourceMapper' @ [216:55] ==> private final val defaultSourceMapper: DefaultSourceMapper defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'info' @ [216:77] ==> val info: RootInliningContext defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.inlineCall[LocalVariableDescriptor]

'callSiteInfo' @ [216:82] ==> public open val callSiteInfo: InlineCallSiteInfo defined in org.jetbrains.kotlin.codegen.inline.RootInliningContext[PropertyDescriptorImpl]

'if (functionDescriptor.isInlineOnly()) InlineOnlySmapSkipper(codegen) else null' @ [217:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: InlineOnlySmapSkipper?, elseBranch: InlineOnlySmapSkipper?): InlineOnlySmapSkipper?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> InlineOnlySmapSkipper?

'functionDescriptor' @ [217:21] ==> protected final val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'isInlineOnly' @ [217:40] ==> public fun MemberDescriptor.isInlineOnly(): Boolean defined in org.jetbrains.kotlin.descriptors.annotations[DeserializedSimpleFunctionDescriptor]

'InlineOnlySmapSkipper' @ [217:56] ==> public constructor InlineOnlySmapSkipper(codegen: BaseExpressionCodegen) defined in org.jetbrains.kotlin.codegen.inline.InlineOnlySmapSkipper[ClassConstructorDescriptorImpl]

'codegen' @ [217:78] ==> protected final val codegen: T defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'LocalVarRemapper' @ [220:24] ==> public constructor LocalVarRemapper(params: Parameters, additionalShift: Int) defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper[ClassConstructorDescriptorImpl]

'parameters' @ [220:41] ==> val parameters: Parameters defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.inlineCall[LocalVariableDescriptor]

'initialFrameSize' @ [220:53] ==> private final val initialFrameSize: Int defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'createEmptyMethodNode' @ [222:23] ==> internal fun createEmptyMethodNode(): MethodNode defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'adapter' @ [224:9] ==> val adapter: MethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.inlineCall[LocalVariableDescriptor]

'visitInsn' @ [224:17] ==> public open fun visitInsn(p0: Int): Unit defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaMethodDescriptor]

'NOP' @ [224:35] ==> public const final val NOP: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'inliner' @ [226:22] ==> val inliner: MethodInliner defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.inlineCall[LocalVariableDescriptor]

'doInline' @ [226:30] ==> public final fun doInline(adapter: MethodVisitor, remapper: LocalVarRemapper, remapReturn: Boolean, labelOwner: LabelOwner): InlineResult defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[SimpleFunctionDescriptorImpl]

'adapter' @ [226:39] ==> val adapter: MethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.inlineCall[LocalVariableDescriptor]

'remapper' @ [226:48] ==> val remapper: LocalVarRemapper defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.inlineCall[LocalVariableDescriptor]

'SKIP_ALL' @ [226:75] ==> public final val SKIP_ALL: (LabelOwner..LabelOwner?) defined in org.jetbrains.kotlin.codegen.inline.LabelOwner[JavaPropertyDescriptor]

'result' @ [227:9] ==> val result: InlineResult defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.inlineCall[LocalVariableDescriptor]

'reifiedTypeParametersUsages' @ [227:16] ==> public final val reifiedTypeParametersUsages: ReifiedTypeParametersUsages defined in org.jetbrains.kotlin.codegen.inline.InlineResult[PropertyDescriptorImpl]

'mergeAll' @ [227:44] ==> public final fun mergeAll(other: ReifiedTypeParametersUsages): Unit defined in org.jetbrains.kotlin.codegen.inline.ReifiedTypeParametersUsages[SimpleFunctionDescriptorImpl]

'reificationResult' @ [227:53] ==> val reificationResult: ReifiedTypeParametersUsages defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.inlineCall[LocalVariableDescriptor]

'sourceCompiler' @ [229:22] ==> protected final val sourceCompiler: SourceCompilerForInline defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'getContextLabels' @ [229:37] ==> public abstract fun getContextLabels(): Set<String> defined in org.jetbrains.kotlin.codegen.inline.SourceCompilerForInline[SimpleFunctionDescriptorImpl]

'MethodInliner' @ [231:21] ==> public companion object defined in org.jetbrains.kotlin.codegen.inline.MethodInliner[FakeCallableDescriptorForObject]

'processReturns' @ [231:35] ==> @JvmStatic public final fun processReturns(node: MethodNode, labelOwner: LabelOwner, remapReturn: Boolean, endLabel: Label?): List<MethodInliner.PointForExternalFinallyBlocks> defined in org.jetbrains.kotlin.codegen.inline.MethodInliner.Companion[SimpleFunctionDescriptorImpl]

'adapter' @ [231:50] ==> val adapter: MethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.inlineCall[LocalVariableDescriptor]

'LabelOwner' @ [231:59] ==> public fun LabelOwner(function: (name: String) -> Boolean): LabelOwner defined in org.jetbrains.kotlin.codegen.inline in file LabelOwner.java[SamConstructorDescriptorImpl]

'labels' @ [231:72] ==> val labels: Set<String> defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.inlineCall[LocalVariableDescriptor]

'contains' @ [231:79] ==> public abstract fun contains(element: String): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'it' @ [231:88] ==> value-parameter it: String defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.inlineCall.<anonymous>[ValueParameterDescriptorImpl]

'sourceCompiler' @ [232:9] ==> protected final val sourceCompiler: SourceCompilerForInline defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'generateAndInsertFinallyBlocks' @ [232:24] ==> public abstract fun generateAndInsertFinallyBlocks(intoNode: MethodNode, insertPoints: List<MethodInliner.PointForExternalFinallyBlocks>, offsetForFinallyLocalVar: Int): Unit defined in org.jetbrains.kotlin.codegen.inline.SourceCompilerForInline[SimpleFunctionDescriptorImpl]

'adapter' @ [233:17] ==> val adapter: MethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.inlineCall[LocalVariableDescriptor]

'infos' @ [233:26] ==> val infos: List<MethodInliner.PointForExternalFinallyBlocks> defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.inlineCall[LocalVariableDescriptor]

'remapper' @ [233:34] ==> val remapper: LocalVarRemapper defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.inlineCall[LocalVariableDescriptor]

'remap' @ [233:43] ==> public final fun remap(index: Int): LocalVarRemapper.RemapInfo defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper[SimpleFunctionDescriptorImpl]

'parameters' @ [233:49] ==> val parameters: Parameters defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.inlineCall[LocalVariableDescriptor]

'argsSizeOnStack' @ [233:60] ==> public final val argsSizeOnStack: Int defined in org.jetbrains.kotlin.codegen.inline.Parameters[PropertyDescriptorImpl]

'value' @ [233:81] ==> @JvmField public final val value: StackValue? defined in org.jetbrains.kotlin.codegen.inline.LocalVarRemapper.RemapInfo[PropertyDescriptorImpl]

'index' @ [233:108] ==> public final val index: Int defined in org.jetbrains.kotlin.codegen.StackValue.Local[JavaPropertyDescriptor]

'removeStaticInitializationTrigger' @ [235:9] ==> private final fun removeStaticInitializationTrigger(methodNode: MethodNode): Unit defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion[SimpleFunctionDescriptorImpl]

'adapter' @ [235:43] ==> val adapter: MethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.inlineCall[LocalVariableDescriptor]

'!' @ [236:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'sourceCompiler' @ [236:14] ==> protected final val sourceCompiler: SourceCompilerForInline defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'isFinallyMarkerRequired' @ [236:29] ==> public abstract fun isFinallyMarkerRequired(): Boolean defined in org.jetbrains.kotlin.codegen.inline.SourceCompilerForInline[SimpleFunctionDescriptorImpl]

'removeFinallyMarkers' @ [237:13] ==> internal fun removeFinallyMarkers(intoNode: MethodNode): Unit defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'adapter' @ [237:34] ==> val adapter: MethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.inlineCall[LocalVariableDescriptor]

'adapter' @ [240:9] ==> val adapter: MethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.inlineCall[LocalVariableDescriptor]

'accept' @ [240:17] ==> public open fun accept(p0: (MethodVisitor..MethodVisitor?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaMethodDescriptor]

'MethodBodyVisitor' @ [240:24] ==> public constructor MethodBodyVisitor(mv: MethodVisitor, visitAnnotationsAndAttributes: Boolean = ...) defined in org.jetbrains.kotlin.codegen.inline.MethodBodyVisitor[ClassConstructorDescriptorImpl]

'codegen' @ [240:42] ==> protected final val codegen: T defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'v' @ [240:50] ==> public val BaseExpressionCodegen.v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.inline in file InlineCodegen.kt[PropertyDescriptorImpl]

'addInlineMarker' @ [242:9] ==> internal fun addInlineMarker(v: InstructionAdapter, isStartNotEnd: Boolean): Unit defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'codegen' @ [242:25] ==> protected final val codegen: T defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'v' @ [242:33] ==> public val BaseExpressionCodegen.v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.inline in file InlineCodegen.kt[PropertyDescriptorImpl]

'defaultSourceMapper' @ [244:9] ==> private final val defaultSourceMapper: DefaultSourceMapper defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'callSiteMarker' @ [244:29] ==> public final var callSiteMarker: CallSiteMarker? defined in org.jetbrains.kotlin.codegen.inline.DefaultSourceMapper[PropertyDescriptorImpl]

'result' @ [246:16] ==> val result: InlineResult defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.inlineCall[LocalVariableDescriptor]

'expressionMap' @ [250:22] ==> protected final val expressionMap: LinkedHashMap<Int, LambdaInfo> /* = LinkedHashMap<Int, LambdaInfo> */ defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'values' @ [250:36] ==> public open val values: MutableCollection<LambdaInfo> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'info' @ [251:13] ==> val info: LambdaInfo defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.generateClosuresBodies[LocalVariableDescriptor]

'generateLambdaBody' @ [251:18] ==> public abstract fun generateLambdaBody(sourceCompiler: SourceCompilerForInline, reifiedTypeInliner: ReifiedTypeInliner): Unit defined in org.jetbrains.kotlin.codegen.inline.LambdaInfo[SimpleFunctionDescriptorImpl]

'sourceCompiler' @ [251:37] ==> protected final val sourceCompiler: SourceCompilerForInline defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'reifiedTypeInliner' @ [251:53] ==> private final val reifiedTypeInliner: ReifiedTypeInliner defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'kind' @ [262:34] ==> value-parameter kind: ValueKind defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.putArgumentOrCapturedToLocalVal[ValueParameterDescriptorImpl]

'DEFAULT_PARAMETER' @ [262:53] ==> enum entry DEFAULT_PARAMETER defined in org.jetbrains.kotlin.codegen.ValueKind[FakeCallableDescriptorForObject]

'!' @ [263:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isDefaultParameter' @ [263:14] ==> val isDefaultParameter: Boolean defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.putArgumentOrCapturedToLocalVal[LocalVariableDescriptor]

'shouldPutGeneralValue' @ [263:36] ==> private final fun shouldPutGeneralValue(type: Type, stackValue: StackValue): Boolean defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion[SimpleFunctionDescriptorImpl]

'type' @ [263:58] ==> value-parameter type: Type defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.putArgumentOrCapturedToLocalVal[ValueParameterDescriptorImpl]

'stackValue' @ [263:64] ==> value-parameter stackValue: StackValue defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.putArgumentOrCapturedToLocalVal[ValueParameterDescriptorImpl]

'stackValue' @ [264:13] ==> value-parameter stackValue: StackValue defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.putArgumentOrCapturedToLocalVal[ValueParameterDescriptorImpl]

'put' @ [264:24] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'type' @ [264:28] ==> value-parameter type: Type defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.putArgumentOrCapturedToLocalVal[ValueParameterDescriptorImpl]

'codegen' @ [264:34] ==> protected final val codegen: T defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'v' @ [264:42] ==> public val BaseExpressionCodegen.v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.inline in file InlineCodegen.kt[PropertyDescriptorImpl]

'!' @ [267:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'asFunctionInline' @ [267:14] ==> private final val asFunctionInline: Boolean defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'VOID_TYPE' @ [267:39] ==> public final val VOID_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'type' @ [267:53] ==> value-parameter type: Type defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.putArgumentOrCapturedToLocalVal[ValueParameterDescriptorImpl]

'!' @ [269:35] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'shouldPutGeneralValue' @ [269:36] ==> private final fun shouldPutGeneralValue(type: Type, stackValue: StackValue): Boolean defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion[SimpleFunctionDescriptorImpl]

'type' @ [269:58] ==> value-parameter type: Type defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.putArgumentOrCapturedToLocalVal[ValueParameterDescriptorImpl]

'stackValue' @ [269:64] ==> value-parameter stackValue: StackValue defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.putArgumentOrCapturedToLocalVal[ValueParameterDescriptorImpl]

'kind' @ [269:79] ==> value-parameter kind: ValueKind defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.putArgumentOrCapturedToLocalVal[ValueParameterDescriptorImpl]

'DEFAULT_PARAMETER' @ [269:98] ==> enum entry DEFAULT_PARAMETER defined in org.jetbrains.kotlin.codegen.ValueKind[FakeCallableDescriptorForObject]

'if (couldBeRemapped) stackValue else null' @ [270:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: StackValue?, elseBranch: StackValue?): StackValue?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> StackValue?

'couldBeRemapped' @ [270:37] ==> val couldBeRemapped: Boolean defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.putArgumentOrCapturedToLocalVal[LocalVariableDescriptor]

'stackValue' @ [270:54] ==> value-parameter stackValue: StackValue defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.putArgumentOrCapturedToLocalVal[ValueParameterDescriptorImpl]

'if (capturedParamIndex >= 0) {
                val capturedParamInfoInLambda = activeLambda!!.capturedVars[capturedParamIndex]
                info = invocationParamBuilder.addCapturedParam(capturedParamInfoInLambda, capturedParamInfoInLambda.fieldName, false)
                info.setRemapValue(remappedValue)
            }
            else {
                info = invocationParamBuilder.addNextValueParameter(type, false, remappedValue, parameterIndex)
            }' @ [273:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'capturedParamIndex' @ [273:17] ==> value-parameter capturedParamIndex: Int defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.putArgumentOrCapturedToLocalVal[ValueParameterDescriptorImpl]

'activeLambda' @ [274:49] ==> protected final var activeLambda: LambdaInfo? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'capturedVars' @ [274:64] ==> public abstract val capturedVars: List<CapturedParamDesc> defined in org.jetbrains.kotlin.codegen.inline.LambdaInfo[PropertyDescriptorImpl]

'capturedParamIndex' @ [274:77] ==> value-parameter capturedParamIndex: Int defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.putArgumentOrCapturedToLocalVal[ValueParameterDescriptorImpl]

'info' @ [275:17] ==> val info: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.putArgumentOrCapturedToLocalVal[LocalVariableDescriptor]

'invocationParamBuilder' @ [275:24] ==> protected final val invocationParamBuilder: ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'addCapturedParam' @ [275:47] ==> public final fun addCapturedParam(desc: CapturedParamDesc, newFieldName: String, skipInConstructor: Boolean): CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[SimpleFunctionDescriptorImpl]

'capturedParamInfoInLambda' @ [275:64] ==> val capturedParamInfoInLambda: CapturedParamDesc defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.putArgumentOrCapturedToLocalVal[LocalVariableDescriptor]

'capturedParamInfoInLambda' @ [275:91] ==> val capturedParamInfoInLambda: CapturedParamDesc defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.putArgumentOrCapturedToLocalVal[LocalVariableDescriptor]

'fieldName' @ [275:117] ==> public final val CapturedParamDesc.fieldName: String[MyPropertyDescriptor]

'info' @ [276:17] ==> val info: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.putArgumentOrCapturedToLocalVal[LocalVariableDescriptor]

'setRemapValue' @ [276:22] ==> @NotNull public open fun setRemapValue(@Nullable remapValue: StackValue?): ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.ParameterInfo[JavaMethodDescriptor]

'remappedValue' @ [276:36] ==> val remappedValue: StackValue? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.putArgumentOrCapturedToLocalVal[LocalVariableDescriptor]

'info' @ [279:17] ==> val info: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.putArgumentOrCapturedToLocalVal[LocalVariableDescriptor]

'invocationParamBuilder' @ [279:24] ==> protected final val invocationParamBuilder: ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'addNextValueParameter' @ [279:47] ==> public final fun addNextValueParameter(type: Type, skipped: Boolean, remapValue: StackValue?, parameterIndex: Int): ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[SimpleFunctionDescriptorImpl]

'type' @ [279:69] ==> value-parameter type: Type defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.putArgumentOrCapturedToLocalVal[ValueParameterDescriptorImpl]

'remappedValue' @ [279:82] ==> val remappedValue: StackValue? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.putArgumentOrCapturedToLocalVal[LocalVariableDescriptor]

'parameterIndex' @ [279:97] ==> value-parameter parameterIndex: Int defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.putArgumentOrCapturedToLocalVal[ValueParameterDescriptorImpl]

'recordParameterValueInLocalVal' @ [282:13] ==> protected final fun recordParameterValueInLocalVal(delayedWritingToLocals: Boolean, skipStore: Boolean, vararg infos: ParameterInfo): (() -> Unit)? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[SimpleFunctionDescriptorImpl]

'isDefaultParameter' @ [284:21] ==> val isDefaultParameter: Boolean defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.putArgumentOrCapturedToLocalVal[LocalVariableDescriptor]

'kind' @ [284:43] ==> value-parameter kind: ValueKind defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.putArgumentOrCapturedToLocalVal[ValueParameterDescriptorImpl]

'DEFAULT_LAMBDA_CAPTURED_PARAMETER' @ [284:62] ==> enum entry DEFAULT_LAMBDA_CAPTURED_PARAMETER defined in org.jetbrains.kotlin.codegen.ValueKind[FakeCallableDescriptorForObject]

'info' @ [285:21] ==> val info: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.putArgumentOrCapturedToLocalVal[LocalVariableDescriptor]

'IntArray' @ [291:21] ==> public constructor IntArray(size: Int, init: (Int) -> Int) defined in kotlin.IntArray[DeserializedClassConstructorDescriptor]

'infos' @ [291:30] ==> value-parameter vararg infos: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.recordParameterValueInLocalVal[ValueParameterDescriptorImpl]

'size' @ [291:36] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'if (!infos[i].isSkippedOrRemapped) {
                codegen.frameMap.enterTemp(infos[i].getType())
            }
            else -1' @ [292:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'!' @ [292:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'infos' @ [292:18] ==> value-parameter vararg infos: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.recordParameterValueInLocalVal[ValueParameterDescriptorImpl]

'i' @ [292:24] ==> value-parameter i: Int defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.recordParameterValueInLocalVal.<anonymous>[ValueParameterDescriptorImpl]

'isSkippedOrRemapped' @ [292:27] ==> public final val ParameterInfo.isSkippedOrRemapped: Boolean[MyPropertyDescriptor]

'codegen' @ [293:17] ==> protected final val codegen: T defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'frameMap' @ [293:25] ==> public abstract val frameMap: FrameMap defined in org.jetbrains.kotlin.codegen.BaseExpressionCodegen[PropertyDescriptorImpl]

'enterTemp' @ [293:34] ==> public open fun enterTemp(type: (Type..Type?)): Int defined in org.jetbrains.kotlin.codegen.FrameMap[JavaMethodDescriptor]

'infos' @ [293:44] ==> value-parameter vararg infos: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.recordParameterValueInLocalVal[ValueParameterDescriptorImpl]

'i' @ [293:50] ==> value-parameter i: Int defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.recordParameterValueInLocalVal.<anonymous>[ValueParameterDescriptorImpl]

'getType' @ [293:53] ==> @NotNull public open fun getType(): Type defined in org.jetbrains.kotlin.codegen.inline.ParameterInfo[JavaMethodDescriptor]

'-' @ [295:18] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'infos' @ [299:23] ==> value-parameter vararg infos: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.recordParameterValueInLocalVal[ValueParameterDescriptorImpl]

'indices' @ [299:29] ==> public val <T> Array<out ParameterInfo>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ParameterInfo

'reversed' @ [299:37] ==> public fun IntProgression.reversed(): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'infos' @ [300:28] ==> value-parameter vararg infos: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.recordParameterValueInLocalVal[ValueParameterDescriptorImpl]

'i' @ [300:34] ==> val i: Int defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.recordParameterValueInLocalVal.<anonymous>[LocalVariableDescriptor]

'!' @ [301:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'info' @ [301:22] ==> val info: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.recordParameterValueInLocalVal.<anonymous>[LocalVariableDescriptor]

'isSkippedOrRemapped' @ [301:27] ==> public final val ParameterInfo.isSkippedOrRemapped: Boolean[MyPropertyDescriptor]

'info' @ [302:32] ==> val info: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.recordParameterValueInLocalVal.<anonymous>[LocalVariableDescriptor]

'type' @ [302:37] ==> public final val type: (Type..Type?) defined in org.jetbrains.kotlin.codegen.inline.ParameterInfo[JavaPropertyDescriptor]

'local' @ [303:44] ==> @NotNull public open fun local(index: Int, @NotNull type: Type): StackValue.Local defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'index' @ [303:50] ==> val index: IntArray defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.recordParameterValueInLocalVal[LocalVariableDescriptor]

'i' @ [303:56] ==> val i: Int defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.recordParameterValueInLocalVal.<anonymous>[LocalVariableDescriptor]

'type' @ [303:60] ==> val type: (Type..Type?) defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.recordParameterValueInLocalVal.<anonymous>[LocalVariableDescriptor]

'!' @ [304:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'skipStore' @ [304:26] ==> value-parameter skipStore: Boolean defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.recordParameterValueInLocalVal[ValueParameterDescriptorImpl]

'local' @ [305:25] ==> val local: StackValue.Local defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.recordParameterValueInLocalVal.<anonymous>[LocalVariableDescriptor]

'store' @ [305:31] ==> public open fun store(@NotNull value: StackValue, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue.Local[JavaMethodDescriptor]

'onStack' @ [305:48] ==> @NotNull public open fun onStack(@NotNull type: Type): StackValue defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'type' @ [305:56] ==> val type: (Type..Type?) defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.recordParameterValueInLocalVal.<anonymous>[LocalVariableDescriptor]

'codegen' @ [305:63] ==> protected final val codegen: T defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'v' @ [305:71] ==> public val BaseExpressionCodegen.v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.inline in file InlineCodegen.kt[PropertyDescriptorImpl]

'info' @ [307:25] ==> val info: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.recordParameterValueInLocalVal.<anonymous>[LocalVariableDescriptor]

'info' @ [308:25] ==> val info: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.recordParameterValueInLocalVal.<anonymous>[LocalVariableDescriptor]

'setRemapValue' @ [308:30] ==> @NotNull public open fun setRemapValue(@Nullable remapValue: StackValue?): ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.ParameterInfo[JavaMethodDescriptor]

'local' @ [308:44] ==> val local: StackValue.Local defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.recordParameterValueInLocalVal.<anonymous>[LocalVariableDescriptor]

'info' @ [309:25] ==> val info: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.recordParameterValueInLocalVal.<anonymous>[LocalVariableDescriptor]

'isSynthetic' @ [309:30] ==> public final var CapturedParamInfo.isSynthetic: Boolean[MyPropertyDescriptor]

'delayedWritingToLocals' @ [315:13] ==> value-parameter delayedWritingToLocals: Boolean defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.recordParameterValueInLocalVal[ValueParameterDescriptorImpl]

'possibleLazyTask' @ [315:44] ==> val possibleLazyTask: () -> Unit defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.recordParameterValueInLocalVal[LocalVariableDescriptor]

'invoke' @ [316:9] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'invocationParamBuilder' @ [322:9] ==> protected final val invocationParamBuilder: ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'listAllParams' @ [322:32] ==> public final fun listAllParams(): List<ParameterInfo> defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[SimpleFunctionDescriptorImpl]

'asReversed' @ [322:48] ==> public fun <T> List<ParameterInfo>.asReversed(): List<ParameterInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ParameterInfo

'forEach' @ [322:61] ==> @HidesMembers public inline fun <T> Iterable<ParameterInfo>.forEach(action: (ParameterInfo) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ParameterInfo

'!' @ [324:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'param' @ [324:18] ==> value-parameter param: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.leaveTemps.<anonymous>[ValueParameterDescriptorImpl]

'isSkippedOrRemapped' @ [324:24] ==> public final val ParameterInfo.isSkippedOrRemapped: Boolean[MyPropertyDescriptor]

'isSynthetic' @ [324:65] ==> public open fun isSynthetic(@NotNull info: ParameterInfo): Boolean defined in org.jetbrains.kotlin.codegen.inline.CapturedParamInfo[JavaMethodDescriptor]

'param' @ [324:77] ==> value-parameter param: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.leaveTemps.<anonymous>[ValueParameterDescriptorImpl]

'codegen' @ [325:17] ==> protected final val codegen: T defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'frameMap' @ [325:25] ==> public abstract val frameMap: FrameMap defined in org.jetbrains.kotlin.codegen.BaseExpressionCodegen[PropertyDescriptorImpl]

'leaveTemp' @ [325:34] ==> public open fun leaveTemp(type: (Type..Type?)): Unit defined in org.jetbrains.kotlin.codegen.FrameMap[JavaMethodDescriptor]

'param' @ [325:44] ==> value-parameter param: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.leaveTemps.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [325:50] ==> public final val type: (Type..Type?) defined in org.jetbrains.kotlin.codegen.inline.ParameterInfo[JavaPropertyDescriptor]

'expressionMap' @ [331:22] ==> protected final val expressionMap: LinkedHashMap<Int, LambdaInfo> /* = LinkedHashMap<Int, LambdaInfo> */ defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'values' @ [331:36] ==> public open val values: MutableCollection<LambdaInfo> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'next' @ [333:17] ==> val next: LambdaInfo defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.putClosureParametersOnStack[LocalVariableDescriptor]

'next' @ [333:45] ==> val next: LambdaInfo defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.putClosureParametersOnStack[LocalVariableDescriptor]

'isBoundCallableReference' @ [333:50] ==> public abstract val isBoundCallableReference: Boolean defined in org.jetbrains.kotlin.codegen.inline.LambdaInfo[PropertyDescriptorImpl]

'putClosureParametersOnStack' @ [334:13] ==> protected abstract fun putClosureParametersOnStack(next: LambdaInfo, functionReferenceReceiver: StackValue?): Unit defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[SimpleFunctionDescriptorImpl]

'next' @ [334:41] ==> val next: LambdaInfo defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.putClosureParametersOnStack[LocalVariableDescriptor]

'component1' @ [341:15] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [341:27] ==> public final operator fun component2(): CapturedParamDesc defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'defaultLambda' @ [341:40] ==> value-parameter defaultLambda: DefaultLambda defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.rememberCapturedForDefaultLambda[ValueParameterDescriptorImpl]

'capturedVars' @ [341:54] ==> public open lateinit var capturedVars: List<CapturedParamDesc> defined in org.jetbrains.kotlin.codegen.inline.DefaultLambda[PropertyDescriptorImpl]

'withIndex' @ [341:67] ==> public fun <T> Iterable<CapturedParamDesc>.withIndex(): Iterable<IndexedValue<CapturedParamDesc>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CapturedParamDesc

'putArgumentOrCapturedToLocalVal' @ [342:13] ==> protected final fun putArgumentOrCapturedToLocalVal(type: Type, stackValue: StackValue, capturedParamIndex: Int, parameterIndex: Int, kind: ValueKind): Unit defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[SimpleFunctionDescriptorImpl]

'captured' @ [343:21] ==> val captured: CapturedParamDesc defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.rememberCapturedForDefaultLambda[LocalVariableDescriptor]

'type' @ [343:30] ==> public final val CapturedParamDesc.type: Type[MyPropertyDescriptor]

'onStack' @ [346:32] ==> @NotNull public open fun onStack(@NotNull type: Type): StackValue defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'captured' @ [346:40] ==> val captured: CapturedParamDesc defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.rememberCapturedForDefaultLambda[LocalVariableDescriptor]

'type' @ [346:49] ==> public final val CapturedParamDesc.type: Type[MyPropertyDescriptor]

'paramIndex' @ [347:21] ==> val paramIndex: Int defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.rememberCapturedForDefaultLambda[LocalVariableDescriptor]

'paramIndex' @ [348:21] ==> val paramIndex: Int defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.rememberCapturedForDefaultLambda[LocalVariableDescriptor]

'DEFAULT_LAMBDA_CAPTURED_PARAMETER' @ [349:31] ==> enum entry DEFAULT_LAMBDA_CAPTURED_PARAMETER defined in org.jetbrains.kotlin.codegen.ValueKind[FakeCallableDescriptorForObject]

'defaultLambda' @ [352:13] ==> value-parameter defaultLambda: DefaultLambda defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.rememberCapturedForDefaultLambda[ValueParameterDescriptorImpl]

'parameterOffsetsInDefault' @ [352:27] ==> public final val parameterOffsetsInDefault: MutableList<Int> defined in org.jetbrains.kotlin.codegen.inline.DefaultLambda[PropertyDescriptorImpl]

'add' @ [352:53] ==> public abstract fun add(element: Int): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'invocationParamBuilder' @ [352:57] ==> protected final val invocationParamBuilder: ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'nextParameterOffset' @ [352:80] ==> public final var nextParameterOffset: Int defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[PropertyDescriptorImpl]

'kind' @ [358:13] ==> value-parameter kind: ValueKind defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.processDefaultMaskOrMethodHandler[ValueParameterDescriptorImpl]

'DEFAULT_MASK' @ [358:32] ==> enum entry DEFAULT_MASK defined in org.jetbrains.kotlin.codegen.ValueKind[FakeCallableDescriptorForObject]

'kind' @ [358:48] ==> value-parameter kind: ValueKind defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.processDefaultMaskOrMethodHandler[ValueParameterDescriptorImpl]

'METHOD_HANDLE_IN_DEFAULT' @ [358:67] ==> enum entry METHOD_HANDLE_IN_DEFAULT defined in org.jetbrains.kotlin.codegen.ValueKind[FakeCallableDescriptorForObject]

'assert' @ [361:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'value' @ [361:16] ==> value-parameter value: StackValue defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.processDefaultMaskOrMethodHandler[ValueParameterDescriptorImpl]

'+' @ [361:48] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'value' @ [361:112] ==> value-parameter value: StackValue defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.processDefaultMaskOrMethodHandler[ValueParameterDescriptorImpl]

'value' @ [362:30] ==> value-parameter value: StackValue defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.processDefaultMaskOrMethodHandler[ValueParameterDescriptorImpl]

'value' @ [362:60] ==> @Nullable public final val value: Any? defined in org.jetbrains.kotlin.codegen.StackValue.Constant[JavaPropertyDescriptor]

'if (kind === ValueKind.DEFAULT_MASK) {
            assert(constantValue is Int) { "Mask should be of Integer type, but " + constantValue }
            maskValues.add(constantValue as Int)
            if (maskStartIndex == -1) {
                maskStartIndex = invocationParamBuilder.listAllParams().sumBy {
                    if (it is CapturedParamInfo) 0 else it.type.size
                }
            }
        }
        else {
            assert(constantValue == null) { "Additional method handle for default argument should be null, but " + constantValue!! }
            methodHandleInDefaultMethodIndex = maskStartIndex + maskValues.size
        }' @ [363:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'kind' @ [363:13] ==> value-parameter kind: ValueKind defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.processDefaultMaskOrMethodHandler[ValueParameterDescriptorImpl]

'DEFAULT_MASK' @ [363:32] ==> enum entry DEFAULT_MASK defined in org.jetbrains.kotlin.codegen.ValueKind[FakeCallableDescriptorForObject]

'assert' @ [364:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'constantValue' @ [364:20] ==> val constantValue: Any? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.processDefaultMaskOrMethodHandler[LocalVariableDescriptor]

'+' @ [364:44] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'constantValue' @ [364:85] ==> val constantValue: Any? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.processDefaultMaskOrMethodHandler[LocalVariableDescriptor]

'maskValues' @ [365:13] ==> protected final val maskValues: ArrayList<Int> defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'add' @ [365:24] ==> public open fun add(element: Int): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'constantValue' @ [365:28] ==> val constantValue: Any? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.processDefaultMaskOrMethodHandler[LocalVariableDescriptor]

'maskStartIndex' @ [366:17] ==> protected final var maskStartIndex: Int defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'-' @ [366:35] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'maskStartIndex' @ [367:17] ==> protected final var maskStartIndex: Int defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'invocationParamBuilder' @ [367:34] ==> protected final val invocationParamBuilder: ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'listAllParams' @ [367:57] ==> public final fun listAllParams(): List<ParameterInfo> defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[SimpleFunctionDescriptorImpl]

'sumBy' @ [367:73] ==> public inline fun <T> Iterable<ParameterInfo>.sumBy(selector: (ParameterInfo) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ParameterInfo

'if (it is CapturedParamInfo) 0 else it.type.size' @ [368:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'it' @ [368:25] ==> value-parameter it: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.processDefaultMaskOrMethodHandler.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [368:57] ==> value-parameter it: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.processDefaultMaskOrMethodHandler.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [368:60] ==> public final val type: (Type..Type?) defined in org.jetbrains.kotlin.codegen.inline.ParameterInfo[JavaPropertyDescriptor]

'size' @ [368:65] ==> public final val Type.size: Int[MyPropertyDescriptor]

'assert' @ [373:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'constantValue' @ [373:20] ==> val constantValue: Any? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.processDefaultMaskOrMethodHandler[LocalVariableDescriptor]

'+' @ [373:45] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'constantValue' @ [373:116] ==> val constantValue: Any? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.processDefaultMaskOrMethodHandler[LocalVariableDescriptor]

'methodHandleInDefaultMethodIndex' @ [374:13] ==> protected final var methodHandleInDefaultMethodIndex: Int defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'maskStartIndex' @ [374:48] ==> protected final var maskStartIndex: Int defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'maskValues' @ [374:65] ==> protected final val maskValues: ArrayList<Int> defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[PropertyDescriptorImpl]

'size' @ [374:76] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'getDirectMember' @ [383:59] ==> @NotNull public open fun getDirectMember(@NotNull descriptor: CallableMemberDescriptor): CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.JvmCodegenUtil[JavaMethodDescriptor]

'functionOrAccessor' @ [383:75] ==> value-parameter functionOrAccessor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.getMemberScope[ValueParameterDescriptorImpl]

'callableMemberDescriptor' @ [384:42] ==> val callableMemberDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.getMemberScope[LocalVariableDescriptor]

'containingDeclaration' @ [384:67] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'when (classOrPackageFragment) {
                is ClassDescriptor -> classOrPackageFragment.unsubstitutedMemberScope
                is PackageFragmentDescriptor -> classOrPackageFragment.getMemberScope()
                else -> null
            }' @ [385:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: MemberScope?, entry1: MemberScope?, entry2: MemberScope?): MemberScope?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> MemberScope?

'classOrPackageFragment' @ [385:26] ==> val classOrPackageFragment: DeclarationDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.getMemberScope[LocalVariableDescriptor]

'classOrPackageFragment' @ [386:39] ==> val classOrPackageFragment: DeclarationDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.getMemberScope[LocalVariableDescriptor]

'unsubstitutedMemberScope' @ [386:62] ==> public final val ClassDescriptor.unsubstitutedMemberScope: MemberScope[MyPropertyDescriptor]

'classOrPackageFragment' @ [387:49] ==> val classOrPackageFragment: DeclarationDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.getMemberScope[LocalVariableDescriptor]

'getMemberScope' @ [387:72] ==> public abstract fun getMemberScope(): MemberScope defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[DeserializedSimpleFunctionDescriptor]

'if (isSpecialEnumMethod(functionDescriptor)) {
                val arguments = resolvedCall!!.typeArguments

                val node = createSpecialEnumMethodBody(
                        codegen,
                        functionDescriptor.name.asString(),
                        arguments.keys.single().defaultType,
                        state.typeMapper
                )
                return SMAPAndMethodNode(node, SMAPParser.parseOrCreateDefault(null, null, "fake", -1, -1))
            }
            else if (functionDescriptor.isBuiltInSuspendCoroutineOrReturnInJvm()) {
                return SMAPAndMethodNode(
                        createMethodNodeForSuspendCoroutineOrReturn(
                                functionDescriptor, state.typeMapper
                        ),
                        SMAPParser.parseOrCreateDefault(null, null, "fake", -1, -1)
                )
            }' @ [401:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isSpecialEnumMethod' @ [401:17] ==> internal fun isSpecialEnumMethod(functionDescriptor: FunctionDescriptor): Boolean defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'functionDescriptor' @ [401:37] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.createInlineMethodNode[ValueParameterDescriptorImpl]

'resolvedCall' @ [402:33] ==> value-parameter resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.createInlineMethodNode[ValueParameterDescriptorImpl]

'typeArguments' @ [402:48] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.typeArguments: (MutableMap<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>..Map<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'createSpecialEnumMethodBody' @ [404:28] ==> internal fun createSpecialEnumMethodBody(codegen: BaseExpressionCodegen, name: String, type: KotlinType, typeMapper: KotlinTypeMapper): MethodNode defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'codegen' @ [405:25] ==> value-parameter codegen: BaseExpressionCodegen defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.createInlineMethodNode[ValueParameterDescriptorImpl]

'functionDescriptor' @ [406:25] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.createInlineMethodNode[ValueParameterDescriptorImpl]

'name' @ [406:44] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [406:49] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'arguments' @ [407:25] ==> val arguments: (MutableMap<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>..Map<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>) defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.createInlineMethodNode[LocalVariableDescriptor]

'keys' @ [407:35] ==> public abstract val keys: MutableSet<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'single' @ [407:40] ==> public fun <T> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.single(): (TypeParameterDescriptor..TypeParameterDescriptor?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'defaultType' @ [407:49] ==> public final val TypeParameterDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'state' @ [408:25] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.createInlineMethodNode[ValueParameterDescriptorImpl]

'typeMapper' @ [408:31] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'SMAPAndMethodNode' @ [410:24] ==> public constructor SMAPAndMethodNode(node: MethodNode, classSMAP: SMAP) defined in org.jetbrains.kotlin.codegen.inline.SMAPAndMethodNode[ClassConstructorDescriptorImpl]

'node' @ [410:42] ==> val node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.createInlineMethodNode[LocalVariableDescriptor]

'parseOrCreateDefault' @ [410:59] ==> @JvmStatic public final fun parseOrCreateDefault(mappingInfo: String?, source: String?, path: String, methodStartLine: Int, methodEndLine: Int): SMAP defined in org.jetbrains.kotlin.codegen.inline.SMAPParser[SimpleFunctionDescriptorImpl]

'-' @ [410:100] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [410:104] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'functionDescriptor' @ [412:22] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.createInlineMethodNode[ValueParameterDescriptorImpl]

'isBuiltInSuspendCoroutineOrReturnInJvm' @ [412:41] ==> public fun FunctionDescriptor.isBuiltInSuspendCoroutineOrReturnInJvm(): Boolean defined in org.jetbrains.kotlin.codegen.coroutines in file coroutineCodegenUtil.kt[SimpleFunctionDescriptorImpl]

'SMAPAndMethodNode' @ [413:24] ==> public constructor SMAPAndMethodNode(node: MethodNode, classSMAP: SMAP) defined in org.jetbrains.kotlin.codegen.inline.SMAPAndMethodNode[ClassConstructorDescriptorImpl]

'createMethodNodeForSuspendCoroutineOrReturn' @ [414:25] ==> public fun createMethodNodeForSuspendCoroutineOrReturn(functionDescriptor: FunctionDescriptor, typeMapper: KotlinTypeMapper): MethodNode defined in org.jetbrains.kotlin.codegen.coroutines in file coroutineCodegenUtil.kt[SimpleFunctionDescriptorImpl]

'functionDescriptor' @ [415:33] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.createInlineMethodNode[ValueParameterDescriptorImpl]

'state' @ [415:53] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.createInlineMethodNode[ValueParameterDescriptorImpl]

'typeMapper' @ [415:59] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'parseOrCreateDefault' @ [417:36] ==> @JvmStatic public final fun parseOrCreateDefault(mappingInfo: String?, source: String?, path: String, methodStartLine: Int, methodEndLine: Int): SMAP defined in org.jetbrains.kotlin.codegen.inline.SMAPParser[SimpleFunctionDescriptorImpl]

'-' @ [417:77] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [417:81] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'if (callDefault)
                state.typeMapper.mapDefaultMethod(functionDescriptor, sourceCompilerForInline.contextKind)
            else
                jvmSignature.asmMethod' @ [421:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Method, elseBranch: Method): Method[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Method

'callDefault' @ [421:33] ==> value-parameter callDefault: Boolean defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.createInlineMethodNode[ValueParameterDescriptorImpl]

'state' @ [422:17] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.createInlineMethodNode[ValueParameterDescriptorImpl]

'typeMapper' @ [422:23] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'mapDefaultMethod' @ [422:34] ==> @NotNull public open fun mapDefaultMethod(@NotNull functionDescriptor: FunctionDescriptor, @NotNull kind: OwnerKind): Method defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'functionDescriptor' @ [422:51] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.createInlineMethodNode[ValueParameterDescriptorImpl]

'sourceCompilerForInline' @ [422:71] ==> value-parameter sourceCompilerForInline: SourceCompilerForInline defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.createInlineMethodNode[ValueParameterDescriptorImpl]

'contextKind' @ [422:95] ==> public abstract val contextKind: OwnerKind defined in org.jetbrains.kotlin.codegen.inline.SourceCompilerForInline[PropertyDescriptorImpl]

'jvmSignature' @ [424:17] ==> value-parameter jvmSignature: JvmMethodSignature defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.createInlineMethodNode[ValueParameterDescriptorImpl]

'asmMethod' @ [424:30] ==> public final val JvmMethodSignature.asmMethod: Method[MyPropertyDescriptor]

'MethodId' @ [426:28] ==> public constructor MethodId(containingFqName: FqName, method: Method) defined in org.jetbrains.kotlin.codegen.inline.MethodId[ClassConstructorDescriptorImpl]

'getFqNameSafe' @ [426:53] ==> @NotNull public open fun getFqNameSafe(@NotNull p0: DeclarationDescriptor): FqName defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'functionDescriptor' @ [426:67] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.createInlineMethodNode[ValueParameterDescriptorImpl]

'containingDeclaration' @ [426:86] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'asmMethod' @ [426:110] ==> val asmMethod: Method defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.createInlineMethodNode[LocalVariableDescriptor]

'getDirectMemberAndCallableFromObject' @ [427:32] ==> private final fun getDirectMemberAndCallableFromObject(functionDescriptor: FunctionDescriptor): CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion[SimpleFunctionDescriptorImpl]

'functionDescriptor' @ [427:69] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.createInlineMethodNode[ValueParameterDescriptorImpl]

'!' @ [428:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isBuiltInArrayIntrinsic' @ [428:18] ==> private final fun isBuiltInArrayIntrinsic(callableDescriptor: CallableMemberDescriptor): Boolean defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion[SimpleFunctionDescriptorImpl]

'functionDescriptor' @ [428:42] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.createInlineMethodNode[ValueParameterDescriptorImpl]

'directMember' @ [428:65] ==> val directMember: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.createInlineMethodNode[LocalVariableDescriptor]

'sourceCompilerForInline' @ [429:24] ==> value-parameter sourceCompilerForInline: SourceCompilerForInline defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.createInlineMethodNode[ValueParameterDescriptorImpl]

'doCreateMethodNodeFromSource' @ [429:48] ==> public abstract fun doCreateMethodNodeFromSource(callableDescriptor: FunctionDescriptor, jvmSignature: JvmMethodSignature, callDefault: Boolean, asmMethod: Method): SMAPAndMethodNode defined in org.jetbrains.kotlin.codegen.inline.SourceCompilerForInline[SimpleFunctionDescriptorImpl]

'functionDescriptor' @ [429:77] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.createInlineMethodNode[ValueParameterDescriptorImpl]

'jvmSignature' @ [429:97] ==> value-parameter jvmSignature: JvmMethodSignature defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.createInlineMethodNode[ValueParameterDescriptorImpl]

'callDefault' @ [429:111] ==> value-parameter callDefault: Boolean defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.createInlineMethodNode[ValueParameterDescriptorImpl]

'asmMethod' @ [429:124] ==> val asmMethod: Method defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.createInlineMethodNode[LocalVariableDescriptor]

'state' @ [432:33] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.createInlineMethodNode[ValueParameterDescriptorImpl]

'inlineCache' @ [432:39] ==> public final val inlineCache: InlineCache defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'methodNodeById' @ [432:51] ==> public final val methodNodeById: SLRUMap<MethodId, SMAPAndMethodNode> defined in org.jetbrains.kotlin.codegen.inline.InlineCache[PropertyDescriptorImpl]

'getOrPut' @ [432:66] ==> public inline fun <K, V> SLRUMap<MethodId, SMAPAndMethodNode>.getOrPut(key: MethodId, defaultValue: () -> SMAPAndMethodNode): SMAPAndMethodNode defined in org.jetbrains.kotlin.codegen.inline[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> MethodId
    <V> -> SMAPAndMethodNode

'methodId' @ [432:75] ==> val methodId: MethodId defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.createInlineMethodNode[LocalVariableDescriptor]

'doCreateMethodNodeFromCompiled' @ [434:17] ==> private final fun doCreateMethodNodeFromCompiled(callableDescriptor: CallableMemberDescriptor, state: GenerationState, asmMethod: Method): SMAPAndMethodNode? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion[SimpleFunctionDescriptorImpl]

'directMember' @ [434:48] ==> val directMember: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.createInlineMethodNode[LocalVariableDescriptor]

'state' @ [434:62] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.createInlineMethodNode[ValueParameterDescriptorImpl]

'asmMethod' @ [434:69] ==> val asmMethod: Method defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.createInlineMethodNode[LocalVariableDescriptor]

'IllegalStateException' @ [435:26] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'+' @ [435:48] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'functionDescriptor' @ [435:96] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.createInlineMethodNode[ValueParameterDescriptorImpl]

'resultInCache' @ [438:20] ==> val resultInCache: SMAPAndMethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.createInlineMethodNode[LocalVariableDescriptor]

'copyWithNewNode' @ [438:34] ==> public final fun copyWithNewNode(newMethodNode: MethodNode): SMAPAndMethodNode defined in org.jetbrains.kotlin.codegen.inline.SMAPAndMethodNode[SimpleFunctionDescriptorImpl]

'cloneMethodNode' @ [438:50] ==> private final fun cloneMethodNode(methodNode: MethodNode): MethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion[SimpleFunctionDescriptorImpl]

'resultInCache' @ [438:66] ==> val resultInCache: SMAPAndMethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.createInlineMethodNode[LocalVariableDescriptor]

'node' @ [438:80] ==> public final val node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.SMAPAndMethodNode[PropertyDescriptorImpl]

'getDirectMember' @ [442:47] ==> @NotNull public open fun getDirectMember(@NotNull descriptor: CallableMemberDescriptor): CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.JvmCodegenUtil[JavaMethodDescriptor]

'functionDescriptor' @ [442:63] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.getDirectMemberAndCallableFromObject[ValueParameterDescriptorImpl]

'?:' @ [443:20] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: CallableMemberDescriptor?, right: CallableMemberDescriptor): CallableMemberDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> CallableMemberDescriptor

'directMember' @ [443:21] ==> val directMember: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.getDirectMemberAndCallableFromObject[LocalVariableDescriptor]

'callableFromObject' @ [443:80] ==> public final val callableFromObject: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.ImportedFromObjectCallableDescriptor[DeserializedPropertyDescriptor]

'directMember' @ [443:102] ==> val directMember: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.getDirectMemberAndCallableFromObject[LocalVariableDescriptor]

'methodNode' @ [447:13] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.cloneMethodNode[ValueParameterDescriptorImpl]

'instructions' @ [447:24] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'resetLabels' @ [447:37] ==> public open fun resetLabels(): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'MethodNode' @ [448:20] ==> public constructor MethodNode(p0: Int, p1: Int, p2: (String..String?), p3: (String..String?), p4: (String..String?), p5: (Array<(String..String?)>..Array<out (String..String?)>?)) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaClassConstructorDescriptor]

'API' @ [449:21] ==> public const val API: Int defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[PropertyDescriptorImpl]

'methodNode' @ [449:26] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.cloneMethodNode[ValueParameterDescriptorImpl]

'access' @ [449:37] ==> public final var access: Int defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'methodNode' @ [449:45] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.cloneMethodNode[ValueParameterDescriptorImpl]

'name' @ [449:56] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'methodNode' @ [449:62] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.cloneMethodNode[ValueParameterDescriptorImpl]

'desc' @ [449:73] ==> public final var desc: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'methodNode' @ [449:79] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.cloneMethodNode[ValueParameterDescriptorImpl]

'signature' @ [449:90] ==> public final var signature: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'toStringArray' @ [450:31] ==> @NotNull @Contract public open fun toStringArray(@Nullable p0: (MutableCollection<(String..String?)>?..Collection<(String..String?)>?)): (Array<(String..String?)>..Array<out (String..String?)>) defined in com.intellij.util.ArrayUtil[JavaMethodDescriptor]

'methodNode' @ [450:45] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.cloneMethodNode[ValueParameterDescriptorImpl]

'exceptions' @ [450:56] ==> public final var exceptions: (MutableList<(String..String?)>..List<(String..String?)>?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'also' @ [451:15] ==> @InlineOnly @SinceKotlin public inline fun <T> MethodNode.also(block: (MethodNode) -> Unit): MethodNode defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MethodNode

'methodNode' @ [451:20] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.cloneMethodNode[ValueParameterDescriptorImpl]

'accept' @ [451:32] ==> public open fun accept(p0: (MethodVisitor..MethodVisitor?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaMethodDescriptor]

'isBuiltInArrayIntrinsic' @ [459:17] ==> private final fun isBuiltInArrayIntrinsic(callableDescriptor: CallableMemberDescriptor): Boolean defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion[SimpleFunctionDescriptorImpl]

'callableDescriptor' @ [459:41] ==> value-parameter callableDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.doCreateMethodNodeFromCompiled[ValueParameterDescriptorImpl]

'classId' @ [460:31] ==> internal val classId: ClassId defined in org.jetbrains.kotlin.codegen.intrinsics in file IntrinsicArrayConstructors.kt[PropertyDescriptorImpl]

'state' @ [461:29] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.doCreateMethodNodeFromCompiled[ValueParameterDescriptorImpl]

'inlineCache' @ [461:35] ==> public final val inlineCache: InlineCache defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'classBytes' @ [461:47] ==> public final val classBytes: SLRUMap<ClassId, ByteArray> defined in org.jetbrains.kotlin.codegen.inline.InlineCache[PropertyDescriptorImpl]

'getOrPut' @ [461:58] ==> public inline fun <K, V> SLRUMap<ClassId, ByteArray>.getOrPut(key: ClassId, defaultValue: () -> ByteArray): ByteArray defined in org.jetbrains.kotlin.codegen.inline[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> ClassId
    <V> -> ByteArray

'classId' @ [461:67] ==> val classId: ClassId defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.doCreateMethodNodeFromCompiled[LocalVariableDescriptor]

'bytecode' @ [461:78] ==> internal val bytecode: ByteArray defined in org.jetbrains.kotlin.codegen.intrinsics in file IntrinsicArrayConstructors.kt[PropertyDescriptorImpl]

'getMethodNode' @ [462:24] ==> internal fun getMethodNode(classData: ByteArray, methodName: String, methodDescriptor: String, classType: Type): SMAPAndMethodNode? defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'bytes' @ [462:38] ==> val bytes: ByteArray defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.doCreateMethodNodeFromCompiled[LocalVariableDescriptor]

'asmMethod' @ [462:45] ==> value-parameter asmMethod: Method defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.doCreateMethodNodeFromCompiled[ValueParameterDescriptorImpl]

'name' @ [462:55] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'asmMethod' @ [462:61] ==> value-parameter asmMethod: Method defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.doCreateMethodNodeFromCompiled[ValueParameterDescriptorImpl]

'descriptor' @ [462:71] ==> public final val Method.descriptor: (String..String?)[MyPropertyDescriptor]

'asmTypeByClassId' @ [462:91] ==> @NotNull public open fun asmTypeByClassId(@NotNull classId: ClassId): Type defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'classId' @ [462:108] ==> val classId: ClassId defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.doCreateMethodNodeFromCompiled[LocalVariableDescriptor]

'assert' @ [465:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'callableDescriptor' @ [465:20] ==> value-parameter callableDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.doCreateMethodNodeFromCompiled[ValueParameterDescriptorImpl]

'+' @ [465:82] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'callableDescriptor' @ [465:126] ==> value-parameter callableDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.doCreateMethodNodeFromCompiled[ValueParameterDescriptorImpl]

'state' @ [467:37] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.doCreateMethodNodeFromCompiled[ValueParameterDescriptorImpl]

'typeMapper' @ [467:43] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'getContainingClassesForDeserializedCallable' @ [467:54] ==> @NotNull public open fun getContainingClassesForDeserializedCallable(@NotNull deserializedDescriptor: DeserializedCallableMemberDescriptor): KotlinTypeMapper.ContainingClassesInfo defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'callableDescriptor' @ [467:98] ==> value-parameter callableDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.doCreateMethodNodeFromCompiled[ValueParameterDescriptorImpl]

'containingClasses' @ [469:31] ==> val containingClasses: KotlinTypeMapper.ContainingClassesInfo defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.doCreateMethodNodeFromCompiled[LocalVariableDescriptor]

'implClassId' @ [469:49] ==> public final val KotlinTypeMapper.ContainingClassesInfo.implClassId: ClassId[MyPropertyDescriptor]

'state' @ [471:25] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.doCreateMethodNodeFromCompiled[ValueParameterDescriptorImpl]

'inlineCache' @ [471:31] ==> public final val inlineCache: InlineCache defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'classBytes' @ [471:43] ==> public final val classBytes: SLRUMap<ClassId, ByteArray> defined in org.jetbrains.kotlin.codegen.inline.InlineCache[PropertyDescriptorImpl]

'getOrPut' @ [471:54] ==> public inline fun <K, V> SLRUMap<ClassId, ByteArray>.getOrPut(key: ClassId, defaultValue: () -> ByteArray): ByteArray defined in org.jetbrains.kotlin.codegen.inline[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> ClassId
    <V> -> ByteArray

'containerId' @ [471:63] ==> val containerId: ClassId defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.doCreateMethodNodeFromCompiled[LocalVariableDescriptor]

'findVirtualFile' @ [472:17] ==> internal fun findVirtualFile(state: GenerationState, classId: ClassId): VirtualFile? defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'state' @ [472:33] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.doCreateMethodNodeFromCompiled[ValueParameterDescriptorImpl]

'containerId' @ [472:40] ==> val containerId: ClassId defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.doCreateMethodNodeFromCompiled[LocalVariableDescriptor]

'contentsToByteArray' @ [472:54] ==> @NotNull public abstract fun contentsToByteArray(): ByteArray defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'IllegalStateException' @ [473:23] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'+' @ [473:45] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'containerId' @ [473:85] ==> val containerId: ClassId defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.doCreateMethodNodeFromCompiled[LocalVariableDescriptor]

'getMethodNode' @ [476:30] ==> internal fun getMethodNode(classData: ByteArray, methodName: String, methodDescriptor: String, classType: Type): SMAPAndMethodNode? defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[SimpleFunctionDescriptorImpl]

'bytes' @ [476:44] ==> val bytes: ByteArray defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.doCreateMethodNodeFromCompiled[LocalVariableDescriptor]

'asmMethod' @ [476:51] ==> value-parameter asmMethod: Method defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.doCreateMethodNodeFromCompiled[ValueParameterDescriptorImpl]

'name' @ [476:61] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'asmMethod' @ [476:67] ==> value-parameter asmMethod: Method defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.doCreateMethodNodeFromCompiled[ValueParameterDescriptorImpl]

'descriptor' @ [476:77] ==> public final val Method.descriptor: (String..String?)[MyPropertyDescriptor]

'asmTypeByClassId' @ [476:97] ==> @NotNull public open fun asmTypeByClassId(@NotNull classId: ClassId): Type defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'containerId' @ [476:114] ==> val containerId: ClassId defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.doCreateMethodNodeFromCompiled[LocalVariableDescriptor]

'isLegacySuspendInlineFunction' @ [480:17] ==> public fun isLegacySuspendInlineFunction(descriptor: CallableMemberDescriptor): Boolean defined in org.jetbrains.kotlin.codegen.inline in file LegacyInlineSuspendUtil.kt[SimpleFunctionDescriptorImpl]

'callableDescriptor' @ [480:47] ==> value-parameter callableDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.doCreateMethodNodeFromCompiled[ValueParameterDescriptorImpl]

'insertLegacySuspendInlineMarks' @ [481:17] ==> public fun insertLegacySuspendInlineMarks(node: MethodNode): Unit defined in org.jetbrains.kotlin.codegen.inline in file LegacyInlineSuspendUtil.kt[SimpleFunctionDescriptorImpl]

'methodNode' @ [481:48] ==> val methodNode: SMAPAndMethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.doCreateMethodNodeFromCompiled[LocalVariableDescriptor]

'node' @ [481:59] ==> public final val node: MethodNode defined in org.jetbrains.kotlin.codegen.inline.SMAPAndMethodNode[PropertyDescriptorImpl]

'methodNode' @ [484:20] ==> val methodNode: SMAPAndMethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.doCreateMethodNodeFromCompiled[LocalVariableDescriptor]

'callableDescriptor' @ [488:17] ==> value-parameter callableDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.isBuiltInArrayIntrinsic[ValueParameterDescriptorImpl]

'callableDescriptor' @ [489:24] ==> value-parameter callableDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.isBuiltInArrayIntrinsic[ValueParameterDescriptorImpl]

'name' @ [489:43] ==> public final val CallableMemberDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [489:48] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'name' @ [490:21] ==> val name: String defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.isBuiltInArrayIntrinsic[LocalVariableDescriptor]

'name' @ [490:42] ==> val name: String defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.isBuiltInArrayIntrinsic[LocalVariableDescriptor]

'callableDescriptor' @ [490:67] ==> value-parameter callableDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.isBuiltInArrayIntrinsic[ValueParameterDescriptorImpl]

'containingDeclaration' @ [490:86] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'methodNode' @ [494:28] ==> value-parameter methodNode: MethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.removeStaticInitializationTrigger[ValueParameterDescriptorImpl]

'instructions' @ [494:39] ==> public final var instructions: (InsnList..InsnList?) defined in org.jetbrains.org.objectweb.asm.tree.MethodNode[JavaPropertyDescriptor]

'insnList' @ [495:43] ==> val insnList: (InsnList..InsnList?) defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.removeStaticInitializationTrigger[LocalVariableDescriptor]

'first' @ [495:52] ==> public final val InsnList.first: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'insn' @ [496:20] ==> var insn: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.removeStaticInitializationTrigger[LocalVariableDescriptor]

'if (MultifileClassPartCodegen.isStaticInitTrigger(insn)) {
                    val clinitTriggerCall = insn
                    insn = insn.next
                    insnList.remove(clinitTriggerCall)
                }
                else {
                    insn = insn.next
                }' @ [497:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'MultifileClassPartCodegen' @ [497:21] ==> public companion object defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen[FakeCallableDescriptorForObject]

'isStaticInitTrigger' @ [497:47] ==> @JvmStatic public final fun isStaticInitTrigger(insn: AbstractInsnNode): Boolean defined in org.jetbrains.kotlin.codegen.MultifileClassPartCodegen.Companion[SimpleFunctionDescriptorImpl]

'insn' @ [497:67] ==> var insn: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.removeStaticInitializationTrigger[LocalVariableDescriptor]

'insn' @ [498:45] ==> var insn: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.removeStaticInitializationTrigger[LocalVariableDescriptor]

'insn' @ [499:21] ==> var insn: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.removeStaticInitializationTrigger[LocalVariableDescriptor]

'insn' @ [499:28] ==> var insn: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.removeStaticInitializationTrigger[LocalVariableDescriptor]

'next' @ [499:33] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'insnList' @ [500:21] ==> val insnList: (InsnList..InsnList?) defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.removeStaticInitializationTrigger[LocalVariableDescriptor]

'remove' @ [500:30] ==> public open fun remove(p0: (AbstractInsnNode..AbstractInsnNode?)): Unit defined in org.jetbrains.org.objectweb.asm.tree.InsnList[JavaMethodDescriptor]

'clinitTriggerCall' @ [500:37] ==> val clinitTriggerCall: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.removeStaticInitializationTrigger[LocalVariableDescriptor]

'insn' @ [503:21] ==> var insn: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.removeStaticInitializationTrigger[LocalVariableDescriptor]

'insn' @ [503:28] ==> var insn: AbstractInsnNode? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.removeStaticInitializationTrigger[LocalVariableDescriptor]

'next' @ [503:33] ==> public final val AbstractInsnNode.next: (AbstractInsnNode..AbstractInsnNode?)[MyPropertyDescriptor]

'isPrimitive' @ [513:17] ==> public open fun isPrimitive(type: (Type..Type?)): Boolean defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'type' @ [513:29] ==> value-parameter type: Type defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.shouldPutGeneralValue[ValueParameterDescriptorImpl]

'isPrimitive' @ [513:38] ==> public open fun isPrimitive(type: (Type..Type?)): Boolean defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'stackValue' @ [513:50] ==> value-parameter stackValue: StackValue defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.shouldPutGeneralValue[ValueParameterDescriptorImpl]

'type' @ [513:61] ==> @NotNull public final val type: Type defined in org.jetbrains.kotlin.codegen.StackValue[JavaPropertyDescriptor]

'stackValue' @ [518:17] ==> value-parameter stackValue: StackValue defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.shouldPutGeneralValue[ValueParameterDescriptorImpl]

'stackValue' @ [522:25] ==> value-parameter stackValue: StackValue defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.shouldPutGeneralValue[ValueParameterDescriptorImpl]

'stackValue' @ [523:17] ==> value-parameter stackValue: StackValue defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.shouldPutGeneralValue[ValueParameterDescriptorImpl]

'field' @ [524:17] ==> var field: StackValue defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.shouldPutGeneralValue[LocalVariableDescriptor]

'stackValue' @ [524:25] ==> value-parameter stackValue: StackValue defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.shouldPutGeneralValue[ValueParameterDescriptorImpl]

'receiver' @ [524:36] ==> @NotNull public final val receiver: StackValue defined in org.jetbrains.kotlin.codegen.StackValue.FieldForSharedVar[JavaPropertyDescriptor]

'field' @ [528:17] ==> var field: StackValue defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.shouldPutGeneralValue[LocalVariableDescriptor]

'field' @ [529:37] ==> var field: StackValue defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.shouldPutGeneralValue[LocalVariableDescriptor]

'descriptor' @ [529:43] ==> public final val descriptor: (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.codegen.StackValue.Field[JavaPropertyDescriptor]

'!' @ [531:24] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'varDescriptor' @ [531:26] ==> val varDescriptor: (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.shouldPutGeneralValue[LocalVariableDescriptor]

'isInlineParameter' @ [532:37] ==> public open fun isInlineParameter(@NotNull p0: ParameterDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineUtil[JavaMethodDescriptor]

'varDescriptor' @ [532:55] ==> val varDescriptor: (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.shouldPutGeneralValue[LocalVariableDescriptor]

'isInline' @ [533:37] ==> public open fun isInline(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineUtil[JavaMethodDescriptor]

'varDescriptor' @ [533:46] ==> val varDescriptor: (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.shouldPutGeneralValue[LocalVariableDescriptor]

'containingDeclaration' @ [533:60] ==> public final val ParameterDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'HashSet' @ [541:26] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'lambdaOrFun' @ [543:17] ==> value-parameter lambdaOrFun: PsiElement? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.getDeclarationLabels[ValueParameterDescriptorImpl]

'LabelResolver' @ [544:29] ==> public object LabelResolver defined in org.jetbrains.kotlin.types.expressions[FakeCallableDescriptorForObject]

'getLabelNameIfAny' @ [544:43] ==> public final fun getLabelNameIfAny(element: PsiElement): Name? defined in org.jetbrains.kotlin.types.expressions.LabelResolver[DeserializedSimpleFunctionDescriptor]

'lambdaOrFun' @ [544:61] ==> value-parameter lambdaOrFun: PsiElement? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.getDeclarationLabels[ValueParameterDescriptorImpl]

'label' @ [545:21] ==> val label: Name? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.getDeclarationLabels[LocalVariableDescriptor]

'result' @ [546:21] ==> val result: HashSet<String> defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.getDeclarationLabels[LocalVariableDescriptor]

'add' @ [546:28] ==> public open fun add(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'label' @ [546:32] ==> val label: Name? defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.getDeclarationLabels[LocalVariableDescriptor]

'asString' @ [546:38] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'!' @ [550:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isFunctionLiteral' @ [550:18] ==> public open fun isFunctionLiteral(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingUtils[JavaMethodDescriptor]

'descriptor' @ [550:36] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.getDeclarationLabels[ValueParameterDescriptorImpl]

'!' @ [551:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [551:22] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.getDeclarationLabels[ValueParameterDescriptorImpl]

'name' @ [551:33] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'isSpecial' @ [551:38] ==> public final val Name.isSpecial: Boolean[MyPropertyDescriptor]

'result' @ [552:21] ==> val result: HashSet<String> defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.getDeclarationLabels[LocalVariableDescriptor]

'add' @ [552:28] ==> public open fun add(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'descriptor' @ [552:32] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.getDeclarationLabels[ValueParameterDescriptorImpl]

'name' @ [552:43] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [552:48] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'result' @ [554:17] ==> val result: HashSet<String> defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.getDeclarationLabels[LocalVariableDescriptor]

'add' @ [554:24] ==> public open fun add(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'FIRST_FUN_LABEL' @ [554:28] ==> internal const val FIRST_FUN_LABEL: String defined in org.jetbrains.kotlin.codegen.inline in file inlineCodegenUtils.kt[PropertyDescriptorImpl]

'result' @ [556:20] ==> val result: HashSet<String> defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.getDeclarationLabels[LocalVariableDescriptor]

'NestedSourceMapper' @ [561:20] ==> public constructor NestedSourceMapper(parent: SourceMapper, ranges: List<RangeMapping>, sourceInfo: SourceInfo) defined in org.jetbrains.kotlin.codegen.inline.NestedSourceMapper[ClassConstructorDescriptorImpl]

'parent' @ [561:39] ==> value-parameter parent: SourceMapper defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.createNestedSourceMapper[ValueParameterDescriptorImpl]

'nodeAndSmap' @ [561:47] ==> value-parameter nodeAndSmap: SMAPAndMethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.createNestedSourceMapper[ValueParameterDescriptorImpl]

'sortedRanges' @ [561:59] ==> public final val sortedRanges: List<RangeMapping> defined in org.jetbrains.kotlin.codegen.inline.SMAPAndMethodNode[PropertyDescriptorImpl]

'nodeAndSmap' @ [561:73] ==> value-parameter nodeAndSmap: SMAPAndMethodNode defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen.Companion.createNestedSourceMapper[ValueParameterDescriptorImpl]

'classSMAP' @ [561:85] ==> public final val classSMAP: SMAP defined in org.jetbrains.kotlin.codegen.inline.SMAPAndMethodNode[PropertyDescriptorImpl]

'sourceInfo' @ [561:95] ==> public final val sourceInfo: SourceInfo defined in org.jetbrains.kotlin.codegen.inline.SMAP[PropertyDescriptorImpl]

'visitor' @ [567:13] ==> public abstract val visitor: InstructionAdapter defined in org.jetbrains.kotlin.codegen.BaseExpressionCodegen[PropertyDescriptorImpl]

'InlineCodegen<ExpressionCodegen>' @ [575:5] ==> public constructor InlineCodegen<out T : BaseExpressionCodegen>(codegen: ExpressionCodegen, state: GenerationState, function: FunctionDescriptor, typeParameterMappings: TypeParameterMappings, sourceCompiler: SourceCompilerForInline) defined in org.jetbrains.kotlin.codegen.inline.InlineCodegen[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : BaseExpressionCodegen> -> ExpressionCodegen

'codegen' @ [575:38] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.<init>[ValueParameterDescriptorImpl]

'state' @ [575:47] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.<init>[ValueParameterDescriptorImpl]

'function' @ [575:54] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.<init>[ValueParameterDescriptorImpl]

'typeParameterMappings' @ [575:64] ==> value-parameter typeParameterMappings: TypeParameterMappings defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.<init>[ValueParameterDescriptorImpl]

'sourceCompiler' @ [575:87] ==> value-parameter sourceCompiler: SourceCompilerForInline defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.<init>[ValueParameterDescriptorImpl]

'performInline' @ [583:8] ==> public final fun performInline(resolvedCall: ResolvedCall<*>?, callDefault: Boolean, codegen: BaseExpressionCodegen): Unit defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [583:22] ==> value-parameter resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.genCallInner[ValueParameterDescriptorImpl]

'callDefault' @ [583:36] ==> value-parameter callDefault: Boolean defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.genCallInner[ValueParameterDescriptorImpl]

'codegen' @ [583:49] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.genCallInner[ValueParameterDescriptorImpl]

'getMethodAsmFlags' @ [587:13] ==> public open fun getMethodAsmFlags(functionDescriptor: (FunctionDescriptor..FunctionDescriptor?), kind: (OwnerKind..OwnerKind?), state: (GenerationState..GenerationState?)): Int defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'functionDescriptor' @ [587:31] ==> protected final val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen[PropertyDescriptorImpl]

'sourceCompiler' @ [587:51] ==> protected final val sourceCompiler: SourceCompilerForInline defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen[PropertyDescriptorImpl]

'contextKind' @ [587:66] ==> public abstract val contextKind: OwnerKind defined in org.jetbrains.kotlin.codegen.inline.SourceCompilerForInline[PropertyDescriptorImpl]

'state' @ [587:79] ==> protected final val state: GenerationState defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen[PropertyDescriptorImpl]

'ACC_STATIC' @ [587:98] ==> public const final val ACC_STATIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'invocationParamBuilder' @ [588:13] ==> protected final val invocationParamBuilder: ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen[PropertyDescriptorImpl]

'addNextParameter' @ [588:36] ==> public final fun addNextParameter(type: Type, skipped: Boolean): ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[SimpleFunctionDescriptorImpl]

'OBJECT_TYPE' @ [588:62] ==> public final val OBJECT_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'jvmSignature' @ [591:23] ==> protected final val jvmSignature: JvmMethodGenericSignature defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen[PropertyDescriptorImpl]

'valueParameters' @ [591:36] ==> public final val JvmMethodGenericSignature.valueParameters: (MutableList<(JvmMethodParameterSignature..JvmMethodParameterSignature?)>..List<(JvmMethodParameterSignature..JvmMethodParameterSignature?)>)[MyPropertyDescriptor]

'param' @ [592:17] ==> val param: (JvmMethodParameterSignature..JvmMethodParameterSignature?) defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.processAndPutHiddenParameters[LocalVariableDescriptor]

'kind' @ [592:23] ==> public final val JvmMethodParameterSignature.kind: JvmMethodParameterKind[MyPropertyDescriptor]

'VALUE' @ [592:54] ==> enum entry VALUE defined in org.jetbrains.kotlin.resolve.jvm.jvmSignature.JvmMethodParameterKind[FakeCallableDescriptorForObject]

'invocationParamBuilder' @ [595:13] ==> protected final val invocationParamBuilder: ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen[PropertyDescriptorImpl]

'addNextParameter' @ [595:36] ==> public final fun addNextParameter(type: Type, skipped: Boolean): ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[SimpleFunctionDescriptorImpl]

'param' @ [595:53] ==> val param: (JvmMethodParameterSignature..JvmMethodParameterSignature?) defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.processAndPutHiddenParameters[LocalVariableDescriptor]

'asmType' @ [595:59] ==> public final val JvmMethodParameterSignature.asmType: Type[MyPropertyDescriptor]

'invocationParamBuilder' @ [598:9] ==> protected final val invocationParamBuilder: ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen[PropertyDescriptorImpl]

'markValueParametersStart' @ [598:32] ==> public final fun markValueParametersStart(): Unit defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[SimpleFunctionDescriptorImpl]

'invocationParamBuilder' @ [599:32] ==> protected final val invocationParamBuilder: ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen[PropertyDescriptorImpl]

'buildParameters' @ [599:55] ==> public final fun buildParameters(): Parameters defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[SimpleFunctionDescriptorImpl]

'parameters' @ [599:73] ==> public final val parameters: List<ParameterInfo> defined in org.jetbrains.kotlin.codegen.inline.Parameters[PropertyDescriptorImpl]

'delayedHiddenWriting' @ [601:9] ==> protected final var delayedHiddenWriting: (() -> Unit)? defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen[PropertyDescriptorImpl]

'recordParameterValueInLocalVal' @ [601:32] ==> protected final fun recordParameterValueInLocalVal(delayedWritingToLocals: Boolean, skipStore: Boolean, vararg infos: ParameterInfo): (() -> Unit)? defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen[SimpleFunctionDescriptorImpl]

'justProcess' @ [601:63] ==> value-parameter justProcess: Boolean defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.processAndPutHiddenParameters[ValueParameterDescriptorImpl]

'hiddenParameters' @ [601:84] ==> val hiddenParameters: List<ParameterInfo> defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.processAndPutHiddenParameters[LocalVariableDescriptor]

'toTypedArray' @ [601:101] ==> public inline fun <reified T> Collection<ParameterInfo>.toTypedArray(): Array<ParameterInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> ParameterInfo

'activeLambda' @ [605:9] ==> protected final var activeLambda: LambdaInfo? defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen[PropertyDescriptorImpl]

'next' @ [605:24] ==> value-parameter next: LambdaInfo defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.putClosureParametersOnStack[ValueParameterDescriptorImpl]

'when (next) {
            is ExpressionLambda -> codegen.pushClosureOnStack(next.classDescriptor, true, this, functionReferenceReceiver)
            is DefaultLambda -> rememberCapturedForDefaultLambda(next)
            else -> throw RuntimeException("Unknown lambda: $next")
        }' @ [606:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'next' @ [606:15] ==> value-parameter next: LambdaInfo defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.putClosureParametersOnStack[ValueParameterDescriptorImpl]

'codegen' @ [607:36] ==> protected final val codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen[PropertyDescriptorImpl]

'pushClosureOnStack' @ [607:44] ==> public open fun pushClosureOnStack(@NotNull classDescriptor: ClassDescriptor, putThis: Boolean, @NotNull callGenerator: CallGenerator, @Nullable functionReferenceReceiver: StackValue?): Unit defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaMethodDescriptor]

'next' @ [607:63] ==> value-parameter next: LambdaInfo defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.putClosureParametersOnStack[ValueParameterDescriptorImpl]

'classDescriptor' @ [607:68] ==> public final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.codegen.inline.ExpressionLambda[PropertyDescriptorImpl]

'this' @ [607:91] ==> <this> defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen[LazyClassReceiverParameterDescriptor]

'functionReferenceReceiver' @ [607:97] ==> value-parameter functionReferenceReceiver: StackValue? defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.putClosureParametersOnStack[ValueParameterDescriptorImpl]

'rememberCapturedForDefaultLambda' @ [608:33] ==> protected final fun rememberCapturedForDefaultLambda(defaultLambda: DefaultLambda): Unit defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen[SimpleFunctionDescriptorImpl]

'next' @ [608:66] ==> value-parameter next: LambdaInfo defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.putClosureParametersOnStack[ValueParameterDescriptorImpl]

'RuntimeException' @ [609:27] ==> public final fun <init>(p0: (String..String?)): RuntimeException /* = RuntimeException */ defined in kotlin.RuntimeException[TypeAliasConstructorDescriptorImpl]

'next' @ [609:62] ==> value-parameter next: LambdaInfo defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.putClosureParametersOnStack[ValueParameterDescriptorImpl]

'activeLambda' @ [611:9] ==> protected final var activeLambda: LambdaInfo? defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen[PropertyDescriptorImpl]

'deparenthesize' @ [618:41] ==> @Nullable public open fun deparenthesize(@Nullable p0: KtExpression?): KtExpression? defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'argumentExpression' @ [618:56] ==> value-parameter argumentExpression: KtExpression defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.getBoundCallableReferenceReceiver[ValueParameterDescriptorImpl]

'deparenthesized' @ [619:13] ==> val deparenthesized: KtExpression? defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.getBoundCallableReferenceReceiver[LocalVariableDescriptor]

'deparenthesized' @ [620:38] ==> val deparenthesized: KtExpression? defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.getBoundCallableReferenceReceiver[LocalVariableDescriptor]

'receiverExpression' @ [620:54] ==> public final val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtCallableReferenceExpression[DeserializedPropertyDescriptor]

'receiverExpression' @ [621:17] ==> val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.getBoundCallableReferenceReceiver[LocalVariableDescriptor]

'state' @ [622:27] ==> protected final val state: GenerationState defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen[PropertyDescriptorImpl]

'bindingContext' @ [622:33] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'get' @ [622:48] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>..ReadOnlySlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>?), p1: (KtExpression..KtExpression?)): DoubleColonLHS? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.types.expressions.DoubleColonLHS..org.jetbrains.kotlin.types.expressions.DoubleColonLHS?)

'DOUBLE_COLON_LHS' @ [622:67] ==> public final val DOUBLE_COLON_LHS: (WritableSlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>..WritableSlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'receiverExpression' @ [622:85] ==> val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.getBoundCallableReferenceReceiver[LocalVariableDescriptor]

'lhs' @ [623:21] ==> val lhs: DoubleColonLHS? defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.getBoundCallableReferenceReceiver[LocalVariableDescriptor]

'receiverExpression' @ [623:62] ==> val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.getBoundCallableReferenceReceiver[LocalVariableDescriptor]

'deparenthesize' @ [632:41] ==> @Nullable public open fun deparenthesize(@Nullable p0: KtExpression?): KtExpression? defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'expression' @ [632:56] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.isInliningParameter[ValueParameterDescriptorImpl]

'isInlineParameter' @ [634:27] ==> public open fun isInlineParameter(@NotNull p0: ParameterDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineUtil[JavaMethodDescriptor]

'valueParameterDescriptor' @ [634:45] ==> value-parameter valueParameterDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.isInliningParameter[ValueParameterDescriptorImpl]

'isInlinableParameterExpression' @ [634:74] ==> public open fun isInlinableParameterExpression(@Nullable p0: KtExpression?): Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineUtil[JavaMethodDescriptor]

'deparenthesized' @ [634:105] ==> val deparenthesized: KtExpression? defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.isInliningParameter[LocalVariableDescriptor]

'if (isInliningParameter(argumentExpression, valueParameterDescriptor)) {
            val lambdaInfo = rememberClosure(argumentExpression, parameterType, valueParameterDescriptor)

            val receiver = getBoundCallableReferenceReceiver(argumentExpression)
            if (receiver != null) {
                val receiverValue = codegen.gen(receiver)
                putClosureParametersOnStack(lambdaInfo, StackValue.coercion(receiverValue, receiverValue.type.boxReceiverForBoundReference()))
            }
        }
        else {
            val value = codegen.gen(argumentExpression)
            putValueIfNeeded(parameterType, value, ValueKind.GENERAL, valueParameterDescriptor.index)
        }' @ [643:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isInliningParameter' @ [643:13] ==> private final fun isInliningParameter(expression: KtExpression, valueParameterDescriptor: ValueParameterDescriptor): Boolean defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen[SimpleFunctionDescriptorImpl]

'argumentExpression' @ [643:33] ==> value-parameter argumentExpression: KtExpression defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.genValueAndPut[ValueParameterDescriptorImpl]

'valueParameterDescriptor' @ [643:53] ==> value-parameter valueParameterDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.genValueAndPut[ValueParameterDescriptorImpl]

'rememberClosure' @ [644:30] ==> private final fun rememberClosure(expression: KtExpression, type: Type, parameter: ValueParameterDescriptor): LambdaInfo defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen[SimpleFunctionDescriptorImpl]

'argumentExpression' @ [644:46] ==> value-parameter argumentExpression: KtExpression defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.genValueAndPut[ValueParameterDescriptorImpl]

'parameterType' @ [644:66] ==> value-parameter parameterType: Type defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.genValueAndPut[ValueParameterDescriptorImpl]

'valueParameterDescriptor' @ [644:81] ==> value-parameter valueParameterDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.genValueAndPut[ValueParameterDescriptorImpl]

'getBoundCallableReferenceReceiver' @ [646:28] ==> private final fun getBoundCallableReferenceReceiver(argumentExpression: KtExpression): KtExpression? defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen[SimpleFunctionDescriptorImpl]

'argumentExpression' @ [646:62] ==> value-parameter argumentExpression: KtExpression defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.genValueAndPut[ValueParameterDescriptorImpl]

'receiver' @ [647:17] ==> val receiver: KtExpression? defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.genValueAndPut[LocalVariableDescriptor]

'codegen' @ [648:37] ==> protected final val codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen[PropertyDescriptorImpl]

'gen' @ [648:45] ==> public open fun gen(expr: (KtElement..KtElement?)): (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaMethodDescriptor]

'receiver' @ [648:49] ==> val receiver: KtExpression? defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.genValueAndPut[LocalVariableDescriptor]

'putClosureParametersOnStack' @ [649:17] ==> protected open fun putClosureParametersOnStack(next: LambdaInfo, functionReferenceReceiver: StackValue?): Unit defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen[SimpleFunctionDescriptorImpl]

'lambdaInfo' @ [649:45] ==> val lambdaInfo: LambdaInfo defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.genValueAndPut[LocalVariableDescriptor]

'coercion' @ [649:68] ==> public open fun coercion(@NotNull value: StackValue, @NotNull castType: Type): (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'receiverValue' @ [649:77] ==> val receiverValue: (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.genValueAndPut[LocalVariableDescriptor]

'receiverValue' @ [649:92] ==> val receiverValue: (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.genValueAndPut[LocalVariableDescriptor]

'type' @ [649:106] ==> @NotNull public final val type: Type defined in org.jetbrains.kotlin.codegen.StackValue[JavaPropertyDescriptor]

'boxReceiverForBoundReference' @ [649:111] ==> public fun Type.boxReceiverForBoundReference(): Type defined in org.jetbrains.kotlin.codegen.inline in file LambdaInfo.kt[SimpleFunctionDescriptorImpl]

'codegen' @ [653:25] ==> protected final val codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen[PropertyDescriptorImpl]

'gen' @ [653:33] ==> public open fun gen(expr: (KtElement..KtElement?)): (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaMethodDescriptor]

'argumentExpression' @ [653:37] ==> value-parameter argumentExpression: KtExpression defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.genValueAndPut[ValueParameterDescriptorImpl]

'putValueIfNeeded' @ [654:13] ==> public open fun putValueIfNeeded(parameterType: Type, value: StackValue, kind: ValueKind, parameterIndex: Int): Unit defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen[SimpleFunctionDescriptorImpl]

'parameterType' @ [654:30] ==> value-parameter parameterType: Type defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.genValueAndPut[ValueParameterDescriptorImpl]

'value' @ [654:45] ==> val value: (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.genValueAndPut[LocalVariableDescriptor]

'GENERAL' @ [654:62] ==> enum entry GENERAL defined in org.jetbrains.kotlin.codegen.ValueKind[FakeCallableDescriptorForObject]

'valueParameterDescriptor' @ [654:71] ==> value-parameter valueParameterDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.genValueAndPut[ValueParameterDescriptorImpl]

'index' @ [654:96] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'deparenthesize' @ [659:34] ==> @Nullable public open fun deparenthesize(@Nullable p0: KtExpression?): KtExpression? defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'expression' @ [659:49] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.rememberClosure[ValueParameterDescriptorImpl]

'assert' @ [660:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'isInlinableParameterExpression' @ [660:16] ==> public open fun isInlinableParameterExpression(@Nullable p0: KtExpression?): Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineUtil[JavaMethodDescriptor]

'ktLambda' @ [660:47] ==> val ktLambda: KtExpression? defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.rememberClosure[LocalVariableDescriptor]

'expression' @ [660:98] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.rememberClosure[ValueParameterDescriptorImpl]

'text' @ [660:109] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'ExpressionLambda' @ [662:16] ==> public constructor ExpressionLambda(expression: KtExpression, typeMapper: KotlinTypeMapper, isCrossInline: Boolean, isBoundCallableReference: Boolean) defined in org.jetbrains.kotlin.codegen.inline.ExpressionLambda[ClassConstructorDescriptorImpl]

'ktLambda' @ [663:17] ==> val ktLambda: KtExpression? defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.rememberClosure[LocalVariableDescriptor]

'typeMapper' @ [663:29] ==> protected final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen[PropertyDescriptorImpl]

'parameter' @ [663:41] ==> value-parameter parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.rememberClosure[ValueParameterDescriptorImpl]

'isCrossinline' @ [663:51] ==> public abstract val isCrossinline: Boolean defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'getBoundCallableReferenceReceiver' @ [663:66] ==> private final fun getBoundCallableReferenceReceiver(argumentExpression: KtExpression): KtExpression? defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen[SimpleFunctionDescriptorImpl]

'expression' @ [663:100] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.rememberClosure[ValueParameterDescriptorImpl]

'also' @ [664:11] ==> @InlineOnly @SinceKotlin public inline fun <T> ExpressionLambda.also(block: (ExpressionLambda) -> Unit): ExpressionLambda defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpressionLambda

'invocationParamBuilder' @ [665:31] ==> protected final val invocationParamBuilder: ParametersBuilder defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen[PropertyDescriptorImpl]

'addNextValueParameter' @ [665:54] ==> public final fun addNextValueParameter(type: Type, skipped: Boolean, remapValue: StackValue?, parameterIndex: Int): ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.ParametersBuilder[SimpleFunctionDescriptorImpl]

'type' @ [665:76] ==> value-parameter type: Type defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.rememberClosure[ValueParameterDescriptorImpl]

'parameter' @ [665:94] ==> value-parameter parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.rememberClosure[ValueParameterDescriptorImpl]

'index' @ [665:104] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'closureInfo' @ [666:13] ==> val closureInfo: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.rememberClosure.<anonymous>[LocalVariableDescriptor]

'lambda' @ [666:25] ==> public final var ParameterInfo.lambda: LambdaInfo?[MyPropertyDescriptor]

'lambda' @ [666:34] ==> value-parameter lambda: ExpressionLambda defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.rememberClosure.<anonymous>[ValueParameterDescriptorImpl]

'expressionMap' @ [667:13] ==> protected final val expressionMap: LinkedHashMap<Int, LambdaInfo> /* = LinkedHashMap<Int, LambdaInfo> */ defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen[PropertyDescriptorImpl]

'put' @ [667:27] ==> public open fun put(key: Int, value: LambdaInfo): LambdaInfo? defined in java.util.LinkedHashMap[JavaMethodDescriptor]

'closureInfo' @ [667:31] ==> val closureInfo: ParameterInfo defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.rememberClosure.<anonymous>[LocalVariableDescriptor]

'index' @ [667:43] ==> public final val ParameterInfo.index: Int[MyPropertyDescriptor]

'lambda' @ [667:50] ==> value-parameter lambda: ExpressionLambda defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.rememberClosure.<anonymous>[ValueParameterDescriptorImpl]

'processDefaultMaskOrMethodHandler' @ [672:13] ==> protected final fun processDefaultMaskOrMethodHandler(value: StackValue, kind: ValueKind): Boolean defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen[SimpleFunctionDescriptorImpl]

'value' @ [672:47] ==> value-parameter value: StackValue defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.putValueIfNeeded[ValueParameterDescriptorImpl]

'kind' @ [672:54] ==> value-parameter kind: ValueKind defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.putValueIfNeeded[ValueParameterDescriptorImpl]

'assert' @ [674:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'maskValues' @ [674:16] ==> protected final val maskValues: ArrayList<Int> defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen[PropertyDescriptorImpl]

'isEmpty' @ [674:27] ==> public open fun isEmpty(): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'+' @ [674:40] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'value' @ [674:104] ==> value-parameter value: StackValue defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.putValueIfNeeded[ValueParameterDescriptorImpl]

'putArgumentOrCapturedToLocalVal' @ [676:9] ==> protected final fun putArgumentOrCapturedToLocalVal(type: Type, stackValue: StackValue, capturedParamIndex: Int, parameterIndex: Int, kind: ValueKind): Unit defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen[SimpleFunctionDescriptorImpl]

'parameterType' @ [676:41] ==> value-parameter parameterType: Type defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.putValueIfNeeded[ValueParameterDescriptorImpl]

'value' @ [676:56] ==> value-parameter value: StackValue defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.putValueIfNeeded[ValueParameterDescriptorImpl]

'-' @ [676:63] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'parameterIndex' @ [676:67] ==> value-parameter parameterIndex: Int defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.putValueIfNeeded[ValueParameterDescriptorImpl]

'kind' @ [676:83] ==> value-parameter kind: ValueKind defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.putValueIfNeeded[ValueParameterDescriptorImpl]

'putArgumentOrCapturedToLocalVal' @ [680:9] ==> protected final fun putArgumentOrCapturedToLocalVal(type: Type, stackValue: StackValue, capturedParamIndex: Int, parameterIndex: Int, kind: ValueKind): Unit defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen[SimpleFunctionDescriptorImpl]

'stackValue' @ [680:41] ==> value-parameter stackValue: StackValue defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.putCapturedValueOnStack[ValueParameterDescriptorImpl]

'type' @ [680:52] ==> @NotNull public final val type: Type defined in org.jetbrains.kotlin.codegen.StackValue[JavaPropertyDescriptor]

'stackValue' @ [680:58] ==> value-parameter stackValue: StackValue defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.putCapturedValueOnStack[ValueParameterDescriptorImpl]

'paramIndex' @ [680:70] ==> value-parameter paramIndex: Int defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.putCapturedValueOnStack[ValueParameterDescriptorImpl]

'paramIndex' @ [680:82] ==> value-parameter paramIndex: Int defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen.putCapturedValueOnStack[ValueParameterDescriptorImpl]

'CAPTURED' @ [680:104] ==> enum entry CAPTURED defined in org.jetbrains.kotlin.codegen.ValueKind[FakeCallableDescriptorForObject]

'Unit' @ [683:131] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'assert' @ [686:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'delayedHiddenWriting' @ [686:16] ==> protected final var delayedHiddenWriting: (() -> Unit)? defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen[PropertyDescriptorImpl]

'delayedHiddenWriting' @ [687:9] ==> protected final var delayedHiddenWriting: (() -> Unit)? defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen[PropertyDescriptorImpl]

'invoke' @ [687:32] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'delayedHiddenWriting' @ [688:9] ==> protected final var delayedHiddenWriting: (() -> Unit)? defined in org.jetbrains.kotlin.codegen.inline.PsiInlineCodegen[PropertyDescriptorImpl]

