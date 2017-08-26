'lazy' @ [70:44] ==> public fun <T> lazy(initializer: () -> PseudocodeVariablesData): Lazy<PseudocodeVariablesData> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PseudocodeVariablesData

'PseudocodeVariablesData' @ [71:9] ==> public constructor PseudocodeVariablesData(pseudocode: Pseudocode, bindingContext: BindingContext) defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData[ClassConstructorDescriptorImpl]

'pseudocode' @ [71:33] ==> private final val pseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'trace' @ [71:45] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'bindingContext' @ [71:51] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'this' @ [75:7] ==> private constructor ControlFlowInformationProvider(subroutine: KtElement, trace: BindingTrace, pseudocode: Pseudocode, languageVersionSettings: LanguageVersionSettings) defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[ClassConstructorDescriptorImpl]

'declaration' @ [75:12] ==> value-parameter declaration: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.<init>[ValueParameterDescriptorImpl]

'trace' @ [75:25] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.<init>[ValueParameterDescriptorImpl]

'ControlFlowProcessor' @ [75:32] ==> public constructor ControlFlowProcessor(trace: BindingTrace) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[ClassConstructorDescriptorImpl]

'trace' @ [75:53] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.<init>[ValueParameterDescriptorImpl]

'generatePseudocode' @ [75:60] ==> public final fun generatePseudocode(subroutine: KtElement): Pseudocode defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[SimpleFunctionDescriptorImpl]

'declaration' @ [75:79] ==> value-parameter declaration: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.<init>[ValueParameterDescriptorImpl]

'languageVersionSettings' @ [75:93] ==> value-parameter languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.<init>[ValueParameterDescriptorImpl]

'recordInitializedVariables' @ [81:9] ==> private final fun recordInitializedVariables(): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'recordInitializedVariables' @ [86:9] ==> private final fun recordInitializedVariables(): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'checkLocalFunctions' @ [88:9] ==> private final fun checkLocalFunctions(): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'markUninitializedVariables' @ [90:9] ==> private final fun markUninitializedVariables(): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'trace' @ [92:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'wantsDiagnostics' @ [92:19] ==> public abstract fun wantsDiagnostics(): Boolean defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'markUnusedVariables' @ [93:13] ==> private final fun markUnusedVariables(): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'markStatements' @ [96:9] ==> private final fun markStatements(): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'markUnusedExpressions' @ [98:9] ==> private final fun markUnusedExpressions(): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'trace' @ [100:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'wantsDiagnostics' @ [100:19] ==> public abstract fun wantsDiagnostics(): Boolean defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'checkIfExpressions' @ [101:13] ==> private final fun checkIfExpressions(): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'checkWhenExpressions' @ [104:9] ==> private final fun checkWhenExpressions(): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'checkConstructorConsistency' @ [106:9] ==> private final fun checkConstructorConsistency(): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'collectUnreachableCode' @ [110:31] ==> private final fun collectUnreachableCode(): UnreachableCode defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'reportUnreachableCode' @ [111:9] ==> private final fun reportUnreachableCode(unreachableCode: UnreachableCode): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'unreachableCode' @ [111:31] ==> val unreachableCode: UnreachableCode defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkFunction[LocalVariableDescriptor]

'subroutine' @ [113:13] ==> private final val subroutine: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'checkDefiniteReturn' @ [115:9] ==> private final fun checkDefiniteReturn(expectedReturnType: KotlinType, unreachableCode: UnreachableCode): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'expectedReturnType' @ [115:29] ==> value-parameter expectedReturnType: KotlinType? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkFunction[ValueParameterDescriptorImpl]

'NO_EXPECTED_TYPE' @ [115:51] ==> @NotNull public final val NO_EXPECTED_TYPE: SimpleType defined in org.jetbrains.kotlin.types.TypeUtils[JavaPropertyDescriptor]

'unreachableCode' @ [115:69] ==> val unreachableCode: UnreachableCode defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkFunction[LocalVariableDescriptor]

'markAndCheckTailCalls' @ [117:9] ==> private final fun markAndCheckTailCalls(): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'pseudocode' @ [121:28] ==> private final val pseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'instructions' @ [121:39] ==> public abstract val instructions: List<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocode.Pseudocode[PropertyDescriptorImpl]

'toHashSet' @ [121:52] ==> public fun <T> Iterable<Instruction>.toHashSet(): HashSet<Instruction> /* = HashSet<Instruction> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Instruction

'pseudocode' @ [122:31] ==> private final val pseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'exitInstruction' @ [122:42] ==> public abstract val exitInstruction: SubroutineExitInstruction defined in org.jetbrains.kotlin.cfg.pseudocode.Pseudocode[PropertyDescriptorImpl]

'exitInstruction' @ [123:37] ==> val exitInstruction: SubroutineExitInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectReturnExpressions[LocalVariableDescriptor]

'previousInstructions' @ [123:53] ==> public open val previousInstructions: MutableCollection<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.SubroutineExitInstruction[PropertyDescriptorImpl]

'previousInstruction' @ [124:13] ==> val previousInstruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectReturnExpressions[LocalVariableDescriptor]

'accept' @ [124:33] ==> public abstract fun accept(visitor: InstructionVisitor): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.Instruction[SimpleFunctionDescriptorImpl]

'InstructionVisitor' @ [124:49] ==> public constructor InstructionVisitor() defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.InstructionVisitor[ClassConstructorDescriptorImpl]

'instructions' @ [126:25] ==> val instructions: HashSet<Instruction> /* = HashSet<Instruction> */ defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectReturnExpressions[LocalVariableDescriptor]

'contains' @ [126:38] ==> public open fun contains(element: Instruction): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'instruction' @ [126:47] ==> value-parameter instruction: ReturnValueInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectReturnExpressions.<no name provided>.visitReturnValue[ValueParameterDescriptorImpl]

'returnedExpressions' @ [127:25] ==> value-parameter returnedExpressions: MutableCollection<KtElement> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectReturnExpressions[ValueParameterDescriptorImpl]

'add' @ [127:45] ==> public abstract fun add(element: KtElement): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'instruction' @ [127:49] ==> value-parameter instruction: ReturnValueInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectReturnExpressions.<no name provided>.visitReturnValue[ValueParameterDescriptorImpl]

'element' @ [127:61] ==> public open val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.jumps.ReturnValueInstruction[PropertyDescriptorImpl]

'instructions' @ [132:25] ==> val instructions: HashSet<Instruction> /* = HashSet<Instruction> */ defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectReturnExpressions[LocalVariableDescriptor]

'contains' @ [132:38] ==> public open fun contains(element: Instruction): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'instruction' @ [132:47] ==> value-parameter instruction: ReturnNoValueInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectReturnExpressions.<no name provided>.visitReturnNoValue[ValueParameterDescriptorImpl]

'returnedExpressions' @ [133:25] ==> value-parameter returnedExpressions: MutableCollection<KtElement> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectReturnExpressions[ValueParameterDescriptorImpl]

'add' @ [133:45] ==> public abstract fun add(element: KtElement): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'instruction' @ [133:49] ==> value-parameter instruction: ReturnNoValueInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectReturnExpressions.<no name provided>.visitReturnNoValue[ValueParameterDescriptorImpl]

'element' @ [133:61] ==> public open val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.jumps.ReturnNoValueInstruction[PropertyDescriptorImpl]

'redirectToPrevInstructions' @ [143:21] ==> private final fun redirectToPrevInstructions(instruction: Instruction): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectReturnExpressions.<no name provided>[SimpleFunctionDescriptorImpl]

'instruction' @ [143:48] ==> value-parameter instruction: UnconditionalJumpInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectReturnExpressions.<no name provided>.visitUnconditionalJump[ValueParameterDescriptorImpl]

'instruction' @ [147:49] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectReturnExpressions.<no name provided>.redirectToPrevInstructions[ValueParameterDescriptorImpl]

'previousInstructions' @ [147:61] ==> public abstract val previousInstructions: Collection<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.Instruction[PropertyDescriptorImpl]

'redirectInstruction' @ [148:25] ==> val redirectInstruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectReturnExpressions.<no name provided>.redirectToPrevInstructions[LocalVariableDescriptor]

'accept' @ [148:45] ==> public abstract fun accept(visitor: InstructionVisitor): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.Instruction[SimpleFunctionDescriptorImpl]

'this' @ [148:52] ==> <this> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectReturnExpressions.<no name provided>[LazyClassReceiverParameterDescriptor]

'redirectToPrevInstructions' @ [153:21] ==> private final fun redirectToPrevInstructions(instruction: Instruction): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectReturnExpressions.<no name provided>[SimpleFunctionDescriptorImpl]

'instruction' @ [153:48] ==> value-parameter instruction: NondeterministicJumpInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectReturnExpressions.<no name provided>.visitNondeterministicJump[ValueParameterDescriptorImpl]

'redirectToPrevInstructions' @ [157:21] ==> private final fun redirectToPrevInstructions(instruction: Instruction): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectReturnExpressions.<no name provided>[SimpleFunctionDescriptorImpl]

'instruction' @ [157:48] ==> value-parameter instruction: MarkInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectReturnExpressions.<no name provided>.visitMarkInstruction[ValueParameterDescriptorImpl]

'if (instruction is KtElementInstruction) {
                        returnedExpressions.add(instruction.element)
                    }
                    else {
                        throw IllegalStateException("$instruction precedes the exit point")
                    }' @ [161:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'instruction' @ [161:25] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectReturnExpressions.<no name provided>.visitInstruction[ValueParameterDescriptorImpl]

'returnedExpressions' @ [162:25] ==> value-parameter returnedExpressions: MutableCollection<KtElement> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectReturnExpressions[ValueParameterDescriptorImpl]

'add' @ [162:45] ==> public abstract fun add(element: KtElement): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'instruction' @ [162:49] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectReturnExpressions.<no name provided>.visitInstruction[ValueParameterDescriptorImpl]

'element' @ [162:61] ==> public abstract val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.KtElementInstruction[PropertyDescriptorImpl]

'IllegalStateException' @ [165:31] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'instruction' @ [165:55] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectReturnExpressions.<no name provided>.visitInstruction[ValueParameterDescriptorImpl]

'pseudocode' @ [173:45] ==> private final val pseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'localDeclarations' @ [173:56] ==> public abstract val localDeclarations: Set<LocalFunctionDeclarationInstruction> defined in org.jetbrains.kotlin.cfg.pseudocode.Pseudocode[PropertyDescriptorImpl]

'localDeclarationInstruction' @ [174:27] ==> val localDeclarationInstruction: LocalFunctionDeclarationInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkLocalFunctions[LocalVariableDescriptor]

'element' @ [174:55] ==> public open val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.LocalFunctionDeclarationInstruction[PropertyDescriptorImpl]

'element' @ [175:17] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkLocalFunctions[LocalVariableDescriptor]

'trace' @ [177:42] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'bindingContext' @ [177:48] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'get' @ [177:63] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?), key: (PsiElement..PsiElement?)): DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> DeclarationDescriptor

'DECLARATION_TO_DESCRIPTOR' @ [177:82] ==> @SuppressWarnings public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'element' @ [177:109] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkLocalFunctions[LocalVariableDescriptor]

'functionDescriptor' @ [178:36] ==> val functionDescriptor: CallableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkLocalFunctions[LocalVariableDescriptor]

'returnType' @ [178:56] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'ControlFlowInformationProvider' @ [180:51] ==> private constructor ControlFlowInformationProvider(subroutine: KtElement, trace: BindingTrace, pseudocode: Pseudocode, languageVersionSettings: LanguageVersionSettings) defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[ClassConstructorDescriptorImpl]

'element' @ [181:25] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkLocalFunctions[LocalVariableDescriptor]

'trace' @ [181:34] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'localDeclarationInstruction' @ [181:41] ==> val localDeclarationInstruction: LocalFunctionDeclarationInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkLocalFunctions[LocalVariableDescriptor]

'body' @ [181:69] ==> public final val body: Pseudocode defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.LocalFunctionDeclarationInstruction[PropertyDescriptorImpl]

'languageVersionSettings' @ [181:75] ==> private final val languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'providerForLocalDeclaration' @ [183:17] ==> val providerForLocalDeclaration: ControlFlowInformationProvider defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkLocalFunctions[LocalVariableDescriptor]

'checkFunction' @ [183:45] ==> public final fun checkFunction(expectedReturnType: KotlinType?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'expectedType' @ [183:59] ==> val expectedType: KotlinType? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkLocalFunctions[LocalVariableDescriptor]

'subroutine' @ [189:24] ==> private final val subroutine: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'AssertionError' @ [190:33] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'subroutine' @ [190:85] ==> private final val subroutine: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'text' @ [190:96] ==> public final val KtElement.text: (String..String?)[MyPropertyDescriptor]

'!' @ [192:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'function' @ [192:14] ==> val function: KtDeclarationWithBody defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkDefiniteReturn[LocalVariableDescriptor]

'hasBody' @ [192:23] ==> public abstract fun hasBody(): Boolean defined in org.jetbrains.kotlin.psi.KtDeclarationWithBody[JavaMethodDescriptor]

'arrayListOf' @ [194:35] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<KtElement> /* = ArrayList<KtElement> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'collectReturnExpressions' @ [195:9] ==> private final fun collectReturnExpressions(returnedExpressions: MutableCollection<KtElement>): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'returnedExpressions' @ [195:34] ==> val returnedExpressions: ArrayList<KtElement> /* = ArrayList<KtElement> */ defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkDefiniteReturn[LocalVariableDescriptor]

'function' @ [197:25] ==> val function: KtDeclarationWithBody defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkDefiniteReturn[LocalVariableDescriptor]

'hasBlockBody' @ [197:34] ==> public abstract fun hasBlockBody(): Boolean defined in org.jetbrains.kotlin.psi.KtDeclarationWithBody[JavaMethodDescriptor]

'returnedExpressions' @ [200:36] ==> val returnedExpressions: ArrayList<KtElement> /* = ArrayList<KtElement> */ defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkDefiniteReturn[LocalVariableDescriptor]

'returnedExpression' @ [201:13] ==> val returnedExpression: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkDefiniteReturn[LocalVariableDescriptor]

'accept' @ [201:32] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'KtVisitorVoid' @ [201:48] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'!' @ [203:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'blockBody' @ [203:26] ==> val blockBody: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkDefiniteReturn[LocalVariableDescriptor]

'trace' @ [204:25] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'report' @ [204:31] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'RETURN_IN_FUNCTION_WITH_EXPRESSION_BODY' @ [204:38] ==> public final val RETURN_IN_FUNCTION_WITH_EXPRESSION_BODY: (DiagnosticFactory0<(KtReturnExpression..KtReturnExpression?)>..DiagnosticFactory0<(KtReturnExpression..KtReturnExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [204:78] ==> @NotNull public open fun on(@NotNull element: KtReturnExpression): SimpleDiagnostic<(KtReturnExpression..KtReturnExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'expression' @ [204:81] ==> value-parameter expression: KtReturnExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkDefiniteReturn.<no name provided>.visitReturnExpression[ValueParameterDescriptorImpl]

'!' @ [209:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [209:27] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkDefiniteReturn.<no name provided>.visitKtElement[ValueParameterDescriptorImpl]

'element' @ [209:54] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkDefiniteReturn.<no name provided>.visitKtElement[ValueParameterDescriptorImpl]

'blockBody' @ [211:25] ==> val blockBody: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkDefiniteReturn[LocalVariableDescriptor]

'!' @ [211:38] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'noExpectedType' @ [211:39] ==> public open fun noExpectedType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'expectedReturnType' @ [211:54] ==> value-parameter expectedReturnType: KotlinType defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkDefiniteReturn[ValueParameterDescriptorImpl]

'!' @ [212:28] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isUnit' @ [212:44] ==> public open fun isUnit(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'expectedReturnType' @ [212:51] ==> value-parameter expectedReturnType: KotlinType defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkDefiniteReturn[ValueParameterDescriptorImpl]

'!' @ [213:28] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'unreachableCode' @ [213:29] ==> value-parameter unreachableCode: UnreachableCode defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkDefiniteReturn[ValueParameterDescriptorImpl]

'elements' @ [213:45] ==> public abstract val elements: Set<KtElement> defined in org.jetbrains.kotlin.cfg.UnreachableCode[PropertyDescriptorImpl]

'contains' @ [213:54] ==> public abstract fun contains(element: KtElement): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'element' @ [213:63] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkDefiniteReturn.<no name provided>.visitKtElement[ValueParameterDescriptorImpl]

'noReturnError' @ [214:25] ==> var noReturnError: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkDefiniteReturn[LocalVariableDescriptor]

'noReturnError' @ [219:13] ==> var noReturnError: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkDefiniteReturn[LocalVariableDescriptor]

'trace' @ [220:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'report' @ [220:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'NO_RETURN_IN_FUNCTION_WITH_BLOCK_BODY' @ [220:26] ==> public final val NO_RETURN_IN_FUNCTION_WITH_BLOCK_BODY: (DiagnosticFactory0<(KtDeclarationWithBody..KtDeclarationWithBody?)>..DiagnosticFactory0<(KtDeclarationWithBody..KtDeclarationWithBody?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [220:64] ==> @NotNull public open fun on(@NotNull element: KtDeclarationWithBody): SimpleDiagnostic<(KtDeclarationWithBody..KtDeclarationWithBody?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'function' @ [220:67] ==> val function: KtDeclarationWithBody defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkDefiniteReturn[LocalVariableDescriptor]

'unreachableCode' @ [225:25] ==> value-parameter unreachableCode: UnreachableCode defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.reportUnreachableCode[ValueParameterDescriptorImpl]

'elements' @ [225:41] ==> public abstract val elements: Set<KtElement> defined in org.jetbrains.kotlin.cfg.UnreachableCode[PropertyDescriptorImpl]

'trace' @ [226:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'report' @ [226:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'UNREACHABLE_CODE' @ [226:33] ==> public final val UNREACHABLE_CODE: (DiagnosticFactory1<(KtElement..KtElement?), (MutableList<(TextRange..TextRange?)>..List<(TextRange..TextRange?)>?)>..DiagnosticFactory1<(KtElement..KtElement?), (MutableList<(TextRange..TextRange?)>..List<(TextRange..TextRange?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [226:50] ==> @NotNull public open fun on(@NotNull element: KtElement, @NotNull argument: (MutableList<(TextRange..TextRange?)>..List<(TextRange..TextRange?)>)): ParametrizedDiagnostic<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'element' @ [226:53] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.reportUnreachableCode[LocalVariableDescriptor]

'unreachableCode' @ [226:62] ==> value-parameter unreachableCode: UnreachableCode defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.reportUnreachableCode[ValueParameterDescriptorImpl]

'getUnreachableTextRanges' @ [226:78] ==> public abstract fun getUnreachableTextRanges(element: KtElement): List<TextRange> defined in org.jetbrains.kotlin.cfg.UnreachableCode[SimpleFunctionDescriptorImpl]

'element' @ [226:103] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.reportUnreachableCode[LocalVariableDescriptor]

'trace' @ [227:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'record' @ [227:19] ==> public abstract fun <K : (Any..Any?), V : (Any..Any?)> record(slice: (WritableSlice<(KtElement..KtElement?), (Boolean..Boolean?)>..WritableSlice<(KtElement..KtElement?), (Boolean..Boolean?)>?), key: (KtElement..KtElement?), value: (Boolean..Boolean?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtElement
    <V : (Any..Any?)> -> Boolean

'UNREACHABLE_CODE' @ [227:41] ==> public final val UNREACHABLE_CODE: (WritableSlice<(KtElement..KtElement?), (Boolean..Boolean?)>..WritableSlice<(KtElement..KtElement?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'element' @ [227:59] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.reportUnreachableCode[LocalVariableDescriptor]

'hashSetOf' @ [232:33] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<KtElement> /* = HashSet<KtElement> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'hashSetOf' @ [233:35] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<KtElement> /* = HashSet<KtElement> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'pseudocode' @ [234:29] ==> private final val pseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'instructionsIncludingDeadCode' @ [234:40] ==> public abstract val instructionsIncludingDeadCode: List<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocode.Pseudocode[PropertyDescriptorImpl]

'instruction' @ [235:17] ==> val instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectUnreachableCode[LocalVariableDescriptor]

'instruction' @ [236:20] ==> val instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectUnreachableCode[LocalVariableDescriptor]

'instruction' @ [237:20] ==> val instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectUnreachableCode[LocalVariableDescriptor]

'instruction' @ [238:20] ==> val instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectUnreachableCode[LocalVariableDescriptor]

'instruction' @ [238:55] ==> val instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectUnreachableCode[LocalVariableDescriptor]

'synthetic' @ [238:67] ==> public final val synthetic: Boolean defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction[PropertyDescriptorImpl]

'instruction' @ [241:27] ==> val instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectUnreachableCode[LocalVariableDescriptor]

'element' @ [241:39] ==> public abstract val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.KtElementInstruction[PropertyDescriptorImpl]

'instruction' @ [243:17] ==> val instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectUnreachableCode[LocalVariableDescriptor]

'element' @ [244:37] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectUnreachableCode[LocalVariableDescriptor]

'element' @ [245:40] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectUnreachableCode[LocalVariableDescriptor]

'element' @ [246:40] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectUnreachableCode[LocalVariableDescriptor]

'element' @ [247:40] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectUnreachableCode[LocalVariableDescriptor]

'!' @ [248:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isJumpElement' @ [248:22] ==> val isJumpElement: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectUnreachableCode[LocalVariableDescriptor]

'if (instruction.dead) {
                unreachableElements.add(element)
            }
            else {
                reachableElements.add(element)
            }' @ [251:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'instruction' @ [251:17] ==> val instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectUnreachableCode[LocalVariableDescriptor]

'dead' @ [251:29] ==> public abstract val dead: Boolean defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.Instruction[PropertyDescriptorImpl]

'unreachableElements' @ [252:17] ==> val unreachableElements: HashSet<KtElement> /* = HashSet<KtElement> */ defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectUnreachableCode[LocalVariableDescriptor]

'add' @ [252:37] ==> public open fun add(element: KtElement): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'element' @ [252:41] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectUnreachableCode[LocalVariableDescriptor]

'reachableElements' @ [255:17] ==> val reachableElements: HashSet<KtElement> /* = HashSet<KtElement> */ defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectUnreachableCode[LocalVariableDescriptor]

'add' @ [255:35] ==> public open fun add(element: KtElement): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'element' @ [255:39] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectUnreachableCode[LocalVariableDescriptor]

'UnreachableCodeImpl' @ [258:16] ==> public constructor UnreachableCodeImpl(reachableElements: Set<KtElement>, unreachableElements: Set<KtElement>) defined in org.jetbrains.kotlin.cfg.UnreachableCodeImpl[ClassConstructorDescriptorImpl]

'reachableElements' @ [258:36] ==> val reachableElements: HashSet<KtElement> /* = HashSet<KtElement> */ defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectUnreachableCode[LocalVariableDescriptor]

'unreachableElements' @ [258:55] ==> val unreachableElements: HashSet<KtElement> /* = HashSet<KtElement> */ defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.collectUnreachableCode[LocalVariableDescriptor]

'hashSetOf' @ [265:50] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<VariableDescriptor> /* = HashSet<VariableDescriptor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableDescriptor

'hashSetOf' @ [266:48] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<VariableDescriptor> /* = HashSet<VariableDescriptor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableDescriptor

'subroutine' @ [267:36] ==> private final val subroutine: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'pseudocodeVariablesData' @ [269:28] ==> private final val pseudocodeVariablesData: PseudocodeVariablesData defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'variableInitializers' @ [269:52] ==> public final val variableInitializers: Map<Instruction, Edges<InitControlFlowInfo>> defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData[PropertyDescriptorImpl]

'pseudocodeVariablesData' @ [270:33] ==> private final val pseudocodeVariablesData: PseudocodeVariablesData defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'getDeclaredVariables' @ [270:57] ==> public final fun getDeclaredVariables(pseudocode: Pseudocode, includeInsideLocalDeclarations: Boolean): Set<VariableDescriptor> defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData[SimpleFunctionDescriptorImpl]

'pseudocode' @ [270:78] ==> private final val pseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'pseudocodeVariablesData' @ [271:38] ==> private final val pseudocodeVariablesData: PseudocodeVariablesData defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'blockScopeVariableInfo' @ [271:62] ==> public final val blockScopeVariableInfo: BlockScopeVariableInfo defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData[PropertyDescriptorImpl]

'hashMapOf' @ [273:37] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<Instruction, DiagnosticFactory<*>> /* = HashMap<Instruction, DiagnosticFactory<*>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Instruction
    <V> -> DiagnosticFactory<*>

'pseudocode' @ [275:9] ==> private final val pseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'traverse' @ [275:20] ==> public fun <D> Pseudocode.traverse(traversalOrder: TraversalOrder, edgesMap: Map<Instruction, Edges<InitControlFlowInfo>>, analyzeInstruction: (Instruction, InitControlFlowInfo, InitControlFlowInfo) -> Unit): Unit defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser[SimpleFunctionDescriptorImpl]
Inferred types:
    <D> -> InitControlFlowInfo

'FORWARD' @ [275:44] ==> enum entry FORWARD defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.TraversalOrder[FakeCallableDescriptorForObject]

'initializers' @ [275:53] ==> val initializers: Map<Instruction, Edges<InitControlFlowInfo>> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUninitializedVariables[LocalVariableDescriptor]

'VariableInitContext' @ [280:24] ==> public constructor VariableInitContext(instruction: Instruction, map: MutableMap<Instruction, DiagnosticFactory<*>>, `in`: ImmutableMap<VariableDescriptor, VariableControlFlowState> /* = Map<VariableDescriptor, VariableControlFlowState> */, out: ImmutableMap<VariableDescriptor, VariableControlFlowState> /* = Map<VariableDescriptor, VariableControlFlowState> */, blockScopeVariableInfo: BlockScopeVariableInfo) defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableInitContext[ClassConstructorDescriptorImpl]

'instruction' @ [280:44] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUninitializedVariables.<anonymous>[ValueParameterDescriptorImpl]

'reportedDiagnosticMap' @ [280:57] ==> val reportedDiagnosticMap: HashMap<Instruction, DiagnosticFactory<*>> /* = HashMap<Instruction, DiagnosticFactory<*>> */ defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUninitializedVariables[LocalVariableDescriptor]

'enterData' @ [280:80] ==> value-parameter enterData: ImmutableMap<VariableDescriptor, VariableControlFlowState> /* = Map<VariableDescriptor, VariableControlFlowState> */ defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUninitializedVariables.<anonymous>[ValueParameterDescriptorImpl]

'exitData' @ [280:91] ==> value-parameter exitData: ImmutableMap<VariableDescriptor, VariableControlFlowState> /* = Map<VariableDescriptor, VariableControlFlowState> */ defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUninitializedVariables.<anonymous>[ValueParameterDescriptorImpl]

'blockScopeVariableInfo' @ [280:101] ==> val blockScopeVariableInfo: BlockScopeVariableInfo defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUninitializedVariables[LocalVariableDescriptor]

'ctxt' @ [281:17] ==> val ctxt: ControlFlowInformationProvider.VariableInitContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUninitializedVariables.<anonymous>[LocalVariableDescriptor]

'variableDescriptor' @ [281:22] ==> internal final val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableInitContext[PropertyDescriptorImpl]

'instruction' @ [282:17] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUninitializedVariables.<anonymous>[ValueParameterDescriptorImpl]

'instruction' @ [283:31] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUninitializedVariables.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [283:43] ==> public open val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.ReadValueInstruction[PropertyDescriptorImpl]

'isThisOrNoDispatchReceiver' @ [284:36] ==> public open fun isThisOrNoDispatchReceiver(@NotNull instruction: AccessValueInstruction, @NotNull bindingContext: BindingContext): Boolean defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeUtil[JavaMethodDescriptor]

'instruction' @ [284:63] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUninitializedVariables.<anonymous>[ValueParameterDescriptorImpl]

'trace' @ [284:76] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'bindingContext' @ [284:82] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'declaredVariables' @ [285:24] ==> val declaredVariables: Set<VariableDescriptor> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUninitializedVariables[LocalVariableDescriptor]

'contains' @ [285:42] ==> public abstract fun contains(element: VariableDescriptor): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'ctxt' @ [285:51] ==> val ctxt: ControlFlowInformationProvider.VariableInitContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUninitializedVariables.<anonymous>[LocalVariableDescriptor]

'variableDescriptor' @ [285:56] ==> internal final val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableInitContext[PropertyDescriptorImpl]

'checkIsInitialized' @ [286:21] ==> private final fun checkIsInitialized(ctxt: ControlFlowInformationProvider.VariableInitContext, element: KtElement, varWithUninitializedErrorGenerated: MutableCollection<VariableDescriptor>): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'ctxt' @ [286:40] ==> val ctxt: ControlFlowInformationProvider.VariableInitContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUninitializedVariables.<anonymous>[LocalVariableDescriptor]

'element' @ [286:46] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUninitializedVariables.<anonymous>[LocalVariableDescriptor]

'varWithUninitializedErrorGenerated' @ [286:55] ==> val varWithUninitializedErrorGenerated: HashSet<VariableDescriptor> /* = HashSet<VariableDescriptor> */ defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUninitializedVariables[LocalVariableDescriptor]

'instruction' @ [290:17] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUninitializedVariables.<anonymous>[ValueParameterDescriptorImpl]

'instruction' @ [291:27] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUninitializedVariables.<anonymous>[ValueParameterDescriptorImpl]

'lValue' @ [291:39] ==> public final val lValue: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.WriteValueInstruction[PropertyDescriptorImpl]

'checkValReassignment' @ [292:25] ==> private final fun checkValReassignment(ctxt: ControlFlowInformationProvider.VariableInitContext, expression: KtExpression, writeValueInstruction: WriteValueInstruction, varWithValReassignErrorGenerated: MutableCollection<VariableDescriptor>): Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'ctxt' @ [292:46] ==> val ctxt: ControlFlowInformationProvider.VariableInitContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUninitializedVariables.<anonymous>[LocalVariableDescriptor]

'element' @ [292:52] ==> val element: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUninitializedVariables.<anonymous>[LocalVariableDescriptor]

'instruction' @ [292:61] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUninitializedVariables.<anonymous>[ValueParameterDescriptorImpl]

'varWithValReassignErrorGenerated' @ [293:46] ==> val varWithValReassignErrorGenerated: HashSet<VariableDescriptor> /* = HashSet<VariableDescriptor> */ defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUninitializedVariables[LocalVariableDescriptor]

'!' @ [294:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'error' @ [294:18] ==> var error: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUninitializedVariables.<anonymous>[LocalVariableDescriptor]

'processClassOrObject' @ [294:27] ==> val processClassOrObject: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUninitializedVariables[LocalVariableDescriptor]

'error' @ [295:17] ==> var error: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUninitializedVariables.<anonymous>[LocalVariableDescriptor]

'checkAssignmentBeforeDeclaration' @ [295:25] ==> private final fun checkAssignmentBeforeDeclaration(ctxt: ControlFlowInformationProvider.VariableInitContext, expression: KtExpression): Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'ctxt' @ [295:58] ==> val ctxt: ControlFlowInformationProvider.VariableInitContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUninitializedVariables.<anonymous>[LocalVariableDescriptor]

'element' @ [295:64] ==> val element: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUninitializedVariables.<anonymous>[LocalVariableDescriptor]

'!' @ [297:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'error' @ [297:18] ==> var error: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUninitializedVariables.<anonymous>[LocalVariableDescriptor]

'processClassOrObject' @ [297:27] ==> val processClassOrObject: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUninitializedVariables[LocalVariableDescriptor]

'checkInitializationForCustomSetter' @ [298:17] ==> private final fun checkInitializationForCustomSetter(ctxt: ControlFlowInformationProvider.VariableInitContext, expression: KtExpression): Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'ctxt' @ [298:52] ==> val ctxt: ControlFlowInformationProvider.VariableInitContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUninitializedVariables.<anonymous>[LocalVariableDescriptor]

'element' @ [298:58] ==> val element: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUninitializedVariables.<anonymous>[LocalVariableDescriptor]

'pseudocodeVariablesData' @ [304:26] ==> private final val pseudocodeVariablesData: PseudocodeVariablesData defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'pseudocode' @ [304:50] ==> public final val pseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData[PropertyDescriptorImpl]

'pseudocodeVariablesData' @ [305:28] ==> private final val pseudocodeVariablesData: PseudocodeVariablesData defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'variableInitializers' @ [305:52] ==> public final val variableInitializers: Map<Instruction, Edges<InitControlFlowInfo>> defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData[PropertyDescriptorImpl]

'recordInitializedVariables' @ [306:9] ==> private final fun recordInitializedVariables(pseudocode: Pseudocode, initializersMap: Map<Instruction, Edges<InitControlFlowInfo>>): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'pseudocode' @ [306:36] ==> val pseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.recordInitializedVariables[LocalVariableDescriptor]

'initializers' @ [306:48] ==> val initializers: Map<Instruction, Edges<InitControlFlowInfo>> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.recordInitializedVariables[LocalVariableDescriptor]

'pseudocode' @ [307:29] ==> val pseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.recordInitializedVariables[LocalVariableDescriptor]

'localDeclarations' @ [307:40] ==> public abstract val localDeclarations: Set<LocalFunctionDeclarationInstruction> defined in org.jetbrains.kotlin.cfg.pseudocode.Pseudocode[PropertyDescriptorImpl]

'recordInitializedVariables' @ [308:13] ==> private final fun recordInitializedVariables(pseudocode: Pseudocode, initializersMap: Map<Instruction, Edges<InitControlFlowInfo>>): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'instruction' @ [308:40] ==> val instruction: LocalFunctionDeclarationInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.recordInitializedVariables[LocalVariableDescriptor]

'body' @ [308:52] ==> public final val body: Pseudocode defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.LocalFunctionDeclarationInstruction[PropertyDescriptorImpl]

'initializers' @ [308:58] ==> val initializers: Map<Instruction, Edges<InitControlFlowInfo>> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.recordInitializedVariables[LocalVariableDescriptor]

'trace' @ [313:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'get' @ [313:19] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>..ReadOnlySlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>?), key: (PropertyDescriptor..PropertyDescriptor?)): Boolean? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PropertyDescriptor
    <V : (Any..Any?)> -> Boolean

'BACKING_FIELD_REQUIRED' @ [313:23] ==> public final val BACKING_FIELD_REQUIRED: (WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>..WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'this' @ [313:47] ==> <this> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.isDefinitelyInitialized[ReceiverParameterDescriptorImpl]

'DescriptorToSourceUtils' @ [314:24] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve in file DescriptorToSourceUtils.kt[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [314:48] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[SimpleFunctionDescriptorImpl]

'this' @ [314:72] ==> <this> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.isDefinitelyInitialized[ReceiverParameterDescriptorImpl]

'property' @ [315:13] ==> val property: PsiElement? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.isDefinitelyInitialized[LocalVariableDescriptor]

'property' @ [315:39] ==> val property: PsiElement? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.isDefinitelyInitialized[LocalVariableDescriptor]

'hasDelegate' @ [315:48] ==> public open fun hasDelegate(): Boolean defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

'element' @ [324:13] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIsInitialized[ValueParameterDescriptorImpl]

'ctxt' @ [326:39] ==> value-parameter ctxt: ControlFlowInformationProvider.VariableInitContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIsInitialized[ValueParameterDescriptorImpl]

'exitInitState' @ [326:44] ==> internal final val exitInitState: VariableControlFlowState? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableInitContext[PropertyDescriptorImpl]

'definitelyInitialized' @ [326:59] ==> public final fun definitelyInitialized(): Boolean defined in org.jetbrains.kotlin.cfg.VariableControlFlowState[SimpleFunctionDescriptorImpl]

'ctxt' @ [327:34] ==> value-parameter ctxt: ControlFlowInformationProvider.VariableInitContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIsInitialized[ValueParameterDescriptorImpl]

'variableDescriptor' @ [327:39] ==> internal final val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableInitContext[PropertyDescriptorImpl]

'!' @ [328:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isDefinitelyInitialized' @ [328:14] ==> var isDefinitelyInitialized: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIsInitialized[LocalVariableDescriptor]

'variableDescriptor' @ [328:41] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIsInitialized[LocalVariableDescriptor]

'isDefinitelyInitialized' @ [329:13] ==> var isDefinitelyInitialized: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIsInitialized[LocalVariableDescriptor]

'variableDescriptor' @ [329:39] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIsInitialized[LocalVariableDescriptor]

'isDefinitelyInitialized' @ [329:58] ==> private final fun PropertyDescriptor.isDefinitelyInitialized(): Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'!' @ [331:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isDefinitelyInitialized' @ [331:14] ==> var isDefinitelyInitialized: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIsInitialized[LocalVariableDescriptor]

'!' @ [331:41] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'varWithUninitializedErrorGenerated' @ [331:42] ==> value-parameter varWithUninitializedErrorGenerated: MutableCollection<VariableDescriptor> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIsInitialized[ValueParameterDescriptorImpl]

'contains' @ [331:77] ==> public operator fun <@OnlyInputTypes T> Iterable<VariableDescriptor?>.contains(element: VariableDescriptor?): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> VariableDescriptor?

'variableDescriptor' @ [331:86] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIsInitialized[LocalVariableDescriptor]

'if (variableDescriptor !is PropertyDescriptor) {
                variableDescriptor?.let { varWithUninitializedErrorGenerated.add(it) }
            }
            else if (variableDescriptor.isLateInit) {
                trace.record(MUST_BE_LATEINIT, variableDescriptor)
                return
            }' @ [332:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any?, elseBranch: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any?

'variableDescriptor' @ [332:17] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIsInitialized[LocalVariableDescriptor]

'variableDescriptor' @ [333:17] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIsInitialized[LocalVariableDescriptor]

'let' @ [333:37] ==> @InlineOnly public inline fun <T, R> VariableDescriptor.let(block: (VariableDescriptor) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableDescriptor
    <R> -> Boolean

'varWithUninitializedErrorGenerated' @ [333:43] ==> value-parameter varWithUninitializedErrorGenerated: MutableCollection<VariableDescriptor> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIsInitialized[ValueParameterDescriptorImpl]

'add' @ [333:78] ==> public abstract fun add(element: VariableDescriptor): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'it' @ [333:82] ==> value-parameter it: VariableDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIsInitialized.<anonymous>[ValueParameterDescriptorImpl]

'variableDescriptor' @ [335:22] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIsInitialized[LocalVariableDescriptor]

'isLateInit' @ [335:41] ==> public final val PropertyDescriptor.isLateInit: Boolean[MyPropertyDescriptor]

'trace' @ [336:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'record' @ [336:23] ==> public abstract fun <K : (Any..Any?)> record(slice: (WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>..WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>?), key: (PropertyDescriptor..PropertyDescriptor?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PropertyDescriptor

'MUST_BE_LATEINIT' @ [336:30] ==> public final val MUST_BE_LATEINIT: (WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>..WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'variableDescriptor' @ [336:48] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIsInitialized[LocalVariableDescriptor]

'when (variableDescriptor) {
                is ValueParameterDescriptor ->
                    report(Errors.UNINITIALIZED_PARAMETER.on(element, variableDescriptor), ctxt)
                is FakeCallableDescriptorForObject -> {
                    val classDescriptor = variableDescriptor.classDescriptor
                    when (classDescriptor.kind) {
                        ClassKind.ENUM_ENTRY ->
                            report(Errors.UNINITIALIZED_ENUM_ENTRY.on(element, classDescriptor), ctxt)
                        ClassKind.OBJECT -> if (classDescriptor.isCompanionObject) {
                            val container = classDescriptor.containingDeclaration
                            if (container is ClassDescriptor && container.kind == ClassKind.ENUM_CLASS) {
                                report(Errors.UNINITIALIZED_ENUM_COMPANION.on(element, container), ctxt)
                            }
                        }
                        else -> {}
                    }
                }
                is VariableDescriptor ->
                    report(Errors.UNINITIALIZED_VARIABLE.on(element, variableDescriptor), ctxt)
            }' @ [339:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'variableDescriptor' @ [339:19] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIsInitialized[LocalVariableDescriptor]

'report' @ [341:21] ==> private final fun report(diagnostic: Diagnostic, ctxt: ControlFlowInformationProvider.VariableContext): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'UNINITIALIZED_PARAMETER' @ [341:35] ==> public final val UNINITIALIZED_PARAMETER: (DiagnosticFactory1<(KtSimpleNameExpression..KtSimpleNameExpression?), (ValueParameterDescriptor..ValueParameterDescriptor?)>..DiagnosticFactory1<(KtSimpleNameExpression..KtSimpleNameExpression?), (ValueParameterDescriptor..ValueParameterDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [341:59] ==> @NotNull public open fun on(@NotNull element: KtSimpleNameExpression, @NotNull argument: ValueParameterDescriptor): ParametrizedDiagnostic<(KtSimpleNameExpression..KtSimpleNameExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'element' @ [341:62] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIsInitialized[ValueParameterDescriptorImpl]

'variableDescriptor' @ [341:71] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIsInitialized[LocalVariableDescriptor]

'ctxt' @ [341:92] ==> value-parameter ctxt: ControlFlowInformationProvider.VariableInitContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIsInitialized[ValueParameterDescriptorImpl]

'variableDescriptor' @ [343:43] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIsInitialized[LocalVariableDescriptor]

'classDescriptor' @ [343:62] ==> public final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.calls.util.FakeCallableDescriptorForObject[DeserializedPropertyDescriptor]

'when (classDescriptor.kind) {
                        ClassKind.ENUM_ENTRY ->
                            report(Errors.UNINITIALIZED_ENUM_ENTRY.on(element, classDescriptor), ctxt)
                        ClassKind.OBJECT -> if (classDescriptor.isCompanionObject) {
                            val container = classDescriptor.containingDeclaration
                            if (container is ClassDescriptor && container.kind == ClassKind.ENUM_CLASS) {
                                report(Errors.UNINITIALIZED_ENUM_COMPANION.on(element, container), ctxt)
                            }
                        }
                        else -> {}
                    }' @ [344:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'classDescriptor' @ [344:27] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIsInitialized[LocalVariableDescriptor]

'kind' @ [344:43] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'ENUM_ENTRY' @ [345:35] ==> enum entry ENUM_ENTRY defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'report' @ [346:29] ==> private final fun report(diagnostic: Diagnostic, ctxt: ControlFlowInformationProvider.VariableContext): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'UNINITIALIZED_ENUM_ENTRY' @ [346:43] ==> public final val UNINITIALIZED_ENUM_ENTRY: (DiagnosticFactory1<(KtSimpleNameExpression..KtSimpleNameExpression?), (ClassDescriptor..ClassDescriptor?)>..DiagnosticFactory1<(KtSimpleNameExpression..KtSimpleNameExpression?), (ClassDescriptor..ClassDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [346:68] ==> @NotNull public open fun on(@NotNull element: KtSimpleNameExpression, @NotNull argument: ClassDescriptor): ParametrizedDiagnostic<(KtSimpleNameExpression..KtSimpleNameExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'element' @ [346:71] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIsInitialized[ValueParameterDescriptorImpl]

'classDescriptor' @ [346:80] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIsInitialized[LocalVariableDescriptor]

'ctxt' @ [346:98] ==> value-parameter ctxt: ControlFlowInformationProvider.VariableInitContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIsInitialized[ValueParameterDescriptorImpl]

'OBJECT' @ [347:35] ==> enum entry OBJECT defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'classDescriptor' @ [347:49] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIsInitialized[LocalVariableDescriptor]

'isCompanionObject' @ [347:65] ==> public final val ClassDescriptor.isCompanionObject: Boolean[MyPropertyDescriptor]

'classDescriptor' @ [348:45] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIsInitialized[LocalVariableDescriptor]

'containingDeclaration' @ [348:61] ==> public final val ClassDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'container' @ [349:33] ==> val container: DeclarationDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIsInitialized[LocalVariableDescriptor]

'container' @ [349:65] ==> val container: DeclarationDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIsInitialized[LocalVariableDescriptor]

'kind' @ [349:75] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'ENUM_CLASS' @ [349:93] ==> enum entry ENUM_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'report' @ [350:33] ==> private final fun report(diagnostic: Diagnostic, ctxt: ControlFlowInformationProvider.VariableContext): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'UNINITIALIZED_ENUM_COMPANION' @ [350:47] ==> public final val UNINITIALIZED_ENUM_COMPANION: (DiagnosticFactory1<(KtSimpleNameExpression..KtSimpleNameExpression?), (ClassDescriptor..ClassDescriptor?)>..DiagnosticFactory1<(KtSimpleNameExpression..KtSimpleNameExpression?), (ClassDescriptor..ClassDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [350:76] ==> @NotNull public open fun on(@NotNull element: KtSimpleNameExpression, @NotNull argument: ClassDescriptor): ParametrizedDiagnostic<(KtSimpleNameExpression..KtSimpleNameExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'element' @ [350:79] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIsInitialized[ValueParameterDescriptorImpl]

'container' @ [350:88] ==> val container: DeclarationDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIsInitialized[LocalVariableDescriptor]

'ctxt' @ [350:100] ==> value-parameter ctxt: ControlFlowInformationProvider.VariableInitContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIsInitialized[ValueParameterDescriptorImpl]

'report' @ [357:21] ==> private final fun report(diagnostic: Diagnostic, ctxt: ControlFlowInformationProvider.VariableContext): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'UNINITIALIZED_VARIABLE' @ [357:35] ==> public final val UNINITIALIZED_VARIABLE: (DiagnosticFactory1<(KtSimpleNameExpression..KtSimpleNameExpression?), (VariableDescriptor..VariableDescriptor?)>..DiagnosticFactory1<(KtSimpleNameExpression..KtSimpleNameExpression?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [357:58] ==> @NotNull public open fun on(@NotNull element: KtSimpleNameExpression, @NotNull argument: VariableDescriptor): ParametrizedDiagnostic<(KtSimpleNameExpression..KtSimpleNameExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'element' @ [357:61] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIsInitialized[ValueParameterDescriptorImpl]

'variableDescriptor' @ [357:70] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIsInitialized[LocalVariableDescriptor]

'ctxt' @ [357:91] ==> value-parameter ctxt: ControlFlowInformationProvider.VariableInitContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIsInitialized[ValueParameterDescriptorImpl]

'variableDescriptor' @ [366:47] ==> value-parameter variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.isCapturedWrite[ValueParameterDescriptorImpl]

'containingDeclaration' @ [366:66] ==> public final val VariableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'containingDeclarationDescriptor' @ [368:13] ==> val containingDeclarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.isCapturedWrite[LocalVariableDescriptor]

'getElementParentDeclaration' @ [369:33] ==> public final fun getElementParentDeclaration(element: KtElement): KtDeclaration? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion[SimpleFunctionDescriptorImpl]

'writeValueInstruction' @ [369:61] ==> value-parameter writeValueInstruction: WriteValueInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.isCapturedWrite[ValueParameterDescriptorImpl]

'element' @ [369:83] ==> public open val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.WriteValueInstruction[PropertyDescriptorImpl]

'trace' @ [371:27] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'bindingContext' @ [371:33] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'getDeclarationDescriptorIncludingConstructors' @ [372:36] ==> public final fun getDeclarationDescriptorIncludingConstructors(context: BindingContext, declaration: KtDeclaration?): DeclarationDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion[SimpleFunctionDescriptorImpl]

'context' @ [372:82] ==> val context: BindingContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.isCapturedWrite[LocalVariableDescriptor]

'parentDeclaration' @ [372:91] ==> var parentDeclaration: KtDeclaration? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.isCapturedWrite[LocalVariableDescriptor]

'parentDescriptor' @ [373:17] ==> val parentDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.isCapturedWrite[LocalVariableDescriptor]

'containingDeclarationDescriptor' @ [373:37] ==> val containingDeclarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.isCapturedWrite[LocalVariableDescriptor]

'when (parentDeclaration) {
                is KtObjectDeclaration, is KtClassInitializer -> {
                    // anonymous objects / initializers count here the same as its owner
                    parentDeclaration = getElementParentDeclaration(parentDeclaration)
                }
                is KtDeclarationWithBody -> {
                    if (parentDeclaration is KtFunction && parentDeclaration.isLocal) return true
                    // miss non-local function or accessor just once
                    parentDeclaration = getElementParentDeclaration(parentDeclaration)
                    return getDeclarationDescriptorIncludingConstructors(context, parentDeclaration) != containingDeclarationDescriptor
                }
                else -> {
                    return true
                }
            }' @ [376:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'parentDeclaration' @ [376:19] ==> var parentDeclaration: KtDeclaration? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.isCapturedWrite[LocalVariableDescriptor]

'parentDeclaration' @ [379:21] ==> var parentDeclaration: KtDeclaration? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.isCapturedWrite[LocalVariableDescriptor]

'getElementParentDeclaration' @ [379:41] ==> public final fun getElementParentDeclaration(element: KtElement): KtDeclaration? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion[SimpleFunctionDescriptorImpl]

'parentDeclaration' @ [379:69] ==> var parentDeclaration: KtDeclaration? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.isCapturedWrite[LocalVariableDescriptor]

'parentDeclaration' @ [382:25] ==> var parentDeclaration: KtDeclaration? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.isCapturedWrite[LocalVariableDescriptor]

'parentDeclaration' @ [382:60] ==> var parentDeclaration: KtDeclaration? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.isCapturedWrite[LocalVariableDescriptor]

'isLocal' @ [382:78] ==> public final val KtFunction.isLocal: Boolean[MyPropertyDescriptor]

'parentDeclaration' @ [384:21] ==> var parentDeclaration: KtDeclaration? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.isCapturedWrite[LocalVariableDescriptor]

'getElementParentDeclaration' @ [384:41] ==> public final fun getElementParentDeclaration(element: KtElement): KtDeclaration? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion[SimpleFunctionDescriptorImpl]

'parentDeclaration' @ [384:69] ==> var parentDeclaration: KtDeclaration? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.isCapturedWrite[LocalVariableDescriptor]

'getDeclarationDescriptorIncludingConstructors' @ [385:28] ==> public final fun getDeclarationDescriptorIncludingConstructors(context: BindingContext, declaration: KtDeclaration?): DeclarationDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion[SimpleFunctionDescriptorImpl]

'context' @ [385:74] ==> val context: BindingContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.isCapturedWrite[LocalVariableDescriptor]

'parentDeclaration' @ [385:83] ==> var parentDeclaration: KtDeclaration? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.isCapturedWrite[LocalVariableDescriptor]

'containingDeclarationDescriptor' @ [385:105] ==> val containingDeclarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.isCapturedWrite[LocalVariableDescriptor]

'ctxt' @ [400:34] ==> value-parameter ctxt: ControlFlowInformationProvider.VariableInitContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[ValueParameterDescriptorImpl]

'variableDescriptor' @ [400:39] ==> internal final val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableInitContext[PropertyDescriptorImpl]

'ctxt' @ [401:39] ==> value-parameter ctxt: ControlFlowInformationProvider.VariableInitContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[ValueParameterDescriptorImpl]

'enterInitState' @ [401:44] ==> internal final val enterInitState: VariableControlFlowState? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableInitContext[PropertyDescriptorImpl]

'mayBeInitialized' @ [401:60] ==> public final fun mayBeInitialized(): Boolean defined in org.jetbrains.kotlin.cfg.VariableControlFlowState[SimpleFunctionDescriptorImpl]

'?:' @ [402:31] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Boolean?, right: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Boolean

'variableDescriptor' @ [402:32] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'let' @ [402:76] ==> @InlineOnly public inline fun <T, R> PropertyDescriptor.let(block: (PropertyDescriptor) -> Boolean?): Boolean? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor
    <R> -> Boolean?

'trace' @ [403:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'get' @ [403:19] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>..ReadOnlySlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>?), key: (PropertyDescriptor..PropertyDescriptor?)): Boolean? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PropertyDescriptor
    <V : (Any..Any?)> -> Boolean

'BACKING_FIELD_REQUIRED' @ [403:38] ==> public final val BACKING_FIELD_REQUIRED: (WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>..WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [403:62] ==> value-parameter it: PropertyDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment.<anonymous>[ValueParameterDescriptorImpl]

'variableDescriptor' @ [405:13] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'variableDescriptor' @ [405:57] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'isVar' @ [405:76] ==> public final val PropertyDescriptor.isVar: Boolean[MyPropertyDescriptor]

'getEnclosingDescriptor' @ [406:50] ==> @NotNull public open fun getEnclosingDescriptor(@NotNull context: BindingContext, @NotNull element: KtElement): DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.BindingContextUtils[JavaMethodDescriptor]

'trace' @ [406:73] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'bindingContext' @ [406:79] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'expression' @ [406:95] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[ValueParameterDescriptorImpl]

'variableDescriptor' @ [407:36] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'setter' @ [407:55] ==> public abstract val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'expression' @ [409:33] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[ValueParameterDescriptorImpl]

'getResolvedCall' @ [409:44] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[SimpleFunctionDescriptorImpl]

'trace' @ [409:60] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'bindingContext' @ [409:66] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'getDispatchReceiverWithSmartCast' @ [409:83] ==> public fun ResolvedCall<*>.getDispatchReceiverWithSmartCast(): ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil in file resolvedCallUtil.kt[SimpleFunctionDescriptorImpl]

'isVisible' @ [411:30] ==> public open fun isVisible(@Nullable p0: ReceiverValue?, @NotNull p1: DeclarationDescriptorWithVisibility, @NotNull p2: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaMethodDescriptor]

'receiverValue' @ [411:40] ==> val receiverValue: ReceiverValue? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'variableDescriptor' @ [411:55] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'descriptor' @ [411:75] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'setterDescriptor' @ [412:20] ==> val setterDescriptor: PropertySetterDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'!' @ [413:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isVisible' @ [413:34] ==> public open fun isVisible(@Nullable p0: ReceiverValue?, @NotNull p1: DeclarationDescriptorWithVisibility, @NotNull p2: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaMethodDescriptor]

'receiverValue' @ [413:44] ==> val receiverValue: ReceiverValue? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'setterDescriptor' @ [413:59] ==> val setterDescriptor: PropertySetterDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'descriptor' @ [413:77] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'report' @ [414:17] ==> private final fun report(diagnostic: Diagnostic, ctxt: ControlFlowInformationProvider.VariableContext): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'INVISIBLE_SETTER' @ [414:31] ==> public final val INVISIBLE_SETTER: (DiagnosticFactory3<(KtExpression..KtExpression?), (DeclarationDescriptor..DeclarationDescriptor?), (Visibility..Visibility?), (DeclarationDescriptor..DeclarationDescriptor?)>..DiagnosticFactory3<(KtExpression..KtExpression?), (DeclarationDescriptor..DeclarationDescriptor?), (Visibility..Visibility?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [414:48] ==> @NotNull public open fun on(@NotNull element: KtExpression, @NotNull a: DeclarationDescriptor, @NotNull b: Visibility, @NotNull c: DeclarationDescriptor): ParametrizedDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory3[JavaMethodDescriptor]

'expression' @ [414:51] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[ValueParameterDescriptorImpl]

'variableDescriptor' @ [414:63] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'setterDescriptor' @ [414:83] ==> val setterDescriptor: PropertySetterDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'visibility' @ [414:100] ==> public final val PropertySetterDescriptor.visibility: Visibility[MyPropertyDescriptor]

'setterDescriptor' @ [415:51] ==> val setterDescriptor: PropertySetterDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'ctxt' @ [415:70] ==> value-parameter ctxt: ControlFlowInformationProvider.VariableInitContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[ValueParameterDescriptorImpl]

'isThisOrNoDispatchReceiver' @ [419:57] ==> public open fun isThisOrNoDispatchReceiver(@NotNull instruction: AccessValueInstruction, @NotNull bindingContext: BindingContext): Boolean defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeUtil[JavaMethodDescriptor]

'writeValueInstruction' @ [419:84] ==> value-parameter writeValueInstruction: WriteValueInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[ValueParameterDescriptorImpl]

'trace' @ [419:107] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'bindingContext' @ [419:113] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'variableDescriptor' @ [420:24] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'let' @ [420:44] ==> @InlineOnly public inline fun <T, R> VariableDescriptor.let(block: (VariableDescriptor) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableDescriptor
    <R> -> Boolean

'isCapturedWrite' @ [420:50] ==> private final fun isCapturedWrite(variableDescriptor: VariableDescriptor, writeValueInstruction: WriteValueInstruction): Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'it' @ [420:66] ==> value-parameter it: VariableDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment.<anonymous>[ValueParameterDescriptorImpl]

'writeValueInstruction' @ [420:70] ==> value-parameter writeValueInstruction: WriteValueInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[ValueParameterDescriptorImpl]

'mayBeInitializedNotHere' @ [421:14] ==> val mayBeInitializedNotHere: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'!' @ [421:41] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasBackingField' @ [421:42] ==> val hasBackingField: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'!' @ [421:61] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isThisOrNoDispatchReceiver' @ [421:62] ==> val isThisOrNoDispatchReceiver: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'captured' @ [421:92] ==> val captured: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'variableDescriptor' @ [422:13] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'!' @ [422:43] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'variableDescriptor' @ [422:44] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'isVar' @ [422:63] ==> public final val VariableDescriptor.isVar: Boolean[MyPropertyDescriptor]

'expression' @ [424:26] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[ValueParameterDescriptorImpl]

'parent' @ [424:37] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (parent) {
                        is KtBinaryExpression -> parent.operationReference
                        is KtUnaryExpression -> parent.operationReference
                        else -> null
                    }' @ [426:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtSimpleNameExpression?, entry1: KtSimpleNameExpression?, entry2: KtSimpleNameExpression?): KtSimpleNameExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtSimpleNameExpression?

'parent' @ [426:27] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'parent' @ [427:50] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'operationReference' @ [427:57] ==> public final val KtBinaryExpression.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'parent' @ [428:49] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'operationReference' @ [428:56] ==> public final val KtUnaryExpression.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'operationReference' @ [431:17] ==> val operationReference: KtSimpleNameExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'trace' @ [432:34] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'get' @ [432:40] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?), key: (KtReferenceExpression..KtReferenceExpression?)): DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtReferenceExpression
    <V : (Any..Any?)> -> DeclarationDescriptor

'REFERENCE_TARGET' @ [432:59] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'operationReference' @ [432:77] ==> val operationReference: KtSimpleNameExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'descriptor' @ [433:21] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'descriptor' @ [434:25] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'returnType' @ [434:36] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'let' @ [434:48] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> Boolean

'isUnit' @ [434:69] ==> public open fun isUnit(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'it' @ [434:76] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment.<anonymous>[ValueParameterDescriptorImpl]

'hasReassignMethodReturningUnit' @ [435:25] ==> var hasReassignMethodReturningUnit: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'descriptor' @ [438:21] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'trace' @ [439:39] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'get' @ [439:45] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtExpression..KtExpression?), (MutableCollection<out (DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?)>..ReadOnlySlice<(KtExpression..KtExpression?), (MutableCollection<out (DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?)>?), key: (KtExpression..KtExpression?)): (MutableCollection<out (DeclarationDescriptor..DeclarationDescriptor?)>?..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtExpression
    <V : (Any..Any?)> -> (kotlin.collections.MutableCollection<out (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)>)

'AMBIGUOUS_REFERENCE_TARGET' @ [439:64] ==> public final val AMBIGUOUS_REFERENCE_TARGET: (WritableSlice<(KtExpression..KtExpression?), (MutableCollection<out (DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?)>..WritableSlice<(KtExpression..KtExpression?), (MutableCollection<out (DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'operationReference' @ [439:92] ==> val operationReference: KtSimpleNameExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'emptyList' @ [439:115] ==> public fun <T> emptyList(): List<(DeclarationDescriptor..DeclarationDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)

'descriptors' @ [440:49] ==> val descriptors: (MutableCollection<out (DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>) defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'==' @ [441:29] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'referenceDescriptor' @ [441:30] ==> val referenceDescriptor: (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'returnType' @ [441:75] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'let' @ [441:87] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> Boolean

'isUnit' @ [441:108] ==> public open fun isUnit(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'it' @ [441:115] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment.<anonymous>[ValueParameterDescriptorImpl]

'hasReassignMethodReturningUnit' @ [442:29] ==> var hasReassignMethodReturningUnit: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'!' @ [447:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasReassignMethodReturningUnit' @ [447:18] ==> var hasReassignMethodReturningUnit: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'!' @ [448:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isThisOrNoDispatchReceiver' @ [448:22] ==> val isThisOrNoDispatchReceiver: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'!' @ [448:52] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'varWithValReassignErrorGenerated' @ [448:53] ==> value-parameter varWithValReassignErrorGenerated: MutableCollection<VariableDescriptor> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[ValueParameterDescriptorImpl]

'contains' @ [448:86] ==> public abstract fun contains(element: VariableDescriptor): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'variableDescriptor' @ [448:95] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'if (captured && !mayBeInitializedNotHere && hasBackingField && isThisOrNoDispatchReceiver) {
                        if (variableDescriptor.containingDeclaration is ClassDescriptor) {
                            report(Errors.CAPTURED_MEMBER_VAL_INITIALIZATION.on(expression, variableDescriptor), ctxt)
                        }
                        else {
                            report(Errors.CAPTURED_VAL_INITIALIZATION.on(expression, variableDescriptor), ctxt)
                        }
                    }
                    else {
                        if (KtPsiUtil.isBackingFieldReference(variableDescriptor)) {
                            report(Errors.VAL_REASSIGNMENT_VIA_BACKING_FIELD.on(expression, variableDescriptor), ctxt)
                        }
                        else {
                            report(Errors.VAL_REASSIGNMENT.on(expression, variableDescriptor), ctxt)
                        }
                    }' @ [449:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'captured' @ [449:25] ==> val captured: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'!' @ [449:37] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'mayBeInitializedNotHere' @ [449:38] ==> val mayBeInitializedNotHere: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'hasBackingField' @ [449:65] ==> val hasBackingField: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'isThisOrNoDispatchReceiver' @ [449:84] ==> val isThisOrNoDispatchReceiver: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'if (variableDescriptor.containingDeclaration is ClassDescriptor) {
                            report(Errors.CAPTURED_MEMBER_VAL_INITIALIZATION.on(expression, variableDescriptor), ctxt)
                        }
                        else {
                            report(Errors.CAPTURED_VAL_INITIALIZATION.on(expression, variableDescriptor), ctxt)
                        }' @ [450:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'variableDescriptor' @ [450:29] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'containingDeclaration' @ [450:48] ==> public final val VariableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'report' @ [451:29] ==> private final fun report(diagnostic: Diagnostic, ctxt: ControlFlowInformationProvider.VariableContext): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'CAPTURED_MEMBER_VAL_INITIALIZATION' @ [451:43] ==> public final val CAPTURED_MEMBER_VAL_INITIALIZATION: (DiagnosticFactory1<(KtExpression..KtExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..DiagnosticFactory1<(KtExpression..KtExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [451:78] ==> @NotNull public open fun on(@NotNull element: KtExpression, @NotNull argument: DeclarationDescriptor): ParametrizedDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'expression' @ [451:81] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[ValueParameterDescriptorImpl]

'variableDescriptor' @ [451:93] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'ctxt' @ [451:114] ==> value-parameter ctxt: ControlFlowInformationProvider.VariableInitContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[ValueParameterDescriptorImpl]

'report' @ [454:29] ==> private final fun report(diagnostic: Diagnostic, ctxt: ControlFlowInformationProvider.VariableContext): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'CAPTURED_VAL_INITIALIZATION' @ [454:43] ==> public final val CAPTURED_VAL_INITIALIZATION: (DiagnosticFactory1<(KtExpression..KtExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..DiagnosticFactory1<(KtExpression..KtExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [454:71] ==> @NotNull public open fun on(@NotNull element: KtExpression, @NotNull argument: DeclarationDescriptor): ParametrizedDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'expression' @ [454:74] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[ValueParameterDescriptorImpl]

'variableDescriptor' @ [454:86] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'ctxt' @ [454:107] ==> value-parameter ctxt: ControlFlowInformationProvider.VariableInitContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[ValueParameterDescriptorImpl]

'if (KtPsiUtil.isBackingFieldReference(variableDescriptor)) {
                            report(Errors.VAL_REASSIGNMENT_VIA_BACKING_FIELD.on(expression, variableDescriptor), ctxt)
                        }
                        else {
                            report(Errors.VAL_REASSIGNMENT.on(expression, variableDescriptor), ctxt)
                        }' @ [458:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isBackingFieldReference' @ [458:39] ==> public open fun isBackingFieldReference(@Nullable descriptor: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'variableDescriptor' @ [458:63] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'report' @ [459:29] ==> private final fun report(diagnostic: Diagnostic, ctxt: ControlFlowInformationProvider.VariableContext): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'VAL_REASSIGNMENT_VIA_BACKING_FIELD' @ [459:43] ==> public final val VAL_REASSIGNMENT_VIA_BACKING_FIELD: (DiagnosticFactory1<(KtExpression..KtExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..DiagnosticFactory1<(KtExpression..KtExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [459:78] ==> @NotNull public open fun on(@NotNull element: KtExpression, @NotNull argument: DeclarationDescriptor): ParametrizedDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'expression' @ [459:81] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[ValueParameterDescriptorImpl]

'variableDescriptor' @ [459:93] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'ctxt' @ [459:114] ==> value-parameter ctxt: ControlFlowInformationProvider.VariableInitContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[ValueParameterDescriptorImpl]

'report' @ [462:29] ==> private final fun report(diagnostic: Diagnostic, ctxt: ControlFlowInformationProvider.VariableContext): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'VAL_REASSIGNMENT' @ [462:43] ==> public final val VAL_REASSIGNMENT: (DiagnosticFactory1<(KtExpression..KtExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..DiagnosticFactory1<(KtExpression..KtExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [462:60] ==> @NotNull public open fun on(@NotNull element: KtExpression, @NotNull argument: DeclarationDescriptor): ParametrizedDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'expression' @ [462:63] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[ValueParameterDescriptorImpl]

'variableDescriptor' @ [462:75] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'ctxt' @ [462:96] ==> value-parameter ctxt: ControlFlowInformationProvider.VariableInitContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[ValueParameterDescriptorImpl]

'isThisOrNoDispatchReceiver' @ [466:21] ==> val isThisOrNoDispatchReceiver: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'varWithValReassignErrorGenerated' @ [469:21] ==> value-parameter varWithValReassignErrorGenerated: MutableCollection<VariableDescriptor> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[ValueParameterDescriptorImpl]

'add' @ [469:54] ==> public abstract fun add(element: VariableDescriptor): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'variableDescriptor' @ [469:58] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkValReassignment[LocalVariableDescriptor]

'if (ctxt.enterInitState?.isDeclared == true
                || ctxt.exitInitState?.isDeclared == true
                || ctxt.enterInitState?.mayBeInitialized() == true
                || ctxt.exitInitState?.mayBeInitialized() != true) {
                false
            }
            else {
                if (ctxt.variableDescriptor != null) {
                    report(Errors.INITIALIZATION_BEFORE_DECLARATION.on(expression, ctxt.variableDescriptor), ctxt)
                }
                true
            }' @ [478:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'ctxt' @ [478:17] ==> value-parameter ctxt: ControlFlowInformationProvider.VariableInitContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkAssignmentBeforeDeclaration[ValueParameterDescriptorImpl]

'enterInitState' @ [478:22] ==> internal final val enterInitState: VariableControlFlowState? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableInitContext[PropertyDescriptorImpl]

'isDeclared' @ [478:38] ==> public final val isDeclared: Boolean defined in org.jetbrains.kotlin.cfg.VariableControlFlowState[PropertyDescriptorImpl]

'ctxt' @ [479:20] ==> value-parameter ctxt: ControlFlowInformationProvider.VariableInitContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkAssignmentBeforeDeclaration[ValueParameterDescriptorImpl]

'exitInitState' @ [479:25] ==> internal final val exitInitState: VariableControlFlowState? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableInitContext[PropertyDescriptorImpl]

'isDeclared' @ [479:40] ==> public final val isDeclared: Boolean defined in org.jetbrains.kotlin.cfg.VariableControlFlowState[PropertyDescriptorImpl]

'ctxt' @ [480:20] ==> value-parameter ctxt: ControlFlowInformationProvider.VariableInitContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkAssignmentBeforeDeclaration[ValueParameterDescriptorImpl]

'enterInitState' @ [480:25] ==> internal final val enterInitState: VariableControlFlowState? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableInitContext[PropertyDescriptorImpl]

'mayBeInitialized' @ [480:41] ==> public final fun mayBeInitialized(): Boolean defined in org.jetbrains.kotlin.cfg.VariableControlFlowState[SimpleFunctionDescriptorImpl]

'ctxt' @ [481:20] ==> value-parameter ctxt: ControlFlowInformationProvider.VariableInitContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkAssignmentBeforeDeclaration[ValueParameterDescriptorImpl]

'exitInitState' @ [481:25] ==> internal final val exitInitState: VariableControlFlowState? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableInitContext[PropertyDescriptorImpl]

'mayBeInitialized' @ [481:40] ==> public final fun mayBeInitialized(): Boolean defined in org.jetbrains.kotlin.cfg.VariableControlFlowState[SimpleFunctionDescriptorImpl]

'ctxt' @ [485:21] ==> value-parameter ctxt: ControlFlowInformationProvider.VariableInitContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkAssignmentBeforeDeclaration[ValueParameterDescriptorImpl]

'variableDescriptor' @ [485:26] ==> internal final val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableInitContext[PropertyDescriptorImpl]

'report' @ [486:21] ==> private final fun report(diagnostic: Diagnostic, ctxt: ControlFlowInformationProvider.VariableContext): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'INITIALIZATION_BEFORE_DECLARATION' @ [486:35] ==> public final val INITIALIZATION_BEFORE_DECLARATION: (DiagnosticFactory1<(KtExpression..KtExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..DiagnosticFactory1<(KtExpression..KtExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [486:69] ==> @NotNull public open fun on(@NotNull element: KtExpression, @NotNull argument: DeclarationDescriptor): ParametrizedDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'expression' @ [486:72] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkAssignmentBeforeDeclaration[ValueParameterDescriptorImpl]

'ctxt' @ [486:84] ==> value-parameter ctxt: ControlFlowInformationProvider.VariableInitContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkAssignmentBeforeDeclaration[ValueParameterDescriptorImpl]

'variableDescriptor' @ [486:89] ==> internal final val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableInitContext[PropertyDescriptorImpl]

'ctxt' @ [486:110] ==> value-parameter ctxt: ControlFlowInformationProvider.VariableInitContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkAssignmentBeforeDeclaration[ValueParameterDescriptorImpl]

'ctxt' @ [492:34] ==> value-parameter ctxt: ControlFlowInformationProvider.VariableInitContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkInitializationForCustomSetter[ValueParameterDescriptorImpl]

'variableDescriptor' @ [492:39] ==> internal final val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableInitContext[PropertyDescriptorImpl]

'variableDescriptor' @ [493:13] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkInitializationForCustomSetter[LocalVariableDescriptor]

'ctxt' @ [494:16] ==> value-parameter ctxt: ControlFlowInformationProvider.VariableInitContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkInitializationForCustomSetter[ValueParameterDescriptorImpl]

'enterInitState' @ [494:21] ==> internal final val enterInitState: VariableControlFlowState? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableInitContext[PropertyDescriptorImpl]

'mayBeInitialized' @ [494:37] ==> public final fun mayBeInitialized(): Boolean defined in org.jetbrains.kotlin.cfg.VariableControlFlowState[SimpleFunctionDescriptorImpl]

'ctxt' @ [495:16] ==> value-parameter ctxt: ControlFlowInformationProvider.VariableInitContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkInitializationForCustomSetter[ValueParameterDescriptorImpl]

'exitInitState' @ [495:21] ==> internal final val exitInitState: VariableControlFlowState? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableInitContext[PropertyDescriptorImpl]

'mayBeInitialized' @ [495:36] ==> public final fun mayBeInitialized(): Boolean defined in org.jetbrains.kotlin.cfg.VariableControlFlowState[SimpleFunctionDescriptorImpl]

'!' @ [496:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'variableDescriptor' @ [496:17] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkInitializationForCustomSetter[LocalVariableDescriptor]

'isVar' @ [496:36] ==> public final val PropertyDescriptor.isVar: Boolean[MyPropertyDescriptor]

'trace' @ [497:16] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'get' @ [497:22] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>..ReadOnlySlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>?), key: (PropertyDescriptor..PropertyDescriptor?)): Boolean? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PropertyDescriptor
    <V : (Any..Any?)> -> Boolean

'BACKING_FIELD_REQUIRED' @ [497:41] ==> public final val BACKING_FIELD_REQUIRED: (WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>..WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'variableDescriptor' @ [497:65] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkInitializationForCustomSetter[LocalVariableDescriptor]

'DescriptorToSourceUtils' @ [501:24] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve in file DescriptorToSourceUtils.kt[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [501:48] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[SimpleFunctionDescriptorImpl]

'variableDescriptor' @ [501:72] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkInitializationForCustomSetter[LocalVariableDescriptor]

'AssertionError' @ [502:18] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'variableDescriptor' @ [502:35] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkInitializationForCustomSetter[LocalVariableDescriptor]

'property' @ [503:22] ==> val property: KtProperty defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkInitializationForCustomSetter[LocalVariableDescriptor]

'setter' @ [503:31] ==> public final val KtProperty.setter: KtPropertyAccessor?[MyPropertyDescriptor]

'variableDescriptor' @ [504:13] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkInitializationForCustomSetter[LocalVariableDescriptor]

'modality' @ [504:32] ==> public final val PropertyDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [504:44] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'FINAL' @ [504:53] ==> enum entry FINAL defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'setter' @ [504:63] ==> val setter: KtPropertyAccessor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkInitializationForCustomSetter[LocalVariableDescriptor]

'!' @ [504:81] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'setter' @ [504:82] ==> val setter: KtPropertyAccessor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkInitializationForCustomSetter[LocalVariableDescriptor]

'hasBody' @ [504:89] ==> @Override public open fun hasBody(): Boolean defined in org.jetbrains.kotlin.psi.KtPropertyAccessor[JavaMethodDescriptor]

'if (expression is KtDotQualifiedExpression &&
                           expression.receiverExpression is KtThisExpression) {
            expression.selectorExpression
        }
        else {
            expression
        }' @ [508:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression?, elseBranch: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression?

'expression' @ [508:28] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkInitializationForCustomSetter[ValueParameterDescriptorImpl]

'expression' @ [509:28] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkInitializationForCustomSetter[ValueParameterDescriptorImpl]

'receiverExpression' @ [509:39] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[PropertyDescriptorImpl]

'expression' @ [510:13] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkInitializationForCustomSetter[ValueParameterDescriptorImpl]

'selectorExpression' @ [510:24] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[PropertyDescriptorImpl]

'expression' @ [513:13] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkInitializationForCustomSetter[ValueParameterDescriptorImpl]

'variable' @ [515:13] ==> val variable: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkInitializationForCustomSetter[LocalVariableDescriptor]

'trace' @ [516:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'record' @ [516:19] ==> public abstract fun <K : (Any..Any?)> record(slice: (WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>..WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>?), key: (PropertyDescriptor..PropertyDescriptor?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PropertyDescriptor

'IS_UNINITIALIZED' @ [516:26] ==> public final val IS_UNINITIALIZED: (WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>..WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'variableDescriptor' @ [516:44] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkInitializationForCustomSetter[LocalVariableDescriptor]

'initializersMap' @ [526:28] ==> value-parameter initializersMap: Map<Instruction, Edges<InitControlFlowInfo>> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.recordInitializedVariables[ValueParameterDescriptorImpl]

'pseudocode' @ [526:44] ==> value-parameter pseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.recordInitializedVariables[ValueParameterDescriptorImpl]

'exitInstruction' @ [526:55] ==> public abstract val exitInstruction: SubroutineExitInstruction defined in org.jetbrains.kotlin.cfg.pseudocode.Pseudocode[PropertyDescriptorImpl]

'pseudocodeVariablesData' @ [527:33] ==> private final val pseudocodeVariablesData: PseudocodeVariablesData defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'getDeclaredVariables' @ [527:57] ==> public final fun getDeclaredVariables(pseudocode: Pseudocode, includeInsideLocalDeclarations: Boolean): Set<VariableDescriptor> defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData[SimpleFunctionDescriptorImpl]

'pseudocode' @ [527:78] ==> value-parameter pseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.recordInitializedVariables[ValueParameterDescriptorImpl]

'declaredVariables' @ [528:26] ==> val declaredVariables: Set<VariableDescriptor> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.recordInitializedVariables[LocalVariableDescriptor]

'variable' @ [529:17] ==> val variable: VariableDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.recordInitializedVariables[LocalVariableDescriptor]

'initializers' @ [530:21] ==> val initializers: Edges<InitControlFlowInfo> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.recordInitializedVariables[LocalVariableDescriptor]

'incoming' @ [530:34] ==> public final val incoming: InitControlFlowInfo defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.Edges[PropertyDescriptorImpl]

'getOrNull' @ [530:43] ==> public fun <K, V> ImmutableMap<VariableDescriptor, VariableControlFlowState> /* = Map<VariableDescriptor, VariableControlFlowState> */.getOrNull(k: VariableDescriptor): VariableControlFlowState? defined in org.jetbrains.kotlin.cfg[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> VariableDescriptor
    <V> -> VariableControlFlowState

'variable' @ [530:53] ==> val variable: VariableDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.recordInitializedVariables[LocalVariableDescriptor]

'definitelyInitialized' @ [530:64] ==> public final fun definitelyInitialized(): Boolean defined in org.jetbrains.kotlin.cfg.VariableControlFlowState[SimpleFunctionDescriptorImpl]

'trace' @ [531:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'record' @ [531:23] ==> public abstract fun <K : (Any..Any?)> record(slice: (WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>..WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>?), key: (PropertyDescriptor..PropertyDescriptor?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PropertyDescriptor

'IS_UNINITIALIZED' @ [531:45] ==> public final val IS_UNINITIALIZED: (WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>..WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'variable' @ [531:63] ==> val variable: VariableDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.recordInitializedVariables[LocalVariableDescriptor]

'pseudocodeVariablesData' @ [540:34] ==> private final val pseudocodeVariablesData: PseudocodeVariablesData defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'variableUseStatusData' @ [540:58] ==> public final val variableUseStatusData: Map<Instruction, Edges<UseControlFlowInfo>> defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData[PropertyDescriptorImpl]

'hashMapOf' @ [541:37] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<Instruction, DiagnosticFactory<*>> /* = HashMap<Instruction, DiagnosticFactory<*>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Instruction
    <V> -> DiagnosticFactory<*>

'hashMapOf' @ [542:38] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<KtExpression, Pair<VariableDescriptor, ControlFlowInformationProvider.VariableUseContext>> /* = HashMap<KtExpression, Pair<VariableDescriptor, ControlFlowInformationProvider.VariableUseContext>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtExpression
    <V> -> Pair<VariableDescriptor, VariableUseContext>

'hashSetOf' @ [543:36] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<KtExpression> /* = HashSet<KtExpression> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'pseudocode' @ [544:9] ==> private final val pseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'traverse' @ [544:20] ==> public fun <D> Pseudocode.traverse(traversalOrder: TraversalOrder, edgesMap: Map<Instruction, Edges<UseControlFlowInfo>>, analyzeInstruction: (Instruction, UseControlFlowInfo, UseControlFlowInfo) -> Unit): Unit defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser[SimpleFunctionDescriptorImpl]
Inferred types:
    <D> -> UseControlFlowInfo

'BACKWARD' @ [544:44] ==> enum entry BACKWARD defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.TraversalOrder[FakeCallableDescriptorForObject]

'variableStatusData' @ [544:54] ==> val variableStatusData: Map<Instruction, Edges<UseControlFlowInfo>> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables[LocalVariableDescriptor]

'VariableUseContext' @ [549:24] ==> public constructor VariableUseContext(instruction: Instruction, map: MutableMap<Instruction, DiagnosticFactory<*>>) defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableUseContext[ClassConstructorDescriptorImpl]

'instruction' @ [549:43] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables.<anonymous>[ValueParameterDescriptorImpl]

'reportedDiagnosticMap' @ [549:56] ==> val reportedDiagnosticMap: HashMap<Instruction, DiagnosticFactory<*>> /* = HashMap<Instruction, DiagnosticFactory<*>> */ defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables[LocalVariableDescriptor]

'pseudocodeVariablesData' @ [550:37] ==> private final val pseudocodeVariablesData: PseudocodeVariablesData defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'getDeclaredVariables' @ [550:61] ==> public final fun getDeclaredVariables(pseudocode: Pseudocode, includeInsideLocalDeclarations: Boolean): Set<VariableDescriptor> defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData[SimpleFunctionDescriptorImpl]

'instruction' @ [550:82] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables.<anonymous>[ValueParameterDescriptorImpl]

'owner' @ [550:94] ==> public abstract var owner: Pseudocode defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.Instruction[PropertyDescriptorImpl]

'extractVariableDescriptorIfAny' @ [551:53] ==> @Nullable public open fun extractVariableDescriptorIfAny(@NotNull instruction: Instruction, @NotNull bindingContext: BindingContext): VariableDescriptor? defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeUtil[JavaMethodDescriptor]

'instruction' @ [552:21] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables.<anonymous>[ValueParameterDescriptorImpl]

'trace' @ [552:34] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'bindingContext' @ [552:40] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'variableDescriptor' @ [553:17] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables.<anonymous>[LocalVariableDescriptor]

'!' @ [554:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'declaredVariables' @ [554:21] ==> val declaredVariables: Set<VariableDescriptor> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables.<anonymous>[LocalVariableDescriptor]

'contains' @ [554:39] ==> public abstract fun contains(element: VariableDescriptor): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'variableDescriptor' @ [554:48] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables.<anonymous>[LocalVariableDescriptor]

'!' @ [555:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isLocal' @ [555:43] ==> public open fun isLocal(containerOfTheCurrentLocality: (DeclarationDescriptor..DeclarationDescriptor?), candidate: (DeclarationDescriptor..DeclarationDescriptor?)): Boolean defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingUtils[JavaMethodDescriptor]

'variableDescriptor' @ [555:51] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables.<anonymous>[LocalVariableDescriptor]

'containingDeclaration' @ [555:70] ==> public final val VariableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'variableDescriptor' @ [555:93] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables.<anonymous>[LocalVariableDescriptor]

'enterData' @ [558:36] ==> value-parameter enterData: ImmutableMap<VariableDescriptor, VariableUseState> /* = Map<VariableDescriptor, VariableUseState> */ defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables.<anonymous>[ValueParameterDescriptorImpl]

'getOrNull' @ [558:46] ==> public fun <K, V> ImmutableMap<VariableDescriptor, VariableUseState> /* = Map<VariableDescriptor, VariableUseState> */.getOrNull(k: VariableDescriptor): VariableUseState? defined in org.jetbrains.kotlin.cfg[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> VariableDescriptor
    <V> -> VariableUseState

'variableDescriptor' @ [558:56] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables.<anonymous>[LocalVariableDescriptor]

'when (instruction) {
                is WriteValueInstruction -> {
                    if (trace.get(CAPTURED_IN_CLOSURE, variableDescriptor) != null) return@traverse
                    val expressionInQuestion = instruction.element as? KtExpression ?: return@traverse
                    if (variableUseState != READ) {
                        unusedValueExpressions.put(expressionInQuestion, variableDescriptor to ctxt)
                    }
                    else {
                        usedValueExpressions.add(expressionInQuestion)
                    }
                }
                is VariableDeclarationInstruction -> {
                    val element = instruction.variableDeclarationElement as? KtNamedDeclaration ?: return@traverse
                    processUnusedDeclaration(element, variableDescriptor, ctxt, variableUseState)
                }
            }' @ [559:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any?, entry1: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any?

'instruction' @ [559:19] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables.<anonymous>[ValueParameterDescriptorImpl]

'trace' @ [561:25] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'get' @ [561:31] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(VariableDescriptor..VariableDescriptor?), (CaptureKind..CaptureKind?)>..ReadOnlySlice<(VariableDescriptor..VariableDescriptor?), (CaptureKind..CaptureKind?)>?), key: (VariableDescriptor..VariableDescriptor?)): CaptureKind? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> VariableDescriptor
    <V : (Any..Any?)> -> CaptureKind

'CAPTURED_IN_CLOSURE' @ [561:35] ==> public final val CAPTURED_IN_CLOSURE: (WritableSlice<(VariableDescriptor..VariableDescriptor?), (CaptureKind..CaptureKind?)>..WritableSlice<(VariableDescriptor..VariableDescriptor?), (CaptureKind..CaptureKind?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'variableDescriptor' @ [561:56] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables.<anonymous>[LocalVariableDescriptor]

'instruction' @ [562:48] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [562:60] ==> public open val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.WriteValueInstruction[PropertyDescriptorImpl]

'if (variableUseState != READ) {
                        unusedValueExpressions.put(expressionInQuestion, variableDescriptor to ctxt)
                    }
                    else {
                        usedValueExpressions.add(expressionInQuestion)
                    }' @ [563:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Serializable?, elseBranch: Serializable?): Serializable?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Serializable?

'variableUseState' @ [563:25] ==> val variableUseState: VariableUseState? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables.<anonymous>[LocalVariableDescriptor]

'READ' @ [563:45] ==> enum entry READ defined in org.jetbrains.kotlin.cfg.VariableUseState[FakeCallableDescriptorForObject]

'unusedValueExpressions' @ [564:25] ==> val unusedValueExpressions: HashMap<KtExpression, Pair<VariableDescriptor, ControlFlowInformationProvider.VariableUseContext>> /* = HashMap<KtExpression, Pair<VariableDescriptor, ControlFlowInformationProvider.VariableUseContext>> */ defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables[LocalVariableDescriptor]

'put' @ [564:48] ==> public open fun put(key: KtExpression, value: Pair<VariableDescriptor, ControlFlowInformationProvider.VariableUseContext>): Pair<VariableDescriptor, ControlFlowInformationProvider.VariableUseContext>? defined in java.util.HashMap[JavaMethodDescriptor]

'expressionInQuestion' @ [564:52] ==> val expressionInQuestion: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables.<anonymous>[LocalVariableDescriptor]

'variableDescriptor' @ [564:74] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables.<anonymous>[LocalVariableDescriptor]

'ctxt' @ [564:96] ==> val ctxt: ControlFlowInformationProvider.VariableUseContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables.<anonymous>[LocalVariableDescriptor]

'usedValueExpressions' @ [567:25] ==> val usedValueExpressions: HashSet<KtExpression> /* = HashSet<KtExpression> */ defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables[LocalVariableDescriptor]

'add' @ [567:46] ==> public open fun add(element: KtExpression): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'expressionInQuestion' @ [567:50] ==> val expressionInQuestion: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables.<anonymous>[LocalVariableDescriptor]

'instruction' @ [571:35] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables.<anonymous>[ValueParameterDescriptorImpl]

'variableDeclarationElement' @ [571:47] ==> public final val variableDeclarationElement: KtDeclaration defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.VariableDeclarationInstruction[PropertyDescriptorImpl]

'processUnusedDeclaration' @ [572:21] ==> private final fun processUnusedDeclaration(element: KtNamedDeclaration, variableDescriptor: VariableDescriptor, ctxt: ControlFlowInformationProvider.VariableUseContext, variableUseState: VariableUseState?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'element' @ [572:46] ==> val element: KtNamedDeclaration defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables.<anonymous>[LocalVariableDescriptor]

'variableDescriptor' @ [572:55] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables.<anonymous>[LocalVariableDescriptor]

'ctxt' @ [572:75] ==> val ctxt: ControlFlowInformationProvider.VariableUseContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables.<anonymous>[LocalVariableDescriptor]

'variableUseState' @ [572:81] ==> val variableUseState: VariableUseState? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables.<anonymous>[LocalVariableDescriptor]

'unusedValueExpressions' @ [576:9] ==> val unusedValueExpressions: HashMap<KtExpression, Pair<VariableDescriptor, ControlFlowInformationProvider.VariableUseContext>> /* = HashMap<KtExpression, Pair<VariableDescriptor, ControlFlowInformationProvider.VariableUseContext>> */ defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables[LocalVariableDescriptor]

'keys' @ [576:32] ==> public open val keys: MutableSet<KtExpression> defined in java.util.HashMap[JavaPropertyDescriptor]

'removeAll' @ [576:37] ==> public abstract fun removeAll(elements: Collection<KtExpression>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'usedValueExpressions' @ [576:47] ==> val usedValueExpressions: HashSet<KtExpression> /* = HashSet<KtExpression> */ defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables[LocalVariableDescriptor]

'component1' @ [577:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<KtExpression, Pair<VariableDescriptor, ControlFlowInformationProvider.VariableUseContext>>.component1(): KtExpression defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtExpression
    <V> -> Pair<VariableDescriptor, VariableUseContext>

'component2' @ [577:37] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<KtExpression, Pair<VariableDescriptor, ControlFlowInformationProvider.VariableUseContext>>.component2(): Pair<VariableDescriptor, ControlFlowInformationProvider.VariableUseContext> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtExpression
    <V> -> Pair<VariableDescriptor, VariableUseContext>

'unusedValueExpressions' @ [577:59] ==> val unusedValueExpressions: HashMap<KtExpression, Pair<VariableDescriptor, ControlFlowInformationProvider.VariableUseContext>> /* = HashMap<KtExpression, Pair<VariableDescriptor, ControlFlowInformationProvider.VariableUseContext>> */ defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables[LocalVariableDescriptor]

'component1' @ [578:18] ==> public final operator fun component1(): VariableDescriptor defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [578:38] ==> public final operator fun component2(): ControlFlowInformationProvider.VariableUseContext defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'variableInContext' @ [578:46] ==> val variableInContext: Pair<VariableDescriptor, ControlFlowInformationProvider.VariableUseContext> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables[LocalVariableDescriptor]

'when (expressionInQuestion) {
                is KtBinaryExpression -> if (expressionInQuestion.operationToken === KtTokens.EQ) {
                    expressionInQuestion.right?.let {
                        report(Errors.UNUSED_VALUE.on(expressionInQuestion, it, variableDescriptor), ctxt)
                    }
                }
                is KtPostfixExpression -> {
                    val operationToken = expressionInQuestion.operationReference.getReferencedNameElementType()
                    if (operationToken === KtTokens.PLUSPLUS || operationToken === KtTokens.MINUSMINUS) {
                        report(Errors.UNUSED_CHANGED_VALUE.on(expressionInQuestion, expressionInQuestion), ctxt)
                    }
                }
            }' @ [579:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'expressionInQuestion' @ [579:19] ==> val expressionInQuestion: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables[LocalVariableDescriptor]

'expressionInQuestion' @ [580:46] ==> val expressionInQuestion: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables[LocalVariableDescriptor]

'operationToken' @ [580:67] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'EQ' @ [580:95] ==> public final val EQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'expressionInQuestion' @ [581:21] ==> val expressionInQuestion: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables[LocalVariableDescriptor]

'right' @ [581:42] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'let' @ [581:49] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> Unit

'report' @ [582:25] ==> private final fun report(diagnostic: Diagnostic, ctxt: ControlFlowInformationProvider.VariableContext): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'UNUSED_VALUE' @ [582:39] ==> public final val UNUSED_VALUE: (DiagnosticFactory2<(KtBinaryExpression..KtBinaryExpression?), (KtElement..KtElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..DiagnosticFactory2<(KtBinaryExpression..KtBinaryExpression?), (KtElement..KtElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [582:52] ==> @NotNull public open fun on(@NotNull element: KtBinaryExpression, @NotNull a: KtElement, @NotNull b: DeclarationDescriptor): ParametrizedDiagnostic<(KtBinaryExpression..KtBinaryExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'expressionInQuestion' @ [582:55] ==> val expressionInQuestion: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables[LocalVariableDescriptor]

'it' @ [582:77] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables.<anonymous>[ValueParameterDescriptorImpl]

'variableDescriptor' @ [582:81] ==> val variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables[LocalVariableDescriptor]

'ctxt' @ [582:102] ==> val ctxt: ControlFlowInformationProvider.VariableUseContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables[LocalVariableDescriptor]

'expressionInQuestion' @ [586:42] ==> val expressionInQuestion: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables[LocalVariableDescriptor]

'operationReference' @ [586:63] ==> public final val KtPostfixExpression.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'getReferencedNameElementType' @ [586:82] ==> public abstract fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[SimpleFunctionDescriptorImpl]

'operationToken' @ [587:25] ==> val operationToken: IElementType defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables[LocalVariableDescriptor]

'PLUSPLUS' @ [587:53] ==> public final val PLUSPLUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'operationToken' @ [587:65] ==> val operationToken: IElementType defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables[LocalVariableDescriptor]

'MINUSMINUS' @ [587:93] ==> public final val MINUSMINUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'report' @ [588:25] ==> private final fun report(diagnostic: Diagnostic, ctxt: ControlFlowInformationProvider.VariableContext): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'UNUSED_CHANGED_VALUE' @ [588:39] ==> public final val UNUSED_CHANGED_VALUE: (DiagnosticFactory1<(KtElement..KtElement?), (KtElement..KtElement?)>..DiagnosticFactory1<(KtElement..KtElement?), (KtElement..KtElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [588:60] ==> @NotNull public open fun on(@NotNull element: KtElement, @NotNull argument: KtElement): ParametrizedDiagnostic<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'expressionInQuestion' @ [588:63] ==> val expressionInQuestion: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables[LocalVariableDescriptor]

'expressionInQuestion' @ [588:85] ==> val expressionInQuestion: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables[LocalVariableDescriptor]

'ctxt' @ [588:108] ==> val ctxt: ControlFlowInformationProvider.VariableUseContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedVariables[LocalVariableDescriptor]

'element' @ [601:9] ==> value-parameter element: KtNamedDeclaration defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedDeclaration[ValueParameterDescriptorImpl]

'nameIdentifier' @ [601:17] ==> public final val KtNamedDeclaration.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'if (!VariableUseState.isUsed(variableUseState)) {
            if (element.isSingleUnderscore) return
            when {
                // KtDestructuringDeclarationEntry -> KtDestructuringDeclaration -> KtParameter -> KtParameterList
                element is KtDestructuringDeclarationEntry && element.parent.parent?.parent is KtParameterList ->
                    report(Errors.UNUSED_DESTRUCTURED_PARAMETER_ENTRY.on(element, variableDescriptor), ctxt)

                KtPsiUtil.isRemovableVariableDeclaration(element) ->
                    report(Errors.UNUSED_VARIABLE.on(element, variableDescriptor), ctxt)

                element is KtParameter ->
                    processUnusedParameter(ctxt, element, variableDescriptor)
            }
        }
        else if (variableUseState === ONLY_WRITTEN_NEVER_READ && KtPsiUtil.isRemovableVariableDeclaration(element)) {
            report(Errors.ASSIGNED_BUT_NEVER_ACCESSED_VARIABLE.on(element, variableDescriptor), ctxt)
        }
        else if (variableUseState === WRITTEN_AFTER_READ && element is KtVariableDeclaration) {
            when (element) {
                is KtProperty ->
                    element.initializer?.let {
                        report(Errors.VARIABLE_WITH_REDUNDANT_INITIALIZER.on(it, variableDescriptor), ctxt)
                    }
                is KtDestructuringDeclarationEntry ->
                    report(VARIABLE_WITH_REDUNDANT_INITIALIZER.on(element, variableDescriptor), ctxt)
            }
        }' @ [602:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [602:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'VariableUseState' @ [602:14] ==> public companion object defined in org.jetbrains.kotlin.cfg.VariableUseState[FakeCallableDescriptorForObject]

'isUsed' @ [602:31] ==> @JvmStatic public final fun isUsed(variableUseState: VariableUseState?): Boolean defined in org.jetbrains.kotlin.cfg.VariableUseState.Companion[SimpleFunctionDescriptorImpl]

'variableUseState' @ [602:38] ==> value-parameter variableUseState: VariableUseState? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedDeclaration[ValueParameterDescriptorImpl]

'element' @ [603:17] ==> value-parameter element: KtNamedDeclaration defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedDeclaration[ValueParameterDescriptorImpl]

'isSingleUnderscore' @ [603:25] ==> public val KtNamedDeclaration.isSingleUnderscore: Boolean defined in org.jetbrains.kotlin.resolve.calls.util in file underscoreUtil.kt[PropertyDescriptorImpl]

'when {
                // KtDestructuringDeclarationEntry -> KtDestructuringDeclaration -> KtParameter -> KtParameterList
                element is KtDestructuringDeclarationEntry && element.parent.parent?.parent is KtParameterList ->
                    report(Errors.UNUSED_DESTRUCTURED_PARAMETER_ENTRY.on(element, variableDescriptor), ctxt)

                KtPsiUtil.isRemovableVariableDeclaration(element) ->
                    report(Errors.UNUSED_VARIABLE.on(element, variableDescriptor), ctxt)

                element is KtParameter ->
                    processUnusedParameter(ctxt, element, variableDescriptor)
            }' @ [604:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'element' @ [606:17] ==> value-parameter element: KtNamedDeclaration defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedDeclaration[ValueParameterDescriptorImpl]

'element' @ [606:63] ==> value-parameter element: KtNamedDeclaration defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedDeclaration[ValueParameterDescriptorImpl]

'parent' @ [606:71] ==> public final val KtDestructuringDeclarationEntry.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [606:78] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [606:86] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'report' @ [607:21] ==> private final fun report(diagnostic: Diagnostic, ctxt: ControlFlowInformationProvider.VariableContext): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'UNUSED_DESTRUCTURED_PARAMETER_ENTRY' @ [607:35] ==> public final val UNUSED_DESTRUCTURED_PARAMETER_ENTRY: (DiagnosticFactory1<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?), (VariableDescriptor..VariableDescriptor?)>..DiagnosticFactory1<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [607:71] ==> @NotNull public open fun on(@NotNull element: KtDestructuringDeclarationEntry, @NotNull argument: VariableDescriptor): ParametrizedDiagnostic<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'element' @ [607:74] ==> value-parameter element: KtNamedDeclaration defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedDeclaration[ValueParameterDescriptorImpl]

'variableDescriptor' @ [607:83] ==> value-parameter variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedDeclaration[ValueParameterDescriptorImpl]

'ctxt' @ [607:104] ==> value-parameter ctxt: ControlFlowInformationProvider.VariableUseContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedDeclaration[ValueParameterDescriptorImpl]

'isRemovableVariableDeclaration' @ [609:27] ==> public open fun isRemovableVariableDeclaration(@NotNull declaration: KtDeclaration): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'element' @ [609:58] ==> value-parameter element: KtNamedDeclaration defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedDeclaration[ValueParameterDescriptorImpl]

'report' @ [610:21] ==> private final fun report(diagnostic: Diagnostic, ctxt: ControlFlowInformationProvider.VariableContext): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'UNUSED_VARIABLE' @ [610:35] ==> public final val UNUSED_VARIABLE: (DiagnosticFactory1<(KtNamedDeclaration..KtNamedDeclaration?), (VariableDescriptor..VariableDescriptor?)>..DiagnosticFactory1<(KtNamedDeclaration..KtNamedDeclaration?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [610:51] ==> @NotNull public open fun on(@NotNull element: KtNamedDeclaration, @NotNull argument: VariableDescriptor): ParametrizedDiagnostic<(KtNamedDeclaration..KtNamedDeclaration?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'element' @ [610:54] ==> value-parameter element: KtNamedDeclaration defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedDeclaration[ValueParameterDescriptorImpl]

'variableDescriptor' @ [610:63] ==> value-parameter variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedDeclaration[ValueParameterDescriptorImpl]

'ctxt' @ [610:84] ==> value-parameter ctxt: ControlFlowInformationProvider.VariableUseContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedDeclaration[ValueParameterDescriptorImpl]

'element' @ [612:17] ==> value-parameter element: KtNamedDeclaration defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedDeclaration[ValueParameterDescriptorImpl]

'processUnusedParameter' @ [613:21] ==> private final fun processUnusedParameter(ctxt: ControlFlowInformationProvider.VariableUseContext, element: KtParameter, variableDescriptor: VariableDescriptor): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'ctxt' @ [613:44] ==> value-parameter ctxt: ControlFlowInformationProvider.VariableUseContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedDeclaration[ValueParameterDescriptorImpl]

'element' @ [613:50] ==> value-parameter element: KtNamedDeclaration defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedDeclaration[ValueParameterDescriptorImpl]

'variableDescriptor' @ [613:59] ==> value-parameter variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedDeclaration[ValueParameterDescriptorImpl]

'if (variableUseState === ONLY_WRITTEN_NEVER_READ && KtPsiUtil.isRemovableVariableDeclaration(element)) {
            report(Errors.ASSIGNED_BUT_NEVER_ACCESSED_VARIABLE.on(element, variableDescriptor), ctxt)
        }
        else if (variableUseState === WRITTEN_AFTER_READ && element is KtVariableDeclaration) {
            when (element) {
                is KtProperty ->
                    element.initializer?.let {
                        report(Errors.VARIABLE_WITH_REDUNDANT_INITIALIZER.on(it, variableDescriptor), ctxt)
                    }
                is KtDestructuringDeclarationEntry ->
                    report(VARIABLE_WITH_REDUNDANT_INITIALIZER.on(element, variableDescriptor), ctxt)
            }
        }' @ [616:14] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'variableUseState' @ [616:18] ==> value-parameter variableUseState: VariableUseState? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedDeclaration[ValueParameterDescriptorImpl]

'ONLY_WRITTEN_NEVER_READ' @ [616:39] ==> enum entry ONLY_WRITTEN_NEVER_READ defined in org.jetbrains.kotlin.cfg.VariableUseState[FakeCallableDescriptorForObject]

'isRemovableVariableDeclaration' @ [616:76] ==> public open fun isRemovableVariableDeclaration(@NotNull declaration: KtDeclaration): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'element' @ [616:107] ==> value-parameter element: KtNamedDeclaration defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedDeclaration[ValueParameterDescriptorImpl]

'report' @ [617:13] ==> private final fun report(diagnostic: Diagnostic, ctxt: ControlFlowInformationProvider.VariableContext): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'ASSIGNED_BUT_NEVER_ACCESSED_VARIABLE' @ [617:27] ==> public final val ASSIGNED_BUT_NEVER_ACCESSED_VARIABLE: (DiagnosticFactory1<(KtNamedDeclaration..KtNamedDeclaration?), (VariableDescriptor..VariableDescriptor?)>..DiagnosticFactory1<(KtNamedDeclaration..KtNamedDeclaration?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [617:64] ==> @NotNull public open fun on(@NotNull element: KtNamedDeclaration, @NotNull argument: VariableDescriptor): ParametrizedDiagnostic<(KtNamedDeclaration..KtNamedDeclaration?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'element' @ [617:67] ==> value-parameter element: KtNamedDeclaration defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedDeclaration[ValueParameterDescriptorImpl]

'variableDescriptor' @ [617:76] ==> value-parameter variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedDeclaration[ValueParameterDescriptorImpl]

'ctxt' @ [617:97] ==> value-parameter ctxt: ControlFlowInformationProvider.VariableUseContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedDeclaration[ValueParameterDescriptorImpl]

'variableUseState' @ [619:18] ==> value-parameter variableUseState: VariableUseState? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedDeclaration[ValueParameterDescriptorImpl]

'WRITTEN_AFTER_READ' @ [619:39] ==> enum entry WRITTEN_AFTER_READ defined in org.jetbrains.kotlin.cfg.VariableUseState[FakeCallableDescriptorForObject]

'element' @ [619:61] ==> value-parameter element: KtNamedDeclaration defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedDeclaration[ValueParameterDescriptorImpl]

'when (element) {
                is KtProperty ->
                    element.initializer?.let {
                        report(Errors.VARIABLE_WITH_REDUNDANT_INITIALIZER.on(it, variableDescriptor), ctxt)
                    }
                is KtDestructuringDeclarationEntry ->
                    report(VARIABLE_WITH_REDUNDANT_INITIALIZER.on(element, variableDescriptor), ctxt)
            }' @ [620:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit?, entry1: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit?

'element' @ [620:19] ==> value-parameter element: KtNamedDeclaration defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedDeclaration[ValueParameterDescriptorImpl]

'element' @ [622:21] ==> value-parameter element: KtNamedDeclaration defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedDeclaration[ValueParameterDescriptorImpl]

'initializer' @ [622:29] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

'let' @ [622:42] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> Unit

'report' @ [623:25] ==> private final fun report(diagnostic: Diagnostic, ctxt: ControlFlowInformationProvider.VariableContext): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'VARIABLE_WITH_REDUNDANT_INITIALIZER' @ [623:39] ==> public final val VARIABLE_WITH_REDUNDANT_INITIALIZER: (DiagnosticFactory1<(KtExpression..KtExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..DiagnosticFactory1<(KtExpression..KtExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [623:75] ==> @NotNull public open fun on(@NotNull element: KtExpression, @NotNull argument: DeclarationDescriptor): ParametrizedDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'it' @ [623:78] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'variableDescriptor' @ [623:82] ==> value-parameter variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedDeclaration[ValueParameterDescriptorImpl]

'ctxt' @ [623:103] ==> value-parameter ctxt: ControlFlowInformationProvider.VariableUseContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedDeclaration[ValueParameterDescriptorImpl]

'report' @ [626:21] ==> private final fun report(diagnostic: Diagnostic, ctxt: ControlFlowInformationProvider.VariableContext): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'VARIABLE_WITH_REDUNDANT_INITIALIZER' @ [626:28] ==> public final val VARIABLE_WITH_REDUNDANT_INITIALIZER: (DiagnosticFactory1<(KtExpression..KtExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..DiagnosticFactory1<(KtExpression..KtExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [626:64] ==> @NotNull public open fun on(@NotNull element: KtExpression, @NotNull argument: DeclarationDescriptor): ParametrizedDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'element' @ [626:67] ==> value-parameter element: KtNamedDeclaration defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedDeclaration[ValueParameterDescriptorImpl]

'variableDescriptor' @ [626:76] ==> value-parameter variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedDeclaration[ValueParameterDescriptorImpl]

'ctxt' @ [626:97] ==> value-parameter ctxt: ControlFlowInformationProvider.VariableUseContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedDeclaration[ValueParameterDescriptorImpl]

'element' @ [632:21] ==> value-parameter element: KtParameter defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedParameter[ValueParameterDescriptorImpl]

'parent' @ [632:29] ==> public final val KtParameter.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [632:36] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (owner) {
            is KtPrimaryConstructor -> if (!element.hasValOrVar()) {
                val containingClass = owner.getContainingClassOrObject()
                val containingClassDescriptor = trace.get(DECLARATION_TO_DESCRIPTOR, containingClass) as? ClassDescriptor
                if (!DescriptorUtils.isAnnotationClass(containingClassDescriptor) && containingClassDescriptor?.isHeader == false &&
                    !containingClassDescriptor.isEffectivelyExternal()
                ) {
                    report(UNUSED_PARAMETER.on(element, variableDescriptor), ctxt)
                }
            }
            is KtFunction -> {
                val anonymous = owner is KtFunctionLiteral || owner is KtNamedFunction && owner.name == null
                if (anonymous && !languageVersionSettings.supportsFeature(LanguageFeature.SingleUnderscoreForParameterName)) {
                    return
                }
                val mainFunctionDetector = MainFunctionDetector(trace.bindingContext)
                val isMain = owner is KtNamedFunction && mainFunctionDetector.isMain(owner)
                val functionDescriptor =
                        trace.get(DECLARATION_TO_DESCRIPTOR, owner) as? FunctionDescriptor
                        ?: throw AssertionError(owner.text)
                val functionName = functionDescriptor.name
                if (isMain
                    || functionDescriptor.isOverridableOrOverrides
                    || owner.hasModifier(KtTokens.OVERRIDE_KEYWORD)
                    || functionDescriptor.isHeader || functionDescriptor.isImpl
                    || functionDescriptor.isEffectivelyExternal()
                    || OperatorNameConventions.GET_VALUE == functionName
                    || OperatorNameConventions.SET_VALUE == functionName
                    || OperatorNameConventions.PROVIDE_DELEGATE == functionName) {
                    return
                }
                if (anonymous) {
                    report(UNUSED_ANONYMOUS_PARAMETER.on(element, variableDescriptor), ctxt)
                }
                else {
                    report(UNUSED_PARAMETER.on(element, variableDescriptor), ctxt)
                }
            }
        }' @ [633:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'owner' @ [633:15] ==> val owner: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedParameter[LocalVariableDescriptor]

'!' @ [634:44] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [634:45] ==> value-parameter element: KtParameter defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedParameter[ValueParameterDescriptorImpl]

'hasValOrVar' @ [634:53] ==> public open fun hasValOrVar(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'owner' @ [635:39] ==> val owner: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedParameter[LocalVariableDescriptor]

'getContainingClassOrObject' @ [635:45] ==> public open fun getContainingClassOrObject(): KtClassOrObject defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor[SimpleFunctionDescriptorImpl]

'trace' @ [636:49] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'get' @ [636:55] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?), key: (PsiElement..PsiElement?)): DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> DeclarationDescriptor

'DECLARATION_TO_DESCRIPTOR' @ [636:59] ==> @SuppressWarnings public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'containingClass' @ [636:86] ==> val containingClass: KtClassOrObject defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedParameter[LocalVariableDescriptor]

'!' @ [637:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isAnnotationClass' @ [637:38] ==> public open fun isAnnotationClass(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'containingClassDescriptor' @ [637:56] ==> val containingClassDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedParameter[LocalVariableDescriptor]

'containingClassDescriptor' @ [637:86] ==> val containingClassDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedParameter[LocalVariableDescriptor]

'isHeader' @ [637:113] ==> public final val ClassDescriptor.isHeader: Boolean[MyPropertyDescriptor]

'!' @ [638:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'containingClassDescriptor' @ [638:22] ==> val containingClassDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedParameter[LocalVariableDescriptor]

'isEffectivelyExternal' @ [638:48] ==> public fun MemberDescriptor.isEffectivelyExternal(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'report' @ [640:21] ==> private final fun report(diagnostic: Diagnostic, ctxt: ControlFlowInformationProvider.VariableContext): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'UNUSED_PARAMETER' @ [640:28] ==> public final val UNUSED_PARAMETER: (DiagnosticFactory1<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>..DiagnosticFactory1<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [640:45] ==> @NotNull public open fun on(@NotNull element: KtParameter, @NotNull argument: VariableDescriptor): ParametrizedDiagnostic<(KtParameter..KtParameter?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'element' @ [640:48] ==> value-parameter element: KtParameter defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedParameter[ValueParameterDescriptorImpl]

'variableDescriptor' @ [640:57] ==> value-parameter variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedParameter[ValueParameterDescriptorImpl]

'ctxt' @ [640:78] ==> value-parameter ctxt: ControlFlowInformationProvider.VariableUseContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedParameter[ValueParameterDescriptorImpl]

'owner' @ [644:33] ==> val owner: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedParameter[LocalVariableDescriptor]

'owner' @ [644:63] ==> val owner: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedParameter[LocalVariableDescriptor]

'owner' @ [644:91] ==> val owner: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedParameter[LocalVariableDescriptor]

'name' @ [644:97] ==> public final val KtNamedFunction.name: String?[MyPropertyDescriptor]

'anonymous' @ [645:21] ==> val anonymous: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedParameter[LocalVariableDescriptor]

'!' @ [645:34] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'languageVersionSettings' @ [645:35] ==> private final val languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'supportsFeature' @ [645:59] ==> public open fun supportsFeature(feature: LanguageFeature): Boolean defined in org.jetbrains.kotlin.config.LanguageVersionSettings[DeserializedSimpleFunctionDescriptor]

'LanguageFeature' @ [645:75] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'SingleUnderscoreForParameterName' @ [645:91] ==> enum entry SingleUnderscoreForParameterName defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'MainFunctionDetector' @ [648:44] ==> public constructor MainFunctionDetector(bindingContext: BindingContext) defined in org.jetbrains.kotlin.idea.MainFunctionDetector[ClassConstructorDescriptorImpl]

'trace' @ [648:65] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'bindingContext' @ [648:71] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'owner' @ [649:30] ==> val owner: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedParameter[LocalVariableDescriptor]

'mainFunctionDetector' @ [649:58] ==> val mainFunctionDetector: MainFunctionDetector defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedParameter[LocalVariableDescriptor]

'isMain' @ [649:79] ==> @JvmOverloads public final fun isMain(function: KtNamedFunction, checkJvmStaticAnnotation: Boolean = ...): Boolean defined in org.jetbrains.kotlin.idea.MainFunctionDetector[SimpleFunctionDescriptorImpl]

'owner' @ [649:86] ==> val owner: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedParameter[LocalVariableDescriptor]

'trace' @ [651:25] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'get' @ [651:31] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?), key: (PsiElement..PsiElement?)): DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> DeclarationDescriptor

'DECLARATION_TO_DESCRIPTOR' @ [651:35] ==> @SuppressWarnings public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'owner' @ [651:62] ==> val owner: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedParameter[LocalVariableDescriptor]

'AssertionError' @ [652:34] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'owner' @ [652:49] ==> val owner: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedParameter[LocalVariableDescriptor]

'text' @ [652:55] ==> public final val KtFunction.text: (String..String?)[MyPropertyDescriptor]

'functionDescriptor' @ [653:36] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedParameter[LocalVariableDescriptor]

'name' @ [653:55] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'isMain' @ [654:21] ==> val isMain: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedParameter[LocalVariableDescriptor]

'functionDescriptor' @ [655:24] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedParameter[LocalVariableDescriptor]

'isOverridableOrOverrides' @ [655:43] ==> public val CallableMemberDescriptor.isOverridableOrOverrides: Boolean defined in org.jetbrains.kotlin.descriptors[DeserializedPropertyDescriptor]

'owner' @ [656:24] ==> val owner: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedParameter[LocalVariableDescriptor]

'hasModifier' @ [656:30] ==> public abstract fun hasModifier(@NotNull modifier: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtFunction[JavaMethodDescriptor]

'OVERRIDE_KEYWORD' @ [656:51] ==> public final val OVERRIDE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'functionDescriptor' @ [657:24] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedParameter[LocalVariableDescriptor]

'isHeader' @ [657:43] ==> public final val FunctionDescriptor.isHeader: Boolean[MyPropertyDescriptor]

'functionDescriptor' @ [657:55] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedParameter[LocalVariableDescriptor]

'isImpl' @ [657:74] ==> public final val FunctionDescriptor.isImpl: Boolean[MyPropertyDescriptor]

'functionDescriptor' @ [658:24] ==> val functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedParameter[LocalVariableDescriptor]

'isEffectivelyExternal' @ [658:43] ==> public fun MemberDescriptor.isEffectivelyExternal(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'OperatorNameConventions' @ [659:24] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'GET_VALUE' @ [659:48] ==> @field:JvmField public final val GET_VALUE: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'functionName' @ [659:61] ==> val functionName: Name defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedParameter[LocalVariableDescriptor]

'OperatorNameConventions' @ [660:24] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'SET_VALUE' @ [660:48] ==> @field:JvmField public final val SET_VALUE: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'functionName' @ [660:61] ==> val functionName: Name defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedParameter[LocalVariableDescriptor]

'OperatorNameConventions' @ [661:24] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'PROVIDE_DELEGATE' @ [661:48] ==> @field:JvmField public final val PROVIDE_DELEGATE: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'functionName' @ [661:68] ==> val functionName: Name defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedParameter[LocalVariableDescriptor]

'if (anonymous) {
                    report(UNUSED_ANONYMOUS_PARAMETER.on(element, variableDescriptor), ctxt)
                }
                else {
                    report(UNUSED_PARAMETER.on(element, variableDescriptor), ctxt)
                }' @ [664:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'anonymous' @ [664:21] ==> val anonymous: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedParameter[LocalVariableDescriptor]

'report' @ [665:21] ==> private final fun report(diagnostic: Diagnostic, ctxt: ControlFlowInformationProvider.VariableContext): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'UNUSED_ANONYMOUS_PARAMETER' @ [665:28] ==> public final val UNUSED_ANONYMOUS_PARAMETER: (DiagnosticFactory1<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>..DiagnosticFactory1<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [665:55] ==> @NotNull public open fun on(@NotNull element: KtParameter, @NotNull argument: VariableDescriptor): ParametrizedDiagnostic<(KtParameter..KtParameter?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'element' @ [665:58] ==> value-parameter element: KtParameter defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedParameter[ValueParameterDescriptorImpl]

'variableDescriptor' @ [665:67] ==> value-parameter variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedParameter[ValueParameterDescriptorImpl]

'ctxt' @ [665:88] ==> value-parameter ctxt: ControlFlowInformationProvider.VariableUseContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedParameter[ValueParameterDescriptorImpl]

'report' @ [668:21] ==> private final fun report(diagnostic: Diagnostic, ctxt: ControlFlowInformationProvider.VariableContext): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'UNUSED_PARAMETER' @ [668:28] ==> public final val UNUSED_PARAMETER: (DiagnosticFactory1<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>..DiagnosticFactory1<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [668:45] ==> @NotNull public open fun on(@NotNull element: KtParameter, @NotNull argument: VariableDescriptor): ParametrizedDiagnostic<(KtParameter..KtParameter?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'element' @ [668:48] ==> value-parameter element: KtParameter defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedParameter[ValueParameterDescriptorImpl]

'variableDescriptor' @ [668:57] ==> value-parameter variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedParameter[ValueParameterDescriptorImpl]

'ctxt' @ [668:78] ==> value-parameter ctxt: ControlFlowInformationProvider.VariableUseContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.processUnusedParameter[ValueParameterDescriptorImpl]

'hashMapOf' @ [678:37] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<Instruction, DiagnosticFactory<*>> /* = HashMap<Instruction, DiagnosticFactory<*>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Instruction
    <V> -> DiagnosticFactory<*>

'pseudocode' @ [679:9] ==> private final val pseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'traverse' @ [679:20] ==> public fun Pseudocode.traverse(traversalOrder: TraversalOrder, analyzeInstruction: (Instruction) -> Unit): Unit defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser[SimpleFunctionDescriptorImpl]

'FORWARD' @ [679:44] ==> enum entry FORWARD defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.TraversalOrder[FakeCallableDescriptorForObject]

'instruction' @ [680:17] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedExpressions.<anonymous>[ValueParameterDescriptorImpl]

'instruction' @ [682:27] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedExpressions.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [682:39] ==> public abstract val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.KtElementInstruction[PropertyDescriptorImpl]

'element' @ [684:17] ==> val element: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedExpressions.<anonymous>[LocalVariableDescriptor]

'isUsedAsStatement' @ [684:25] ==> public fun KtExpression.isUsedAsStatement(context: BindingContext): Boolean defined in org.jetbrains.kotlin.resolve.bindingContextUtil in file BindingContextUtils.kt[SimpleFunctionDescriptorImpl]

'trace' @ [684:43] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'bindingContext' @ [684:49] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'instruction' @ [684:68] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedExpressions.<anonymous>[ValueParameterDescriptorImpl]

'sideEffectFree' @ [684:80] ==> public val Instruction.sideEffectFree: Boolean defined in org.jetbrains.kotlin.cfg.pseudocode in file pseudocodeUtils.kt[PropertyDescriptorImpl]

'VariableContext' @ [685:31] ==> public constructor VariableContext(instruction: Instruction, reportedDiagnosticMap: MutableMap<Instruction, DiagnosticFactory<*>>) defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableContext[ClassConstructorDescriptorImpl]

'instruction' @ [685:47] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedExpressions.<anonymous>[ValueParameterDescriptorImpl]

'reportedDiagnosticMap' @ [685:60] ==> val reportedDiagnosticMap: HashMap<Instruction, DiagnosticFactory<*>> /* = HashMap<Instruction, DiagnosticFactory<*>> */ defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedExpressions[LocalVariableDescriptor]

'report' @ [686:17] ==> private final fun report(diagnostic: Diagnostic, ctxt: ControlFlowInformationProvider.VariableContext): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'when (element) {
                           is KtLambdaExpression -> Errors.UNUSED_LAMBDA_EXPRESSION.on(element)
                           else -> Errors.UNUSED_EXPRESSION.on(element)
                       }' @ [686:24] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: SimpleDiagnostic<out (KtElement..KtElement?)>, entry1: SimpleDiagnostic<out (KtElement..KtElement?)>): SimpleDiagnostic<out (KtElement..KtElement?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> SimpleDiagnostic<out (org.jetbrains.kotlin.psi.KtElement..org.jetbrains.kotlin.psi.KtElement?)>

'element' @ [686:30] ==> val element: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedExpressions.<anonymous>[LocalVariableDescriptor]

'UNUSED_LAMBDA_EXPRESSION' @ [687:60] ==> public final val UNUSED_LAMBDA_EXPRESSION: (DiagnosticFactory0<(KtLambdaExpression..KtLambdaExpression?)>..DiagnosticFactory0<(KtLambdaExpression..KtLambdaExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [687:85] ==> @NotNull public open fun on(@NotNull element: KtLambdaExpression): SimpleDiagnostic<(KtLambdaExpression..KtLambdaExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'element' @ [687:88] ==> val element: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedExpressions.<anonymous>[LocalVariableDescriptor]

'UNUSED_EXPRESSION' @ [688:43] ==> public final val UNUSED_EXPRESSION: (DiagnosticFactory0<(KtElement..KtElement?)>..DiagnosticFactory0<(KtElement..KtElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [688:61] ==> @NotNull public open fun on(@NotNull element: KtElement): SimpleDiagnostic<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'element' @ [688:64] ==> val element: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedExpressions.<anonymous>[LocalVariableDescriptor]

'context' @ [689:27] ==> val context: ControlFlowInformationProvider.VariableContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markUnusedExpressions.<anonymous>[LocalVariableDescriptor]

'pseudocode' @ [697:36] ==> private final val pseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'traverse' @ [697:47] ==> public fun Pseudocode.traverse(traversalOrder: TraversalOrder, analyzeInstruction: (Instruction) -> Unit): Unit defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser[SimpleFunctionDescriptorImpl]

'FORWARD' @ [697:71] ==> enum entry FORWARD defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.TraversalOrder[FakeCallableDescriptorForObject]

'instruction' @ [698:22] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markStatements.<anonymous>[ValueParameterDescriptorImpl]

'outputValue' @ [698:61] ==> public abstract val outputValue: PseudoValue? defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.InstructionWithValue[PropertyDescriptorImpl]

'instruction' @ [699:26] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markStatements.<anonymous>[ValueParameterDescriptorImpl]

'owner' @ [699:38] ==> public abstract var owner: Pseudocode defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.Instruction[PropertyDescriptorImpl]

'pseudocode' @ [700:22] ==> val pseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markStatements.<anonymous>[LocalVariableDescriptor]

'getUsages' @ [700:33] ==> public abstract fun getUsages(value: PseudoValue?): List<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocode.Pseudocode[SimpleFunctionDescriptorImpl]

'value' @ [700:43] ==> val value: PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markStatements.<anonymous>[LocalVariableDescriptor]

'!' @ [701:34] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'usages' @ [701:35] ==> val usages: List<Instruction> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markStatements.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [701:42] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'isUsedAsResultOfLambda' @ [702:38] ==> private final fun isUsedAsResultOfLambda(usages: List<Instruction>): Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion[SimpleFunctionDescriptorImpl]

'usages' @ [702:61] ==> val usages: List<Instruction> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markStatements.<anonymous>[LocalVariableDescriptor]

'pseudocode' @ [703:25] ==> val pseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markStatements.<anonymous>[LocalVariableDescriptor]

'getValueElements' @ [703:36] ==> public abstract fun getValueElements(value: PseudoValue?): List<KtElement> defined in org.jetbrains.kotlin.cfg.pseudocode.Pseudocode[SimpleFunctionDescriptorImpl]

'value' @ [703:53] ==> val value: PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markStatements.<anonymous>[LocalVariableDescriptor]

'trace' @ [704:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'record' @ [704:19] ==> public abstract fun <K : (Any..Any?), V : (Any..Any?)> record(slice: (WritableSlice<(KtElement..KtElement?), (Boolean..Boolean?)>..WritableSlice<(KtElement..KtElement?), (Boolean..Boolean?)>?), key: (KtElement..KtElement?), value: (Boolean..Boolean?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtElement
    <V : (Any..Any?)> -> Boolean

'USED_AS_EXPRESSION' @ [704:41] ==> public final val USED_AS_EXPRESSION: (WritableSlice<(KtElement..KtElement?), (Boolean..Boolean?)>..WritableSlice<(KtElement..KtElement?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'element' @ [704:61] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markStatements.<anonymous>[LocalVariableDescriptor]

'isUsedAsExpression' @ [704:70] ==> val isUsedAsExpression: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markStatements.<anonymous>[LocalVariableDescriptor]

'trace' @ [705:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'record' @ [705:19] ==> public abstract fun <K : (Any..Any?), V : (Any..Any?)> record(slice: (WritableSlice<(KtElement..KtElement?), (Boolean..Boolean?)>..WritableSlice<(KtElement..KtElement?), (Boolean..Boolean?)>?), key: (KtElement..KtElement?), value: (Boolean..Boolean?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtElement
    <V : (Any..Any?)> -> Boolean

'USED_AS_RESULT_OF_LAMBDA' @ [705:41] ==> public final val USED_AS_RESULT_OF_LAMBDA: (WritableSlice<(KtElement..KtElement?), (Boolean..Boolean?)>..WritableSlice<(KtElement..KtElement?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'element' @ [705:67] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markStatements.<anonymous>[LocalVariableDescriptor]

'isUsedAsResultOfLambda' @ [705:76] ==> val isUsedAsResultOfLambda: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markStatements.<anonymous>[LocalVariableDescriptor]

'pseudocode' @ [709:40] ==> private final val pseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'traverse' @ [709:51] ==> public fun Pseudocode.traverse(traversalOrder: TraversalOrder, analyzeInstruction: (Instruction) -> Unit): Unit defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser[SimpleFunctionDescriptorImpl]

'FORWARD' @ [709:75] ==> enum entry FORWARD defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.TraversalOrder[FakeCallableDescriptorForObject]

'instruction' @ [710:22] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIfExpressions.<anonymous>[ValueParameterDescriptorImpl]

'outputValue' @ [710:61] ==> public abstract val outputValue: PseudoValue? defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.InstructionWithValue[PropertyDescriptorImpl]

'instruction' @ [711:25] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIfExpressions.<anonymous>[ValueParameterDescriptorImpl]

'owner' @ [711:37] ==> public abstract var owner: Pseudocode defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.Instruction[PropertyDescriptorImpl]

'getValueElements' @ [711:43] ==> public abstract fun getValueElements(value: PseudoValue?): List<KtElement> defined in org.jetbrains.kotlin.cfg.pseudocode.Pseudocode[SimpleFunctionDescriptorImpl]

'value' @ [711:60] ==> val value: PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIfExpressions.<anonymous>[LocalVariableDescriptor]

'element' @ [712:17] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIfExpressions.<anonymous>[LocalVariableDescriptor]

'element' @ [714:17] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIfExpressions.<anonymous>[LocalVariableDescriptor]

'isUsedAsExpression' @ [714:25] ==> public fun KtExpression.isUsedAsExpression(context: BindingContext): Boolean defined in org.jetbrains.kotlin.resolve.bindingContextUtil in file BindingContextUtils.kt[SimpleFunctionDescriptorImpl]

'trace' @ [714:44] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'bindingContext' @ [714:50] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'element' @ [715:38] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIfExpressions.<anonymous>[LocalVariableDescriptor]

'then' @ [715:46] ==> public final val KtIfExpression.then: KtExpression?[MyPropertyDescriptor]

'element' @ [716:38] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIfExpressions.<anonymous>[LocalVariableDescriptor]

'`else`' @ [716:46] ==> public final val KtIfExpression.`else`: KtExpression?[MyPropertyDescriptor]

'if (thenExpression == null || elseExpression == null) {
                    trace.report(INVALID_IF_AS_EXPRESSION.on(element.ifKeyword))
                }
                else {
                    checkImplicitCastOnConditionalExpression(element)
                }' @ [718:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'thenExpression' @ [718:21] ==> val thenExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIfExpressions.<anonymous>[LocalVariableDescriptor]

'elseExpression' @ [718:47] ==> val elseExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIfExpressions.<anonymous>[LocalVariableDescriptor]

'trace' @ [719:21] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'report' @ [719:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'INVALID_IF_AS_EXPRESSION' @ [719:34] ==> public final val INVALID_IF_AS_EXPRESSION: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [719:59] ==> @NotNull public open fun on(@NotNull element: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'element' @ [719:62] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIfExpressions.<anonymous>[LocalVariableDescriptor]

'ifKeyword' @ [719:70] ==> public final val KtIfExpression.ifKeyword: PsiElement[MyPropertyDescriptor]

'checkImplicitCastOnConditionalExpression' @ [722:21] ==> private final fun checkImplicitCastOnConditionalExpression(expression: KtExpression): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'element' @ [722:62] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkIfExpressions.<anonymous>[LocalVariableDescriptor]

'collectResultingExpressionsOfConditionalExpression' @ [729:33] ==> private final fun collectResultingExpressionsOfConditionalExpression(expression: KtExpression): List<KtExpression> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [729:84] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkImplicitCastOnConditionalExpression[ValueParameterDescriptorImpl]

'trace' @ [731:38] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'get' @ [731:44] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtExpression..KtExpression?), (KotlinType..KotlinType?)>..ReadOnlySlice<(KtExpression..KtExpression?), (KotlinType..KotlinType?)>?), key: (KtExpression..KtExpression?)): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtExpression
    <V : (Any..Any?)> -> KotlinType

'EXPECTED_EXPRESSION_TYPE' @ [731:48] ==> public final val EXPECTED_EXPRESSION_TYPE: (WritableSlice<(KtExpression..KtExpression?), (KotlinType..KotlinType?)>..WritableSlice<(KtExpression..KtExpression?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [731:74] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkImplicitCastOnConditionalExpression[ValueParameterDescriptorImpl]

'expectedExpressionType' @ [732:13] ==> val expectedExpressionType: KotlinType? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkImplicitCastOnConditionalExpression[LocalVariableDescriptor]

'expectedExpressionType' @ [732:47] ==> val expectedExpressionType: KotlinType? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkImplicitCastOnConditionalExpression[LocalVariableDescriptor]

'DONT_CARE' @ [732:74] ==> public final val DONT_CARE: (SimpleType..SimpleType?) defined in org.jetbrains.kotlin.types.TypeUtils[JavaPropertyDescriptor]

'trace' @ [734:30] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'getType' @ [734:36] ==> @Nullable public abstract fun getType(@NotNull expression: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'expression' @ [734:44] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkImplicitCastOnConditionalExpression[ValueParameterDescriptorImpl]

'isAnyOrNullableAny' @ [735:28] ==> public open fun isAnyOrNullableAny(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'expressionType' @ [735:47] ==> val expressionType: KotlinType defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkImplicitCastOnConditionalExpression[LocalVariableDescriptor]

'expression' @ [736:42] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkImplicitCastOnConditionalExpression[ValueParameterDescriptorImpl]

'isUsedAsResultOfLambda' @ [736:53] ==> public fun KtExpression.isUsedAsResultOfLambda(context: BindingContext): Boolean defined in org.jetbrains.kotlin.resolve.bindingContextUtil in file BindingContextUtils.kt[SimpleFunctionDescriptorImpl]

'trace' @ [736:76] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'bindingContext' @ [736:82] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'branchExpressions' @ [737:38] ==> val branchExpressions: List<KtExpression> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkImplicitCastOnConditionalExpression[LocalVariableDescriptor]

'trace' @ [738:34] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'getType' @ [738:40] ==> @Nullable public abstract fun getType(@NotNull expression: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'branchExpression' @ [738:48] ==> val branchExpression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkImplicitCastOnConditionalExpression[LocalVariableDescriptor]

'isAnyOrNullableAny' @ [739:36] ==> public open fun isAnyOrNullableAny(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'branchType' @ [739:55] ==> val branchType: KotlinType defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkImplicitCastOnConditionalExpression[LocalVariableDescriptor]

'isUsedAsResultOfLambda' @ [740:21] ==> val isUsedAsResultOfLambda: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkImplicitCastOnConditionalExpression[LocalVariableDescriptor]

'isUnitOrNullableUnit' @ [740:62] ==> public open fun isUnitOrNullableUnit(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'branchType' @ [740:83] ==> val branchType: KotlinType defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkImplicitCastOnConditionalExpression[LocalVariableDescriptor]

'branchExpressions' @ [744:38] ==> val branchExpressions: List<KtExpression> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkImplicitCastOnConditionalExpression[LocalVariableDescriptor]

'trace' @ [745:34] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'getType' @ [745:40] ==> @Nullable public abstract fun getType(@NotNull expression: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'branchExpression' @ [745:48] ==> val branchExpression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkImplicitCastOnConditionalExpression[LocalVariableDescriptor]

'isNothing' @ [746:36] ==> public open fun isNothing(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'branchType' @ [746:46] ==> val branchType: KotlinType defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkImplicitCastOnConditionalExpression[LocalVariableDescriptor]

'trace' @ [747:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'report' @ [747:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'IMPLICIT_CAST_TO_ANY' @ [747:30] ==> public final val IMPLICIT_CAST_TO_ANY: (DiagnosticFactory2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>..DiagnosticFactory2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [747:51] ==> @NotNull public open fun on(@NotNull element: KtExpression, @NotNull a: KotlinType, @NotNull b: KotlinType): ParametrizedDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'getResultingExpression' @ [747:54] ==> private final fun getResultingExpression(expression: KtExpression): KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion[SimpleFunctionDescriptorImpl]

'branchExpression' @ [747:77] ==> val branchExpression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkImplicitCastOnConditionalExpression[LocalVariableDescriptor]

'branchType' @ [747:96] ==> val branchType: KotlinType defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkImplicitCastOnConditionalExpression[LocalVariableDescriptor]

'expressionType' @ [747:108] ==> val expressionType: KotlinType defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkImplicitCastOnConditionalExpression[LocalVariableDescriptor]

'pseudocodeVariablesData' @ [753:28] ==> private final val pseudocodeVariablesData: PseudocodeVariablesData defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'variableInitializers' @ [753:52] ==> public final val variableInitializers: Map<Instruction, Edges<InitControlFlowInfo>> defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData[PropertyDescriptorImpl]

'pseudocode' @ [754:9] ==> private final val pseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'traverse' @ [754:20] ==> public fun Pseudocode.traverse(traversalOrder: TraversalOrder, analyzeInstruction: (Instruction) -> Unit): Unit defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser[SimpleFunctionDescriptorImpl]

'FORWARD' @ [754:44] ==> enum entry FORWARD defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.TraversalOrder[FakeCallableDescriptorForObject]

'instruction' @ [755:17] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[ValueParameterDescriptorImpl]

'instruction' @ [756:21] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [756:33] ==> public final val kind: MagicKind defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction[PropertyDescriptorImpl]

'EXHAUSTIVE_WHEN_ELSE' @ [756:52] ==> enum entry EXHAUSTIVE_WHEN_ELSE defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'instruction' @ [757:32] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[ValueParameterDescriptorImpl]

'next' @ [757:44] ==> public final var next: Instruction? defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction[PropertyDescriptorImpl]

'next' @ [758:25] ==> val next: Instruction? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'initializers' @ [759:41] ==> val initializers: Map<Instruction, Edges<InitControlFlowInfo>> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions[LocalVariableDescriptor]

'next' @ [759:54] ==> val next: Instruction? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'incoming' @ [759:61] ==> public final val incoming: InitControlFlowInfo defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.Edges[PropertyDescriptorImpl]

'initializers' @ [760:41] ==> val initializers: Map<Instruction, Edges<InitControlFlowInfo>> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions[LocalVariableDescriptor]

'instruction' @ [760:54] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[ValueParameterDescriptorImpl]

'outgoing' @ [760:68] ==> public final val outgoing: InitControlFlowInfo defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.Edges[PropertyDescriptorImpl]

'mergeInfo' @ [761:29] ==> val mergeInfo: InitControlFlowInfo? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'magicInfo' @ [761:50] ==> val magicInfo: InitControlFlowInfo? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'next' @ [762:33] ==> val next: Instruction? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'element' @ [762:38] ==> public open val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MergeInstruction[PropertyDescriptorImpl]

'magicInfo' @ [762:69] ==> val magicInfo: InitControlFlowInfo? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'checkDefiniteInitializationInWhen' @ [762:79] ==> public final fun checkDefiniteInitializationInWhen(merge: InitControlFlowInfo): Boolean defined in org.jetbrains.kotlin.cfg.InitControlFlowInfo[SimpleFunctionDescriptorImpl]

'mergeInfo' @ [762:113] ==> val mergeInfo: InitControlFlowInfo? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'trace' @ [763:33] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'record' @ [763:39] ==> public abstract fun <K : (Any..Any?)> record(slice: (WritableSlice<(KtWhenExpression..KtWhenExpression?), (Boolean..Boolean?)>..WritableSlice<(KtWhenExpression..KtWhenExpression?), (Boolean..Boolean?)>?), key: (KtWhenExpression..KtWhenExpression?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtWhenExpression

'IMPLICIT_EXHAUSTIVE_WHEN' @ [763:46] ==> public final val IMPLICIT_EXHAUSTIVE_WHEN: (WritableSlice<(KtWhenExpression..KtWhenExpression?), (Boolean..Boolean?)>..WritableSlice<(KtWhenExpression..KtWhenExpression?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'next' @ [763:72] ==> val next: Instruction? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'element' @ [763:77] ==> public open val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MergeInstruction[PropertyDescriptorImpl]

'instruction' @ [769:26] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[ValueParameterDescriptorImpl]

'outputValue' @ [769:65] ==> public abstract val outputValue: PseudoValue? defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.InstructionWithValue[PropertyDescriptorImpl]

'instruction' @ [770:29] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[ValueParameterDescriptorImpl]

'owner' @ [770:41] ==> public abstract var owner: Pseudocode defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.Instruction[PropertyDescriptorImpl]

'getValueElements' @ [770:47] ==> public abstract fun getValueElements(value: PseudoValue?): List<KtElement> defined in org.jetbrains.kotlin.cfg.pseudocode.Pseudocode[SimpleFunctionDescriptorImpl]

'value' @ [770:64] ==> val value: PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'element' @ [771:21] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'element' @ [773:40] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'isUsedAsExpression' @ [773:48] ==> public fun KtExpression.isUsedAsExpression(context: BindingContext): Boolean defined in org.jetbrains.kotlin.resolve.bindingContextUtil in file BindingContextUtils.kt[SimpleFunctionDescriptorImpl]

'trace' @ [773:67] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'bindingContext' @ [773:73] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'usedAsExpression' @ [774:21] ==> val usedAsExpression: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'checkImplicitCastOnConditionalExpression' @ [775:21] ==> private final fun checkImplicitCastOnConditionalExpression(expression: KtExpression): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'element' @ [775:62] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'trace' @ [778:31] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'bindingContext' @ [778:37] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'WhenChecker' @ [779:36] ==> public object WhenChecker defined in org.jetbrains.kotlin.cfg in file WhenChecker.kt[FakeCallableDescriptorForObject]

'getMissingCases' @ [779:48] ==> public final fun getMissingCases(expression: KtWhenExpression, context: BindingContext): List<WhenMissingCase> defined in org.jetbrains.kotlin.cfg.WhenChecker[SimpleFunctionDescriptorImpl]

'element' @ [779:64] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'context' @ [779:73] ==> val context: BindingContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'element' @ [781:33] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'entries' @ [781:41] ==> public final val KtWhenExpression.entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>)[MyPropertyDescriptor]

'find' @ [781:49] ==> @InlineOnly public inline fun <T> Iterable<(KtWhenEntry..KtWhenEntry?)>.find(predicate: ((KtWhenEntry..KtWhenEntry?)) -> Boolean): KtWhenEntry? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtWhenEntry..org.jetbrains.kotlin.psi.KtWhenEntry?)

'it' @ [781:56] ==> value-parameter it: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isElse' @ [781:59] ==> public final val KtWhenEntry.isElse: Boolean[MyPropertyDescriptor]

'element' @ [782:41] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'subjectExpression' @ [782:49] ==> public final val KtWhenExpression.subjectExpression: KtExpression?[MyPropertyDescriptor]

'if (usedAsExpression && missingCases.isNotEmpty()) {
                    if (elseEntry != null) continue
                    trace.report(NO_ELSE_IN_WHEN.on(element, missingCases))
                }
                else if (subjectExpression != null) {
                    val subjectType = trace.getType(subjectExpression)
                    if (elseEntry != null) {
                        if (missingCases.isEmpty() && subjectType != null && !subjectType.isFlexible()) {
                            val subjectClass = subjectType.constructor.declarationDescriptor as? ClassDescriptor
                            val pseudocodeElement = instruction.owner.correspondingElement
                            val pseudocodeDescriptor = trace[DECLARATION_TO_DESCRIPTOR, pseudocodeElement]
                            if (subjectClass == null ||
                                KotlinBuiltIns.isBooleanOrNullableBoolean(subjectType) ||
                                subjectClass.module == pseudocodeDescriptor?.module) {
                                trace.report(REDUNDANT_ELSE_IN_WHEN.on(elseEntry))
                            }
                        }
                        continue
                    }
                    if (!usedAsExpression) {
                        val enumClassDescriptor = WhenChecker.getClassDescriptorOfTypeIfEnum(subjectType)
                        if (enumClassDescriptor != null) {
                            val enumMissingCases = WhenChecker.getEnumMissingCases(element, context, enumClassDescriptor)
                            if (!enumMissingCases.isEmpty()) {
                                trace.report(NON_EXHAUSTIVE_WHEN.on(element, enumMissingCases))
                            }
                        }
                        val sealedClassDescriptor = WhenChecker.getClassDescriptorOfTypeIfSealed(subjectType)
                        if (sealedClassDescriptor != null) {
                            val sealedMissingCases = WhenChecker.getSealedMissingCases(element, context, sealedClassDescriptor)
                            if (!sealedMissingCases.isEmpty()) {
                                trace.report(NON_EXHAUSTIVE_WHEN_ON_SEALED_CLASS.on(element, sealedMissingCases))
                            }
                        }
                    }
                }' @ [783:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'usedAsExpression' @ [783:21] ==> val usedAsExpression: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'missingCases' @ [783:41] ==> val missingCases: List<WhenMissingCase> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'isNotEmpty' @ [783:54] ==> @InlineOnly public inline fun <T> Collection<WhenMissingCase>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WhenMissingCase

'elseEntry' @ [784:25] ==> val elseEntry: KtWhenEntry? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'trace' @ [785:21] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'report' @ [785:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'NO_ELSE_IN_WHEN' @ [785:34] ==> public final val NO_ELSE_IN_WHEN: (DiagnosticFactory1<(KtWhenExpression..KtWhenExpression?), (MutableList<(WhenMissingCase..WhenMissingCase?)>..List<(WhenMissingCase..WhenMissingCase?)>?)>..DiagnosticFactory1<(KtWhenExpression..KtWhenExpression?), (MutableList<(WhenMissingCase..WhenMissingCase?)>..List<(WhenMissingCase..WhenMissingCase?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [785:50] ==> @NotNull public open fun on(@NotNull element: KtWhenExpression, @NotNull argument: (MutableList<(WhenMissingCase..WhenMissingCase?)>..List<(WhenMissingCase..WhenMissingCase?)>)): ParametrizedDiagnostic<(KtWhenExpression..KtWhenExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'element' @ [785:53] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'missingCases' @ [785:62] ==> val missingCases: List<WhenMissingCase> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'subjectExpression' @ [787:26] ==> val subjectExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'trace' @ [788:39] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'getType' @ [788:45] ==> @Nullable public abstract fun getType(@NotNull expression: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'subjectExpression' @ [788:53] ==> val subjectExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'elseEntry' @ [789:25] ==> val elseEntry: KtWhenEntry? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'missingCases' @ [790:29] ==> val missingCases: List<WhenMissingCase> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [790:42] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'subjectType' @ [790:55] ==> val subjectType: KotlinType? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'!' @ [790:78] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'subjectType' @ [790:79] ==> val subjectType: KotlinType? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'isFlexible' @ [790:91] ==> public fun KotlinType.isFlexible(): Boolean defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'subjectType' @ [791:48] ==> val subjectType: KotlinType? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'constructor' @ [791:60] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [791:72] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'instruction' @ [792:53] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[ValueParameterDescriptorImpl]

'owner' @ [792:65] ==> public abstract var owner: Pseudocode defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.Instruction[PropertyDescriptorImpl]

'correspondingElement' @ [792:71] ==> public abstract val correspondingElement: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.Pseudocode[PropertyDescriptorImpl]

'trace' @ [793:56] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'DECLARATION_TO_DESCRIPTOR' @ [793:62] ==> @SuppressWarnings public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'pseudocodeElement' @ [793:89] ==> val pseudocodeElement: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'subjectClass' @ [794:33] ==> val subjectClass: ClassDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'isBooleanOrNullableBoolean' @ [795:48] ==> public open fun isBooleanOrNullableBoolean(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'subjectType' @ [795:75] ==> val subjectType: KotlinType? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'subjectClass' @ [796:33] ==> val subjectClass: ClassDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'module' @ [796:46] ==> public val DeclarationDescriptor.module: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'pseudocodeDescriptor' @ [796:56] ==> val pseudocodeDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'module' @ [796:78] ==> public val DeclarationDescriptor.module: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'trace' @ [797:33] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'report' @ [797:39] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'REDUNDANT_ELSE_IN_WHEN' @ [797:46] ==> public final val REDUNDANT_ELSE_IN_WHEN: (DiagnosticFactory0<(KtWhenEntry..KtWhenEntry?)>..DiagnosticFactory0<(KtWhenEntry..KtWhenEntry?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [797:69] ==> @NotNull public open fun on(@NotNull element: KtWhenEntry): SimpleDiagnostic<(KtWhenEntry..KtWhenEntry?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'elseEntry' @ [797:72] ==> val elseEntry: KtWhenEntry? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'!' @ [802:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'usedAsExpression' @ [802:26] ==> val usedAsExpression: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'WhenChecker' @ [803:51] ==> public object WhenChecker defined in org.jetbrains.kotlin.cfg in file WhenChecker.kt[FakeCallableDescriptorForObject]

'getClassDescriptorOfTypeIfEnum' @ [803:63] ==> @JvmStatic public final fun getClassDescriptorOfTypeIfEnum(type: KotlinType?): ClassDescriptor? defined in org.jetbrains.kotlin.cfg.WhenChecker[SimpleFunctionDescriptorImpl]

'subjectType' @ [803:94] ==> val subjectType: KotlinType? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'enumClassDescriptor' @ [804:29] ==> val enumClassDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'WhenChecker' @ [805:52] ==> public object WhenChecker defined in org.jetbrains.kotlin.cfg in file WhenChecker.kt[FakeCallableDescriptorForObject]

'getEnumMissingCases' @ [805:64] ==> @JvmStatic public final fun getEnumMissingCases(expression: KtWhenExpression, context: BindingContext, enumClassDescriptor: ClassDescriptor): List<WhenMissingCase> defined in org.jetbrains.kotlin.cfg.WhenChecker[SimpleFunctionDescriptorImpl]

'element' @ [805:84] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'context' @ [805:93] ==> val context: BindingContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'enumClassDescriptor' @ [805:102] ==> val enumClassDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'!' @ [806:33] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'enumMissingCases' @ [806:34] ==> val enumMissingCases: List<WhenMissingCase> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [806:51] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'trace' @ [807:33] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'report' @ [807:39] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'NON_EXHAUSTIVE_WHEN' @ [807:46] ==> public final val NON_EXHAUSTIVE_WHEN: (DiagnosticFactory1<(KtWhenExpression..KtWhenExpression?), (MutableList<(WhenMissingCase..WhenMissingCase?)>..List<(WhenMissingCase..WhenMissingCase?)>?)>..DiagnosticFactory1<(KtWhenExpression..KtWhenExpression?), (MutableList<(WhenMissingCase..WhenMissingCase?)>..List<(WhenMissingCase..WhenMissingCase?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [807:66] ==> @NotNull public open fun on(@NotNull element: KtWhenExpression, @NotNull argument: (MutableList<(WhenMissingCase..WhenMissingCase?)>..List<(WhenMissingCase..WhenMissingCase?)>)): ParametrizedDiagnostic<(KtWhenExpression..KtWhenExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'element' @ [807:69] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'enumMissingCases' @ [807:78] ==> val enumMissingCases: List<WhenMissingCase> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'WhenChecker' @ [810:53] ==> public object WhenChecker defined in org.jetbrains.kotlin.cfg in file WhenChecker.kt[FakeCallableDescriptorForObject]

'getClassDescriptorOfTypeIfSealed' @ [810:65] ==> @JvmStatic public final fun getClassDescriptorOfTypeIfSealed(type: KotlinType?): ClassDescriptor? defined in org.jetbrains.kotlin.cfg.WhenChecker[SimpleFunctionDescriptorImpl]

'subjectType' @ [810:98] ==> val subjectType: KotlinType? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'sealedClassDescriptor' @ [811:29] ==> val sealedClassDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'WhenChecker' @ [812:54] ==> public object WhenChecker defined in org.jetbrains.kotlin.cfg in file WhenChecker.kt[FakeCallableDescriptorForObject]

'getSealedMissingCases' @ [812:66] ==> @JvmStatic public final fun getSealedMissingCases(expression: KtWhenExpression, context: BindingContext, sealedClassDescriptor: ClassDescriptor): List<WhenMissingCase> defined in org.jetbrains.kotlin.cfg.WhenChecker[SimpleFunctionDescriptorImpl]

'element' @ [812:88] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'context' @ [812:97] ==> val context: BindingContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'sealedClassDescriptor' @ [812:106] ==> val sealedClassDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'!' @ [813:33] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'sealedMissingCases' @ [813:34] ==> val sealedMissingCases: List<WhenMissingCase> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [813:53] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'trace' @ [814:33] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'report' @ [814:39] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'NON_EXHAUSTIVE_WHEN_ON_SEALED_CLASS' @ [814:46] ==> public final val NON_EXHAUSTIVE_WHEN_ON_SEALED_CLASS: (DiagnosticFactory1<(KtWhenExpression..KtWhenExpression?), (MutableList<(WhenMissingCase..WhenMissingCase?)>..List<(WhenMissingCase..WhenMissingCase?)>?)>..DiagnosticFactory1<(KtWhenExpression..KtWhenExpression?), (MutableList<(WhenMissingCase..WhenMissingCase?)>..List<(WhenMissingCase..WhenMissingCase?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [814:82] ==> @NotNull public open fun on(@NotNull element: KtWhenExpression, @NotNull argument: (MutableList<(WhenMissingCase..WhenMissingCase?)>..List<(WhenMissingCase..WhenMissingCase?)>)): ParametrizedDiagnostic<(KtWhenExpression..KtWhenExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'element' @ [814:85] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'sealedMissingCases' @ [814:94] ==> val sealedMissingCases: List<WhenMissingCase> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkWhenExpressions.<anonymous>[LocalVariableDescriptor]

'when (subroutine) {
            is KtClassOrObject -> ConstructorConsistencyChecker.check(subroutine, trace, pseudocode, pseudocodeVariablesData)
            is KtSecondaryConstructor -> ConstructorConsistencyChecker.check(subroutine, trace, pseudocode, pseudocodeVariablesData)
        }' @ [824:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'subroutine' @ [824:15] ==> private final val subroutine: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'ConstructorConsistencyChecker' @ [825:35] ==> public companion object defined in org.jetbrains.kotlin.cfg.ConstructorConsistencyChecker[FakeCallableDescriptorForObject]

'check' @ [825:65] ==> @JvmStatic public final fun check(classOrObject: KtClassOrObject, trace: BindingTrace, pseudocode: Pseudocode, pseudocodeVariablesData: PseudocodeVariablesData): Unit defined in org.jetbrains.kotlin.cfg.ConstructorConsistencyChecker.Companion[SimpleFunctionDescriptorImpl]

'subroutine' @ [825:71] ==> private final val subroutine: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'trace' @ [825:83] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'pseudocode' @ [825:90] ==> private final val pseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'pseudocodeVariablesData' @ [825:102] ==> private final val pseudocodeVariablesData: PseudocodeVariablesData defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'ConstructorConsistencyChecker' @ [826:42] ==> public companion object defined in org.jetbrains.kotlin.cfg.ConstructorConsistencyChecker[FakeCallableDescriptorForObject]

'check' @ [826:72] ==> @JvmStatic public final fun check(constructor: KtSecondaryConstructor, trace: BindingTrace, pseudocode: Pseudocode, pseudocodeVariablesData: PseudocodeVariablesData): Unit defined in org.jetbrains.kotlin.cfg.ConstructorConsistencyChecker.Companion[SimpleFunctionDescriptorImpl]

'subroutine' @ [826:78] ==> private final val subroutine: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'trace' @ [826:90] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'pseudocode' @ [826:97] ==> private final val pseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'pseudocodeVariablesData' @ [826:109] ==> private final val pseudocodeVariablesData: PseudocodeVariablesData defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'trace' @ [834:36] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'get' @ [834:42] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?), key: (PsiElement..PsiElement?)): DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> DeclarationDescriptor

'DECLARATION_TO_DESCRIPTOR' @ [834:61] ==> @SuppressWarnings public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'subroutine' @ [834:88] ==> private final val subroutine: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'markAndCheckRecursiveTailCalls' @ [836:9] ==> private final fun markAndCheckRecursiveTailCalls(subroutineDescriptor: FunctionDescriptor): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'subroutineDescriptor' @ [836:40] ==> val subroutineDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markAndCheckTailCalls[LocalVariableDescriptor]

'checkSuspendCalls' @ [837:9] ==> private final fun checkSuspendCalls(currentFunction: FunctionDescriptor): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'subroutineDescriptor' @ [837:27] ==> val subroutineDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markAndCheckTailCalls[LocalVariableDescriptor]

'!' @ [841:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'currentFunction' @ [841:14] ==> value-parameter currentFunction: FunctionDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkSuspendCalls[ValueParameterDescriptorImpl]

'isSuspend' @ [841:30] ==> public final val FunctionDescriptor.isSuspend: Boolean[MyPropertyDescriptor]

'traverseCalls' @ [844:9] ==> private final inline fun traverseCalls(crossinline onCall: (instruction: CallInstruction, resolvedCall: ResolvedCall<*>) -> Unit): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [845:36] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkSuspendCalls.<anonymous>[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [845:49] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'!' @ [846:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'calleeDescriptor' @ [846:18] ==> val calleeDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkSuspendCalls.<anonymous>[LocalVariableDescriptor]

'isSuspend' @ [846:35] ==> public final val FunctionDescriptor.isSuspend: Boolean[MyPropertyDescriptor]

'trace' @ [851:21] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'get' @ [851:27] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(Call..Call?), (FunctionDescriptor..FunctionDescriptor?)>..ReadOnlySlice<(Call..Call?), (FunctionDescriptor..FunctionDescriptor?)>?), key: (Call..Call?)): FunctionDescriptor? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Call
    <V : (Any..Any?)> -> FunctionDescriptor

'ENCLOSING_SUSPEND_FUNCTION_FOR_SUSPEND_FUNCTION_CALL' @ [851:46] ==> public final val ENCLOSING_SUSPEND_FUNCTION_FOR_SUSPEND_FUNCTION_CALL: (WritableSlice<(Call..Call?), (FunctionDescriptor..FunctionDescriptor?)>..WritableSlice<(Call..Call?), (FunctionDescriptor..FunctionDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'resolvedCall' @ [851:100] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkSuspendCalls.<anonymous>[ValueParameterDescriptorImpl]

'call' @ [851:113] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'let' @ [852:23] ==> @InlineOnly public inline fun <T, R> FunctionDescriptor.let(block: (FunctionDescriptor) -> PsiElement?): PsiElement? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor
    <R> -> PsiElement?

'DescriptorToSourceUtils' @ [852:27] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve in file DescriptorToSourceUtils.kt[FakeCallableDescriptorForObject]

'instruction' @ [855:27] ==> value-parameter instruction: CallInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkSuspendCalls.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [855:39] ==> public open val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction[PropertyDescriptorImpl]

'instruction' @ [856:38] ==> value-parameter instruction: CallInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkSuspendCalls.<anonymous>[ValueParameterDescriptorImpl]

'owner' @ [856:50] ==> public open var owner: Pseudocode defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction[PropertyDescriptorImpl]

'getUsages' @ [856:56] ==> public abstract fun getUsages(value: PseudoValue?): List<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocode.Pseudocode[SimpleFunctionDescriptorImpl]

'instruction' @ [856:66] ==> value-parameter instruction: CallInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkSuspendCalls.<anonymous>[ValueParameterDescriptorImpl]

'outputValue' @ [856:78] ==> public open val outputValue: PseudoValue? defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction[PropertyDescriptorImpl]

'isNotEmpty' @ [856:91] ==> @InlineOnly public inline fun <T> Collection<Instruction>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Instruction

'!' @ [858:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isUsedAsExpression' @ [858:18] ==> val isUsedAsExpression: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkSuspendCalls.<anonymous>[LocalVariableDescriptor]

'!' @ [858:40] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'instruction' @ [858:41] ==> value-parameter instruction: CallInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkSuspendCalls.<anonymous>[ValueParameterDescriptorImpl]

'isTailCall' @ [858:53] ==> private final fun CallInstruction.isTailCall(subroutine: KtElement = ...): Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'enclosingSuspendFunction' @ [858:64] ==> val enclosingSuspendFunction: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkSuspendCalls.<anonymous>[LocalVariableDescriptor]

'isInsideTry' @ [858:93] ==> private final fun isInsideTry(element: KtElement): Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'element' @ [858:105] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkSuspendCalls.<anonymous>[LocalVariableDescriptor]

'containsNonTailCalls' @ [859:17] ==> var containsNonTailCalls: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkSuspendCalls[LocalVariableDescriptor]

'pseudocode' @ [863:9] ==> private final val pseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'traverse' @ [863:20] ==> public fun Pseudocode.traverse(traversalOrder: TraversalOrder, analyzeInstruction: (Instruction) -> Unit): Unit defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser[SimpleFunctionDescriptorImpl]

'FORWARD' @ [863:44] ==> enum entry FORWARD defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.TraversalOrder[FakeCallableDescriptorForObject]

'instruction' @ [864:17] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkSuspendCalls.<anonymous>[ValueParameterDescriptorImpl]

'instruction' @ [864:67] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkSuspendCalls.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [864:79] ==> public open val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.VariableDeclarationInstruction[PropertyDescriptorImpl]

'!' @ [864:105] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'instruction' @ [864:106] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkSuspendCalls.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [864:118] ==> public open val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.VariableDeclarationInstruction[PropertyDescriptorImpl]

'hasDelegate' @ [864:126] ==> public open fun hasDelegate(): Boolean defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

'trace' @ [867:21] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'DECLARATION_TO_DESCRIPTOR' @ [867:42] ==> @SuppressWarnings public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'instruction' @ [867:69] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkSuspendCalls.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [867:81] ==> public open val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.VariableDeclarationInstruction[PropertyDescriptorImpl]

'containsNonTailCalls' @ [870:13] ==> var containsNonTailCalls: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkSuspendCalls[LocalVariableDescriptor]

'containsNonTailCalls' @ [871:21] ==> var containsNonTailCalls: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkSuspendCalls[LocalVariableDescriptor]

'variableDescriptor' @ [871:45] ==> val variableDescriptor: VariableDescriptorWithAccessors defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkSuspendCalls.<anonymous>[LocalVariableDescriptor]

'accessors' @ [871:64] ==> public val VariableDescriptorWithAccessors.accessors: List<VariableAccessorDescriptor> defined in org.jetbrains.kotlin.descriptors[DeserializedPropertyDescriptor]

'any' @ [871:74] ==> public inline fun <T> Iterable<VariableAccessorDescriptor>.any(predicate: (VariableAccessorDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableAccessorDescriptor

'trace' @ [872:25] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'DELEGATED_PROPERTY_RESOLVED_CALL' @ [872:46] ==> public final val DELEGATED_PROPERTY_RESOLVED_CALL: (WritableSlice<(VariableAccessorDescriptor..VariableAccessorDescriptor?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(VariableAccessorDescriptor..VariableAccessorDescriptor?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [872:80] ==> value-parameter it: VariableAccessorDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkSuspendCalls.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'candidateDescriptor' @ [872:85] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>.candidateDescriptor: (FunctionDescriptor..FunctionDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'isSuspend' @ [872:106] ==> public final val FunctionDescriptor.isSuspend: Boolean[MyPropertyDescriptor]

'containsNonTailCalls' @ [876:13] ==> var containsNonTailCalls: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkSuspendCalls[LocalVariableDescriptor]

'trace' @ [877:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'record' @ [877:19] ==> public abstract fun <K : (Any..Any?)> record(slice: (WritableSlice<(FunctionDescriptor..FunctionDescriptor?), (Boolean..Boolean?)>..WritableSlice<(FunctionDescriptor..FunctionDescriptor?), (Boolean..Boolean?)>?), key: (FunctionDescriptor..FunctionDescriptor?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> FunctionDescriptor

'CONTAINS_NON_TAIL_SUSPEND_CALLS' @ [877:41] ==> public final val CONTAINS_NON_TAIL_SUSPEND_CALLS: (WritableSlice<(FunctionDescriptor..FunctionDescriptor?), (Boolean..Boolean?)>..WritableSlice<(FunctionDescriptor..FunctionDescriptor?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'currentFunction' @ [877:74] ==> value-parameter currentFunction: FunctionDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.checkSuspendCalls[ValueParameterDescriptorImpl]

'original' @ [877:90] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'!' @ [882:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'subroutineDescriptor' @ [882:14] ==> value-parameter subroutineDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markAndCheckRecursiveTailCalls[ValueParameterDescriptorImpl]

'isTailrec' @ [882:35] ==> public final val FunctionDescriptor.isTailrec: Boolean[MyPropertyDescriptor]

'subroutine' @ [883:13] ==> private final val subroutine: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'!' @ [883:46] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'subroutine' @ [883:47] ==> private final val subroutine: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'hasBody' @ [883:58] ==> @Override public open fun hasBody(): Boolean defined in org.jetbrains.kotlin.psi.KtNamedFunction[JavaMethodDescriptor]

'HashMap' @ [888:21] ==> public final fun <K, V> <init>(): HashMap<KtElement, KindAndCall> /* = HashMap<KtElement, KindAndCall> */ defined in kotlin.collections.HashMap[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <K> -> KtElement
    <V> -> KindAndCall

'traverseCalls' @ [889:9] ==> private final inline fun traverseCalls(crossinline onCall: (instruction: CallInstruction, resolvedCall: ResolvedCall<*>) -> Unit): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [891:38] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markAndCheckRecursiveTailCalls.<anonymous>[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [891:51] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'functionDescriptor' @ [892:17] ==> val functionDescriptor: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markAndCheckRecursiveTailCalls.<anonymous>[LocalVariableDescriptor]

'original' @ [892:36] ==> public final val CallableDescriptor.original: CallableDescriptor[MyPropertyDescriptor]

'subroutineDescriptor' @ [892:48] ==> value-parameter subroutineDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markAndCheckRecursiveTailCalls[ValueParameterDescriptorImpl]

'resolvedCall' @ [894:17] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markAndCheckRecursiveTailCalls.<anonymous>[ValueParameterDescriptorImpl]

'call' @ [894:30] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'valueArguments' @ [894:35] ==> public final val Call.valueArguments: List<(ValueArgument..ValueArgument?)>[MyPropertyDescriptor]

'size' @ [894:50] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'functionDescriptor' @ [894:58] ==> val functionDescriptor: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markAndCheckRecursiveTailCalls.<anonymous>[LocalVariableDescriptor]

'valueParameters' @ [894:77] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [894:93] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'!' @ [895:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'functionDescriptor' @ [895:21] ==> val functionDescriptor: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markAndCheckRecursiveTailCalls.<anonymous>[LocalVariableDescriptor]

'overriddenDescriptors' @ [895:40] ==> public final val CallableDescriptor.overriddenDescriptors: (MutableCollection<out (CallableDescriptor..CallableDescriptor?)>..Collection<(CallableDescriptor..CallableDescriptor?)>)[MyPropertyDescriptor]

'isEmpty' @ [895:62] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'instruction' @ [898:27] ==> value-parameter instruction: CallInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markAndCheckRecursiveTailCalls.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [898:39] ==> public open val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction[PropertyDescriptorImpl]

'isInsideTry' @ [901:17] ==> private final fun isInsideTry(element: KtElement): Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'element' @ [901:29] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markAndCheckRecursiveTailCalls.<anonymous>[LocalVariableDescriptor]

'calls' @ [904:17] ==> val calls: HashMap<KtElement, KindAndCall> /* = HashMap<KtElement, KindAndCall> */ defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markAndCheckRecursiveTailCalls[LocalVariableDescriptor]

'put' @ [904:23] ==> public open fun put(key: KtElement, value: KindAndCall): KindAndCall? defined in java.util.HashMap[JavaMethodDescriptor]

'element' @ [904:27] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markAndCheckRecursiveTailCalls.<anonymous>[LocalVariableDescriptor]

'KindAndCall' @ [904:36] ==> public constructor KindAndCall(kind: TailRecursionKind, call: ResolvedCall<*>) defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markAndCheckRecursiveTailCalls.KindAndCall[ClassConstructorDescriptorImpl]

'IN_TRY' @ [904:48] ==> enum entry IN_TRY defined in org.jetbrains.kotlin.cfg.TailRecursionKind[FakeCallableDescriptorForObject]

'resolvedCall' @ [904:56] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markAndCheckRecursiveTailCalls.<anonymous>[ValueParameterDescriptorImpl]

'resolvedCall' @ [914:40] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markAndCheckRecursiveTailCalls.<anonymous>[ValueParameterDescriptorImpl]

'hasThisOrNoDispatchReceiver' @ [914:53] ==> public fun ResolvedCall<*>.hasThisOrNoDispatchReceiver(context: BindingContext): Boolean defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil in file resolvedCallUtil.kt[SimpleFunctionDescriptorImpl]

'trace' @ [914:81] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'bindingContext' @ [914:87] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'if (sameDispatchReceiver && instruction.isTailCall()) TAIL_CALL else NON_TAIL' @ [916:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TailRecursionKind, elseBranch: TailRecursionKind): TailRecursionKind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TailRecursionKind

'sameDispatchReceiver' @ [916:28] ==> val sameDispatchReceiver: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markAndCheckRecursiveTailCalls.<anonymous>[LocalVariableDescriptor]

'instruction' @ [916:52] ==> value-parameter instruction: CallInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markAndCheckRecursiveTailCalls.<anonymous>[ValueParameterDescriptorImpl]

'isTailCall' @ [916:64] ==> private final fun CallInstruction.isTailCall(subroutine: KtElement = ...): Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[SimpleFunctionDescriptorImpl]

'TAIL_CALL' @ [916:78] ==> enum entry TAIL_CALL defined in org.jetbrains.kotlin.cfg.TailRecursionKind[FakeCallableDescriptorForObject]

'NON_TAIL' @ [916:93] ==> enum entry NON_TAIL defined in org.jetbrains.kotlin.cfg.TailRecursionKind[FakeCallableDescriptorForObject]

'calls' @ [918:31] ==> val calls: HashMap<KtElement, KindAndCall> /* = HashMap<KtElement, KindAndCall> */ defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markAndCheckRecursiveTailCalls[LocalVariableDescriptor]

'element' @ [918:37] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markAndCheckRecursiveTailCalls.<anonymous>[LocalVariableDescriptor]

'calls' @ [919:13] ==> val calls: HashMap<KtElement, KindAndCall> /* = HashMap<KtElement, KindAndCall> */ defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markAndCheckRecursiveTailCalls[LocalVariableDescriptor]

'put' @ [919:19] ==> public open fun put(key: KtElement, value: KindAndCall): KindAndCall? defined in java.util.HashMap[JavaMethodDescriptor]

'element' @ [919:23] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markAndCheckRecursiveTailCalls.<anonymous>[LocalVariableDescriptor]

'KindAndCall' @ [919:32] ==> public constructor KindAndCall(kind: TailRecursionKind, call: ResolvedCall<*>) defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markAndCheckRecursiveTailCalls.KindAndCall[ClassConstructorDescriptorImpl]

'combineKinds' @ [919:44] ==> private final fun combineKinds(kind: TailRecursionKind, existingKind: TailRecursionKind?): TailRecursionKind defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion[SimpleFunctionDescriptorImpl]

'kind' @ [919:57] ==> val kind: TailRecursionKind defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markAndCheckRecursiveTailCalls.<anonymous>[LocalVariableDescriptor]

'kindAndCall' @ [919:63] ==> val kindAndCall: KindAndCall? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markAndCheckRecursiveTailCalls.<anonymous>[LocalVariableDescriptor]

'kind' @ [919:76] ==> public final var kind: TailRecursionKind defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markAndCheckRecursiveTailCalls.KindAndCall[PropertyDescriptorImpl]

'resolvedCall' @ [919:83] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markAndCheckRecursiveTailCalls.<anonymous>[ValueParameterDescriptorImpl]

'component1' @ [923:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<KtElement, KindAndCall>.component1(): KtElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtElement
    <V> -> KindAndCall

'component2' @ [923:24] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<KtElement, KindAndCall>.component2(): KindAndCall defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtElement
    <V> -> KindAndCall

'calls' @ [923:40] ==> val calls: HashMap<KtElement, KindAndCall> /* = HashMap<KtElement, KindAndCall> */ defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markAndCheckRecursiveTailCalls[LocalVariableDescriptor]

'when (kindAndCall.kind) {
                TAIL_CALL -> {
                    trace.record(TAIL_RECURSION_CALL, kindAndCall.call.call, TailRecursionKind.TAIL_CALL)
                    hasTailCalls = true
                }
                IN_TRY -> trace.report(Errors.TAIL_RECURSION_IN_TRY_IS_NOT_SUPPORTED.on(element))
                NON_TAIL -> trace.report(Errors.NON_TAIL_RECURSIVE_CALL.on(element))
            }' @ [924:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'kindAndCall' @ [924:19] ==> val kindAndCall: KindAndCall defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markAndCheckRecursiveTailCalls[LocalVariableDescriptor]

'kind' @ [924:31] ==> public final var kind: TailRecursionKind defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markAndCheckRecursiveTailCalls.KindAndCall[PropertyDescriptorImpl]

'TAIL_CALL' @ [925:17] ==> enum entry TAIL_CALL defined in org.jetbrains.kotlin.cfg.TailRecursionKind[FakeCallableDescriptorForObject]

'trace' @ [926:21] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'record' @ [926:27] ==> public abstract fun <K : (Any..Any?), V : (Any..Any?)> record(slice: (WritableSlice<(Call..Call?), (TailRecursionKind..TailRecursionKind?)>..WritableSlice<(Call..Call?), (TailRecursionKind..TailRecursionKind?)>?), key: (Call..Call?), value: (TailRecursionKind..TailRecursionKind?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Call
    <V : (Any..Any?)> -> TailRecursionKind

'TAIL_RECURSION_CALL' @ [926:34] ==> public final val TAIL_RECURSION_CALL: (WritableSlice<(Call..Call?), (TailRecursionKind..TailRecursionKind?)>..WritableSlice<(Call..Call?), (TailRecursionKind..TailRecursionKind?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'kindAndCall' @ [926:55] ==> val kindAndCall: KindAndCall defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markAndCheckRecursiveTailCalls[LocalVariableDescriptor]

'call' @ [926:67] ==> internal final val call: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markAndCheckRecursiveTailCalls.KindAndCall[PropertyDescriptorImpl]

'call' @ [926:72] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'TAIL_CALL' @ [926:96] ==> enum entry TAIL_CALL defined in org.jetbrains.kotlin.cfg.TailRecursionKind[FakeCallableDescriptorForObject]

'hasTailCalls' @ [927:21] ==> var hasTailCalls: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markAndCheckRecursiveTailCalls[LocalVariableDescriptor]

'IN_TRY' @ [929:17] ==> enum entry IN_TRY defined in org.jetbrains.kotlin.cfg.TailRecursionKind[FakeCallableDescriptorForObject]

'trace' @ [929:27] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'report' @ [929:33] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'TAIL_RECURSION_IN_TRY_IS_NOT_SUPPORTED' @ [929:47] ==> public final val TAIL_RECURSION_IN_TRY_IS_NOT_SUPPORTED: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [929:86] ==> @NotNull public open fun on(@NotNull element: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'element' @ [929:89] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markAndCheckRecursiveTailCalls[LocalVariableDescriptor]

'NON_TAIL' @ [930:17] ==> enum entry NON_TAIL defined in org.jetbrains.kotlin.cfg.TailRecursionKind[FakeCallableDescriptorForObject]

'trace' @ [930:29] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'report' @ [930:35] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'NON_TAIL_RECURSIVE_CALL' @ [930:49] ==> public final val NON_TAIL_RECURSIVE_CALL: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [930:73] ==> @NotNull public open fun on(@NotNull element: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'element' @ [930:76] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markAndCheckRecursiveTailCalls[LocalVariableDescriptor]

'!' @ [934:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasTailCalls' @ [934:14] ==> var hasTailCalls: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.markAndCheckRecursiveTailCalls[LocalVariableDescriptor]

'subroutine' @ [934:30] ==> private final val subroutine: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'trace' @ [935:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'report' @ [935:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'NO_TAIL_CALLS_FOUND' @ [935:33] ==> public final val NO_TAIL_CALLS_FOUND: (DiagnosticFactory0<(KtNamedFunction..KtNamedFunction?)>..DiagnosticFactory0<(KtNamedFunction..KtNamedFunction?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [935:53] ==> @NotNull public open fun on(@NotNull element: KtNamedFunction): SimpleDiagnostic<(KtNamedFunction..KtNamedFunction?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'subroutine' @ [935:56] ==> private final val subroutine: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'getParentOfType' @ [940:13] ==> @SafeVarargs @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull vararg p1: (Class<out (KtExpression..KtExpression?)>..Class<out (KtExpression..KtExpression?)>?)): KtExpression? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtExpression

'element' @ [941:21] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.isInsideTry[ValueParameterDescriptorImpl]

'KtTryExpression' @ [942:21] ==> public constructor KtTryExpression(@NotNull node: ASTNode) defined in org.jetbrains.kotlin.psi.KtTryExpression[JavaClassConstructorDescriptor]

'java' @ [942:44] ==> public val <T> KClass<KtTryExpression>.java: Class<KtTryExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtTryExpression

'java' @ [942:68] ==> public val <T> KClass<KtFunction>.java: Class<KtFunction> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtFunction

'java' @ [942:104] ==> public val <T> KClass<KtAnonymousInitializer>.java: Class<KtAnonymousInitializer> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtAnonymousInitializer

'this@ControlFlowInformationProvider' @ [945:68] ==> <this> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[LazyClassReceiverParameterDescriptor]

'subroutine' @ [945:104] ==> private final val subroutine: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'TailInstructionDetector' @ [946:39] ==> public constructor TailInstructionDetector(@NotNull subroutine: KtElement) defined in org.jetbrains.kotlin.cfg.TailInstructionDetector[JavaClassConstructorDescriptor]

'subroutine' @ [946:63] ==> value-parameter subroutine: KtElement = ... defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.isTailCall[ValueParameterDescriptorImpl]

'traverseFollowingInstructions' @ [947:16] ==> public fun traverseFollowingInstructions(rootInstruction: Instruction, visited: MutableSet<Instruction> = ..., order: TraversalOrder = ..., handler: ((Instruction) -> TraverseInstructionResult)?): Boolean defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser[SimpleFunctionDescriptorImpl]

'this' @ [948:17] ==> <this> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.isTailCall[ReceiverParameterDescriptorImpl]

'hashSetOf' @ [949:17] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<Instruction> /* = HashSet<Instruction> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Instruction

'FORWARD' @ [950:32] ==> enum entry FORWARD defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.TraversalOrder[FakeCallableDescriptorForObject]

'if (it == this@isTailCall || it.accept(tailInstructionDetector))
                TraverseInstructionResult.CONTINUE
            else
                TraverseInstructionResult.HALT' @ [952:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TraverseInstructionResult, elseBranch: TraverseInstructionResult): TraverseInstructionResult[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TraverseInstructionResult

'it' @ [952:17] ==> value-parameter it: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.isTailCall.<anonymous>[ValueParameterDescriptorImpl]

'this@isTailCall' @ [952:23] ==> <this> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.isTailCall[ReceiverParameterDescriptorImpl]

'it' @ [952:42] ==> value-parameter it: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.isTailCall.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [952:45] ==> public abstract fun <R> accept(visitor: InstructionVisitorWithResult<(Boolean..Boolean?)>): (Boolean..Boolean?) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.Instruction[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> (kotlin.Boolean..kotlin.Boolean?)

'tailInstructionDetector' @ [952:52] ==> val tailInstructionDetector: TailInstructionDetector defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.isTailCall[LocalVariableDescriptor]

'CONTINUE' @ [953:43] ==> enum entry CONTINUE defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.TraverseInstructionResult[FakeCallableDescriptorForObject]

'HALT' @ [955:43] ==> enum entry HALT defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.TraverseInstructionResult[FakeCallableDescriptorForObject]

'pseudocode' @ [960:9] ==> private final val pseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'traverse' @ [960:20] ==> public fun Pseudocode.traverse(traversalOrder: TraversalOrder, analyzeInstruction: (Instruction) -> Unit): Unit defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser[SimpleFunctionDescriptorImpl]

'FORWARD' @ [960:44] ==> enum entry FORWARD defined in org.jetbrains.kotlin.cfg.pseudocodeTraverser.TraversalOrder[FakeCallableDescriptorForObject]

'instruction' @ [961:17] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.traverseCalls.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [962:13] ==> public abstract operator fun invoke(instruction: @ParameterName CallInstruction, resolvedCall: @ParameterName ResolvedCall<*>): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'instruction' @ [962:20] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.traverseCalls.<anonymous>[ValueParameterDescriptorImpl]

'instruction' @ [962:33] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.traverseCalls.<anonymous>[ValueParameterDescriptorImpl]

'resolvedCall' @ [962:45] ==> public final val resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction[PropertyDescriptorImpl]

'ctxt' @ [977:27] ==> value-parameter ctxt: ControlFlowInformationProvider.VariableContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.report[ValueParameterDescriptorImpl]

'instruction' @ [977:32] ==> internal final val instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableContext[PropertyDescriptorImpl]

'instruction' @ [978:13] ==> val instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.report[LocalVariableDescriptor]

'copies' @ [978:25] ==> public abstract val copies: Collection<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.Instruction[PropertyDescriptorImpl]

'isEmpty' @ [978:32] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'trace' @ [979:13] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'report' @ [979:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'diagnostic' @ [979:26] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.report[ValueParameterDescriptorImpl]

'ctxt' @ [982:34] ==> value-parameter ctxt: ControlFlowInformationProvider.VariableContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.report[ValueParameterDescriptorImpl]

'reportedDiagnosticMap' @ [982:39] ==> internal final val reportedDiagnosticMap: MutableMap<Instruction, DiagnosticFactory<*>> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableContext[PropertyDescriptorImpl]

'previouslyReported' @ [983:9] ==> val previouslyReported: MutableMap<Instruction, DiagnosticFactory<*>> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.report[LocalVariableDescriptor]

'put' @ [983:28] ==> public abstract fun put(key: Instruction, value: DiagnosticFactory<*>): DiagnosticFactory<*>? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'instruction' @ [983:32] ==> val instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.report[LocalVariableDescriptor]

'diagnostic' @ [983:45] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.report[ValueParameterDescriptorImpl]

'factory' @ [983:56] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'instruction' @ [987:22] ==> val instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.report[LocalVariableDescriptor]

'copies' @ [987:34] ==> public abstract val copies: Collection<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.Instruction[PropertyDescriptorImpl]

'previouslyReported' @ [988:50] ==> val previouslyReported: MutableMap<Instruction, DiagnosticFactory<*>> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.report[LocalVariableDescriptor]

'copy' @ [988:69] ==> val copy: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.report[LocalVariableDescriptor]

'previouslyReportedErrorFactory' @ [989:17] ==> val previouslyReportedErrorFactory: DiagnosticFactory<*>? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.report[LocalVariableDescriptor]

'alreadyReported' @ [990:17] ==> var alreadyReported: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.report[LocalVariableDescriptor]

'previouslyReportedErrorFactory' @ [993:17] ==> val previouslyReportedErrorFactory: DiagnosticFactory<*>? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.report[LocalVariableDescriptor]

'diagnostic' @ [993:52] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.report[ValueParameterDescriptorImpl]

'factory' @ [993:63] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'sameErrorForAllCopies' @ [994:17] ==> var sameErrorForAllCopies: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.report[LocalVariableDescriptor]

'if (mustBeReportedOnAllCopies(diagnostic.factory)) {
            if (sameErrorForAllCopies) {
                trace.report(diagnostic)
            }
        }
        else {
            //only one reporting required
            if (!alreadyReported) {
                trace.report(diagnostic)
            }
        }' @ [998:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'mustBeReportedOnAllCopies' @ [998:13] ==> private final fun mustBeReportedOnAllCopies(diagnosticFactory: DiagnosticFactory<*>): Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion[SimpleFunctionDescriptorImpl]

'diagnostic' @ [998:39] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.report[ValueParameterDescriptorImpl]

'factory' @ [998:50] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'sameErrorForAllCopies' @ [999:17] ==> var sameErrorForAllCopies: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.report[LocalVariableDescriptor]

'trace' @ [1000:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'report' @ [1000:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'diagnostic' @ [1000:30] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.report[ValueParameterDescriptorImpl]

'!' @ [1005:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'alreadyReported' @ [1005:18] ==> var alreadyReported: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.report[LocalVariableDescriptor]

'trace' @ [1006:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'report' @ [1006:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'diagnostic' @ [1006:30] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.report[ValueParameterDescriptorImpl]

'extractVariableDescriptorFromReference' @ [1016:58] ==> @Nullable public open fun extractVariableDescriptorFromReference(@NotNull instruction: Instruction, @NotNull bindingContext: BindingContext): VariableDescriptor? defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeUtil[JavaMethodDescriptor]

'instruction' @ [1016:97] ==> internal final val instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableContext[PropertyDescriptorImpl]

'trace' @ [1016:110] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider[PropertyDescriptorImpl]

'bindingContext' @ [1016:116] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'VariableContext' @ [1025:9] ==> public constructor VariableContext(instruction: Instruction, reportedDiagnosticMap: MutableMap<Instruction, DiagnosticFactory<*>>) defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableContext[ClassConstructorDescriptorImpl]

'instruction' @ [1025:25] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableInitContext.<init>[ValueParameterDescriptorImpl]

'map' @ [1025:38] ==> value-parameter map: MutableMap<Instruction, DiagnosticFactory<*>> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableInitContext.<init>[ValueParameterDescriptorImpl]

'initialize' @ [1026:39] ==> private final fun initialize(variableDescriptor: VariableDescriptor?, blockScopeVariableInfo: BlockScopeVariableInfo, map: ImmutableMap<VariableDescriptor, VariableControlFlowState> /* = Map<VariableDescriptor, VariableControlFlowState> */): VariableControlFlowState? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableInitContext[SimpleFunctionDescriptorImpl]

'variableDescriptor' @ [1026:50] ==> internal final val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableInitContext[PropertyDescriptorImpl]

'blockScopeVariableInfo' @ [1026:70] ==> value-parameter blockScopeVariableInfo: BlockScopeVariableInfo defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableInitContext.<init>[ValueParameterDescriptorImpl]

'`in`' @ [1026:94] ==> value-parameter `in`: ImmutableMap<VariableDescriptor, VariableControlFlowState> /* = Map<VariableDescriptor, VariableControlFlowState> */ defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableInitContext.<init>[ValueParameterDescriptorImpl]

'initialize' @ [1027:38] ==> private final fun initialize(variableDescriptor: VariableDescriptor?, blockScopeVariableInfo: BlockScopeVariableInfo, map: ImmutableMap<VariableDescriptor, VariableControlFlowState> /* = Map<VariableDescriptor, VariableControlFlowState> */): VariableControlFlowState? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableInitContext[SimpleFunctionDescriptorImpl]

'variableDescriptor' @ [1027:49] ==> internal final val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableInitContext[PropertyDescriptorImpl]

'blockScopeVariableInfo' @ [1027:69] ==> value-parameter blockScopeVariableInfo: BlockScopeVariableInfo defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableInitContext.<init>[ValueParameterDescriptorImpl]

'out' @ [1027:93] ==> value-parameter out: ImmutableMap<VariableDescriptor, VariableControlFlowState> /* = Map<VariableDescriptor, VariableControlFlowState> */ defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableInitContext.<init>[ValueParameterDescriptorImpl]

'map' @ [1034:25] ==> value-parameter map: ImmutableMap<VariableDescriptor, VariableControlFlowState> /* = Map<VariableDescriptor, VariableControlFlowState> */ defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableInitContext.initialize[ValueParameterDescriptorImpl]

'getOrNull' @ [1034:29] ==> public fun <K, V> ImmutableMap<VariableDescriptor, VariableControlFlowState> /* = Map<VariableDescriptor, VariableControlFlowState> */.getOrNull(k: VariableDescriptor): VariableControlFlowState? defined in org.jetbrains.kotlin.cfg[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> VariableDescriptor
    <V> -> VariableControlFlowState

'variableDescriptor' @ [1034:39] ==> value-parameter variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableInitContext.initialize[ValueParameterDescriptorImpl]

'state' @ [1035:17] ==> val state: VariableControlFlowState? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableInitContext.initialize[LocalVariableDescriptor]

'state' @ [1035:39] ==> val state: VariableControlFlowState? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableInitContext.initialize[LocalVariableDescriptor]

'PseudocodeVariablesData' @ [1036:20] ==> public companion object defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData[FakeCallableDescriptorForObject]

'getDefaultValueForInitializers' @ [1036:44] ==> @JvmStatic public final fun getDefaultValueForInitializers(variable: VariableDescriptor, instruction: Instruction, blockScopeVariableInfo: BlockScopeVariableInfo): VariableControlFlowState defined in org.jetbrains.kotlin.cfg.PseudocodeVariablesData.Companion[SimpleFunctionDescriptorImpl]

'variableDescriptor' @ [1036:75] ==> value-parameter variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableInitContext.initialize[ValueParameterDescriptorImpl]

'instruction' @ [1036:95] ==> internal final val instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableInitContext[PropertyDescriptorImpl]

'blockScopeVariableInfo' @ [1036:108] ==> value-parameter blockScopeVariableInfo: BlockScopeVariableInfo defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableInitContext.initialize[ValueParameterDescriptorImpl]

'VariableContext' @ [1043:9] ==> public constructor VariableContext(instruction: Instruction, reportedDiagnosticMap: MutableMap<Instruction, DiagnosticFactory<*>>) defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableContext[ClassConstructorDescriptorImpl]

'instruction' @ [1043:25] ==> value-parameter instruction: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableUseContext.<init>[ValueParameterDescriptorImpl]

'map' @ [1043:38] ==> value-parameter map: MutableMap<Instruction, DiagnosticFactory<*>> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.VariableUseContext.<init>[ValueParameterDescriptorImpl]

'getParentOfType' @ [1049:17] ==> @SafeVarargs @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull vararg p1: (Class<out (KtDeclaration..KtDeclaration?)>..Class<out (KtDeclaration..KtDeclaration?)>?)): KtDeclaration? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtDeclaration

'element' @ [1049:33] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.getElementParentDeclaration[ValueParameterDescriptorImpl]

'java' @ [1049:71] ==> public val <T> KClass<KtDeclarationWithBody>.java: Class<KtDeclarationWithBody> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtDeclarationWithBody

'java' @ [1049:100] ==> public val <T> KClass<KtClassOrObject>.java: Class<KtClassOrObject> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtClassOrObject

'java' @ [1049:132] ==> public val <T> KClass<KtClassInitializer>.java: Class<KtClassInitializer> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtClassInitializer

'context' @ [1052:30] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.getDeclarationDescriptorIncludingConstructors[ValueParameterDescriptorImpl]

'get' @ [1052:38] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?), key: (PsiElement..PsiElement?)): DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> DeclarationDescriptor

'DECLARATION_TO_DESCRIPTOR' @ [1052:42] ==> @SuppressWarnings public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'?:' @ [1053:40] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtDeclaration?, right: KtDeclaration?): KtDeclaration?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtDeclaration?

'declaration' @ [1053:41] ==> value-parameter declaration: KtDeclaration? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.getDeclarationDescriptorIncludingConstructors[ValueParameterDescriptorImpl]

'containingDeclaration' @ [1053:78] ==> public open val containingDeclaration: KtClassOrObject defined in org.jetbrains.kotlin.psi.KtClassInitializer[PropertyDescriptorImpl]

'declaration' @ [1053:103] ==> value-parameter declaration: KtDeclaration? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.getDeclarationDescriptorIncludingConstructors[ValueParameterDescriptorImpl]

'if (descriptor is ClassDescriptor && declaration is KtClassInitializer) {
                // For a class primary constructor, we cannot directly get ConstructorDescriptor by KtClassInitializer,
                // so we have to do additional conversion: KtClassInitializer -> KtClassOrObject -> ClassDescriptor -> ConstructorDescriptor
                descriptor.unsubstitutedPrimaryConstructor
                ?: (descriptor as? ClassDescriptorWithResolutionScopes)?.scopeForInitializerResolution?.ownerDescriptor
            }
            else {
                descriptor
            }' @ [1054:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DeclarationDescriptor?, elseBranch: DeclarationDescriptor?): DeclarationDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DeclarationDescriptor?

'descriptor' @ [1054:24] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.getDeclarationDescriptorIncludingConstructors[LocalVariableDescriptor]

'declaration' @ [1054:57] ==> value-parameter declaration: KtDeclaration? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.getDeclarationDescriptorIncludingConstructors[ValueParameterDescriptorImpl]

'descriptor' @ [1057:17] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.getDeclarationDescriptorIncludingConstructors[LocalVariableDescriptor]

'unsubstitutedPrimaryConstructor' @ [1057:28] ==> public final val ClassDescriptor.unsubstitutedPrimaryConstructor: ClassConstructorDescriptor?[MyPropertyDescriptor]

'descriptor' @ [1058:21] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.getDeclarationDescriptorIncludingConstructors[LocalVariableDescriptor]

'scopeForInitializerResolution' @ [1058:74] ==> public final val ClassDescriptorWithResolutionScopes.scopeForInitializerResolution: LexicalScope[MyPropertyDescriptor]

'ownerDescriptor' @ [1058:105] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedPropertyDescriptor]

'descriptor' @ [1061:17] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.getDeclarationDescriptorIncludingConstructors[LocalVariableDescriptor]

'usages' @ [1066:27] ==> value-parameter usages: List<Instruction> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.isUsedAsResultOfLambda[ValueParameterDescriptorImpl]

'usage' @ [1067:21] ==> val usage: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.isUsedAsResultOfLambda[LocalVariableDescriptor]

'usage' @ [1068:41] ==> val usage: Instruction defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.isUsedAsResultOfLambda[LocalVariableDescriptor]

'element' @ [1068:47] ==> public open val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.jumps.ReturnValueInstruction[PropertyDescriptorImpl]

'returnElement' @ [1069:41] ==> val returnElement: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.isUsedAsResultOfLambda[LocalVariableDescriptor]

'parent' @ [1069:55] ==> public final val KtElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'returnElement' @ [1070:25] ==> val returnElement: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.isUsedAsResultOfLambda[LocalVariableDescriptor]

'parentElement' @ [1071:26] ==> val parentElement: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.isUsedAsResultOfLambda[LocalVariableDescriptor]

'parentElement' @ [1071:61] ==> val parentElement: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.isUsedAsResultOfLambda[LocalVariableDescriptor]

'ArrayList' @ [1080:32] ==> public final fun <E> <init>(): ArrayList<KtExpression> /* = ArrayList<KtExpression> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> KtExpression

'collectResultingExpressionsOfConditionalExpressionRec' @ [1081:13] ==> private final fun collectResultingExpressionsOfConditionalExpressionRec(expression: KtExpression?, resultingExpressions: MutableList<KtExpression>): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [1081:67] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.collectResultingExpressionsOfConditionalExpression[ValueParameterDescriptorImpl]

'leafBranches' @ [1081:79] ==> val leafBranches: ArrayList<KtExpression> /* = ArrayList<KtExpression> */ defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.collectResultingExpressionsOfConditionalExpression[LocalVariableDescriptor]

'leafBranches' @ [1082:20] ==> val leafBranches: ArrayList<KtExpression> /* = ArrayList<KtExpression> */ defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.collectResultingExpressionsOfConditionalExpression[LocalVariableDescriptor]

'when (expression) {
                is KtIfExpression -> {
                    collectResultingExpressionsOfConditionalExpressionRec(expression.then, resultingExpressions)
                    collectResultingExpressionsOfConditionalExpressionRec(expression.`else`, resultingExpressions)
                }
                is KtWhenExpression -> for (whenEntry in expression.entries) {
                    collectResultingExpressionsOfConditionalExpressionRec(whenEntry.expression, resultingExpressions)
                }
                is Any -> {
                    val resultingExpression = getResultingExpression(expression)
                    if (resultingExpression is KtIfExpression || resultingExpression is KtWhenExpression) {
                        collectResultingExpressionsOfConditionalExpressionRec(resultingExpression, resultingExpressions)
                    }
                    else {
                        resultingExpressions.add(resultingExpression)
                    }
                }
            }' @ [1089:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'expression' @ [1089:19] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.collectResultingExpressionsOfConditionalExpressionRec[ValueParameterDescriptorImpl]

'collectResultingExpressionsOfConditionalExpressionRec' @ [1091:21] ==> private final fun collectResultingExpressionsOfConditionalExpressionRec(expression: KtExpression?, resultingExpressions: MutableList<KtExpression>): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [1091:75] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.collectResultingExpressionsOfConditionalExpressionRec[ValueParameterDescriptorImpl]

'then' @ [1091:86] ==> public final val KtIfExpression.then: KtExpression?[MyPropertyDescriptor]

'resultingExpressions' @ [1091:92] ==> value-parameter resultingExpressions: MutableList<KtExpression> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.collectResultingExpressionsOfConditionalExpressionRec[ValueParameterDescriptorImpl]

'collectResultingExpressionsOfConditionalExpressionRec' @ [1092:21] ==> private final fun collectResultingExpressionsOfConditionalExpressionRec(expression: KtExpression?, resultingExpressions: MutableList<KtExpression>): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [1092:75] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.collectResultingExpressionsOfConditionalExpressionRec[ValueParameterDescriptorImpl]

'`else`' @ [1092:86] ==> public final val KtIfExpression.`else`: KtExpression?[MyPropertyDescriptor]

'resultingExpressions' @ [1092:94] ==> value-parameter resultingExpressions: MutableList<KtExpression> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.collectResultingExpressionsOfConditionalExpressionRec[ValueParameterDescriptorImpl]

'expression' @ [1094:58] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.collectResultingExpressionsOfConditionalExpressionRec[ValueParameterDescriptorImpl]

'entries' @ [1094:69] ==> public final val KtWhenExpression.entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>)[MyPropertyDescriptor]

'collectResultingExpressionsOfConditionalExpressionRec' @ [1095:21] ==> private final fun collectResultingExpressionsOfConditionalExpressionRec(expression: KtExpression?, resultingExpressions: MutableList<KtExpression>): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion[SimpleFunctionDescriptorImpl]

'whenEntry' @ [1095:75] ==> val whenEntry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.collectResultingExpressionsOfConditionalExpressionRec[LocalVariableDescriptor]

'expression' @ [1095:85] ==> public final val KtWhenEntry.expression: KtExpression?[MyPropertyDescriptor]

'resultingExpressions' @ [1095:97] ==> value-parameter resultingExpressions: MutableList<KtExpression> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.collectResultingExpressionsOfConditionalExpressionRec[ValueParameterDescriptorImpl]

'getResultingExpression' @ [1098:47] ==> private final fun getResultingExpression(expression: KtExpression): KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [1098:70] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.collectResultingExpressionsOfConditionalExpressionRec[ValueParameterDescriptorImpl]

'if (resultingExpression is KtIfExpression || resultingExpression is KtWhenExpression) {
                        collectResultingExpressionsOfConditionalExpressionRec(resultingExpression, resultingExpressions)
                    }
                    else {
                        resultingExpressions.add(resultingExpression)
                    }' @ [1099:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'resultingExpression' @ [1099:25] ==> val resultingExpression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.collectResultingExpressionsOfConditionalExpressionRec[LocalVariableDescriptor]

'resultingExpression' @ [1099:66] ==> val resultingExpression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.collectResultingExpressionsOfConditionalExpressionRec[LocalVariableDescriptor]

'collectResultingExpressionsOfConditionalExpressionRec' @ [1100:25] ==> private final fun collectResultingExpressionsOfConditionalExpressionRec(expression: KtExpression?, resultingExpressions: MutableList<KtExpression>): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion[SimpleFunctionDescriptorImpl]

'resultingExpression' @ [1100:79] ==> val resultingExpression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.collectResultingExpressionsOfConditionalExpressionRec[LocalVariableDescriptor]

'resultingExpressions' @ [1100:100] ==> value-parameter resultingExpressions: MutableList<KtExpression> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.collectResultingExpressionsOfConditionalExpressionRec[ValueParameterDescriptorImpl]

'resultingExpressions' @ [1103:25] ==> value-parameter resultingExpressions: MutableList<KtExpression> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.collectResultingExpressionsOfConditionalExpressionRec[ValueParameterDescriptorImpl]

'add' @ [1103:46] ==> public abstract fun add(element: KtExpression): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'resultingExpression' @ [1103:50] ==> val resultingExpression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.collectResultingExpressionsOfConditionalExpressionRec[LocalVariableDescriptor]

'expression' @ [1110:26] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.getResultingExpression[ValueParameterDescriptorImpl]

'deparenthesize' @ [1112:49] ==> @Nullable public open fun deparenthesize(@Nullable expression: KtExpression?): KtExpression? defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'finger' @ [1112:64] ==> var finger: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.getResultingExpression[LocalVariableDescriptor]

'deparenthesized' @ [1113:17] ==> var deparenthesized: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.getResultingExpression[LocalVariableDescriptor]

'getExpressionOrLastStatementInBlock' @ [1113:45] ==> @Nullable public open fun getExpressionOrLastStatementInBlock(@Nullable expression: KtExpression?): KtExpression? defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'deparenthesized' @ [1113:81] ==> var deparenthesized: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.getResultingExpression[LocalVariableDescriptor]

'deparenthesized' @ [1114:21] ==> var deparenthesized: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.getResultingExpression[LocalVariableDescriptor]

'deparenthesized' @ [1114:48] ==> var deparenthesized: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.getResultingExpression[LocalVariableDescriptor]

'finger' @ [1114:68] ==> var finger: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.getResultingExpression[LocalVariableDescriptor]

'finger' @ [1115:17] ==> var finger: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.getResultingExpression[LocalVariableDescriptor]

'deparenthesized' @ [1115:26] ==> var deparenthesized: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.getResultingExpression[LocalVariableDescriptor]

'finger' @ [1117:20] ==> var finger: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.getResultingExpression[LocalVariableDescriptor]

'if (existingKind == null || existingKind == kind) {
                kind
            }
            else {
                when {
                    check(kind, existingKind, IN_TRY, TAIL_CALL) -> IN_TRY
                    check(kind, existingKind, IN_TRY, NON_TAIL) -> IN_TRY
                    else -> NON_TAIL // TAIL_CALL, NON_TAIL
                }
            }' @ [1121:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TailRecursionKind, elseBranch: TailRecursionKind): TailRecursionKind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TailRecursionKind

'existingKind' @ [1121:24] ==> value-parameter existingKind: TailRecursionKind? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.combineKinds[ValueParameterDescriptorImpl]

'existingKind' @ [1121:48] ==> value-parameter existingKind: TailRecursionKind? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.combineKinds[ValueParameterDescriptorImpl]

'kind' @ [1121:64] ==> value-parameter kind: TailRecursionKind defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.combineKinds[ValueParameterDescriptorImpl]

'kind' @ [1122:17] ==> value-parameter kind: TailRecursionKind defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.combineKinds[ValueParameterDescriptorImpl]

'when {
                    check(kind, existingKind, IN_TRY, TAIL_CALL) -> IN_TRY
                    check(kind, existingKind, IN_TRY, NON_TAIL) -> IN_TRY
                    else -> NON_TAIL // TAIL_CALL, NON_TAIL
                }' @ [1125:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: TailRecursionKind, entry1: TailRecursionKind, entry2: TailRecursionKind): TailRecursionKind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> TailRecursionKind

'check' @ [1126:21] ==> private final fun check(a: Any, b: Any, x: Any, y: Any): Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion[SimpleFunctionDescriptorImpl]

'kind' @ [1126:27] ==> value-parameter kind: TailRecursionKind defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.combineKinds[ValueParameterDescriptorImpl]

'existingKind' @ [1126:33] ==> value-parameter existingKind: TailRecursionKind? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.combineKinds[ValueParameterDescriptorImpl]

'IN_TRY' @ [1126:47] ==> enum entry IN_TRY defined in org.jetbrains.kotlin.cfg.TailRecursionKind[FakeCallableDescriptorForObject]

'TAIL_CALL' @ [1126:55] ==> enum entry TAIL_CALL defined in org.jetbrains.kotlin.cfg.TailRecursionKind[FakeCallableDescriptorForObject]

'IN_TRY' @ [1126:69] ==> enum entry IN_TRY defined in org.jetbrains.kotlin.cfg.TailRecursionKind[FakeCallableDescriptorForObject]

'check' @ [1127:21] ==> private final fun check(a: Any, b: Any, x: Any, y: Any): Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion[SimpleFunctionDescriptorImpl]

'kind' @ [1127:27] ==> value-parameter kind: TailRecursionKind defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.combineKinds[ValueParameterDescriptorImpl]

'existingKind' @ [1127:33] ==> value-parameter existingKind: TailRecursionKind? defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.combineKinds[ValueParameterDescriptorImpl]

'IN_TRY' @ [1127:47] ==> enum entry IN_TRY defined in org.jetbrains.kotlin.cfg.TailRecursionKind[FakeCallableDescriptorForObject]

'NON_TAIL' @ [1127:55] ==> enum entry NON_TAIL defined in org.jetbrains.kotlin.cfg.TailRecursionKind[FakeCallableDescriptorForObject]

'IN_TRY' @ [1127:68] ==> enum entry IN_TRY defined in org.jetbrains.kotlin.cfg.TailRecursionKind[FakeCallableDescriptorForObject]

'NON_TAIL' @ [1128:29] ==> enum entry NON_TAIL defined in org.jetbrains.kotlin.cfg.TailRecursionKind[FakeCallableDescriptorForObject]

'a' @ [1133:61] ==> value-parameter a: Any defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.check[ValueParameterDescriptorImpl]

'x' @ [1133:67] ==> value-parameter x: Any defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.check[ValueParameterDescriptorImpl]

'b' @ [1133:72] ==> value-parameter b: Any defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.check[ValueParameterDescriptorImpl]

'y' @ [1133:78] ==> value-parameter y: Any defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.check[ValueParameterDescriptorImpl]

'a' @ [1133:83] ==> value-parameter a: Any defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.check[ValueParameterDescriptorImpl]

'y' @ [1133:89] ==> value-parameter y: Any defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.check[ValueParameterDescriptorImpl]

'b' @ [1133:94] ==> value-parameter b: Any defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.check[ValueParameterDescriptorImpl]

'x' @ [1133:100] ==> value-parameter x: Any defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.check[ValueParameterDescriptorImpl]

'diagnosticFactory' @ [1136:17] ==> value-parameter diagnosticFactory: DiagnosticFactory<*> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.mustBeReportedOnAllCopies[ValueParameterDescriptorImpl]

'UNUSED_VARIABLE' @ [1136:39] ==> public final val UNUSED_VARIABLE: (DiagnosticFactory1<(KtNamedDeclaration..KtNamedDeclaration?), (VariableDescriptor..VariableDescriptor?)>..DiagnosticFactory1<(KtNamedDeclaration..KtNamedDeclaration?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'diagnosticFactory' @ [1137:20] ==> value-parameter diagnosticFactory: DiagnosticFactory<*> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.mustBeReportedOnAllCopies[ValueParameterDescriptorImpl]

'UNUSED_PARAMETER' @ [1137:42] ==> public final val UNUSED_PARAMETER: (DiagnosticFactory1<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>..DiagnosticFactory1<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'diagnosticFactory' @ [1138:20] ==> value-parameter diagnosticFactory: DiagnosticFactory<*> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.mustBeReportedOnAllCopies[ValueParameterDescriptorImpl]

'UNUSED_ANONYMOUS_PARAMETER' @ [1138:42] ==> public final val UNUSED_ANONYMOUS_PARAMETER: (DiagnosticFactory1<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>..DiagnosticFactory1<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'diagnosticFactory' @ [1139:20] ==> value-parameter diagnosticFactory: DiagnosticFactory<*> defined in org.jetbrains.kotlin.cfg.ControlFlowInformationProvider.Companion.mustBeReportedOnAllCopies[ValueParameterDescriptorImpl]

'UNUSED_CHANGED_VALUE' @ [1139:42] ==> public final val UNUSED_CHANGED_VALUE: (DiagnosticFactory1<(KtElement..KtElement?), (KtElement..KtElement?)>..DiagnosticFactory1<(KtElement..KtElement?), (KtElement..KtElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

