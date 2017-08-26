'ControlFlowInstructionsGenerator' @ [63:47] ==> public constructor ControlFlowInstructionsGenerator() defined in org.jetbrains.kotlin.cfg.pseudocode.ControlFlowInstructionsGenerator[ClassConstructorDescriptorImpl]

'generate' @ [66:26] ==> private final fun generate(subroutine: KtElement): Pseudocode defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[SimpleFunctionDescriptorImpl]

'subroutine' @ [66:35] ==> value-parameter subroutine: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.generatePseudocode[ValueParameterDescriptorImpl]

'pseudocode' @ [67:10] ==> val pseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.generatePseudocode[LocalVariableDescriptor]

'postProcess' @ [67:40] ==> public final fun postProcess(): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeImpl[SimpleFunctionDescriptorImpl]

'pseudocode' @ [68:16] ==> val pseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.generatePseudocode[LocalVariableDescriptor]

'builder' @ [72:9] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[PropertyDescriptorImpl]

'enterSubroutine' @ [72:17] ==> public abstract fun enterSubroutine(subroutine: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'subroutine' @ [72:33] ==> value-parameter subroutine: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.generate[ValueParameterDescriptorImpl]

'CFPVisitor' @ [73:26] ==> public constructor CFPVisitor(builder: ControlFlowBuilder) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[ClassConstructorDescriptorImpl]

'builder' @ [73:37] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[PropertyDescriptorImpl]

'if (subroutine is KtDeclarationWithBody && subroutine !is KtSecondaryConstructor) {
            val valueParameters = subroutine.valueParameters
            for (valueParameter in valueParameters) {
                cfpVisitor.generateInstructions(valueParameter)
            }
            val bodyExpression = subroutine.bodyExpression
            if (bodyExpression != null) {
                cfpVisitor.generateInstructions(bodyExpression)
                if (!subroutine.hasBlockBody()) {
                    generateImplicitReturnValue(bodyExpression, subroutine)
                }
            }
        }
        else {
            cfpVisitor.generateInstructions(subroutine)
        }' @ [74:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'subroutine' @ [74:13] ==> value-parameter subroutine: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.generate[ValueParameterDescriptorImpl]

'subroutine' @ [74:52] ==> value-parameter subroutine: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.generate[ValueParameterDescriptorImpl]

'subroutine' @ [75:35] ==> value-parameter subroutine: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.generate[ValueParameterDescriptorImpl]

'valueParameters' @ [75:46] ==> public final val KtDeclarationWithBody.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'valueParameters' @ [76:36] ==> val valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.generate[LocalVariableDescriptor]

'cfpVisitor' @ [77:17] ==> val cfpVisitor: ControlFlowProcessor.CFPVisitor defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.generate[LocalVariableDescriptor]

'generateInstructions' @ [77:28] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'valueParameter' @ [77:49] ==> val valueParameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.generate[LocalVariableDescriptor]

'subroutine' @ [79:34] ==> value-parameter subroutine: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.generate[ValueParameterDescriptorImpl]

'bodyExpression' @ [79:45] ==> public final val KtDeclarationWithBody.bodyExpression: KtExpression?[MyPropertyDescriptor]

'bodyExpression' @ [80:17] ==> val bodyExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.generate[LocalVariableDescriptor]

'cfpVisitor' @ [81:17] ==> val cfpVisitor: ControlFlowProcessor.CFPVisitor defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.generate[LocalVariableDescriptor]

'generateInstructions' @ [81:28] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'bodyExpression' @ [81:49] ==> val bodyExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.generate[LocalVariableDescriptor]

'!' @ [82:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'subroutine' @ [82:22] ==> value-parameter subroutine: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.generate[ValueParameterDescriptorImpl]

'hasBlockBody' @ [82:33] ==> public abstract fun hasBlockBody(): Boolean defined in org.jetbrains.kotlin.psi.KtDeclarationWithBody[JavaMethodDescriptor]

'generateImplicitReturnValue' @ [83:21] ==> private final fun generateImplicitReturnValue(bodyExpression: KtExpression, subroutine: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[SimpleFunctionDescriptorImpl]

'bodyExpression' @ [83:49] ==> val bodyExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.generate[LocalVariableDescriptor]

'subroutine' @ [83:65] ==> value-parameter subroutine: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.generate[ValueParameterDescriptorImpl]

'cfpVisitor' @ [88:13] ==> val cfpVisitor: ControlFlowProcessor.CFPVisitor defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.generate[LocalVariableDescriptor]

'generateInstructions' @ [88:24] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'subroutine' @ [88:45] ==> value-parameter subroutine: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.generate[ValueParameterDescriptorImpl]

'builder' @ [90:16] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[PropertyDescriptorImpl]

'exitSubroutine' @ [90:24] ==> public abstract fun exitSubroutine(subroutine: KtElement): Pseudocode defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'subroutine' @ [90:39] ==> value-parameter subroutine: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.generate[ValueParameterDescriptorImpl]

'trace' @ [94:36] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[PropertyDescriptorImpl]

'get' @ [94:42] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?), key: (PsiElement..PsiElement?)): DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> DeclarationDescriptor

'DECLARATION_TO_DESCRIPTOR' @ [94:61] ==> @SuppressWarnings public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'subroutine' @ [94:88] ==> value-parameter subroutine: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.generateImplicitReturnValue[ValueParameterDescriptorImpl]

'subroutineDescriptor' @ [96:26] ==> val subroutineDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.generateImplicitReturnValue[LocalVariableDescriptor]

'returnType' @ [96:47] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'returnType' @ [97:13] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.generateImplicitReturnValue[LocalVariableDescriptor]

'isUnit' @ [97:50] ==> public open fun isUnit(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'returnType' @ [97:57] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.generateImplicitReturnValue[LocalVariableDescriptor]

'subroutineDescriptor' @ [97:72] ==> val subroutineDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.generateImplicitReturnValue[LocalVariableDescriptor]

'builder' @ [99:27] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[PropertyDescriptorImpl]

'getBoundValue' @ [99:35] ==> public abstract fun getBoundValue(element: KtElement?): PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'bodyExpression' @ [99:49] ==> value-parameter bodyExpression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.generateImplicitReturnValue[ValueParameterDescriptorImpl]

'builder' @ [101:9] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[PropertyDescriptorImpl]

'returnValue' @ [101:17] ==> public abstract fun returnValue(returnExpression: KtExpression, returnValue: PseudoValue, subroutine: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'bodyExpression' @ [101:29] ==> value-parameter bodyExpression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.generateImplicitReturnValue[ValueParameterDescriptorImpl]

'returnValue' @ [101:45] ==> val returnValue: PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.generateImplicitReturnValue[LocalVariableDescriptor]

'subroutine' @ [101:58] ==> value-parameter subroutine: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.generateImplicitReturnValue[ValueParameterDescriptorImpl]

'builder' @ [105:32] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[PropertyDescriptorImpl]

'createUnboundLabel' @ [105:40] ==> public abstract fun createUnboundLabel(name: String): Label defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'builder' @ [107:9] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[PropertyDescriptorImpl]

'nondeterministicJump' @ [107:17] ==> public abstract fun nondeterministicJump(label: Label, element: KtElement, inputValue: PseudoValue?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'afterDeclaration' @ [107:38] ==> val afterDeclaration: Label defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.processLocalDeclaration[LocalVariableDescriptor]

'subroutine' @ [107:56] ==> value-parameter subroutine: KtDeclaration defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.processLocalDeclaration[ValueParameterDescriptorImpl]

'generate' @ [108:9] ==> private final fun generate(subroutine: KtElement): Pseudocode defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[SimpleFunctionDescriptorImpl]

'subroutine' @ [108:18] ==> value-parameter subroutine: KtDeclaration defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.processLocalDeclaration[ValueParameterDescriptorImpl]

'builder' @ [109:9] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[PropertyDescriptorImpl]

'bindLabel' @ [109:17] ==> public abstract fun bindLabel(label: Label): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'afterDeclaration' @ [109:27] ==> val afterDeclaration: Label defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.processLocalDeclaration[LocalVariableDescriptor]

'KtVisitorVoid' @ [114:79] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'Stack' @ [116:41] ==> public constructor Stack<E : (Any..Any?)>() defined in java.util.Stack[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> CatchFinallyLabels

'KtVisitorVoid' @ [118:49] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'condition' @ [121:21] ==> value-parameter condition: KtWhenCondition defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.conditionVisitor.<no name provided>.getSubjectExpression[ValueParameterDescriptorImpl]

'getStrictParentOfType' @ [121:31] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtWhenExpression? defined in org.jetbrains.kotlin.psi.psiUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KtWhenExpression

'subjectExpression' @ [121:74] ==> public final val KtWhenExpression.subjectExpression: KtExpression?[MyPropertyDescriptor]

'!' @ [124:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'generateCall' @ [124:22] ==> private final fun generateCall(callElement: KtElement): Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'condition' @ [124:35] ==> value-parameter condition: KtWhenConditionInRange defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.conditionVisitor.<no name provided>.visitWhenConditionInRange[ValueParameterDescriptorImpl]

'operationReference' @ [124:45] ==> public final val KtWhenConditionInRange.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'condition' @ [125:43] ==> value-parameter condition: KtWhenConditionInRange defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.conditionVisitor.<no name provided>.visitWhenConditionInRange[ValueParameterDescriptorImpl]

'rangeExpression' @ [125:53] ==> public final val KtWhenConditionInRange.rangeExpression: KtExpression?[MyPropertyDescriptor]

'generateInstructions' @ [126:21] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'rangeExpression' @ [126:42] ==> val rangeExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.conditionVisitor.<no name provided>.visitWhenConditionInRange[LocalVariableDescriptor]

'createNonSyntheticValue' @ [127:21] ==> private final fun createNonSyntheticValue(to: KtElement, kind: MagicKind, vararg from: KtElement?): PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'condition' @ [127:45] ==> value-parameter condition: KtWhenConditionInRange defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.conditionVisitor.<no name provided>.visitWhenConditionInRange[ValueParameterDescriptorImpl]

'UNRESOLVED_CALL' @ [127:66] ==> enum entry UNRESOLVED_CALL defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'rangeExpression' @ [127:83] ==> val rangeExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.conditionVisitor.<no name provided>.visitWhenConditionInRange[LocalVariableDescriptor]

'mark' @ [132:17] ==> private final fun mark(element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'condition' @ [132:22] ==> value-parameter condition: KtWhenConditionIsPattern defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.conditionVisitor.<no name provided>.visitWhenConditionIsPattern[ValueParameterDescriptorImpl]

'createNonSyntheticValue' @ [133:17] ==> private final fun createNonSyntheticValue(to: KtElement, kind: MagicKind, vararg from: KtElement?): PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'condition' @ [133:41] ==> value-parameter condition: KtWhenConditionIsPattern defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.conditionVisitor.<no name provided>.visitWhenConditionIsPattern[ValueParameterDescriptorImpl]

'IS' @ [133:62] ==> enum entry IS defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'getSubjectExpression' @ [133:66] ==> private final fun getSubjectExpression(condition: KtWhenCondition): KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.conditionVisitor.<no name provided>[SimpleFunctionDescriptorImpl]

'condition' @ [133:87] ==> value-parameter condition: KtWhenConditionIsPattern defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.conditionVisitor.<no name provided>.visitWhenConditionIsPattern[ValueParameterDescriptorImpl]

'mark' @ [137:17] ==> private final fun mark(element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'condition' @ [137:22] ==> value-parameter condition: KtWhenConditionWithExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.conditionVisitor.<no name provided>.visitWhenConditionWithExpression[ValueParameterDescriptorImpl]

'condition' @ [139:34] ==> value-parameter condition: KtWhenConditionWithExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.conditionVisitor.<no name provided>.visitWhenConditionWithExpression[ValueParameterDescriptorImpl]

'expression' @ [139:44] ==> public final val KtWhenConditionWithExpression.expression: KtExpression?[MyPropertyDescriptor]

'generateInstructions' @ [140:17] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [140:38] ==> val expression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.conditionVisitor.<no name provided>.visitWhenConditionWithExpression[LocalVariableDescriptor]

'getSubjectExpression' @ [142:41] ==> private final fun getSubjectExpression(condition: KtWhenCondition): KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.conditionVisitor.<no name provided>[SimpleFunctionDescriptorImpl]

'condition' @ [142:62] ==> value-parameter condition: KtWhenConditionWithExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.conditionVisitor.<no name provided>.visitWhenConditionWithExpression[ValueParameterDescriptorImpl]

'if (subjectExpression != null) {
                    // todo: this can be replaced by equals() invocation (when corresponding resolved call is recorded)
                    createNonSyntheticValue(condition, MagicKind.EQUALS_IN_WHEN_CONDITION, subjectExpression, expression)
                }
                else {
                    copyValue(expression, condition)
                }' @ [143:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'subjectExpression' @ [143:21] ==> val subjectExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.conditionVisitor.<no name provided>.visitWhenConditionWithExpression[LocalVariableDescriptor]

'createNonSyntheticValue' @ [145:21] ==> private final fun createNonSyntheticValue(to: KtElement, kind: MagicKind, vararg from: KtElement?): PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'condition' @ [145:45] ==> value-parameter condition: KtWhenConditionWithExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.conditionVisitor.<no name provided>.visitWhenConditionWithExpression[ValueParameterDescriptorImpl]

'EQUALS_IN_WHEN_CONDITION' @ [145:66] ==> enum entry EQUALS_IN_WHEN_CONDITION defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'subjectExpression' @ [145:92] ==> val subjectExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.conditionVisitor.<no name provided>.visitWhenConditionWithExpression[LocalVariableDescriptor]

'expression' @ [145:111] ==> val expression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.conditionVisitor.<no name provided>.visitWhenConditionWithExpression[LocalVariableDescriptor]

'copyValue' @ [148:21] ==> private final fun copyValue(from: KtElement?, to: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [148:31] ==> val expression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.conditionVisitor.<no name provided>.visitWhenConditionWithExpression[LocalVariableDescriptor]

'condition' @ [148:43] ==> value-parameter condition: KtWhenConditionWithExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.conditionVisitor.<no name provided>.visitWhenConditionWithExpression[ValueParameterDescriptorImpl]

'UnsupportedOperationException' @ [153:23] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'+' @ [153:53] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'element' @ [153:81] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.conditionVisitor.<no name provided>.visitKtElement[ValueParameterDescriptorImpl]

'toString' @ [153:89] ==> public open fun toString(): String defined in org.jetbrains.kotlin.psi.KtElement[DeserializedSimpleFunctionDescriptor]

'builder' @ [158:13] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'mark' @ [158:21] ==> public abstract fun mark(element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'element' @ [158:26] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.mark[ValueParameterDescriptorImpl]

'element' @ [162:17] ==> value-parameter element: KtElement? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateInstructions[ValueParameterDescriptorImpl]

'element' @ [163:13] ==> value-parameter element: KtElement? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateInstructions[ValueParameterDescriptorImpl]

'accept' @ [163:21] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'this' @ [163:28] ==> <this> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[LazyClassReceiverParameterDescriptor]

'checkNothingType' @ [164:13] ==> private final fun checkNothingType(element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'element' @ [164:30] ==> value-parameter element: KtElement? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateInstructions[ValueParameterDescriptorImpl]

'element' @ [168:17] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.checkNothingType[ValueParameterDescriptorImpl]

'?:' @ [170:30] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtExpression?, right: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtExpression

'deparenthesize' @ [170:40] ==> @Nullable public open fun deparenthesize(@Nullable expression: KtExpression?): KtExpression? defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'element' @ [170:55] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.checkNothingType[ValueParameterDescriptorImpl]

'expression' @ [172:17] ==> val expression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.checkNothingType[LocalVariableDescriptor]

'expression' @ [172:56] ==> val expression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.checkNothingType[LocalVariableDescriptor]

'expression' @ [173:20] ==> val expression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.checkNothingType[LocalVariableDescriptor]

'expression' @ [173:52] ==> val expression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.checkNothingType[LocalVariableDescriptor]

'trace' @ [177:24] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[PropertyDescriptorImpl]

'bindingContext' @ [177:30] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'getType' @ [177:45] ==> @Nullable public abstract fun getType(@NotNull expression: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'expression' @ [177:53] ==> val expression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.checkNothingType[LocalVariableDescriptor]

'type' @ [178:17] ==> val type: KotlinType? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.checkNothingType[LocalVariableDescriptor]

'isNothing' @ [178:48] ==> public open fun isNothing(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [178:58] ==> val type: KotlinType? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.checkNothingType[LocalVariableDescriptor]

'builder' @ [179:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'jumpToError' @ [179:25] ==> public abstract fun jumpToError(element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [179:37] ==> val expression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.checkNothingType[LocalVariableDescriptor]

'builder' @ [184:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'magic' @ [184:25] ==> public abstract fun magic(instructionElement: KtElement, valueElement: KtElement?, inputValues: List<PseudoValue>, kind: MagicKind): MagicInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'instructionElement' @ [184:31] ==> value-parameter instructionElement: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.createSyntheticValue[ValueParameterDescriptorImpl]

'elementsToValues' @ [184:57] ==> private final fun elementsToValues(from: List<KtElement?>): List<PseudoValue> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'from' @ [184:74] ==> value-parameter vararg from: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.createSyntheticValue[ValueParameterDescriptorImpl]

'asList' @ [184:79] ==> public fun <T> Array<out KtElement>.asList(): List<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'kind' @ [184:90] ==> value-parameter kind: MagicKind defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.createSyntheticValue[ValueParameterDescriptorImpl]

'outputValue' @ [184:96] ==> public open val outputValue: PseudoValue defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction[PropertyDescriptorImpl]

'builder' @ [187:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'magic' @ [187:25] ==> public abstract fun magic(instructionElement: KtElement, valueElement: KtElement?, inputValues: List<PseudoValue>, kind: MagicKind): MagicInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'to' @ [187:31] ==> value-parameter to: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.createNonSyntheticValue[ValueParameterDescriptorImpl]

'to' @ [187:35] ==> value-parameter to: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.createNonSyntheticValue[ValueParameterDescriptorImpl]

'elementsToValues' @ [187:39] ==> private final fun elementsToValues(from: List<KtElement?>): List<PseudoValue> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'from' @ [187:56] ==> value-parameter from: List<KtElement?> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.createNonSyntheticValue[ValueParameterDescriptorImpl]

'kind' @ [187:63] ==> value-parameter kind: MagicKind defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.createNonSyntheticValue[ValueParameterDescriptorImpl]

'outputValue' @ [187:69] ==> public open val outputValue: PseudoValue defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction[PropertyDescriptorImpl]

'createNonSyntheticValue' @ [190:17] ==> private final fun createNonSyntheticValue(to: KtElement, from: List<KtElement?>, kind: MagicKind): PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'to' @ [190:41] ==> value-parameter to: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.createNonSyntheticValue[ValueParameterDescriptorImpl]

'from' @ [190:45] ==> value-parameter vararg from: KtElement? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.createNonSyntheticValue[ValueParameterDescriptorImpl]

'asList' @ [190:50] ==> public fun <T> Array<out KtElement?>.asList(): List<KtElement?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement?

'kind' @ [190:60] ==> value-parameter kind: MagicKind defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.createNonSyntheticValue[ValueParameterDescriptorImpl]

'builder' @ [193:13] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'merge' @ [193:21] ==> public abstract fun merge(expression: KtExpression, inputValues: List<PseudoValue>): MergeInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'to' @ [193:27] ==> value-parameter to: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.mergeValues[ValueParameterDescriptorImpl]

'elementsToValues' @ [193:31] ==> private final fun elementsToValues(from: List<KtElement?>): List<PseudoValue> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'from' @ [193:48] ==> value-parameter from: List<KtExpression> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.mergeValues[ValueParameterDescriptorImpl]

'getBoundOrUnreachableValue' @ [197:13] ==> private final fun getBoundOrUnreachableValue(element: KtElement?): PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'from' @ [197:40] ==> value-parameter from: KtElement? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.copyValue[ValueParameterDescriptorImpl]

'let' @ [197:47] ==> @InlineOnly public inline fun <T, R> PseudoValue.let(block: (PseudoValue) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PseudoValue
    <R> -> Unit

'builder' @ [197:53] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'bindValue' @ [197:61] ==> public abstract fun bindValue(value: PseudoValue, element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'it' @ [197:71] ==> value-parameter it: PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.copyValue.<anonymous>[ValueParameterDescriptorImpl]

'to' @ [197:75] ==> value-parameter to: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.copyValue[ValueParameterDescriptorImpl]

'element' @ [201:17] ==> value-parameter element: KtElement? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getBoundOrUnreachableValue[ValueParameterDescriptorImpl]

'builder' @ [203:25] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'getBoundValue' @ [203:33] ==> public abstract fun getBoundValue(element: KtElement?): PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'element' @ [203:47] ==> value-parameter element: KtElement? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getBoundOrUnreachableValue[ValueParameterDescriptorImpl]

'if (value != null || element is KtDeclaration) value else builder.newValue(element)' @ [204:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PseudoValue?, elseBranch: PseudoValue?): PseudoValue?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PseudoValue?

'value' @ [204:24] ==> val value: PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getBoundOrUnreachableValue[LocalVariableDescriptor]

'element' @ [204:41] ==> value-parameter element: KtElement? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getBoundOrUnreachableValue[ValueParameterDescriptorImpl]

'value' @ [204:67] ==> val value: PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getBoundOrUnreachableValue[LocalVariableDescriptor]

'builder' @ [204:78] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'newValue' @ [204:86] ==> public abstract fun newValue(element: KtElement?): PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'element' @ [204:95] ==> value-parameter element: KtElement? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getBoundOrUnreachableValue[ValueParameterDescriptorImpl]

'from' @ [208:17] ==> value-parameter from: List<KtElement?> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.elementsToValues[ValueParameterDescriptorImpl]

'mapNotNull' @ [208:22] ==> public inline fun <T, R : Any> Iterable<KtElement?>.mapNotNull(transform: (KtElement?) -> PseudoValue?): List<PseudoValue> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement?
    <R : Any> -> PseudoValue

'getBoundOrUnreachableValue' @ [208:46] ==> private final fun getBoundOrUnreachableValue(element: KtElement?): PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'element' @ [208:73] ==> value-parameter element: KtElement? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.elementsToValues.<anonymous>[ValueParameterDescriptorImpl]

'builder' @ [211:13] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'write' @ [211:21] ==> public abstract fun write(assignment: KtElement, lValue: KtElement, rValue: PseudoValue, target: AccessTarget, receiverValues: Map<PseudoValue, ReceiverValue>): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'declaration' @ [211:27] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateInitializer[ValueParameterDescriptorImpl]

'declaration' @ [211:40] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateInitializer[ValueParameterDescriptorImpl]

'initValue' @ [211:53] ==> value-parameter initValue: PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateInitializer[ValueParameterDescriptorImpl]

'getDeclarationAccessTarget' @ [211:64] ==> private final fun getDeclarationAccessTarget(element: KtElement): AccessTarget defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'declaration' @ [211:91] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateInitializer[ValueParameterDescriptorImpl]

'emptyMap' @ [211:105] ==> public fun <K, V> emptyMap(): Map<PseudoValue, ReceiverValue> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> PseudoValue
    <V> -> ReceiverValue

'element' @ [215:17] ==> value-parameter element: KtElement? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getResolvedCallAccessTarget[ValueParameterDescriptorImpl]

'getResolvedCall' @ [215:25] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[SimpleFunctionDescriptorImpl]

'trace' @ [215:41] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[PropertyDescriptorImpl]

'bindingContext' @ [215:47] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'let' @ [215:64] ==> @InlineOnly public inline fun <T, R> ResolvedCall<out CallableDescriptor>.let(block: (ResolvedCall<out CallableDescriptor>) -> AccessTarget.Call): AccessTarget.Call defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolvedCall<out CallableDescriptor>
    <R> -> Call

'Call' @ [215:83] ==> public constructor Call(resolvedCall: ResolvedCall<*>) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.AccessTarget.Call[ClassConstructorDescriptorImpl]

'it' @ [215:88] ==> value-parameter it: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getResolvedCallAccessTarget.<anonymous>[ValueParameterDescriptorImpl]

'BlackBox' @ [216:37] ==> public object BlackBox : AccessTarget defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.AccessTarget[FakeCallableDescriptorForObject]

'trace' @ [219:30] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[PropertyDescriptorImpl]

'get' @ [219:36] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?), key: (PsiElement..PsiElement?)): DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> DeclarationDescriptor

'DECLARATION_TO_DESCRIPTOR' @ [219:55] ==> @SuppressWarnings public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'element' @ [219:82] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getDeclarationAccessTarget[ValueParameterDescriptorImpl]

'if (descriptor is VariableDescriptor)
                AccessTarget.Declaration(descriptor)
            else
                AccessTarget.BlackBox' @ [220:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: AccessTarget, elseBranch: AccessTarget): AccessTarget[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> AccessTarget

'descriptor' @ [220:24] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getDeclarationAccessTarget[LocalVariableDescriptor]

'Declaration' @ [221:30] ==> public constructor Declaration(descriptor: VariableDescriptor) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.AccessTarget.Declaration[ClassConstructorDescriptorImpl]

'descriptor' @ [221:42] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getDeclarationAccessTarget[LocalVariableDescriptor]

'BlackBox' @ [223:30] ==> public object BlackBox : AccessTarget defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.AccessTarget[FakeCallableDescriptorForObject]

'mark' @ [227:13] ==> private final fun mark(element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [227:18] ==> value-parameter expression: KtParenthesizedExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitParenthesizedExpression[ValueParameterDescriptorImpl]

'expression' @ [228:35] ==> value-parameter expression: KtParenthesizedExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitParenthesizedExpression[ValueParameterDescriptorImpl]

'expression' @ [228:46] ==> public final val KtParenthesizedExpression.expression: KtExpression?[MyPropertyDescriptor]

'innerExpression' @ [229:17] ==> val innerExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitParenthesizedExpression[LocalVariableDescriptor]

'generateInstructions' @ [230:17] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'innerExpression' @ [230:38] ==> val innerExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitParenthesizedExpression[LocalVariableDescriptor]

'copyValue' @ [231:17] ==> private final fun copyValue(from: KtElement?, to: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'innerExpression' @ [231:27] ==> val innerExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitParenthesizedExpression[LocalVariableDescriptor]

'expression' @ [231:44] ==> value-parameter expression: KtParenthesizedExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitParenthesizedExpression[ValueParameterDescriptorImpl]

'expression' @ [236:34] ==> value-parameter expression: KtAnnotatedExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitAnnotatedExpression[ValueParameterDescriptorImpl]

'baseExpression' @ [236:45] ==> public final val KtAnnotatedExpression.baseExpression: KtExpression?[MyPropertyDescriptor]

'baseExpression' @ [237:17] ==> val baseExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitAnnotatedExpression[LocalVariableDescriptor]

'generateInstructions' @ [238:17] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'baseExpression' @ [238:38] ==> val baseExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitAnnotatedExpression[LocalVariableDescriptor]

'copyValue' @ [239:17] ==> private final fun copyValue(from: KtElement?, to: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'baseExpression' @ [239:27] ==> val baseExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitAnnotatedExpression[LocalVariableDescriptor]

'expression' @ [239:43] ==> value-parameter expression: KtAnnotatedExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitAnnotatedExpression[ValueParameterDescriptorImpl]

'expression' @ [244:32] ==> value-parameter expression: KtThisExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitThisExpression[ValueParameterDescriptorImpl]

'getResolvedCall' @ [244:43] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[SimpleFunctionDescriptorImpl]

'trace' @ [244:59] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[PropertyDescriptorImpl]

'bindingContext' @ [244:65] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'resolvedCall' @ [245:17] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitThisExpression[LocalVariableDescriptor]

'createNonSyntheticValue' @ [246:17] ==> private final fun createNonSyntheticValue(to: KtElement, kind: MagicKind, vararg from: KtElement?): PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [246:41] ==> value-parameter expression: KtThisExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitThisExpression[ValueParameterDescriptorImpl]

'UNRESOLVED_CALL' @ [246:63] ==> enum entry UNRESOLVED_CALL defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'resolvedCall' @ [250:39] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitThisExpression[LocalVariableDescriptor]

'resultingDescriptor' @ [250:52] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'resultingDescriptor' @ [251:17] ==> val resultingDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitThisExpression[LocalVariableDescriptor]

'builder' @ [252:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'readVariable' @ [252:25] ==> public abstract fun readVariable(expression: KtExpression, resolvedCall: ResolvedCall<*>, receiverValues: Map<PseudoValue, ReceiverValue>): ReadValueInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [252:38] ==> value-parameter expression: KtThisExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitThisExpression[ValueParameterDescriptorImpl]

'resolvedCall' @ [252:50] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitThisExpression[LocalVariableDescriptor]

'getReceiverValues' @ [252:64] ==> private final fun getReceiverValues(resolvedCall: ResolvedCall<*>): Map<PseudoValue, ReceiverValue> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [252:82] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitThisExpression[LocalVariableDescriptor]

'copyValue' @ [255:13] ==> private final fun copyValue(from: KtElement?, to: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [255:23] ==> value-parameter expression: KtThisExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitThisExpression[ValueParameterDescriptorImpl]

'expression' @ [255:35] ==> value-parameter expression: KtThisExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitThisExpression[ValueParameterDescriptorImpl]

'instanceReference' @ [255:46] ==> public final val KtThisExpression.instanceReference: KtReferenceExpression[MyPropertyDescriptor]

'ConstantExpressionEvaluator' @ [259:28] ==> public companion object defined in org.jetbrains.kotlin.resolve.constants.evaluate.ConstantExpressionEvaluator[FakeCallableDescriptorForObject]

'getConstant' @ [259:56] ==> @JvmStatic public final fun getConstant(expression: KtExpression, bindingContext: BindingContext): CompileTimeConstant<*>? defined in org.jetbrains.kotlin.resolve.constants.evaluate.ConstantExpressionEvaluator.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [259:68] ==> value-parameter expression: KtConstantExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitConstantExpression[ValueParameterDescriptorImpl]

'trace' @ [259:80] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[PropertyDescriptorImpl]

'bindingContext' @ [259:86] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'builder' @ [260:13] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'loadConstant' @ [260:21] ==> public abstract fun loadConstant(expression: KtExpression, constant: CompileTimeConstant<*>?): InstructionWithValue defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [260:34] ==> value-parameter expression: KtConstantExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitConstantExpression[ValueParameterDescriptorImpl]

'constant' @ [260:46] ==> val constant: CompileTimeConstant<*>? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitConstantExpression[LocalVariableDescriptor]

'expression' @ [264:32] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'getResolvedCall' @ [264:43] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[SimpleFunctionDescriptorImpl]

'trace' @ [264:59] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[PropertyDescriptorImpl]

'bindingContext' @ [264:65] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'if (resolvedCall is VariableAsFunctionResolvedCall) {
                generateCall(resolvedCall.variableCall)
            }
            else {
                if (resolvedCall == null) {
                    val qualifier = trace.bindingContext[BindingContext.QUALIFIER, expression]
                    if (qualifier != null && generateQualifier(expression, qualifier)) return
                }
                if (!generateCall(expression) && expression.parent !is KtCallExpression) {
                    createNonSyntheticValue(expression, MagicKind.UNRESOLVED_CALL, generateAndGetReceiverIfAny(expression))
                }
            }' @ [265:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'resolvedCall' @ [265:17] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitSimpleNameExpression[LocalVariableDescriptor]

'generateCall' @ [266:17] ==> private final fun generateCall(resolvedCall: ResolvedCall<*>): InstructionWithValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [266:30] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitSimpleNameExpression[LocalVariableDescriptor]

'variableCall' @ [266:43] ==> public abstract val variableCall: ResolvedCall<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.model.VariableAsFunctionResolvedCall[PropertyDescriptorImpl]

'resolvedCall' @ [269:21] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitSimpleNameExpression[LocalVariableDescriptor]

'trace' @ [270:37] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[PropertyDescriptorImpl]

'bindingContext' @ [270:43] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'QUALIFIER' @ [270:73] ==> public final val QUALIFIER: (WritableSlice<(KtExpression..KtExpression?), (Qualifier..Qualifier?)>..WritableSlice<(KtExpression..KtExpression?), (Qualifier..Qualifier?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [270:84] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'qualifier' @ [271:25] ==> val qualifier: Qualifier? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitSimpleNameExpression[LocalVariableDescriptor]

'generateQualifier' @ [271:46] ==> private final fun generateQualifier(expression: KtExpression, qualifier: Qualifier): Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [271:64] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'qualifier' @ [271:76] ==> val qualifier: Qualifier? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitSimpleNameExpression[LocalVariableDescriptor]

'!' @ [273:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'generateCall' @ [273:22] ==> private final fun generateCall(callElement: KtElement): Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [273:35] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'expression' @ [273:50] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'parent' @ [273:61] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'createNonSyntheticValue' @ [274:21] ==> private final fun createNonSyntheticValue(to: KtElement, kind: MagicKind, vararg from: KtElement?): PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [274:45] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'UNRESOLVED_CALL' @ [274:67] ==> enum entry UNRESOLVED_CALL defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'generateAndGetReceiverIfAny' @ [274:84] ==> private final fun generateAndGetReceiverIfAny(expression: KtExpression): KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [274:112] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'mark' @ [280:13] ==> private final fun mark(element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [280:18] ==> value-parameter expression: KtLabeledExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitLabeledExpression[ValueParameterDescriptorImpl]

'expression' @ [281:34] ==> value-parameter expression: KtLabeledExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitLabeledExpression[ValueParameterDescriptorImpl]

'baseExpression' @ [281:45] ==> public final val baseExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtLabeledExpression[PropertyDescriptorImpl]

'baseExpression' @ [282:17] ==> val baseExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitLabeledExpression[LocalVariableDescriptor]

'generateInstructions' @ [283:17] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'baseExpression' @ [283:38] ==> val baseExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitLabeledExpression[LocalVariableDescriptor]

'copyValue' @ [284:17] ==> private final fun copyValue(from: KtElement?, to: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'baseExpression' @ [284:27] ==> val baseExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitLabeledExpression[LocalVariableDescriptor]

'expression' @ [284:43] ==> value-parameter expression: KtLabeledExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitLabeledExpression[ValueParameterDescriptorImpl]

'expression' @ [289:38] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryExpression[ValueParameterDescriptorImpl]

'operationReference' @ [289:49] ==> public final val KtBinaryExpression.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'operationReference' @ [290:33] ==> val operationReference: KtOperationReferenceExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryExpression[LocalVariableDescriptor]

'getReferencedNameElementType' @ [290:52] ==> public open fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtOperationReferenceExpression[SimpleFunctionDescriptorImpl]

'expression' @ [292:24] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryExpression[ValueParameterDescriptorImpl]

'left' @ [292:35] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'expression' @ [293:25] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryExpression[ValueParameterDescriptorImpl]

'right' @ [293:36] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'if (operationType === ANDAND || operationType === OROR) {
                generateBooleanOperation(expression)
            }
            else if (operationType === EQ) {
                visitAssignment(left, getDeferredValue(right), expression)
            }
            else if (OperatorConventions.ASSIGNMENT_OPERATIONS.containsKey(operationType)) {
                val resolvedCall = expression.getResolvedCall(trace.bindingContext)
                if (resolvedCall != null) {
                    val rhsValue = generateCall(resolvedCall).outputValue
                    val assignMethodName = OperatorConventions.getNameForOperationSymbol(expression.operationToken as KtToken)
                    if (resolvedCall.resultingDescriptor.name != assignMethodName) {
                        /* At this point assignment of the form a += b actually means a = a + b
                         * So we first generate call of "+" operation and then use its output pseudo-value
                         * as a right-hand side when generating assignment call
                         */
                        visitAssignment(left, getValueAsFunction(rhsValue), expression)
                    }
                }
                else {
                    generateBothArgumentsAndMark(expression)
                }
            }
            else if (operationType === ELVIS) {
                generateInstructions(left)
                mark(expression)
                val afterElvis = builder.createUnboundLabel("after elvis operator")
                builder.jumpOnTrue(afterElvis, expression, builder.getBoundValue(left))
                generateInstructions(right)
                builder.bindLabel(afterElvis)
                mergeValues(listOf(left, right).filterNotNull(), expression)
            }
            else {
                if (!generateCall(expression)) {
                    generateBothArgumentsAndMark(expression)
                }
            }' @ [294:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'operationType' @ [294:17] ==> val operationType: IElementType defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryExpression[LocalVariableDescriptor]

'ANDAND' @ [294:35] ==> public final val ANDAND: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'operationType' @ [294:45] ==> val operationType: IElementType defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryExpression[LocalVariableDescriptor]

'OROR' @ [294:63] ==> public final val OROR: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'generateBooleanOperation' @ [295:17] ==> private final fun generateBooleanOperation(expression: KtBinaryExpression): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [295:42] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryExpression[ValueParameterDescriptorImpl]

'if (operationType === EQ) {
                visitAssignment(left, getDeferredValue(right), expression)
            }
            else if (OperatorConventions.ASSIGNMENT_OPERATIONS.containsKey(operationType)) {
                val resolvedCall = expression.getResolvedCall(trace.bindingContext)
                if (resolvedCall != null) {
                    val rhsValue = generateCall(resolvedCall).outputValue
                    val assignMethodName = OperatorConventions.getNameForOperationSymbol(expression.operationToken as KtToken)
                    if (resolvedCall.resultingDescriptor.name != assignMethodName) {
                        /* At this point assignment of the form a += b actually means a = a + b
                         * So we first generate call of "+" operation and then use its output pseudo-value
                         * as a right-hand side when generating assignment call
                         */
                        visitAssignment(left, getValueAsFunction(rhsValue), expression)
                    }
                }
                else {
                    generateBothArgumentsAndMark(expression)
                }
            }
            else if (operationType === ELVIS) {
                generateInstructions(left)
                mark(expression)
                val afterElvis = builder.createUnboundLabel("after elvis operator")
                builder.jumpOnTrue(afterElvis, expression, builder.getBoundValue(left))
                generateInstructions(right)
                builder.bindLabel(afterElvis)
                mergeValues(listOf(left, right).filterNotNull(), expression)
            }
            else {
                if (!generateCall(expression)) {
                    generateBothArgumentsAndMark(expression)
                }
            }' @ [297:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'operationType' @ [297:22] ==> val operationType: IElementType defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryExpression[LocalVariableDescriptor]

'EQ' @ [297:40] ==> public final val EQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'visitAssignment' @ [298:17] ==> private final fun visitAssignment(lhs: KtExpression?, rhsDeferredValue: () -> PseudoValue?, parentExpression: KtExpression): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'left' @ [298:33] ==> val left: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryExpression[LocalVariableDescriptor]

'getDeferredValue' @ [298:39] ==> private final fun getDeferredValue(expression: KtExpression?): () -> PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'right' @ [298:56] ==> val right: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryExpression[LocalVariableDescriptor]

'expression' @ [298:64] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryExpression[ValueParameterDescriptorImpl]

'if (OperatorConventions.ASSIGNMENT_OPERATIONS.containsKey(operationType)) {
                val resolvedCall = expression.getResolvedCall(trace.bindingContext)
                if (resolvedCall != null) {
                    val rhsValue = generateCall(resolvedCall).outputValue
                    val assignMethodName = OperatorConventions.getNameForOperationSymbol(expression.operationToken as KtToken)
                    if (resolvedCall.resultingDescriptor.name != assignMethodName) {
                        /* At this point assignment of the form a += b actually means a = a + b
                         * So we first generate call of "+" operation and then use its output pseudo-value
                         * as a right-hand side when generating assignment call
                         */
                        visitAssignment(left, getValueAsFunction(rhsValue), expression)
                    }
                }
                else {
                    generateBothArgumentsAndMark(expression)
                }
            }
            else if (operationType === ELVIS) {
                generateInstructions(left)
                mark(expression)
                val afterElvis = builder.createUnboundLabel("after elvis operator")
                builder.jumpOnTrue(afterElvis, expression, builder.getBoundValue(left))
                generateInstructions(right)
                builder.bindLabel(afterElvis)
                mergeValues(listOf(left, right).filterNotNull(), expression)
            }
            else {
                if (!generateCall(expression)) {
                    generateBothArgumentsAndMark(expression)
                }
            }' @ [300:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'ASSIGNMENT_OPERATIONS' @ [300:42] ==> public final val ASSIGNMENT_OPERATIONS: (ImmutableBiMap<(KtSingleValueToken..KtSingleValueToken?), (Name..Name?)>..ImmutableBiMap<(KtSingleValueToken..KtSingleValueToken?), (Name..Name?)>?) defined in org.jetbrains.kotlin.types.expressions.OperatorConventions[JavaPropertyDescriptor]

'containsKey' @ [300:64] ==> @InlineOnly public inline fun <@OnlyInputTypes K> Map<out (IElementType..IElementType?), *>.containsKey(key: (IElementType..IElementType?)): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes K> -> (com.intellij.psi.tree.IElementType..com.intellij.psi.tree.IElementType?)

'operationType' @ [300:76] ==> val operationType: IElementType defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryExpression[LocalVariableDescriptor]

'expression' @ [301:36] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryExpression[ValueParameterDescriptorImpl]

'getResolvedCall' @ [301:47] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[SimpleFunctionDescriptorImpl]

'trace' @ [301:63] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[PropertyDescriptorImpl]

'bindingContext' @ [301:69] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'if (resolvedCall != null) {
                    val rhsValue = generateCall(resolvedCall).outputValue
                    val assignMethodName = OperatorConventions.getNameForOperationSymbol(expression.operationToken as KtToken)
                    if (resolvedCall.resultingDescriptor.name != assignMethodName) {
                        /* At this point assignment of the form a += b actually means a = a + b
                         * So we first generate call of "+" operation and then use its output pseudo-value
                         * as a right-hand side when generating assignment call
                         */
                        visitAssignment(left, getValueAsFunction(rhsValue), expression)
                    }
                }
                else {
                    generateBothArgumentsAndMark(expression)
                }' @ [302:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'resolvedCall' @ [302:21] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryExpression[LocalVariableDescriptor]

'generateCall' @ [303:36] ==> private final fun generateCall(resolvedCall: ResolvedCall<*>): InstructionWithValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [303:49] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryExpression[LocalVariableDescriptor]

'outputValue' @ [303:63] ==> public abstract val outputValue: PseudoValue? defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.InstructionWithValue[PropertyDescriptorImpl]

'getNameForOperationSymbol' @ [304:64] ==> @Nullable public open fun getNameForOperationSymbol(@NotNull token: KtToken): Name? defined in org.jetbrains.kotlin.types.expressions.OperatorConventions[JavaMethodDescriptor]

'expression' @ [304:90] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryExpression[ValueParameterDescriptorImpl]

'operationToken' @ [304:101] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'resolvedCall' @ [305:25] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryExpression[LocalVariableDescriptor]

'resultingDescriptor' @ [305:38] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'name' @ [305:58] ==> public final val CallableDescriptor.name: Name[MyPropertyDescriptor]

'assignMethodName' @ [305:66] ==> val assignMethodName: Name? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryExpression[LocalVariableDescriptor]

'visitAssignment' @ [310:25] ==> private final fun visitAssignment(lhs: KtExpression?, rhsDeferredValue: () -> PseudoValue?, parentExpression: KtExpression): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'left' @ [310:41] ==> val left: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryExpression[LocalVariableDescriptor]

'getValueAsFunction' @ [310:47] ==> private final fun getValueAsFunction(value: PseudoValue?): () -> PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'rhsValue' @ [310:66] ==> val rhsValue: PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryExpression[LocalVariableDescriptor]

'expression' @ [310:77] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryExpression[ValueParameterDescriptorImpl]

'generateBothArgumentsAndMark' @ [314:21] ==> private final fun generateBothArgumentsAndMark(expression: KtBinaryExpression): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [314:50] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryExpression[ValueParameterDescriptorImpl]

'if (operationType === ELVIS) {
                generateInstructions(left)
                mark(expression)
                val afterElvis = builder.createUnboundLabel("after elvis operator")
                builder.jumpOnTrue(afterElvis, expression, builder.getBoundValue(left))
                generateInstructions(right)
                builder.bindLabel(afterElvis)
                mergeValues(listOf(left, right).filterNotNull(), expression)
            }
            else {
                if (!generateCall(expression)) {
                    generateBothArgumentsAndMark(expression)
                }
            }' @ [317:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'operationType' @ [317:22] ==> val operationType: IElementType defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryExpression[LocalVariableDescriptor]

'ELVIS' @ [317:40] ==> public final val ELVIS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'generateInstructions' @ [318:17] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'left' @ [318:38] ==> val left: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryExpression[LocalVariableDescriptor]

'mark' @ [319:17] ==> private final fun mark(element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [319:22] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryExpression[ValueParameterDescriptorImpl]

'builder' @ [320:34] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'createUnboundLabel' @ [320:42] ==> public abstract fun createUnboundLabel(name: String): Label defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'builder' @ [321:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'jumpOnTrue' @ [321:25] ==> public abstract fun jumpOnTrue(label: Label, element: KtElement, conditionValue: PseudoValue?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'afterElvis' @ [321:36] ==> val afterElvis: Label defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryExpression[LocalVariableDescriptor]

'expression' @ [321:48] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryExpression[ValueParameterDescriptorImpl]

'builder' @ [321:60] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'getBoundValue' @ [321:68] ==> public abstract fun getBoundValue(element: KtElement?): PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'left' @ [321:82] ==> val left: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryExpression[LocalVariableDescriptor]

'generateInstructions' @ [322:17] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'right' @ [322:38] ==> val right: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryExpression[LocalVariableDescriptor]

'builder' @ [323:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'bindLabel' @ [323:25] ==> public abstract fun bindLabel(label: Label): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'afterElvis' @ [323:35] ==> val afterElvis: Label defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryExpression[LocalVariableDescriptor]

'mergeValues' @ [324:17] ==> private final fun mergeValues(from: List<KtExpression>, to: KtExpression): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'listOf' @ [324:29] ==> public fun <T> listOf(vararg elements: KtExpression?): List<KtExpression?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression?

'left' @ [324:36] ==> val left: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryExpression[LocalVariableDescriptor]

'right' @ [324:42] ==> val right: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryExpression[LocalVariableDescriptor]

'filterNotNull' @ [324:49] ==> public fun <T : Any> Iterable<KtExpression?>.filterNotNull(): List<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> KtExpression

'expression' @ [324:66] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryExpression[ValueParameterDescriptorImpl]

'!' @ [327:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'generateCall' @ [327:22] ==> private final fun generateCall(callElement: KtElement): Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [327:35] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryExpression[ValueParameterDescriptorImpl]

'generateBothArgumentsAndMark' @ [328:21] ==> private final fun generateBothArgumentsAndMark(expression: KtBinaryExpression): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [328:50] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryExpression[ValueParameterDescriptorImpl]

'expression' @ [334:33] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateBooleanOperation[ValueParameterDescriptorImpl]

'operationReference' @ [334:44] ==> public final val KtBinaryExpression.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'getReferencedNameElementType' @ [334:63] ==> public open fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtOperationReferenceExpression[SimpleFunctionDescriptorImpl]

'expression' @ [335:24] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateBooleanOperation[ValueParameterDescriptorImpl]

'left' @ [335:35] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'expression' @ [336:25] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateBooleanOperation[ValueParameterDescriptorImpl]

'right' @ [336:36] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'builder' @ [338:31] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'createUnboundLabel' @ [338:39] ==> public abstract fun createUnboundLabel(name: String): Label defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'generateInstructions' @ [339:13] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'left' @ [339:34] ==> val left: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateBooleanOperation[LocalVariableDescriptor]

'if (operationType === ANDAND) {
                builder.jumpOnFalse(resultLabel, expression, builder.getBoundValue(left))
            }
            else {
                builder.jumpOnTrue(resultLabel, expression, builder.getBoundValue(left))
            }' @ [340:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'operationType' @ [340:17] ==> val operationType: IElementType defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateBooleanOperation[LocalVariableDescriptor]

'ANDAND' @ [340:35] ==> public final val ANDAND: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'builder' @ [341:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'jumpOnFalse' @ [341:25] ==> public abstract fun jumpOnFalse(label: Label, element: KtElement, conditionValue: PseudoValue?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'resultLabel' @ [341:37] ==> val resultLabel: Label defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateBooleanOperation[LocalVariableDescriptor]

'expression' @ [341:50] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateBooleanOperation[ValueParameterDescriptorImpl]

'builder' @ [341:62] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'getBoundValue' @ [341:70] ==> public abstract fun getBoundValue(element: KtElement?): PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'left' @ [341:84] ==> val left: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateBooleanOperation[LocalVariableDescriptor]

'builder' @ [344:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'jumpOnTrue' @ [344:25] ==> public abstract fun jumpOnTrue(label: Label, element: KtElement, conditionValue: PseudoValue?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'resultLabel' @ [344:36] ==> val resultLabel: Label defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateBooleanOperation[LocalVariableDescriptor]

'expression' @ [344:49] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateBooleanOperation[ValueParameterDescriptorImpl]

'builder' @ [344:61] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'getBoundValue' @ [344:69] ==> public abstract fun getBoundValue(element: KtElement?): PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'left' @ [344:83] ==> val left: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateBooleanOperation[LocalVariableDescriptor]

'generateInstructions' @ [346:13] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'right' @ [346:34] ==> val right: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateBooleanOperation[LocalVariableDescriptor]

'builder' @ [347:13] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'bindLabel' @ [347:21] ==> public abstract fun bindLabel(label: Label): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'resultLabel' @ [347:31] ==> val resultLabel: Label defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateBooleanOperation[LocalVariableDescriptor]

'if (operationType === ANDAND) AND else OR' @ [348:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ControlFlowBuilder.PredefinedOperation, elseBranch: ControlFlowBuilder.PredefinedOperation): ControlFlowBuilder.PredefinedOperation[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PredefinedOperation

'operationType' @ [348:33] ==> val operationType: IElementType defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateBooleanOperation[LocalVariableDescriptor]

'ANDAND' @ [348:51] ==> public final val ANDAND: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'AND' @ [348:59] ==> enum entry AND defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder.PredefinedOperation[FakeCallableDescriptorForObject]

'OR' @ [348:68] ==> enum entry OR defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder.PredefinedOperation[FakeCallableDescriptorForObject]

'builder' @ [349:13] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'predefinedOperation' @ [349:21] ==> public abstract fun predefinedOperation(expression: KtExpression, operation: ControlFlowBuilder.PredefinedOperation, inputValues: List<PseudoValue>): OperationInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [349:41] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateBooleanOperation[ValueParameterDescriptorImpl]

'operation' @ [349:53] ==> val operation: ControlFlowBuilder.PredefinedOperation defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateBooleanOperation[LocalVariableDescriptor]

'elementsToValues' @ [349:64] ==> private final fun elementsToValues(from: List<KtElement?>): List<PseudoValue> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'listOf' @ [349:81] ==> public fun <T> listOf(vararg elements: KtExpression?): List<KtExpression?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression?

'left' @ [349:88] ==> val left: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateBooleanOperation[LocalVariableDescriptor]

'right' @ [349:94] ==> val right: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateBooleanOperation[LocalVariableDescriptor]

'filterNotNull' @ [349:101] ==> public fun <T : Any> Iterable<KtExpression?>.filterNotNull(): List<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> KtExpression

'value' @ [352:65] ==> value-parameter value: PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getValueAsFunction[ValueParameterDescriptorImpl]

'generateInstructions' @ [355:13] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [355:34] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getDeferredValue[ValueParameterDescriptorImpl]

'getBoundOrUnreachableValue' @ [356:13] ==> private final fun getBoundOrUnreachableValue(element: KtElement?): PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [356:40] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getDeferredValue[ValueParameterDescriptorImpl]

'deparenthesize' @ [360:34] ==> @Nullable public open fun deparenthesize(@Nullable expression: KtExpression?): KtExpression? defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'expression' @ [360:49] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateBothArgumentsAndMark[ValueParameterDescriptorImpl]

'left' @ [360:60] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'left' @ [361:17] ==> val left: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateBothArgumentsAndMark[LocalVariableDescriptor]

'generateInstructions' @ [362:17] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'left' @ [362:38] ==> val left: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateBothArgumentsAndMark[LocalVariableDescriptor]

'expression' @ [364:25] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateBothArgumentsAndMark[ValueParameterDescriptorImpl]

'right' @ [364:36] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'right' @ [365:17] ==> val right: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateBothArgumentsAndMark[LocalVariableDescriptor]

'generateInstructions' @ [366:17] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'right' @ [366:38] ==> val right: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateBothArgumentsAndMark[LocalVariableDescriptor]

'mark' @ [368:13] ==> private final fun mark(element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [368:18] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateBothArgumentsAndMark[ValueParameterDescriptorImpl]

'createNonSyntheticValue' @ [369:13] ==> private final fun createNonSyntheticValue(to: KtElement, kind: MagicKind, vararg from: KtElement?): PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [369:37] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateBothArgumentsAndMark[ValueParameterDescriptorImpl]

'UNRESOLVED_CALL' @ [369:59] ==> enum entry UNRESOLVED_CALL defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'left' @ [369:76] ==> val left: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateBothArgumentsAndMark[LocalVariableDescriptor]

'right' @ [369:82] ==> val right: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateBothArgumentsAndMark[LocalVariableDescriptor]

'deparenthesize' @ [377:34] ==> @Nullable public open fun deparenthesize(@Nullable expression: KtExpression?): KtExpression? defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'lhs' @ [377:49] ==> value-parameter lhs: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitAssignment[ValueParameterDescriptorImpl]

'left' @ [378:17] ==> val left: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitAssignment[LocalVariableDescriptor]

'invoke' @ [379:33] ==> public abstract operator fun invoke(): PseudoValue? defined in kotlin.Function0[FunctionInvokeDescriptor]

'let' @ [379:53] ==> @InlineOnly public inline fun <T, R> PseudoValue.let(block: (PseudoValue) -> List<PseudoValue>): List<PseudoValue> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PseudoValue
    <R> -> List<PseudoValue>

'listOf' @ [379:59] ==> public fun <T> listOf(element: PseudoValue): List<PseudoValue> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PseudoValue

'it' @ [379:66] ==> value-parameter it: PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitAssignment.<anonymous>[ValueParameterDescriptorImpl]

'emptyList' @ [379:75] ==> public fun <T> emptyList(): List<PseudoValue> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PseudoValue

'builder' @ [380:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'magic' @ [380:25] ==> public abstract fun magic(instructionElement: KtElement, valueElement: KtElement?, inputValues: List<PseudoValue>, kind: MagicKind): MagicInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'parentExpression' @ [380:31] ==> value-parameter parentExpression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitAssignment[ValueParameterDescriptorImpl]

'parentExpression' @ [380:49] ==> value-parameter parentExpression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitAssignment[ValueParameterDescriptorImpl]

'arguments' @ [380:67] ==> val arguments: List<PseudoValue> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitAssignment[LocalVariableDescriptor]

'UNSUPPORTED_ELEMENT' @ [380:88] ==> enum entry UNSUPPORTED_ELEMENT defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'left' @ [384:17] ==> val left: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitAssignment[LocalVariableDescriptor]

'generateArrayAssignment' @ [385:17] ==> private final fun generateArrayAssignment(lhs: KtArrayAccessExpression, rhsDeferredValue: () -> PseudoValue?, parentExpression: KtExpression): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'left' @ [385:41] ==> val left: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitAssignment[LocalVariableDescriptor]

'rhsDeferredValue' @ [385:47] ==> value-parameter rhsDeferredValue: () -> PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitAssignment[ValueParameterDescriptorImpl]

'parentExpression' @ [385:65] ==> value-parameter parentExpression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitAssignment[ValueParameterDescriptorImpl]

'emptyMap' @ [389:77] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> emptyMap(): (SmartFMap<(PseudoValue..PseudoValue?), (ReceiverValue..ReceiverValue?)>..SmartFMap<(PseudoValue..PseudoValue?), (ReceiverValue..ReceiverValue?)>?) defined in com.intellij.util.SmartFMap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PseudoValue
    <V : (Any..Any?)> -> ReceiverValue

'BlackBox' @ [390:59] ==> public object BlackBox : AccessTarget defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.AccessTarget[FakeCallableDescriptorForObject]

'if (left is KtSimpleNameExpression || left is KtQualifiedExpression) {
                accessTarget = getResolvedCallAccessTarget(left.getQualifiedElementSelector())
                if (accessTarget is AccessTarget.Call) {
                    receiverValues = getReceiverValues(accessTarget.resolvedCall)
                }
            }
            else if (left is KtProperty) {
                accessTarget = getDeclarationAccessTarget(left)
            }' @ [391:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'left' @ [391:17] ==> val left: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitAssignment[LocalVariableDescriptor]

'left' @ [391:51] ==> val left: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitAssignment[LocalVariableDescriptor]

'accessTarget' @ [392:17] ==> var accessTarget: AccessTarget defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitAssignment[LocalVariableDescriptor]

'getResolvedCallAccessTarget' @ [392:32] ==> private final fun getResolvedCallAccessTarget(element: KtElement?): AccessTarget defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'left' @ [392:60] ==> val left: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitAssignment[LocalVariableDescriptor]

'getQualifiedElementSelector' @ [392:65] ==> public fun KtElement.getQualifiedElementSelector(): KtElement? defined in org.jetbrains.kotlin.psi.psiUtil in file ktPsiUtil.kt[SimpleFunctionDescriptorImpl]

'accessTarget' @ [393:21] ==> var accessTarget: AccessTarget defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitAssignment[LocalVariableDescriptor]

'receiverValues' @ [394:21] ==> var receiverValues: Map<PseudoValue, ReceiverValue> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitAssignment[LocalVariableDescriptor]

'getReceiverValues' @ [394:38] ==> private final fun getReceiverValues(resolvedCall: ResolvedCall<*>): Map<PseudoValue, ReceiverValue> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'accessTarget' @ [394:56] ==> var accessTarget: AccessTarget defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitAssignment[LocalVariableDescriptor]

'resolvedCall' @ [394:69] ==> public final val resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.AccessTarget.Call[PropertyDescriptorImpl]

'left' @ [397:22] ==> val left: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitAssignment[LocalVariableDescriptor]

'accessTarget' @ [398:17] ==> var accessTarget: AccessTarget defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitAssignment[LocalVariableDescriptor]

'getDeclarationAccessTarget' @ [398:32] ==> private final fun getDeclarationAccessTarget(element: KtElement): AccessTarget defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'left' @ [398:59] ==> val left: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitAssignment[LocalVariableDescriptor]

'accessTarget' @ [401:17] ==> var accessTarget: AccessTarget defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitAssignment[LocalVariableDescriptor]

'BlackBox' @ [401:47] ==> public object BlackBox : AccessTarget defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.AccessTarget[FakeCallableDescriptorForObject]

'left' @ [401:59] ==> val left: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitAssignment[LocalVariableDescriptor]

'generateInstructions' @ [402:17] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'left' @ [402:38] ==> val left: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitAssignment[LocalVariableDescriptor]

'createSyntheticValue' @ [403:17] ==> private final fun createSyntheticValue(instructionElement: KtElement, kind: MagicKind, vararg from: KtElement): PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'left' @ [403:38] ==> val left: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitAssignment[LocalVariableDescriptor]

'VALUE_CONSUMER' @ [403:54] ==> enum entry VALUE_CONSUMER defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'left' @ [403:70] ==> val left: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitAssignment[LocalVariableDescriptor]

'rhsDeferredValue' @ [406:30] ==> value-parameter rhsDeferredValue: () -> PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitAssignment[ValueParameterDescriptorImpl]

'invoke' @ [406:47] ==> public abstract operator fun invoke(): PseudoValue? defined in kotlin.Function0[FunctionInvokeDescriptor]

'rightValue' @ [407:26] ==> val rightValue: PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitAssignment[LocalVariableDescriptor]

'createSyntheticValue' @ [407:40] ==> private final fun createSyntheticValue(instructionElement: KtElement, kind: MagicKind, vararg from: KtElement): PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'parentExpression' @ [407:61] ==> value-parameter parentExpression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitAssignment[ValueParameterDescriptorImpl]

'UNRECOGNIZED_WRITE_RHS' @ [407:89] ==> enum entry UNRECOGNIZED_WRITE_RHS defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'builder' @ [408:13] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'write' @ [408:21] ==> public abstract fun write(assignment: KtElement, lValue: KtElement, rValue: PseudoValue, target: AccessTarget, receiverValues: Map<PseudoValue, ReceiverValue>): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'parentExpression' @ [408:27] ==> value-parameter parentExpression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitAssignment[ValueParameterDescriptorImpl]

'left' @ [408:45] ==> val left: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitAssignment[LocalVariableDescriptor]

'rValue' @ [408:51] ==> val rValue: PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitAssignment[LocalVariableDescriptor]

'accessTarget' @ [408:59] ==> var accessTarget: AccessTarget defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitAssignment[LocalVariableDescriptor]

'receiverValues' @ [408:73] ==> var receiverValues: Map<PseudoValue, ReceiverValue> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitAssignment[LocalVariableDescriptor]

'trace' @ [416:35] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[PropertyDescriptorImpl]

'get' @ [416:41] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..ReadOnlySlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?), key: (KtExpression..KtExpression?)): ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtExpression
    <V : (Any..Any?)> -> ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>

'INDEXED_LVALUE_SET' @ [416:60] ==> public final val INDEXED_LVALUE_SET: (WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'lhs' @ [416:80] ==> value-parameter lhs: KtArrayAccessExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateArrayAssignment[ValueParameterDescriptorImpl]

'setResolvedCall' @ [418:17] ==> val setResolvedCall: ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateArrayAssignment[LocalVariableDescriptor]

'generateArrayAccess' @ [419:17] ==> private final fun generateArrayAccess(arrayAccessExpression: KtArrayAccessExpression, resolvedCall: ResolvedCall<*>?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'lhs' @ [419:37] ==> value-parameter lhs: KtArrayAccessExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateArrayAssignment[ValueParameterDescriptorImpl]

'listOf' @ [421:33] ==> public fun <T> listOf(vararg elements: PseudoValue?): List<PseudoValue?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PseudoValue?

'getBoundOrUnreachableValue' @ [421:40] ==> private final fun getBoundOrUnreachableValue(element: KtElement?): PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'lhs' @ [421:67] ==> value-parameter lhs: KtArrayAccessExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateArrayAssignment[ValueParameterDescriptorImpl]

'rhsDeferredValue' @ [421:73] ==> value-parameter rhsDeferredValue: () -> PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateArrayAssignment[ValueParameterDescriptorImpl]

'invoke' @ [421:90] ==> public abstract operator fun invoke(): PseudoValue? defined in kotlin.Function0[FunctionInvokeDescriptor]

'filterNotNull' @ [421:100] ==> public fun <T : Any> Iterable<PseudoValue?>.filterNotNull(): List<PseudoValue> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> PseudoValue

'builder' @ [422:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'magic' @ [422:25] ==> public abstract fun magic(instructionElement: KtElement, valueElement: KtElement?, inputValues: List<PseudoValue>, kind: MagicKind): MagicInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'parentExpression' @ [422:31] ==> value-parameter parentExpression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateArrayAssignment[ValueParameterDescriptorImpl]

'parentExpression' @ [422:49] ==> value-parameter parentExpression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateArrayAssignment[ValueParameterDescriptorImpl]

'arguments' @ [422:67] ==> val arguments: List<PseudoValue> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateArrayAssignment[LocalVariableDescriptor]

'UNRESOLVED_CALL' @ [422:88] ==> enum entry UNRESOLVED_CALL defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'parentExpression' @ [428:18] ==> value-parameter parentExpression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateArrayAssignment[ValueParameterDescriptorImpl]

'operationReference' @ [428:61] ==> public final val KtOperationExpression.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'getReferencedNameElementType' @ [428:80] ==> public abstract fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[SimpleFunctionDescriptorImpl]

'EQ' @ [428:115] ==> public final val EQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'mark' @ [429:17] ==> private final fun mark(element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'lhs' @ [429:22] ==> value-parameter lhs: KtArrayAccessExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateArrayAssignment[ValueParameterDescriptorImpl]

'generateInstructions' @ [432:13] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'lhs' @ [432:34] ==> value-parameter lhs: KtArrayAccessExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateArrayAssignment[ValueParameterDescriptorImpl]

'arrayExpression' @ [432:38] ==> public final val KtArrayAccessExpression.arrayExpression: KtExpression?[MyPropertyDescriptor]

'getReceiverValues' @ [434:34] ==> private final fun getReceiverValues(resolvedCall: ResolvedCall<*>): Map<PseudoValue, ReceiverValue> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'setResolvedCall' @ [434:52] ==> val setResolvedCall: ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateArrayAssignment[LocalVariableDescriptor]

'getArraySetterArguments' @ [435:34] ==> private final fun getArraySetterArguments(rhsDeferredValue: () -> PseudoValue?, setResolvedCall: ResolvedCall<FunctionDescriptor>): SmartFMap<PseudoValue, ValueParameterDescriptor> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'rhsDeferredValue' @ [435:58] ==> value-parameter rhsDeferredValue: () -> PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateArrayAssignment[ValueParameterDescriptorImpl]

'setResolvedCall' @ [435:76] ==> val setResolvedCall: ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateArrayAssignment[LocalVariableDescriptor]

'builder' @ [437:13] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'call' @ [437:21] ==> public abstract fun call(valueElement: KtElement, resolvedCall: ResolvedCall<*>, receiverValues: Map<PseudoValue, ReceiverValue>, arguments: Map<PseudoValue, ValueParameterDescriptor>): CallInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'parentExpression' @ [437:26] ==> value-parameter parentExpression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateArrayAssignment[ValueParameterDescriptorImpl]

'setResolvedCall' @ [437:44] ==> val setResolvedCall: ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateArrayAssignment[LocalVariableDescriptor]

'receiverValues' @ [437:61] ==> val receiverValues: Map<PseudoValue, ReceiverValue> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateArrayAssignment[LocalVariableDescriptor]

'argumentValues' @ [437:77] ==> val argumentValues: SmartFMap<PseudoValue, ValueParameterDescriptor> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateArrayAssignment[LocalVariableDescriptor]

'setResolvedCall' @ [450:34] ==> value-parameter setResolvedCall: ResolvedCall<FunctionDescriptor> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getArraySetterArguments[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [450:50] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<FunctionDescriptor>.resultingDescriptor: FunctionDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> FunctionDescriptor

'valueParameters' @ [450:70] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'flatMapTo' @ [450:86] ==> public inline fun <T, R, C : MutableCollection<in (ValueArgument..ValueArgument?)>> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.flatMapTo(destination: ArrayList<ValueArgument>, transform: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Iterable<(ValueArgument..ValueArgument?)>): ArrayList<ValueArgument> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <R> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)
    <C : MutableCollection<in R>> -> ArrayList<ValueArgument>

'ArrayList' @ [451:21] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ValueArgument

'setResolvedCall' @ [452:31] ==> value-parameter setResolvedCall: ResolvedCall<FunctionDescriptor> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getArraySetterArguments[ValueParameterDescriptorImpl]

'valueArguments' @ [452:47] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<FunctionDescriptor>.valueArguments: (MutableMap<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>..Map<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> FunctionDescriptor

'descriptor' @ [452:62] ==> value-parameter descriptor: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getArraySetterArguments.<anonymous>[ValueParameterDescriptorImpl]

'arguments' @ [452:75] ==> public final val ResolvedValueArgument.arguments: (MutableList<(ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'emptyList' @ [452:88] ==> public fun <T> emptyList(): List<ValueArgument> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueArgument

'valueArguments' @ [454:31] ==> val valueArguments: ArrayList<ValueArgument> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getArraySetterArguments[LocalVariableDescriptor]

'lastOrNull' @ [454:46] ==> public fun <T> List<ValueArgument>.lastOrNull(): ValueArgument? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueArgument

'emptyMap' @ [455:44] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> emptyMap(): (SmartFMap<(PseudoValue..PseudoValue?), (ValueParameterDescriptor..ValueParameterDescriptor?)>..SmartFMap<(PseudoValue..PseudoValue?), (ValueParameterDescriptor..ValueParameterDescriptor?)>?) defined in com.intellij.util.SmartFMap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PseudoValue
    <V : (Any..Any?)> -> ValueParameterDescriptor

'valueArguments' @ [456:35] ==> val valueArguments: ArrayList<ValueArgument> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getArraySetterArguments[LocalVariableDescriptor]

'setResolvedCall' @ [457:39] ==> value-parameter setResolvedCall: ResolvedCall<FunctionDescriptor> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getArraySetterArguments[ValueParameterDescriptorImpl]

'getArgumentMapping' @ [457:55] ==> @NotNull public abstract fun getArgumentMapping(@NotNull valueArgument: ValueArgument): ArgumentMapping defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCall[JavaMethodDescriptor]

'valueArgument' @ [457:74] ==> val valueArgument: ValueArgument defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getArraySetterArguments[LocalVariableDescriptor]

'argumentMapping' @ [458:43] ==> val argumentMapping: ArgumentMatch defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getArraySetterArguments[LocalVariableDescriptor]

'valueParameter' @ [458:59] ==> public abstract val valueParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.model.ArgumentMatch[PropertyDescriptorImpl]

'if (valueArgument !== rhsArgument) {
                    argumentValues = generateValueArgument(valueArgument, parameterDescriptor, argumentValues)
                }
                else {
                    val rhsValue = rhsDeferredValue.invoke()
                    if (rhsValue != null) {
                        argumentValues = argumentValues.plus(rhsValue, parameterDescriptor)
                    }
                }' @ [459:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'valueArgument' @ [459:21] ==> val valueArgument: ValueArgument defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getArraySetterArguments[LocalVariableDescriptor]

'rhsArgument' @ [459:39] ==> val rhsArgument: ValueArgument? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getArraySetterArguments[LocalVariableDescriptor]

'argumentValues' @ [460:21] ==> var argumentValues: (SmartFMap<(PseudoValue..PseudoValue?), (ValueParameterDescriptor..ValueParameterDescriptor?)>..SmartFMap<(PseudoValue..PseudoValue?), (ValueParameterDescriptor..ValueParameterDescriptor?)>?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getArraySetterArguments[LocalVariableDescriptor]

'generateValueArgument' @ [460:38] ==> private final fun generateValueArgument(valueArgument: ValueArgument, parameterDescriptor: ValueParameterDescriptor, parameterValuesArg: SmartFMap<PseudoValue, ValueParameterDescriptor>): SmartFMap<PseudoValue, ValueParameterDescriptor> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'valueArgument' @ [460:60] ==> val valueArgument: ValueArgument defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getArraySetterArguments[LocalVariableDescriptor]

'parameterDescriptor' @ [460:75] ==> val parameterDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getArraySetterArguments[LocalVariableDescriptor]

'argumentValues' @ [460:96] ==> var argumentValues: (SmartFMap<(PseudoValue..PseudoValue?), (ValueParameterDescriptor..ValueParameterDescriptor?)>..SmartFMap<(PseudoValue..PseudoValue?), (ValueParameterDescriptor..ValueParameterDescriptor?)>?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getArraySetterArguments[LocalVariableDescriptor]

'rhsDeferredValue' @ [463:36] ==> value-parameter rhsDeferredValue: () -> PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getArraySetterArguments[ValueParameterDescriptorImpl]

'invoke' @ [463:53] ==> public abstract operator fun invoke(): PseudoValue? defined in kotlin.Function0[FunctionInvokeDescriptor]

'rhsValue' @ [464:25] ==> val rhsValue: PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getArraySetterArguments[LocalVariableDescriptor]

'argumentValues' @ [465:25] ==> var argumentValues: (SmartFMap<(PseudoValue..PseudoValue?), (ValueParameterDescriptor..ValueParameterDescriptor?)>..SmartFMap<(PseudoValue..PseudoValue?), (ValueParameterDescriptor..ValueParameterDescriptor?)>?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getArraySetterArguments[LocalVariableDescriptor]

'argumentValues' @ [465:42] ==> var argumentValues: (SmartFMap<(PseudoValue..PseudoValue?), (ValueParameterDescriptor..ValueParameterDescriptor?)>..SmartFMap<(PseudoValue..PseudoValue?), (ValueParameterDescriptor..ValueParameterDescriptor?)>?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getArraySetterArguments[LocalVariableDescriptor]

'plus' @ [465:57] ==> public open fun plus(@NotNull p0: PseudoValue, p1: (ValueParameterDescriptor..ValueParameterDescriptor?)): (SmartFMap<(PseudoValue..PseudoValue?), (ValueParameterDescriptor..ValueParameterDescriptor?)>..SmartFMap<(PseudoValue..PseudoValue?), (ValueParameterDescriptor..ValueParameterDescriptor?)>?) defined in com.intellij.util.SmartFMap[JavaMethodDescriptor]

'rhsValue' @ [465:62] ==> val rhsValue: PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getArraySetterArguments[LocalVariableDescriptor]

'parameterDescriptor' @ [465:72] ==> val parameterDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getArraySetterArguments[LocalVariableDescriptor]

'argumentValues' @ [469:20] ==> var argumentValues: (SmartFMap<(PseudoValue..PseudoValue?), (ValueParameterDescriptor..ValueParameterDescriptor?)>..SmartFMap<(PseudoValue..PseudoValue?), (ValueParameterDescriptor..ValueParameterDescriptor?)>?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getArraySetterArguments[LocalVariableDescriptor]

'builder' @ [473:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'getBoundValue' @ [473:25] ==> public abstract fun getBoundValue(element: KtElement?): PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'arrayAccessExpression' @ [473:39] ==> value-parameter arrayAccessExpression: KtArrayAccessExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateArrayAccess[ValueParameterDescriptorImpl]

'mark' @ [474:13] ==> private final fun mark(element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'arrayAccessExpression' @ [474:18] ==> value-parameter arrayAccessExpression: KtArrayAccessExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateArrayAccess[ValueParameterDescriptorImpl]

'!' @ [475:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'checkAndGenerateCall' @ [475:18] ==> private final fun checkAndGenerateCall(resolvedCall: ResolvedCall<*>?): Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [475:39] ==> value-parameter resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateArrayAccess[ValueParameterDescriptorImpl]

'generateArrayAccessWithoutCall' @ [476:17] ==> private final fun generateArrayAccessWithoutCall(arrayAccessExpression: KtArrayAccessExpression): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'arrayAccessExpression' @ [476:48] ==> value-parameter arrayAccessExpression: KtArrayAccessExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateArrayAccess[ValueParameterDescriptorImpl]

'createNonSyntheticValue' @ [481:13] ==> private final fun createNonSyntheticValue(to: KtElement, from: List<KtElement?>, kind: MagicKind): PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'arrayAccessExpression' @ [481:37] ==> value-parameter arrayAccessExpression: KtArrayAccessExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateArrayAccessWithoutCall[ValueParameterDescriptorImpl]

'generateArrayAccessArguments' @ [481:60] ==> private final fun generateArrayAccessArguments(arrayAccessExpression: KtArrayAccessExpression): List<KtExpression> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'arrayAccessExpression' @ [481:89] ==> value-parameter arrayAccessExpression: KtArrayAccessExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateArrayAccessWithoutCall[ValueParameterDescriptorImpl]

'UNRESOLVED_CALL' @ [481:123] ==> enum entry UNRESOLVED_CALL defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'ArrayList' @ [485:36] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtExpression

'arrayAccessExpression' @ [487:35] ==> value-parameter arrayAccessExpression: KtArrayAccessExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateArrayAccessArguments[ValueParameterDescriptorImpl]

'arrayExpression' @ [487:57] ==> public final val KtArrayAccessExpression.arrayExpression: KtExpression?[MyPropertyDescriptor]

'arrayExpression' @ [488:17] ==> val arrayExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateArrayAccessArguments[LocalVariableDescriptor]

'inputExpressions' @ [489:17] ==> val inputExpressions: ArrayList<KtExpression> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateArrayAccessArguments[LocalVariableDescriptor]

'add' @ [489:34] ==> public open fun add(element: KtExpression): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'arrayExpression' @ [489:38] ==> val arrayExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateArrayAccessArguments[LocalVariableDescriptor]

'generateInstructions' @ [491:13] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'arrayExpression' @ [491:34] ==> val arrayExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateArrayAccessArguments[LocalVariableDescriptor]

'arrayAccessExpression' @ [493:27] ==> value-parameter arrayAccessExpression: KtArrayAccessExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateArrayAccessArguments[ValueParameterDescriptorImpl]

'indexExpressions' @ [493:49] ==> public final val KtArrayAccessExpression.indexExpressions: (MutableList<(KtExpression..KtExpression?)>..List<(KtExpression..KtExpression?)>)[MyPropertyDescriptor]

'generateInstructions' @ [494:17] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'index' @ [494:38] ==> val index: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateArrayAccessArguments[LocalVariableDescriptor]

'inputExpressions' @ [495:17] ==> val inputExpressions: ArrayList<KtExpression> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateArrayAccessArguments[LocalVariableDescriptor]

'add' @ [495:34] ==> public open fun add(element: KtExpression): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'index' @ [495:38] ==> val index: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateArrayAccessArguments[LocalVariableDescriptor]

'inputExpressions' @ [498:20] ==> val inputExpressions: ArrayList<KtExpression> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateArrayAccessArguments[LocalVariableDescriptor]

'expression' @ [502:33] ==> value-parameter expression: KtUnaryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitUnaryExpression[ValueParameterDescriptorImpl]

'operationReference' @ [502:44] ==> public final val KtUnaryExpression.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'operationSign' @ [503:33] ==> val operationSign: KtSimpleNameExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitUnaryExpression[LocalVariableDescriptor]

'getReferencedNameElementType' @ [503:47] ==> public abstract fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[SimpleFunctionDescriptorImpl]

'expression' @ [504:34] ==> value-parameter expression: KtUnaryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitUnaryExpression[ValueParameterDescriptorImpl]

'baseExpression' @ [504:45] ==> public final val KtUnaryExpression.baseExpression: KtExpression?[MyPropertyDescriptor]

'EXCLEXCL' @ [505:26] ==> public final val EXCLEXCL: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'operationType' @ [505:39] ==> val operationType: IElementType defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitUnaryExpression[LocalVariableDescriptor]

'generateInstructions' @ [506:17] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'baseExpression' @ [506:38] ==> val baseExpression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitUnaryExpression[LocalVariableDescriptor]

'builder' @ [507:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'predefinedOperation' @ [507:25] ==> public abstract fun predefinedOperation(expression: KtExpression, operation: ControlFlowBuilder.PredefinedOperation, inputValues: List<PseudoValue>): OperationInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [507:45] ==> value-parameter expression: KtUnaryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitUnaryExpression[ValueParameterDescriptorImpl]

'NOT_NULL_ASSERTION' @ [507:57] ==> enum entry NOT_NULL_ASSERTION defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder.PredefinedOperation[FakeCallableDescriptorForObject]

'elementsToValues' @ [507:77] ==> private final fun elementsToValues(from: List<KtElement?>): List<PseudoValue> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'listOf' @ [507:94] ==> public fun <T> listOf(element: KtExpression): List<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'baseExpression' @ [507:101] ==> val baseExpression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitUnaryExpression[LocalVariableDescriptor]

'isIncrementOrDecrement' @ [511:40] ==> private final fun isIncrementOrDecrement(operationType: IElementType): Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'operationType' @ [511:63] ==> val operationType: IElementType defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitUnaryExpression[LocalVariableDescriptor]

'expression' @ [512:32] ==> value-parameter expression: KtUnaryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitUnaryExpression[ValueParameterDescriptorImpl]

'getResolvedCall' @ [512:43] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[SimpleFunctionDescriptorImpl]

'trace' @ [512:59] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[PropertyDescriptorImpl]

'bindingContext' @ [512:65] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'if (resolvedCall != null) {
                generateCall(resolvedCall).outputValue
            }
            else {
                generateInstructions(baseExpression)
                createNonSyntheticValue(expression, MagicKind.UNRESOLVED_CALL, baseExpression)
            }' @ [514:42] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PseudoValue?, elseBranch: PseudoValue?): PseudoValue?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PseudoValue?

'resolvedCall' @ [514:46] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitUnaryExpression[LocalVariableDescriptor]

'generateCall' @ [515:17] ==> private final fun generateCall(resolvedCall: ResolvedCall<*>): InstructionWithValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [515:30] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitUnaryExpression[LocalVariableDescriptor]

'outputValue' @ [515:44] ==> public abstract val outputValue: PseudoValue? defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.InstructionWithValue[PropertyDescriptorImpl]

'generateInstructions' @ [518:17] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'baseExpression' @ [518:38] ==> val baseExpression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitUnaryExpression[LocalVariableDescriptor]

'createNonSyntheticValue' @ [519:17] ==> private final fun createNonSyntheticValue(to: KtElement, kind: MagicKind, vararg from: KtElement?): PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [519:41] ==> value-parameter expression: KtUnaryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitUnaryExpression[ValueParameterDescriptorImpl]

'UNRESOLVED_CALL' @ [519:63] ==> enum entry UNRESOLVED_CALL defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'baseExpression' @ [519:80] ==> val baseExpression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitUnaryExpression[LocalVariableDescriptor]

'incrementOrDecrement' @ [522:17] ==> val incrementOrDecrement: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitUnaryExpression[LocalVariableDescriptor]

'visitAssignment' @ [523:17] ==> private final fun visitAssignment(lhs: KtExpression?, rhsDeferredValue: () -> PseudoValue?, parentExpression: KtExpression): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'baseExpression' @ [523:33] ==> val baseExpression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitUnaryExpression[LocalVariableDescriptor]

'getValueAsFunction' @ [523:49] ==> private final fun getValueAsFunction(value: PseudoValue?): () -> PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'rhsValue' @ [523:68] ==> val rhsValue: PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitUnaryExpression[LocalVariableDescriptor]

'expression' @ [523:79] ==> value-parameter expression: KtUnaryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitUnaryExpression[ValueParameterDescriptorImpl]

'expression' @ [524:21] ==> value-parameter expression: KtUnaryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitUnaryExpression[ValueParameterDescriptorImpl]

'copyValue' @ [525:21] ==> private final fun copyValue(from: KtElement?, to: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'baseExpression' @ [525:31] ==> val baseExpression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitUnaryExpression[LocalVariableDescriptor]

'expression' @ [525:47] ==> value-parameter expression: KtUnaryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitUnaryExpression[ValueParameterDescriptorImpl]

'operationType' @ [531:17] ==> value-parameter operationType: IElementType defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.isIncrementOrDecrement[ValueParameterDescriptorImpl]

'PLUSPLUS' @ [531:44] ==> public final val PLUSPLUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'operationType' @ [531:56] ==> value-parameter operationType: IElementType defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.isIncrementOrDecrement[ValueParameterDescriptorImpl]

'MINUSMINUS' @ [531:83] ==> public final val MINUSMINUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'mark' @ [534:13] ==> private final fun mark(element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [534:18] ==> value-parameter expression: KtIfExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitIfExpression[ValueParameterDescriptorImpl]

'ArrayList' @ [535:28] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtExpression

'expression' @ [536:29] ==> value-parameter expression: KtIfExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitIfExpression[ValueParameterDescriptorImpl]

'condition' @ [536:40] ==> public final val KtIfExpression.condition: KtExpression?[MyPropertyDescriptor]

'generateInstructions' @ [537:13] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'condition' @ [537:34] ==> val condition: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitIfExpression[LocalVariableDescriptor]

'builder' @ [538:29] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'createUnboundLabel' @ [538:37] ==> public abstract fun createUnboundLabel(name: String): Label defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'builder' @ [539:13] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'jumpOnFalse' @ [539:21] ==> public abstract fun jumpOnFalse(label: Label, element: KtElement, conditionValue: PseudoValue?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'elseLabel' @ [539:33] ==> val elseLabel: Label defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitIfExpression[LocalVariableDescriptor]

'expression' @ [539:44] ==> value-parameter expression: KtIfExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitIfExpression[ValueParameterDescriptorImpl]

'builder' @ [539:56] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'getBoundValue' @ [539:64] ==> public abstract fun getBoundValue(element: KtElement?): PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'condition' @ [539:78] ==> val condition: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitIfExpression[LocalVariableDescriptor]

'expression' @ [540:30] ==> value-parameter expression: KtIfExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitIfExpression[ValueParameterDescriptorImpl]

'then' @ [540:41] ==> public final val KtIfExpression.then: KtExpression?[MyPropertyDescriptor]

'if (thenBranch != null) {
                branches.add(thenBranch)
                generateInstructions(thenBranch)
            }
            else {
                builder.loadUnit(expression)
            }' @ [541:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'thenBranch' @ [541:17] ==> val thenBranch: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitIfExpression[LocalVariableDescriptor]

'branches' @ [542:17] ==> val branches: ArrayList<KtExpression> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitIfExpression[LocalVariableDescriptor]

'add' @ [542:26] ==> public open fun add(element: KtExpression): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'thenBranch' @ [542:30] ==> val thenBranch: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitIfExpression[LocalVariableDescriptor]

'generateInstructions' @ [543:17] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'thenBranch' @ [543:38] ==> val thenBranch: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitIfExpression[LocalVariableDescriptor]

'builder' @ [546:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'loadUnit' @ [546:25] ==> public abstract fun loadUnit(expression: KtExpression): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [546:34] ==> value-parameter expression: KtIfExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitIfExpression[ValueParameterDescriptorImpl]

'builder' @ [548:31] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'createUnboundLabel' @ [548:39] ==> public abstract fun createUnboundLabel(name: String): Label defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'builder' @ [549:13] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'jump' @ [549:21] ==> public abstract fun jump(label: Label, element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'resultLabel' @ [549:26] ==> val resultLabel: Label defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitIfExpression[LocalVariableDescriptor]

'expression' @ [549:39] ==> value-parameter expression: KtIfExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitIfExpression[ValueParameterDescriptorImpl]

'builder' @ [550:13] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'bindLabel' @ [550:21] ==> public abstract fun bindLabel(label: Label): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'elseLabel' @ [550:31] ==> val elseLabel: Label defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitIfExpression[LocalVariableDescriptor]

'expression' @ [551:30] ==> value-parameter expression: KtIfExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitIfExpression[ValueParameterDescriptorImpl]

'`else`' @ [551:41] ==> public final val KtIfExpression.`else`: KtExpression?[MyPropertyDescriptor]

'if (elseBranch != null) {
                branches.add(elseBranch)
                generateInstructions(elseBranch)
            }
            else {
                builder.loadUnit(expression)
            }' @ [552:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'elseBranch' @ [552:17] ==> val elseBranch: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitIfExpression[LocalVariableDescriptor]

'branches' @ [553:17] ==> val branches: ArrayList<KtExpression> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitIfExpression[LocalVariableDescriptor]

'add' @ [553:26] ==> public open fun add(element: KtExpression): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'elseBranch' @ [553:30] ==> val elseBranch: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitIfExpression[LocalVariableDescriptor]

'generateInstructions' @ [554:17] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'elseBranch' @ [554:38] ==> val elseBranch: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitIfExpression[LocalVariableDescriptor]

'builder' @ [557:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'loadUnit' @ [557:25] ==> public abstract fun loadUnit(expression: KtExpression): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [557:34] ==> value-parameter expression: KtIfExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitIfExpression[ValueParameterDescriptorImpl]

'builder' @ [559:13] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'bindLabel' @ [559:21] ==> public abstract fun bindLabel(label: Label): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'resultLabel' @ [559:31] ==> val resultLabel: Label defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitIfExpression[LocalVariableDescriptor]

'mergeValues' @ [560:13] ==> private final fun mergeValues(from: List<KtExpression>, to: KtExpression): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'branches' @ [560:25] ==> val branches: ArrayList<KtExpression> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitIfExpression[LocalVariableDescriptor]

'expression' @ [560:35] ==> value-parameter expression: KtIfExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitIfExpression[ValueParameterDescriptorImpl]

'finallyBlock' @ [568:39] ==> private final val finallyBlock: KtFinallySection? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.FinallyBlockGenerator[PropertyDescriptorImpl]

'finalExpression' @ [568:53] ==> public final val KtFinallySection.finalExpression: (KtBlockExpression..KtBlockExpression?)[MyPropertyDescriptor]

'catchFinallyStack' @ [569:17] ==> private final val catchFinallyStack: Stack<ControlFlowProcessor.CatchFinallyLabels> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'push' @ [569:35] ==> public open fun push(p0: (ControlFlowProcessor.CatchFinallyLabels..ControlFlowProcessor.CatchFinallyLabels?)): (ControlFlowProcessor.CatchFinallyLabels..ControlFlowProcessor.CatchFinallyLabels?) defined in java.util.Stack[JavaMethodDescriptor]

'CatchFinallyLabels' @ [569:40] ==> public constructor CatchFinallyLabels(onException: Label?, toFinally: Label?, tryExpression: KtTryExpression?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CatchFinallyLabels[ClassConstructorDescriptorImpl]

'startFinally' @ [570:17] ==> private final var startFinally: Label? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.FinallyBlockGenerator[PropertyDescriptorImpl]

'let' @ [570:31] ==> @InlineOnly public inline fun <T, R> Label.let(block: (Label) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Label
    <R> -> Nothing

'assert' @ [571:21] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'finishFinally' @ [571:28] ==> private final var finishFinally: Label? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.FinallyBlockGenerator[PropertyDescriptorImpl]

'startFinally' @ [571:84] ==> private final var startFinally: Label? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.FinallyBlockGenerator[PropertyDescriptorImpl]

'builder' @ [572:21] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'repeatPseudocode' @ [572:29] ==> public abstract fun repeatPseudocode(startLabel: Label, finishLabel: Label): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'it' @ [572:46] ==> value-parameter it: Label defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.FinallyBlockGenerator.generate.<anonymous>[ValueParameterDescriptorImpl]

'finishFinally' @ [572:50] ==> private final var finishFinally: Label? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.FinallyBlockGenerator[PropertyDescriptorImpl]

'catchFinallyStack' @ [573:21] ==> private final val catchFinallyStack: Stack<ControlFlowProcessor.CatchFinallyLabels> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'pop' @ [573:39] ==> public open fun pop(): (ControlFlowProcessor.CatchFinallyLabels..ControlFlowProcessor.CatchFinallyLabels?) defined in java.util.Stack[JavaMethodDescriptor]

'builder' @ [576:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'createUnboundLabel' @ [576:25] ==> public abstract fun createUnboundLabel(name: String): Label defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'let' @ [576:61] ==> @InlineOnly public inline fun <T, R> Label.let(block: (Label) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Label
    <R> -> Unit

'startFinally' @ [577:21] ==> private final var startFinally: Label? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.FinallyBlockGenerator[PropertyDescriptorImpl]

'it' @ [577:36] ==> value-parameter it: Label defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.FinallyBlockGenerator.generate.<anonymous>[ValueParameterDescriptorImpl]

'builder' @ [578:21] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'bindLabel' @ [578:29] ==> public abstract fun bindLabel(label: Label): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'it' @ [578:39] ==> value-parameter it: Label defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.FinallyBlockGenerator.generate.<anonymous>[ValueParameterDescriptorImpl]

'generateInstructions' @ [580:17] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'finalExpression' @ [580:38] ==> val finalExpression: KtBlockExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.FinallyBlockGenerator.generate[LocalVariableDescriptor]

'builder' @ [581:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'createUnboundLabel' @ [581:25] ==> public abstract fun createUnboundLabel(name: String): Label defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'let' @ [581:62] ==> @InlineOnly public inline fun <T, R> Label.let(block: (Label) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Label
    <R> -> Unit

'finishFinally' @ [582:21] ==> private final var finishFinally: Label? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.FinallyBlockGenerator[PropertyDescriptorImpl]

'it' @ [582:37] ==> value-parameter it: Label defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.FinallyBlockGenerator.generate.<anonymous>[ValueParameterDescriptorImpl]

'builder' @ [583:21] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'bindLabel' @ [583:29] ==> public abstract fun bindLabel(label: Label): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'it' @ [583:39] ==> value-parameter it: Label defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.FinallyBlockGenerator.generate.<anonymous>[ValueParameterDescriptorImpl]

'catchFinallyStack' @ [585:17] ==> private final val catchFinallyStack: Stack<ControlFlowProcessor.CatchFinallyLabels> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'pop' @ [585:35] ==> public open fun pop(): (ControlFlowProcessor.CatchFinallyLabels..ControlFlowProcessor.CatchFinallyLabels?) defined in java.util.Stack[JavaMethodDescriptor]

'mark' @ [590:13] ==> private final fun mark(element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [590:18] ==> value-parameter expression: KtTryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitTryExpression[ValueParameterDescriptorImpl]

'expression' @ [592:32] ==> value-parameter expression: KtTryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitTryExpression[ValueParameterDescriptorImpl]

'finallyBlock' @ [592:43] ==> public final val KtTryExpression.finallyBlock: KtFinallySection?[MyPropertyDescriptor]

'FinallyBlockGenerator' @ [593:41] ==> public constructor FinallyBlockGenerator(finallyBlock: KtFinallySection?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.FinallyBlockGenerator[ClassConstructorDescriptorImpl]

'finallyBlock' @ [593:63] ==> val finallyBlock: KtFinallySection? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitTryExpression[LocalVariableDescriptor]

'finallyBlock' @ [594:30] ==> val finallyBlock: KtFinallySection? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitTryExpression[LocalVariableDescriptor]

'hasFinally' @ [595:17] ==> val hasFinally: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitTryExpression[LocalVariableDescriptor]

'builder' @ [596:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'enterTryFinally' @ [596:25] ==> public abstract fun enterTryFinally(trigger: GenerationTrigger): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'working' @ [601:29] ==> private final var working: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitTryExpression.<no name provided>[PropertyDescriptorImpl]

'working' @ [602:25] ==> private final var working: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitTryExpression.<no name provided>[PropertyDescriptorImpl]

'finallyBlockGenerator' @ [603:25] ==> val finallyBlockGenerator: ControlFlowProcessor.CFPVisitor.FinallyBlockGenerator defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitTryExpression[LocalVariableDescriptor]

'generate' @ [603:47] ==> public final fun generate(): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.FinallyBlockGenerator[SimpleFunctionDescriptorImpl]

'working' @ [604:25] ==> private final var working: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitTryExpression.<no name provided>[PropertyDescriptorImpl]

'generateTryAndCatches' @ [609:45] ==> private final fun generateTryAndCatches(expression: KtTryExpression): Label? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [609:67] ==> value-parameter expression: KtTryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitTryExpression[ValueParameterDescriptorImpl]

'hasFinally' @ [611:17] ==> val hasFinally: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitTryExpression[LocalVariableDescriptor]

'assert' @ [612:17] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'onExceptionToFinallyBlock' @ [612:24] ==> val onExceptionToFinallyBlock: Label? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitTryExpression[LocalVariableDescriptor]

'+' @ [612:61] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'expression' @ [612:94] ==> value-parameter expression: KtTryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitTryExpression[ValueParameterDescriptorImpl]

'text' @ [612:105] ==> public final val KtTryExpression.text: (String..String?)[MyPropertyDescriptor]

'builder' @ [614:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'exitTryFinally' @ [614:25] ==> public abstract fun exitTryFinally(): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'builder' @ [616:47] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'createUnboundLabel' @ [616:55] ==> public abstract fun createUnboundLabel(name: String): Label defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'builder' @ [617:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'jump' @ [617:25] ==> public abstract fun jump(label: Label, element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'skipFinallyToErrorBlock' @ [617:30] ==> val skipFinallyToErrorBlock: Label defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitTryExpression[LocalVariableDescriptor]

'expression' @ [617:55] ==> value-parameter expression: KtTryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitTryExpression[ValueParameterDescriptorImpl]

'builder' @ [618:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'bindLabel' @ [618:25] ==> public abstract fun bindLabel(label: Label): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'onExceptionToFinallyBlock' @ [618:35] ==> val onExceptionToFinallyBlock: Label? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitTryExpression[LocalVariableDescriptor]

'finallyBlockGenerator' @ [619:17] ==> val finallyBlockGenerator: ControlFlowProcessor.CFPVisitor.FinallyBlockGenerator defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitTryExpression[LocalVariableDescriptor]

'generate' @ [619:39] ==> public final fun generate(): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.FinallyBlockGenerator[SimpleFunctionDescriptorImpl]

'builder' @ [620:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'jumpToError' @ [620:25] ==> public abstract fun jumpToError(element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [620:37] ==> value-parameter expression: KtTryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitTryExpression[ValueParameterDescriptorImpl]

'builder' @ [621:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'bindLabel' @ [621:25] ==> public abstract fun bindLabel(label: Label): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'skipFinallyToErrorBlock' @ [621:35] ==> val skipFinallyToErrorBlock: Label defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitTryExpression[LocalVariableDescriptor]

'finallyBlockGenerator' @ [623:17] ==> val finallyBlockGenerator: ControlFlowProcessor.CFPVisitor.FinallyBlockGenerator defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitTryExpression[LocalVariableDescriptor]

'generate' @ [623:39] ==> public final fun generate(): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.FinallyBlockGenerator[SimpleFunctionDescriptorImpl]

'ArrayList' @ [626:28] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtExpression

'branches' @ [627:13] ==> val branches: ArrayList<KtExpression> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitTryExpression[LocalVariableDescriptor]

'add' @ [627:22] ==> public open fun add(element: KtExpression): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'expression' @ [627:26] ==> value-parameter expression: KtTryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitTryExpression[ValueParameterDescriptorImpl]

'tryBlock' @ [627:37] ==> public final val KtTryExpression.tryBlock: KtBlockExpression[MyPropertyDescriptor]

'expression' @ [628:33] ==> value-parameter expression: KtTryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitTryExpression[ValueParameterDescriptorImpl]

'catchClauses' @ [628:44] ==> public final val KtTryExpression.catchClauses: (MutableList<(KtCatchClause..KtCatchClause?)>..List<(KtCatchClause..KtCatchClause?)>)[MyPropertyDescriptor]

'catchClause' @ [629:17] ==> val catchClause: (KtCatchClause..KtCatchClause?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitTryExpression[LocalVariableDescriptor]

'catchBody' @ [629:29] ==> public final val KtCatchClause.catchBody: KtExpression?[MyPropertyDescriptor]

'let' @ [629:40] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> Boolean

'branches' @ [629:46] ==> val branches: ArrayList<KtExpression> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitTryExpression[LocalVariableDescriptor]

'add' @ [629:55] ==> public open fun add(element: KtExpression): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [629:59] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitTryExpression.<anonymous>[ValueParameterDescriptorImpl]

'mergeValues' @ [631:13] ==> private final fun mergeValues(from: List<KtExpression>, to: KtExpression): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'branches' @ [631:25] ==> val branches: ArrayList<KtExpression> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitTryExpression[LocalVariableDescriptor]

'expression' @ [631:35] ==> value-parameter expression: KtTryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitTryExpression[ValueParameterDescriptorImpl]

'expression' @ [636:32] ==> value-parameter expression: KtTryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[ValueParameterDescriptorImpl]

'catchClauses' @ [636:43] ==> public final val KtTryExpression.catchClauses: (MutableList<(KtCatchClause..KtCatchClause?)>..List<(KtCatchClause..KtCatchClause?)>)[MyPropertyDescriptor]

'!' @ [637:30] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'catchClauses' @ [637:31] ==> val catchClauses: (MutableList<(KtCatchClause..KtCatchClause?)>..List<(KtCatchClause..KtCatchClause?)>) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[LocalVariableDescriptor]

'isEmpty' @ [637:44] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'hasCatches' @ [640:17] ==> val hasCatches: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[LocalVariableDescriptor]

'onException' @ [641:17] ==> var onException: Label? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[LocalVariableDescriptor]

'builder' @ [641:31] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'createUnboundLabel' @ [641:39] ==> public abstract fun createUnboundLabel(name: String): Label defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'builder' @ [642:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'nondeterministicJump' @ [642:25] ==> public abstract fun nondeterministicJump(label: Label, element: KtElement, inputValue: PseudoValue?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'onException' @ [642:46] ==> var onException: Label? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[LocalVariableDescriptor]

'expression' @ [642:59] ==> value-parameter expression: KtTryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[ValueParameterDescriptorImpl]

'expression' @ [646:17] ==> value-parameter expression: KtTryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[ValueParameterDescriptorImpl]

'finallyBlock' @ [646:28] ==> public final val KtTryExpression.finallyBlock: KtFinallySection?[MyPropertyDescriptor]

'onExceptionToFinallyBlock' @ [647:17] ==> var onExceptionToFinallyBlock: Label? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[LocalVariableDescriptor]

'builder' @ [647:45] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'createUnboundLabel' @ [647:53] ==> public abstract fun createUnboundLabel(name: String): Label defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'builder' @ [648:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'nondeterministicJump' @ [648:25] ==> public abstract fun nondeterministicJump(label: Label, element: KtElement, inputValue: PseudoValue?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'onExceptionToFinallyBlock' @ [648:46] ==> var onExceptionToFinallyBlock: Label? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[LocalVariableDescriptor]

'expression' @ [648:73] ==> value-parameter expression: KtTryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[ValueParameterDescriptorImpl]

'expression' @ [651:28] ==> value-parameter expression: KtTryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[ValueParameterDescriptorImpl]

'tryBlock' @ [651:39] ==> public final val KtTryExpression.tryBlock: KtBlockExpression[MyPropertyDescriptor]

'catchFinallyStack' @ [652:13] ==> private final val catchFinallyStack: Stack<ControlFlowProcessor.CatchFinallyLabels> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'push' @ [652:31] ==> public open fun push(p0: (ControlFlowProcessor.CatchFinallyLabels..ControlFlowProcessor.CatchFinallyLabels?)): (ControlFlowProcessor.CatchFinallyLabels..ControlFlowProcessor.CatchFinallyLabels?) defined in java.util.Stack[JavaMethodDescriptor]

'CatchFinallyLabels' @ [652:36] ==> public constructor CatchFinallyLabels(onException: Label?, toFinally: Label?, tryExpression: KtTryExpression?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CatchFinallyLabels[ClassConstructorDescriptorImpl]

'onException' @ [652:55] ==> var onException: Label? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[LocalVariableDescriptor]

'onExceptionToFinallyBlock' @ [652:68] ==> var onExceptionToFinallyBlock: Label? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[LocalVariableDescriptor]

'expression' @ [652:95] ==> value-parameter expression: KtTryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[ValueParameterDescriptorImpl]

'generateInstructions' @ [653:13] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'tryBlock' @ [653:34] ==> val tryBlock: KtBlockExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[LocalVariableDescriptor]

'generateJumpsToCatchAndFinally' @ [654:13] ==> private final fun generateJumpsToCatchAndFinally(): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'catchFinallyStack' @ [655:13] ==> private final val catchFinallyStack: Stack<ControlFlowProcessor.CatchFinallyLabels> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'pop' @ [655:31] ==> public open fun pop(): (ControlFlowProcessor.CatchFinallyLabels..ControlFlowProcessor.CatchFinallyLabels?) defined in java.util.Stack[JavaMethodDescriptor]

'hasCatches' @ [657:17] ==> val hasCatches: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[LocalVariableDescriptor]

'onException' @ [657:31] ==> var onException: Label? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[LocalVariableDescriptor]

'builder' @ [658:36] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'createUnboundLabel' @ [658:44] ==> public abstract fun createUnboundLabel(name: String): Label defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'builder' @ [659:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'jump' @ [659:25] ==> public abstract fun jump(label: Label, element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'afterCatches' @ [659:30] ==> val afterCatches: Label defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[LocalVariableDescriptor]

'expression' @ [659:44] ==> value-parameter expression: KtTryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[ValueParameterDescriptorImpl]

'builder' @ [661:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'bindLabel' @ [661:25] ==> public abstract fun bindLabel(label: Label): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'onException' @ [661:35] ==> var onException: Label? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[LocalVariableDescriptor]

'LinkedList' @ [662:35] ==> public constructor LinkedList<E : (Any..Any?)>() defined in java.util.LinkedList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Label

'catchClauses' @ [663:40] ==> val catchClauses: (MutableList<(KtCatchClause..KtCatchClause?)>..List<(KtCatchClause..KtCatchClause?)>) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[LocalVariableDescriptor]

'size' @ [663:53] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'until' @ [664:27] ==> public infix fun Int.until(to: Int): IntRange defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'catchClausesSize' @ [664:35] ==> val catchClausesSize: Int defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[LocalVariableDescriptor]

'catchLabels' @ [665:21] ==> val catchLabels: LinkedList<Label> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[LocalVariableDescriptor]

'add' @ [665:33] ==> public open fun add(element: Label): Boolean defined in java.util.LinkedList[JavaMethodDescriptor]

'builder' @ [665:37] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'createUnboundLabel' @ [665:45] ==> public abstract fun createUnboundLabel(name: String): Label defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'+' @ [665:64] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'i' @ [665:75] ==> val i: Int defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[LocalVariableDescriptor]

'!' @ [667:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'catchLabels' @ [667:22] ==> val catchLabels: LinkedList<Label> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[LocalVariableDescriptor]

'isEmpty' @ [667:34] ==> public open fun isEmpty(): Boolean defined in java.util.LinkedList[JavaMethodDescriptor]

'builder' @ [668:21] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'nondeterministicJump' @ [668:29] ==> public abstract fun nondeterministicJump(label: List<Label>, element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'catchLabels' @ [668:50] ==> val catchLabels: LinkedList<Label> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[LocalVariableDescriptor]

'expression' @ [668:63] ==> value-parameter expression: KtTryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[ValueParameterDescriptorImpl]

'catchClauses' @ [671:37] ==> val catchClauses: (MutableList<(KtCatchClause..KtCatchClause?)>..List<(KtCatchClause..KtCatchClause?)>) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[LocalVariableDescriptor]

'builder' @ [672:21] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'enterBlockScope' @ [672:29] ==> public abstract fun enterBlockScope(block: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'catchClause' @ [672:45] ==> val catchClause: (KtCatchClause..KtCatchClause?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[LocalVariableDescriptor]

'if (!isFirst) {
                        builder.bindLabel(catchLabels.remove())
                    }
                    else {
                        isFirst = false
                    }' @ [673:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [673:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isFirst' @ [673:26] ==> var isFirst: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[LocalVariableDescriptor]

'builder' @ [674:25] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'bindLabel' @ [674:33] ==> public abstract fun bindLabel(label: Label): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'catchLabels' @ [674:43] ==> val catchLabels: LinkedList<Label> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[LocalVariableDescriptor]

'remove' @ [674:55] ==> public open fun remove(): (Label..Label?) defined in java.util.LinkedList[JavaMethodDescriptor]

'isFirst' @ [677:25] ==> var isFirst: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[LocalVariableDescriptor]

'catchClause' @ [679:42] ==> val catchClause: (KtCatchClause..KtCatchClause?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[LocalVariableDescriptor]

'catchParameter' @ [679:54] ==> public final val KtCatchClause.catchParameter: KtParameter?[MyPropertyDescriptor]

'catchParameter' @ [680:25] ==> val catchParameter: KtParameter? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[LocalVariableDescriptor]

'builder' @ [681:25] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'declareParameter' @ [681:33] ==> public abstract fun declareParameter(parameter: KtParameter): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'catchParameter' @ [681:50] ==> val catchParameter: KtParameter? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[LocalVariableDescriptor]

'generateInitializer' @ [682:25] ==> private final fun generateInitializer(declaration: KtDeclaration, initValue: PseudoValue): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'catchParameter' @ [682:45] ==> val catchParameter: KtParameter? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[LocalVariableDescriptor]

'createSyntheticValue' @ [682:61] ==> private final fun createSyntheticValue(instructionElement: KtElement, kind: MagicKind, vararg from: KtElement): PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'catchParameter' @ [682:82] ==> val catchParameter: KtParameter? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[LocalVariableDescriptor]

'FAKE_INITIALIZER' @ [682:108] ==> enum entry FAKE_INITIALIZER defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'generateInstructions' @ [684:21] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'catchClause' @ [684:42] ==> val catchClause: (KtCatchClause..KtCatchClause?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[LocalVariableDescriptor]

'catchBody' @ [684:54] ==> public final val KtCatchClause.catchBody: KtExpression?[MyPropertyDescriptor]

'builder' @ [685:21] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'jump' @ [685:29] ==> public abstract fun jump(label: Label, element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'afterCatches' @ [685:34] ==> val afterCatches: Label defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[LocalVariableDescriptor]

'expression' @ [685:48] ==> value-parameter expression: KtTryExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[ValueParameterDescriptorImpl]

'builder' @ [686:21] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'exitBlockScope' @ [686:29] ==> public abstract fun exitBlockScope(block: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'catchClause' @ [686:44] ==> val catchClause: (KtCatchClause..KtCatchClause?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[LocalVariableDescriptor]

'builder' @ [689:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'bindLabel' @ [689:25] ==> public abstract fun bindLabel(label: Label): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'afterCatches' @ [689:35] ==> val afterCatches: Label defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[LocalVariableDescriptor]

'onExceptionToFinallyBlock' @ [692:20] ==> var onExceptionToFinallyBlock: Label? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateTryAndCatches[LocalVariableDescriptor]

'builder' @ [696:28] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'enterLoop' @ [696:36] ==> public abstract fun enterLoop(expression: KtLoopExpression): LoopInfo defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [696:46] ==> value-parameter expression: KtWhileExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhileExpression[ValueParameterDescriptorImpl]

'builder' @ [698:13] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'bindLabel' @ [698:21] ==> public abstract fun bindLabel(label: Label): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'loopInfo' @ [698:31] ==> val loopInfo: LoopInfo defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhileExpression[LocalVariableDescriptor]

'conditionEntryPoint' @ [698:40] ==> public final val conditionEntryPoint: Label defined in org.jetbrains.kotlin.cfg.LoopInfo[PropertyDescriptorImpl]

'expression' @ [699:29] ==> value-parameter expression: KtWhileExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhileExpression[ValueParameterDescriptorImpl]

'condition' @ [699:40] ==> public final val KtWhileExpression.condition: KtExpression?[MyPropertyDescriptor]

'generateInstructions' @ [700:13] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'condition' @ [700:34] ==> val condition: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhileExpression[LocalVariableDescriptor]

'mark' @ [701:13] ==> private final fun mark(element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [701:18] ==> value-parameter expression: KtWhileExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhileExpression[ValueParameterDescriptorImpl]

'if (!CompileTimeConstantUtils.canBeReducedToBooleanConstant(condition, trace.bindingContext, true)) {
                builder.jumpOnFalse(loopInfo.exitPoint, expression, builder.getBoundValue(condition))
            }
            else {
                assert(condition != null) { "Invalid while condition: " + expression.text }
                createSyntheticValue(condition!!, MagicKind.VALUE_CONSUMER, condition)
            }' @ [702:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'!' @ [702:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'canBeReducedToBooleanConstant' @ [702:43] ==> public open fun canBeReducedToBooleanConstant(@Nullable expression: KtExpression?, @NotNull context: BindingContext, @Nullable expectedValue: Boolean?): Boolean defined in org.jetbrains.kotlin.resolve.CompileTimeConstantUtils[JavaMethodDescriptor]

'condition' @ [702:73] ==> val condition: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhileExpression[LocalVariableDescriptor]

'trace' @ [702:84] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[PropertyDescriptorImpl]

'bindingContext' @ [702:90] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'builder' @ [703:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'jumpOnFalse' @ [703:25] ==> public abstract fun jumpOnFalse(label: Label, element: KtElement, conditionValue: PseudoValue?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'loopInfo' @ [703:37] ==> val loopInfo: LoopInfo defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhileExpression[LocalVariableDescriptor]

'exitPoint' @ [703:46] ==> public final val exitPoint: Label defined in org.jetbrains.kotlin.cfg.LoopInfo[PropertyDescriptorImpl]

'expression' @ [703:57] ==> value-parameter expression: KtWhileExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhileExpression[ValueParameterDescriptorImpl]

'builder' @ [703:69] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'getBoundValue' @ [703:77] ==> public abstract fun getBoundValue(element: KtElement?): PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'condition' @ [703:91] ==> val condition: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhileExpression[LocalVariableDescriptor]

'assert' @ [706:17] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'condition' @ [706:24] ==> val condition: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhileExpression[LocalVariableDescriptor]

'+' @ [706:45] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'expression' @ [706:75] ==> value-parameter expression: KtWhileExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhileExpression[ValueParameterDescriptorImpl]

'text' @ [706:86] ==> public final val KtWhileExpression.text: (String..String?)[MyPropertyDescriptor]

'createSyntheticValue' @ [707:17] ==> private final fun createSyntheticValue(instructionElement: KtElement, kind: MagicKind, vararg from: KtElement): PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'condition' @ [707:38] ==> val condition: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhileExpression[LocalVariableDescriptor]

'VALUE_CONSUMER' @ [707:61] ==> enum entry VALUE_CONSUMER defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'condition' @ [707:77] ==> val condition: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhileExpression[LocalVariableDescriptor]

'builder' @ [710:13] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'enterLoopBody' @ [710:21] ==> public abstract fun enterLoopBody(expression: KtLoopExpression): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [710:35] ==> value-parameter expression: KtWhileExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhileExpression[ValueParameterDescriptorImpl]

'generateInstructions' @ [711:13] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [711:34] ==> value-parameter expression: KtWhileExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhileExpression[ValueParameterDescriptorImpl]

'body' @ [711:45] ==> public final val KtWhileExpression.body: KtExpression?[MyPropertyDescriptor]

'builder' @ [712:13] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'jump' @ [712:21] ==> public abstract fun jump(label: Label, element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'loopInfo' @ [712:26] ==> val loopInfo: LoopInfo defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhileExpression[LocalVariableDescriptor]

'entryPoint' @ [712:35] ==> public final val entryPoint: Label defined in org.jetbrains.kotlin.cfg.LoopInfo[PropertyDescriptorImpl]

'expression' @ [712:47] ==> value-parameter expression: KtWhileExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhileExpression[ValueParameterDescriptorImpl]

'builder' @ [713:13] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'exitLoopBody' @ [713:21] ==> public abstract fun exitLoopBody(expression: KtLoopExpression): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [713:34] ==> value-parameter expression: KtWhileExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhileExpression[ValueParameterDescriptorImpl]

'builder' @ [714:13] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'bindLabel' @ [714:21] ==> public abstract fun bindLabel(label: Label): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'loopInfo' @ [714:31] ==> val loopInfo: LoopInfo defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhileExpression[LocalVariableDescriptor]

'exitPoint' @ [714:40] ==> public final val exitPoint: Label defined in org.jetbrains.kotlin.cfg.LoopInfo[PropertyDescriptorImpl]

'builder' @ [715:13] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'loadUnit' @ [715:21] ==> public abstract fun loadUnit(expression: KtExpression): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [715:30] ==> value-parameter expression: KtWhileExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhileExpression[ValueParameterDescriptorImpl]

'builder' @ [719:13] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'enterBlockScope' @ [719:21] ==> public abstract fun enterBlockScope(block: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [719:37] ==> value-parameter expression: KtDoWhileExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDoWhileExpression[ValueParameterDescriptorImpl]

'mark' @ [720:13] ==> private final fun mark(element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [720:18] ==> value-parameter expression: KtDoWhileExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDoWhileExpression[ValueParameterDescriptorImpl]

'builder' @ [721:28] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'enterLoop' @ [721:36] ==> public abstract fun enterLoop(expression: KtLoopExpression): LoopInfo defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [721:46] ==> value-parameter expression: KtDoWhileExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDoWhileExpression[ValueParameterDescriptorImpl]

'builder' @ [723:13] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'enterLoopBody' @ [723:21] ==> public abstract fun enterLoopBody(expression: KtLoopExpression): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [723:35] ==> value-parameter expression: KtDoWhileExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDoWhileExpression[ValueParameterDescriptorImpl]

'generateInstructions' @ [724:13] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [724:34] ==> value-parameter expression: KtDoWhileExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDoWhileExpression[ValueParameterDescriptorImpl]

'body' @ [724:45] ==> public final val KtDoWhileExpression.body: KtExpression?[MyPropertyDescriptor]

'builder' @ [725:13] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'exitLoopBody' @ [725:21] ==> public abstract fun exitLoopBody(expression: KtLoopExpression): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [725:34] ==> value-parameter expression: KtDoWhileExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDoWhileExpression[ValueParameterDescriptorImpl]

'builder' @ [726:13] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'bindLabel' @ [726:21] ==> public abstract fun bindLabel(label: Label): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'loopInfo' @ [726:31] ==> val loopInfo: LoopInfo defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDoWhileExpression[LocalVariableDescriptor]

'conditionEntryPoint' @ [726:40] ==> public final val conditionEntryPoint: Label defined in org.jetbrains.kotlin.cfg.LoopInfo[PropertyDescriptorImpl]

'expression' @ [727:29] ==> value-parameter expression: KtDoWhileExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDoWhileExpression[ValueParameterDescriptorImpl]

'condition' @ [727:40] ==> public final val KtDoWhileExpression.condition: KtExpression?[MyPropertyDescriptor]

'generateInstructions' @ [728:13] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'condition' @ [728:34] ==> val condition: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDoWhileExpression[LocalVariableDescriptor]

'builder' @ [729:13] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'exitBlockScope' @ [729:21] ==> public abstract fun exitBlockScope(block: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [729:36] ==> value-parameter expression: KtDoWhileExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDoWhileExpression[ValueParameterDescriptorImpl]

'if (!CompileTimeConstantUtils.canBeReducedToBooleanConstant(condition, trace.bindingContext, true)) {
                builder.jumpOnTrue(loopInfo.entryPoint, expression, builder.getBoundValue(expression.condition))
            }
            else {
                assert(condition != null) { "Invalid do / while condition: " + expression.text }
                createSyntheticValue(condition!!, MagicKind.VALUE_CONSUMER, condition)
                builder.jump(loopInfo.entryPoint, expression)
            }' @ [730:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [730:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'canBeReducedToBooleanConstant' @ [730:43] ==> public open fun canBeReducedToBooleanConstant(@Nullable expression: KtExpression?, @NotNull context: BindingContext, @Nullable expectedValue: Boolean?): Boolean defined in org.jetbrains.kotlin.resolve.CompileTimeConstantUtils[JavaMethodDescriptor]

'condition' @ [730:73] ==> val condition: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDoWhileExpression[LocalVariableDescriptor]

'trace' @ [730:84] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[PropertyDescriptorImpl]

'bindingContext' @ [730:90] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'builder' @ [731:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'jumpOnTrue' @ [731:25] ==> public abstract fun jumpOnTrue(label: Label, element: KtElement, conditionValue: PseudoValue?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'loopInfo' @ [731:36] ==> val loopInfo: LoopInfo defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDoWhileExpression[LocalVariableDescriptor]

'entryPoint' @ [731:45] ==> public final val entryPoint: Label defined in org.jetbrains.kotlin.cfg.LoopInfo[PropertyDescriptorImpl]

'expression' @ [731:57] ==> value-parameter expression: KtDoWhileExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDoWhileExpression[ValueParameterDescriptorImpl]

'builder' @ [731:69] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'getBoundValue' @ [731:77] ==> public abstract fun getBoundValue(element: KtElement?): PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [731:91] ==> value-parameter expression: KtDoWhileExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDoWhileExpression[ValueParameterDescriptorImpl]

'condition' @ [731:102] ==> public final val KtDoWhileExpression.condition: KtExpression?[MyPropertyDescriptor]

'assert' @ [734:17] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'condition' @ [734:24] ==> val condition: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDoWhileExpression[LocalVariableDescriptor]

'+' @ [734:45] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'expression' @ [734:80] ==> value-parameter expression: KtDoWhileExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDoWhileExpression[ValueParameterDescriptorImpl]

'text' @ [734:91] ==> public final val KtDoWhileExpression.text: (String..String?)[MyPropertyDescriptor]

'createSyntheticValue' @ [735:17] ==> private final fun createSyntheticValue(instructionElement: KtElement, kind: MagicKind, vararg from: KtElement): PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'condition' @ [735:38] ==> val condition: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDoWhileExpression[LocalVariableDescriptor]

'VALUE_CONSUMER' @ [735:61] ==> enum entry VALUE_CONSUMER defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'condition' @ [735:77] ==> val condition: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDoWhileExpression[LocalVariableDescriptor]

'builder' @ [736:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'jump' @ [736:25] ==> public abstract fun jump(label: Label, element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'loopInfo' @ [736:30] ==> val loopInfo: LoopInfo defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDoWhileExpression[LocalVariableDescriptor]

'entryPoint' @ [736:39] ==> public final val entryPoint: Label defined in org.jetbrains.kotlin.cfg.LoopInfo[PropertyDescriptorImpl]

'expression' @ [736:51] ==> value-parameter expression: KtDoWhileExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDoWhileExpression[ValueParameterDescriptorImpl]

'builder' @ [738:13] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'bindLabel' @ [738:21] ==> public abstract fun bindLabel(label: Label): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'loopInfo' @ [738:31] ==> val loopInfo: LoopInfo defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDoWhileExpression[LocalVariableDescriptor]

'exitPoint' @ [738:40] ==> public final val exitPoint: Label defined in org.jetbrains.kotlin.cfg.LoopInfo[PropertyDescriptorImpl]

'builder' @ [739:13] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'loadUnit' @ [739:21] ==> public abstract fun loadUnit(expression: KtExpression): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [739:30] ==> value-parameter expression: KtDoWhileExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDoWhileExpression[ValueParameterDescriptorImpl]

'builder' @ [743:13] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'enterBlockScope' @ [743:21] ==> public abstract fun enterBlockScope(block: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [743:37] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitForExpression[ValueParameterDescriptorImpl]

'expression' @ [745:29] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitForExpression[ValueParameterDescriptorImpl]

'loopRange' @ [745:40] ==> public final val KtForExpression.loopRange: KtExpression?[MyPropertyDescriptor]

'generateInstructions' @ [746:13] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'loopRange' @ [746:34] ==> val loopRange: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitForExpression[LocalVariableDescriptor]

'generateLoopConventionCall' @ [747:13] ==> private final fun generateLoopConventionCall(loopRange: KtExpression?, callSlice: ReadOnlySlice<KtExpression, ResolvedCall<FunctionDescriptor>>): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'loopRange' @ [747:40] ==> val loopRange: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitForExpression[LocalVariableDescriptor]

'LOOP_RANGE_ITERATOR_RESOLVED_CALL' @ [747:66] ==> public final val LOOP_RANGE_ITERATOR_RESOLVED_CALL: (WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'declareLoopParameter' @ [748:13] ==> private final fun declareLoopParameter(expression: KtForExpression): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [748:34] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitForExpression[ValueParameterDescriptorImpl]

'builder' @ [751:28] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'enterLoop' @ [751:36] ==> public abstract fun enterLoop(expression: KtLoopExpression): LoopInfo defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [751:46] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitForExpression[ValueParameterDescriptorImpl]

'builder' @ [753:13] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'bindLabel' @ [753:21] ==> public abstract fun bindLabel(label: Label): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'loopInfo' @ [753:31] ==> val loopInfo: LoopInfo defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitForExpression[LocalVariableDescriptor]

'conditionEntryPoint' @ [753:40] ==> public final val conditionEntryPoint: Label defined in org.jetbrains.kotlin.cfg.LoopInfo[PropertyDescriptorImpl]

'generateLoopConventionCall' @ [754:13] ==> private final fun generateLoopConventionCall(loopRange: KtExpression?, callSlice: ReadOnlySlice<KtExpression, ResolvedCall<FunctionDescriptor>>): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'loopRange' @ [754:40] ==> val loopRange: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitForExpression[LocalVariableDescriptor]

'LOOP_RANGE_HAS_NEXT_RESOLVED_CALL' @ [754:66] ==> public final val LOOP_RANGE_HAS_NEXT_RESOLVED_CALL: (WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'builder' @ [755:13] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'nondeterministicJump' @ [755:21] ==> public abstract fun nondeterministicJump(label: Label, element: KtElement, inputValue: PseudoValue?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'loopInfo' @ [755:42] ==> val loopInfo: LoopInfo defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitForExpression[LocalVariableDescriptor]

'exitPoint' @ [755:51] ==> public final val exitPoint: Label defined in org.jetbrains.kotlin.cfg.LoopInfo[PropertyDescriptorImpl]

'expression' @ [755:62] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitForExpression[ValueParameterDescriptorImpl]

'generateLoopConventionCall' @ [756:13] ==> private final fun generateLoopConventionCall(loopRange: KtExpression?, callSlice: ReadOnlySlice<KtExpression, ResolvedCall<FunctionDescriptor>>): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'loopRange' @ [756:40] ==> val loopRange: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitForExpression[LocalVariableDescriptor]

'LOOP_RANGE_NEXT_RESOLVED_CALL' @ [756:66] ==> public final val LOOP_RANGE_NEXT_RESOLVED_CALL: (WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'writeLoopParameterAssignment' @ [758:13] ==> private final fun writeLoopParameterAssignment(expression: KtForExpression): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [758:42] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitForExpression[ValueParameterDescriptorImpl]

'mark' @ [760:13] ==> private final fun mark(element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [760:18] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitForExpression[ValueParameterDescriptorImpl]

'builder' @ [761:13] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'enterLoopBody' @ [761:21] ==> public abstract fun enterLoopBody(expression: KtLoopExpression): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [761:35] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitForExpression[ValueParameterDescriptorImpl]

'generateInstructions' @ [762:13] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [762:34] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitForExpression[ValueParameterDescriptorImpl]

'body' @ [762:45] ==> public final val KtForExpression.body: KtExpression?[MyPropertyDescriptor]

'builder' @ [763:13] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'jump' @ [763:21] ==> public abstract fun jump(label: Label, element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'loopInfo' @ [763:26] ==> val loopInfo: LoopInfo defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitForExpression[LocalVariableDescriptor]

'entryPoint' @ [763:35] ==> public final val entryPoint: Label defined in org.jetbrains.kotlin.cfg.LoopInfo[PropertyDescriptorImpl]

'expression' @ [763:47] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitForExpression[ValueParameterDescriptorImpl]

'builder' @ [765:13] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'exitLoopBody' @ [765:21] ==> public abstract fun exitLoopBody(expression: KtLoopExpression): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [765:34] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitForExpression[ValueParameterDescriptorImpl]

'builder' @ [766:13] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'bindLabel' @ [766:21] ==> public abstract fun bindLabel(label: Label): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'loopInfo' @ [766:31] ==> val loopInfo: LoopInfo defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitForExpression[LocalVariableDescriptor]

'exitPoint' @ [766:40] ==> public final val exitPoint: Label defined in org.jetbrains.kotlin.cfg.LoopInfo[PropertyDescriptorImpl]

'builder' @ [767:13] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'loadUnit' @ [767:21] ==> public abstract fun loadUnit(expression: KtExpression): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [767:30] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitForExpression[ValueParameterDescriptorImpl]

'builder' @ [768:13] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'exitBlockScope' @ [768:21] ==> public abstract fun exitBlockScope(block: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [768:36] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitForExpression[ValueParameterDescriptorImpl]

'loopRange' @ [775:17] ==> value-parameter loopRange: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateLoopConventionCall[ValueParameterDescriptorImpl]

'trace' @ [776:32] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[PropertyDescriptorImpl]

'bindingContext' @ [776:38] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'callSlice' @ [776:53] ==> value-parameter callSlice: ReadOnlySlice<KtExpression, ResolvedCall<FunctionDescriptor>> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateLoopConventionCall[ValueParameterDescriptorImpl]

'loopRange' @ [776:64] ==> value-parameter loopRange: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateLoopConventionCall[ValueParameterDescriptorImpl]

'generateCall' @ [777:13] ==> private final fun generateCall(resolvedCall: ResolvedCall<*>): InstructionWithValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [777:26] ==> val resolvedCall: ResolvedCall<FunctionDescriptor> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateLoopConventionCall[LocalVariableDescriptor]

'expression' @ [781:33] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.declareLoopParameter[ValueParameterDescriptorImpl]

'loopParameter' @ [781:44] ==> public final val KtForExpression.loopParameter: KtParameter?[MyPropertyDescriptor]

'loopParameter' @ [782:17] ==> val loopParameter: KtParameter? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.declareLoopParameter[LocalVariableDescriptor]

'loopParameter' @ [783:48] ==> val loopParameter: KtParameter? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.declareLoopParameter[LocalVariableDescriptor]

'destructuringDeclaration' @ [783:62] ==> public final val KtParameter.destructuringDeclaration: KtDestructuringDeclaration?[MyPropertyDescriptor]

'if (destructuringDeclaration != null) {
                    visitDestructuringDeclaration(destructuringDeclaration, false)
                }
                else {
                    builder.declareParameter(loopParameter)
                }' @ [784:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'destructuringDeclaration' @ [784:21] ==> val destructuringDeclaration: KtDestructuringDeclaration? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.declareLoopParameter[LocalVariableDescriptor]

'visitDestructuringDeclaration' @ [785:21] ==> private final fun visitDestructuringDeclaration(declaration: KtDestructuringDeclaration, generateWriteForEntries: Boolean): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'destructuringDeclaration' @ [785:51] ==> val destructuringDeclaration: KtDestructuringDeclaration? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.declareLoopParameter[LocalVariableDescriptor]

'builder' @ [788:21] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'declareParameter' @ [788:29] ==> public abstract fun declareParameter(parameter: KtParameter): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'loopParameter' @ [788:46] ==> val loopParameter: KtParameter? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.declareLoopParameter[LocalVariableDescriptor]

'expression' @ [794:33] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.writeLoopParameterAssignment[ValueParameterDescriptorImpl]

'loopParameter' @ [794:44] ==> public final val KtForExpression.loopParameter: KtParameter?[MyPropertyDescriptor]

'expression' @ [795:29] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.writeLoopParameterAssignment[ValueParameterDescriptorImpl]

'loopRange' @ [795:40] ==> public final val KtForExpression.loopRange: KtExpression?[MyPropertyDescriptor]

'builder' @ [797:25] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'magic' @ [797:33] ==> public abstract fun magic(instructionElement: KtElement, valueElement: KtElement?, inputValues: List<PseudoValue>, kind: MagicKind): MagicInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'loopRange' @ [798:21] ==> val loopRange: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.writeLoopParameterAssignment[LocalVariableDescriptor]

'expression' @ [798:34] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.writeLoopParameterAssignment[ValueParameterDescriptorImpl]

'createMaybeSingletonList' @ [800:35] ==> @NotNull @Contract public open fun <T : (Any..Any?)> createMaybeSingletonList(@Nullable p0: PseudoValue?): (MutableList<(PseudoValue..PseudoValue?)>..List<(PseudoValue..PseudoValue?)>) defined in com.intellij.util.containers.ContainerUtil[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PseudoValue

'builder' @ [800:60] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'getBoundValue' @ [800:68] ==> public abstract fun getBoundValue(element: KtElement?): PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'loopRange' @ [800:82] ==> val loopRange: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.writeLoopParameterAssignment[LocalVariableDescriptor]

'LOOP_RANGE_ITERATION' @ [801:31] ==> enum entry LOOP_RANGE_ITERATION defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'outputValue' @ [802:15] ==> public open val outputValue: PseudoValue defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction[PropertyDescriptorImpl]

'loopParameter' @ [804:17] ==> val loopParameter: KtParameter? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.writeLoopParameterAssignment[LocalVariableDescriptor]

'loopParameter' @ [805:48] ==> val loopParameter: KtParameter? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.writeLoopParameterAssignment[LocalVariableDescriptor]

'destructuringDeclaration' @ [805:62] ==> public final val KtParameter.destructuringDeclaration: KtDestructuringDeclaration?[MyPropertyDescriptor]

'if (destructuringDeclaration != null) {
                    for (entry in destructuringDeclaration.entries) {
                        generateInitializer(entry, value)
                    }
                }
                else {
                    generateInitializer(loopParameter, value)
                }' @ [806:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'destructuringDeclaration' @ [806:21] ==> val destructuringDeclaration: KtDestructuringDeclaration? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.writeLoopParameterAssignment[LocalVariableDescriptor]

'destructuringDeclaration' @ [807:35] ==> val destructuringDeclaration: KtDestructuringDeclaration? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.writeLoopParameterAssignment[LocalVariableDescriptor]

'entries' @ [807:60] ==> public final val KtDestructuringDeclaration.entries: (MutableList<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>..List<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>)[MyPropertyDescriptor]

'generateInitializer' @ [808:25] ==> private final fun generateInitializer(declaration: KtDeclaration, initValue: PseudoValue): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'entry' @ [808:45] ==> val entry: (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.writeLoopParameterAssignment[LocalVariableDescriptor]

'value' @ [808:52] ==> val value: PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.writeLoopParameterAssignment[LocalVariableDescriptor]

'generateInitializer' @ [812:21] ==> private final fun generateInitializer(declaration: KtDeclaration, initValue: PseudoValue): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'loopParameter' @ [812:41] ==> val loopParameter: KtParameter? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.writeLoopParameterAssignment[LocalVariableDescriptor]

'value' @ [812:56] ==> val value: PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.writeLoopParameterAssignment[LocalVariableDescriptor]

'getCorrespondingLoop' @ [818:24] ==> private final fun getCorrespondingLoop(expression: KtExpressionWithLabel): KtLoopExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [818:45] ==> value-parameter expression: KtBreakExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBreakExpression[ValueParameterDescriptorImpl]

'loop' @ [819:17] ==> val loop: KtLoopExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBreakExpression[LocalVariableDescriptor]

'jumpCrossesTryCatchBoundary' @ [820:21] ==> private final fun jumpCrossesTryCatchBoundary(jumpExpression: KtExpressionWithLabel, jumpTarget: PsiElement): Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [820:49] ==> value-parameter expression: KtBreakExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBreakExpression[ValueParameterDescriptorImpl]

'loop' @ [820:61] ==> val loop: KtLoopExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBreakExpression[LocalVariableDescriptor]

'generateJumpsToCatchAndFinally' @ [821:21] ==> private final fun generateJumpsToCatchAndFinally(): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'jumpDoesNotCrossFunctionBoundary' @ [823:21] ==> private final fun jumpDoesNotCrossFunctionBoundary(jumpExpression: KtExpressionWithLabel, jumpTarget: KtLoopExpression): Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [823:54] ==> value-parameter expression: KtBreakExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBreakExpression[ValueParameterDescriptorImpl]

'loop' @ [823:66] ==> val loop: KtLoopExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBreakExpression[LocalVariableDescriptor]

'builder' @ [824:21] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'getLoopExitPoint' @ [824:29] ==> public abstract fun getLoopExitPoint(loop: KtLoopExpression): Label? defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'loop' @ [824:46] ==> val loop: KtLoopExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBreakExpression[LocalVariableDescriptor]

'let' @ [824:53] ==> @InlineOnly public inline fun <T, R> Label.let(block: (Label) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Label
    <R> -> Unit

'builder' @ [824:59] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'jump' @ [824:67] ==> public abstract fun jump(label: Label, element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'it' @ [824:72] ==> value-parameter it: Label defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBreakExpression.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [824:76] ==> value-parameter expression: KtBreakExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBreakExpression[ValueParameterDescriptorImpl]

'getCorrespondingLoop' @ [830:24] ==> private final fun getCorrespondingLoop(expression: KtExpressionWithLabel): KtLoopExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [830:45] ==> value-parameter expression: KtContinueExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitContinueExpression[ValueParameterDescriptorImpl]

'loop' @ [831:17] ==> val loop: KtLoopExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitContinueExpression[LocalVariableDescriptor]

'jumpCrossesTryCatchBoundary' @ [832:21] ==> private final fun jumpCrossesTryCatchBoundary(jumpExpression: KtExpressionWithLabel, jumpTarget: PsiElement): Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [832:49] ==> value-parameter expression: KtContinueExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitContinueExpression[ValueParameterDescriptorImpl]

'loop' @ [832:61] ==> val loop: KtLoopExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitContinueExpression[LocalVariableDescriptor]

'generateJumpsToCatchAndFinally' @ [833:21] ==> private final fun generateJumpsToCatchAndFinally(): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'jumpDoesNotCrossFunctionBoundary' @ [835:21] ==> private final fun jumpDoesNotCrossFunctionBoundary(jumpExpression: KtExpressionWithLabel, jumpTarget: KtLoopExpression): Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [835:54] ==> value-parameter expression: KtContinueExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitContinueExpression[ValueParameterDescriptorImpl]

'loop' @ [835:66] ==> val loop: KtLoopExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitContinueExpression[LocalVariableDescriptor]

'builder' @ [836:21] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'getLoopConditionEntryPoint' @ [836:29] ==> public abstract fun getLoopConditionEntryPoint(loop: KtLoopExpression): Label? defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'loop' @ [836:56] ==> val loop: KtLoopExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitContinueExpression[LocalVariableDescriptor]

'let' @ [836:63] ==> @InlineOnly public inline fun <T, R> Label.let(block: (Label) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Label
    <R> -> Unit

'builder' @ [836:69] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'jump' @ [836:77] ==> public abstract fun jump(label: Label, element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'it' @ [836:82] ==> value-parameter it: Label defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitContinueExpression.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [836:86] ==> value-parameter expression: KtContinueExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitContinueExpression[ValueParameterDescriptorImpl]

'expression' @ [841:74] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getNearestLoopExpression[ValueParameterDescriptorImpl]

'getStrictParentOfType' @ [841:85] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtLoopExpression? defined in org.jetbrains.kotlin.psi.psiUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KtLoopExpression

'getNearestLoopExpression' @ [844:30] ==> private final fun getNearestLoopExpression(expression: KtExpression): KtLoopExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [844:55] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getCorrespondingLoopWithoutLabel[ValueParameterDescriptorImpl]

'parentLoop' @ [845:30] ==> val parentLoop: KtLoopExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getCorrespondingLoopWithoutLabel[LocalVariableDescriptor]

'body' @ [845:41] ==> public final val KtLoopExpression.body: KtExpression?[MyPropertyDescriptor]

'if (parentBody != null && parentBody.textRange.contains(expression.textRange)) {
                parentLoop
            }
            else {
                getNearestLoopExpression(parentLoop)
            }' @ [846:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtLoopExpression?, elseBranch: KtLoopExpression?): KtLoopExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtLoopExpression?

'parentBody' @ [846:24] ==> val parentBody: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getCorrespondingLoopWithoutLabel[LocalVariableDescriptor]

'parentBody' @ [846:46] ==> val parentBody: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getCorrespondingLoopWithoutLabel[LocalVariableDescriptor]

'textRange' @ [846:57] ==> public final val KtExpression.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'contains' @ [846:67] ==> public open operator fun contains(@NotNull p0: TextRange): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'expression' @ [846:76] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getCorrespondingLoopWithoutLabel[ValueParameterDescriptorImpl]

'textRange' @ [846:87] ==> public final val KtExpression.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'parentLoop' @ [847:17] ==> val parentLoop: KtLoopExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getCorrespondingLoopWithoutLabel[LocalVariableDescriptor]

'getNearestLoopExpression' @ [850:17] ==> private final fun getNearestLoopExpression(expression: KtExpression): KtLoopExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'parentLoop' @ [850:42] ==> val parentLoop: KtLoopExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getCorrespondingLoopWithoutLabel[LocalVariableDescriptor]

'expression' @ [855:29] ==> value-parameter expression: KtExpressionWithLabel defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getCorrespondingLoop[ValueParameterDescriptorImpl]

'getLabelName' @ [855:40] ==> public final fun getLabelName(): String? defined in org.jetbrains.kotlin.psi.KtExpressionWithLabel[SimpleFunctionDescriptorImpl]

'if (labelName != null) {
                val targetLabel = expression.getTargetLabel()!!
                val labeledElement = trace.get(BindingContext.LABEL_TARGET, targetLabel)
                loop = if (labeledElement is KtLoopExpression) {
                    labeledElement
                }
                else {
                    trace.report(NOT_A_LOOP_LABEL.on(expression, targetLabel.text))
                    null
                }
            }
            else {
                loop = getCorrespondingLoopWithoutLabel(expression)
                if (loop == null) {
                    trace.report(BREAK_OR_CONTINUE_OUTSIDE_A_LOOP.on(expression))
                }
                else {
                    val whenExpression = PsiTreeUtil.getParentOfType(expression, KtWhenExpression::class.java, true,
                                                                     KtLoopExpression::class.java)
                    if (whenExpression != null) {
                        trace.report(BREAK_OR_CONTINUE_IN_WHEN.on(expression))
                    }
                }
            }' @ [857:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'labelName' @ [857:17] ==> val labelName: String? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getCorrespondingLoop[LocalVariableDescriptor]

'expression' @ [858:35] ==> value-parameter expression: KtExpressionWithLabel defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getCorrespondingLoop[ValueParameterDescriptorImpl]

'getTargetLabel' @ [858:46] ==> public final fun getTargetLabel(): KtSimpleNameExpression? defined in org.jetbrains.kotlin.psi.KtExpressionWithLabel[SimpleFunctionDescriptorImpl]

'trace' @ [859:38] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[PropertyDescriptorImpl]

'get' @ [859:44] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (PsiElement..PsiElement?)>..ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (PsiElement..PsiElement?)>?), key: (KtReferenceExpression..KtReferenceExpression?)): PsiElement? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtReferenceExpression
    <V : (Any..Any?)> -> PsiElement

'LABEL_TARGET' @ [859:63] ==> public final val LABEL_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (PsiElement..PsiElement?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'targetLabel' @ [859:77] ==> val targetLabel: KtSimpleNameExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getCorrespondingLoop[LocalVariableDescriptor]

'loop' @ [860:17] ==> val loop: KtLoopExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getCorrespondingLoop[LocalVariableDescriptor]

'if (labeledElement is KtLoopExpression) {
                    labeledElement
                }
                else {
                    trace.report(NOT_A_LOOP_LABEL.on(expression, targetLabel.text))
                    null
                }' @ [860:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtLoopExpression?, elseBranch: KtLoopExpression?): KtLoopExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtLoopExpression?

'labeledElement' @ [860:28] ==> val labeledElement: PsiElement? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getCorrespondingLoop[LocalVariableDescriptor]

'labeledElement' @ [861:21] ==> val labeledElement: PsiElement? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getCorrespondingLoop[LocalVariableDescriptor]

'trace' @ [864:21] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[PropertyDescriptorImpl]

'report' @ [864:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'NOT_A_LOOP_LABEL' @ [864:34] ==> public final val NOT_A_LOOP_LABEL: (DiagnosticFactory1<(KtExpressionWithLabel..KtExpressionWithLabel?), (String..String?)>..DiagnosticFactory1<(KtExpressionWithLabel..KtExpressionWithLabel?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [864:51] ==> @NotNull public open fun on(@NotNull element: KtExpressionWithLabel, @NotNull argument: String): ParametrizedDiagnostic<(KtExpressionWithLabel..KtExpressionWithLabel?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'expression' @ [864:54] ==> value-parameter expression: KtExpressionWithLabel defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getCorrespondingLoop[ValueParameterDescriptorImpl]

'targetLabel' @ [864:66] ==> val targetLabel: KtSimpleNameExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getCorrespondingLoop[LocalVariableDescriptor]

'text' @ [864:78] ==> public final val KtSimpleNameExpression.text: (String..String?)[MyPropertyDescriptor]

'loop' @ [869:17] ==> val loop: KtLoopExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getCorrespondingLoop[LocalVariableDescriptor]

'getCorrespondingLoopWithoutLabel' @ [869:24] ==> private final fun getCorrespondingLoopWithoutLabel(expression: KtExpression): KtLoopExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [869:57] ==> value-parameter expression: KtExpressionWithLabel defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getCorrespondingLoop[ValueParameterDescriptorImpl]

'if (loop == null) {
                    trace.report(BREAK_OR_CONTINUE_OUTSIDE_A_LOOP.on(expression))
                }
                else {
                    val whenExpression = PsiTreeUtil.getParentOfType(expression, KtWhenExpression::class.java, true,
                                                                     KtLoopExpression::class.java)
                    if (whenExpression != null) {
                        trace.report(BREAK_OR_CONTINUE_IN_WHEN.on(expression))
                    }
                }' @ [870:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'loop' @ [870:21] ==> val loop: KtLoopExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getCorrespondingLoop[LocalVariableDescriptor]

'trace' @ [871:21] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[PropertyDescriptorImpl]

'report' @ [871:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'BREAK_OR_CONTINUE_OUTSIDE_A_LOOP' @ [871:34] ==> public final val BREAK_OR_CONTINUE_OUTSIDE_A_LOOP: (DiagnosticFactory0<(KtExpressionWithLabel..KtExpressionWithLabel?)>..DiagnosticFactory0<(KtExpressionWithLabel..KtExpressionWithLabel?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [871:67] ==> @NotNull public open fun on(@NotNull element: KtExpressionWithLabel): SimpleDiagnostic<(KtExpressionWithLabel..KtExpressionWithLabel?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'expression' @ [871:70] ==> value-parameter expression: KtExpressionWithLabel defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getCorrespondingLoop[ValueParameterDescriptorImpl]

'getParentOfType' @ [874:54] ==> @SafeVarargs @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(KtWhenExpression..KtWhenExpression?)>, p2: Boolean, @NotNull vararg p3: (Class<out (PsiElement..PsiElement?)>..Class<out (PsiElement..PsiElement?)>?)): KtWhenExpression? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtWhenExpression

'expression' @ [874:70] ==> value-parameter expression: KtExpressionWithLabel defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getCorrespondingLoop[ValueParameterDescriptorImpl]

'KtWhenExpression' @ [874:82] ==> public constructor KtWhenExpression(@NotNull node: ASTNode) defined in org.jetbrains.kotlin.psi.KtWhenExpression[JavaClassConstructorDescriptor]

'java' @ [874:106] ==> public val <T> KClass<KtWhenExpression>.java: Class<KtWhenExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtWhenExpression

'KtLoopExpression' @ [875:70] ==> public constructor KtLoopExpression(@NotNull node: ASTNode) defined in org.jetbrains.kotlin.psi.KtLoopExpression[JavaClassConstructorDescriptor]

'java' @ [875:94] ==> public val <T> KClass<KtLoopExpression>.java: Class<KtLoopExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtLoopExpression

'whenExpression' @ [876:25] ==> val whenExpression: KtWhenExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getCorrespondingLoop[LocalVariableDescriptor]

'trace' @ [877:25] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[PropertyDescriptorImpl]

'report' @ [877:31] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'BREAK_OR_CONTINUE_IN_WHEN' @ [877:38] ==> public final val BREAK_OR_CONTINUE_IN_WHEN: (DiagnosticFactory0<(KtExpressionWithLabel..KtExpressionWithLabel?)>..DiagnosticFactory0<(KtExpressionWithLabel..KtExpressionWithLabel?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [877:64] ==> @NotNull public open fun on(@NotNull element: KtExpressionWithLabel): SimpleDiagnostic<(KtExpressionWithLabel..KtExpressionWithLabel?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'expression' @ [877:67] ==> value-parameter expression: KtExpressionWithLabel defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getCorrespondingLoop[ValueParameterDescriptorImpl]

'loop' @ [881:13] ==> val loop: KtLoopExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getCorrespondingLoop[LocalVariableDescriptor]

'body' @ [881:19] ==> public final val KtLoopExpression.body: KtExpression?[MyPropertyDescriptor]

'let' @ [881:25] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> Unit

'!' @ [882:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [882:22] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getCorrespondingLoop.<anonymous>[ValueParameterDescriptorImpl]

'textRange' @ [882:25] ==> public final val KtExpression.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'contains' @ [882:35] ==> public open operator fun contains(@NotNull p0: TextRange): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'expression' @ [882:44] ==> value-parameter expression: KtExpressionWithLabel defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getCorrespondingLoop[ValueParameterDescriptorImpl]

'textRange' @ [882:55] ==> public final val KtExpressionWithLabel.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'trace' @ [883:21] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[PropertyDescriptorImpl]

'report' @ [883:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'BREAK_OR_CONTINUE_OUTSIDE_A_LOOP' @ [883:34] ==> public final val BREAK_OR_CONTINUE_OUTSIDE_A_LOOP: (DiagnosticFactory0<(KtExpressionWithLabel..KtExpressionWithLabel?)>..DiagnosticFactory0<(KtExpressionWithLabel..KtExpressionWithLabel?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [883:67] ==> @NotNull public open fun on(@NotNull element: KtExpressionWithLabel): SimpleDiagnostic<(KtExpressionWithLabel..KtExpressionWithLabel?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'expression' @ [883:70] ==> value-parameter expression: KtExpressionWithLabel defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getCorrespondingLoop[ValueParameterDescriptorImpl]

'loop' @ [887:20] ==> val loop: KtLoopExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getCorrespondingLoop[LocalVariableDescriptor]

'returnExpression' @ [891:31] ==> value-parameter returnExpression: KtReturnExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.returnCrossesTryCatchBoundary[ValueParameterDescriptorImpl]

'getTargetLabel' @ [891:48] ==> public final fun getTargetLabel(): KtSimpleNameExpression? defined in org.jetbrains.kotlin.psi.KtReturnExpression[SimpleFunctionDescriptorImpl]

'trace' @ [892:34] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[PropertyDescriptorImpl]

'get' @ [892:40] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (PsiElement..PsiElement?)>..ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (PsiElement..PsiElement?)>?), key: (KtReferenceExpression..KtReferenceExpression?)): PsiElement? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtReferenceExpression
    <V : (Any..Any?)> -> PsiElement

'LABEL_TARGET' @ [892:59] ==> public final val LABEL_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (PsiElement..PsiElement?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'targetLabel' @ [892:73] ==> val targetLabel: KtSimpleNameExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.returnCrossesTryCatchBoundary[LocalVariableDescriptor]

'jumpCrossesTryCatchBoundary' @ [893:20] ==> private final fun jumpCrossesTryCatchBoundary(jumpExpression: KtExpressionWithLabel, jumpTarget: PsiElement): Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'returnExpression' @ [893:48] ==> value-parameter returnExpression: KtReturnExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.returnCrossesTryCatchBoundary[ValueParameterDescriptorImpl]

'labeledElement' @ [893:66] ==> val labeledElement: PsiElement defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.returnCrossesTryCatchBoundary[LocalVariableDescriptor]

'jumpExpression' @ [897:27] ==> value-parameter jumpExpression: KtExpressionWithLabel defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.jumpCrossesTryCatchBoundary[ValueParameterDescriptorImpl]

'parent' @ [897:42] ==> public final val KtExpressionWithLabel.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (current) {
                    jumpTarget -> return false
                    is KtTryExpression -> return true
                    else -> current = current.parent
                }' @ [899:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'current' @ [899:23] ==> var current: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.jumpCrossesTryCatchBoundary[LocalVariableDescriptor]

'jumpTarget' @ [900:21] ==> value-parameter jumpTarget: PsiElement defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.jumpCrossesTryCatchBoundary[ValueParameterDescriptorImpl]

'current' @ [902:29] ==> var current: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.jumpCrossesTryCatchBoundary[LocalVariableDescriptor]

'current' @ [902:39] ==> var current: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.jumpCrossesTryCatchBoundary[LocalVariableDescriptor]

'parent' @ [902:47] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'trace' @ [908:34] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[PropertyDescriptorImpl]

'bindingContext' @ [908:40] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'getEnclosingFunctionDescriptor' @ [910:62] ==> @Nullable public open fun getEnclosingFunctionDescriptor(@NotNull context: BindingContext, @NotNull element: KtElement): FunctionDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContextUtils[JavaMethodDescriptor]

'bindingContext' @ [910:93] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.jumpDoesNotCrossFunctionBoundary[LocalVariableDescriptor]

'jumpExpression' @ [910:109] ==> value-parameter jumpExpression: KtExpressionWithLabel defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.jumpDoesNotCrossFunctionBoundary[ValueParameterDescriptorImpl]

'getEnclosingFunctionDescriptor' @ [911:64] ==> @Nullable public open fun getEnclosingFunctionDescriptor(@NotNull context: BindingContext, @NotNull element: KtElement): FunctionDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContextUtils[JavaMethodDescriptor]

'bindingContext' @ [911:95] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.jumpDoesNotCrossFunctionBoundary[LocalVariableDescriptor]

'jumpTarget' @ [911:111] ==> value-parameter jumpTarget: KtLoopExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.jumpDoesNotCrossFunctionBoundary[ValueParameterDescriptorImpl]

'if (labelExprEnclosingFunc !== labelTargetEnclosingFunc) {
                // Check to report only once
                if (builder.getLoopExitPoint(jumpTarget) != null ||
                    // Local class secondary constructors are handled differently
                    // They are the only local class element NOT included in owner pseudocode
                    // See generateInitializersForScriptClassOrObject && generateDeclarationForLocalClassOrObjectIfNeeded
                    labelExprEnclosingFunc is ConstructorDescriptor && !labelExprEnclosingFunc.isPrimary) {
                    trace.report(BREAK_OR_CONTINUE_JUMPS_ACROSS_FUNCTION_BOUNDARY.on(jumpExpression))
                }
                false
            }
            else {
                true
            }' @ [912:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'labelExprEnclosingFunc' @ [912:24] ==> val labelExprEnclosingFunc: FunctionDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.jumpDoesNotCrossFunctionBoundary[LocalVariableDescriptor]

'labelTargetEnclosingFunc' @ [912:51] ==> val labelTargetEnclosingFunc: FunctionDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.jumpDoesNotCrossFunctionBoundary[LocalVariableDescriptor]

'builder' @ [914:21] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'getLoopExitPoint' @ [914:29] ==> public abstract fun getLoopExitPoint(loop: KtLoopExpression): Label? defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'jumpTarget' @ [914:46] ==> value-parameter jumpTarget: KtLoopExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.jumpDoesNotCrossFunctionBoundary[ValueParameterDescriptorImpl]

'labelExprEnclosingFunc' @ [918:21] ==> val labelExprEnclosingFunc: FunctionDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.jumpDoesNotCrossFunctionBoundary[LocalVariableDescriptor]

'!' @ [918:72] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'labelExprEnclosingFunc' @ [918:73] ==> val labelExprEnclosingFunc: FunctionDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.jumpDoesNotCrossFunctionBoundary[LocalVariableDescriptor]

'isPrimary' @ [918:96] ==> public final val ConstructorDescriptor.isPrimary: Boolean[MyPropertyDescriptor]

'trace' @ [919:21] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[PropertyDescriptorImpl]

'report' @ [919:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'BREAK_OR_CONTINUE_JUMPS_ACROSS_FUNCTION_BOUNDARY' @ [919:34] ==> public final val BREAK_OR_CONTINUE_JUMPS_ACROSS_FUNCTION_BOUNDARY: (DiagnosticFactory0<(KtExpressionWithLabel..KtExpressionWithLabel?)>..DiagnosticFactory0<(KtExpressionWithLabel..KtExpressionWithLabel?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [919:83] ==> @NotNull public open fun on(@NotNull element: KtExpressionWithLabel): SimpleDiagnostic<(KtExpressionWithLabel..KtExpressionWithLabel?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'jumpExpression' @ [919:86] ==> value-parameter jumpExpression: KtExpressionWithLabel defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.jumpDoesNotCrossFunctionBoundary[ValueParameterDescriptorImpl]

'returnCrossesTryCatchBoundary' @ [929:17] ==> private final fun returnCrossesTryCatchBoundary(returnExpression: KtReturnExpression): Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [929:47] ==> value-parameter expression: KtReturnExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitReturnExpression[ValueParameterDescriptorImpl]

'generateJumpsToCatchAndFinally' @ [930:17] ==> private final fun generateJumpsToCatchAndFinally(): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [932:38] ==> value-parameter expression: KtReturnExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitReturnExpression[ValueParameterDescriptorImpl]

'returnedExpression' @ [932:49] ==> public final val KtReturnExpression.returnedExpression: KtExpression?[MyPropertyDescriptor]

'returnedExpression' @ [933:17] ==> val returnedExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitReturnExpression[LocalVariableDescriptor]

'generateInstructions' @ [934:17] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'returnedExpression' @ [934:38] ==> val returnedExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitReturnExpression[LocalVariableDescriptor]

'expression' @ [936:32] ==> value-parameter expression: KtReturnExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitReturnExpression[ValueParameterDescriptorImpl]

'getTargetLabel' @ [936:43] ==> public final fun getTargetLabel(): KtSimpleNameExpression? defined in org.jetbrains.kotlin.psi.KtReturnExpression[SimpleFunctionDescriptorImpl]

'expression' @ [938:29] ==> value-parameter expression: KtReturnExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitReturnExpression[ValueParameterDescriptorImpl]

'getLabelName' @ [938:40] ==> public final fun getLabelName(): String? defined in org.jetbrains.kotlin.psi.KtReturnExpression[SimpleFunctionDescriptorImpl]

'subroutine' @ [939:13] ==> val subroutine: KtElement? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitReturnExpression[LocalVariableDescriptor]

'if (labelElement != null && labelName != null) {
                val labeledElement = trace.get(BindingContext.LABEL_TARGET, labelElement)
                if (labeledElement != null) {
                    assert(labeledElement is KtElement)
                    labeledElement as KtElement?
                }
                else {
                    null
                }
            }
            else {
                builder.returnSubroutine
                // TODO : a context check
            }' @ [939:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtElement?, elseBranch: KtElement?): KtElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtElement?

'labelElement' @ [939:30] ==> val labelElement: KtSimpleNameExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitReturnExpression[LocalVariableDescriptor]

'labelName' @ [939:54] ==> val labelName: String? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitReturnExpression[LocalVariableDescriptor]

'trace' @ [940:38] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[PropertyDescriptorImpl]

'get' @ [940:44] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (PsiElement..PsiElement?)>..ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (PsiElement..PsiElement?)>?), key: (KtReferenceExpression..KtReferenceExpression?)): PsiElement? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtReferenceExpression
    <V : (Any..Any?)> -> PsiElement

'LABEL_TARGET' @ [940:63] ==> public final val LABEL_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (PsiElement..PsiElement?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'labelElement' @ [940:77] ==> val labelElement: KtSimpleNameExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitReturnExpression[LocalVariableDescriptor]

'if (labeledElement != null) {
                    assert(labeledElement is KtElement)
                    labeledElement as KtElement?
                }
                else {
                    null
                }' @ [941:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtElement?, elseBranch: KtElement?): KtElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtElement?

'labeledElement' @ [941:21] ==> val labeledElement: PsiElement? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitReturnExpression[LocalVariableDescriptor]

'assert' @ [942:21] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'labeledElement' @ [942:28] ==> val labeledElement: PsiElement? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitReturnExpression[LocalVariableDescriptor]

'labeledElement' @ [943:21] ==> val labeledElement: PsiElement? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitReturnExpression[LocalVariableDescriptor]

'builder' @ [950:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'returnSubroutine' @ [950:25] ==> public abstract val returnSubroutine: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[PropertyDescriptorImpl]

'if (subroutine is KtFunction || subroutine is KtPropertyAccessor) {
                val returnValue = if (returnedExpression != null) builder.getBoundValue(returnedExpression) else null
                if (returnValue == null) {
                    builder.returnNoValue(expression, subroutine)
                }
                else {
                    builder.returnValue(expression, returnValue, subroutine)
                }
            }
            else {
                createNonSyntheticValue(expression, MagicKind.UNSUPPORTED_ELEMENT, returnedExpression)
            }' @ [954:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'subroutine' @ [954:17] ==> val subroutine: KtElement? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitReturnExpression[LocalVariableDescriptor]

'subroutine' @ [954:45] ==> val subroutine: KtElement? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitReturnExpression[LocalVariableDescriptor]

'if (returnedExpression != null) builder.getBoundValue(returnedExpression) else null' @ [955:35] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PseudoValue?, elseBranch: PseudoValue?): PseudoValue?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PseudoValue?

'returnedExpression' @ [955:39] ==> val returnedExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitReturnExpression[LocalVariableDescriptor]

'builder' @ [955:67] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'getBoundValue' @ [955:75] ==> public abstract fun getBoundValue(element: KtElement?): PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'returnedExpression' @ [955:89] ==> val returnedExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitReturnExpression[LocalVariableDescriptor]

'if (returnValue == null) {
                    builder.returnNoValue(expression, subroutine)
                }
                else {
                    builder.returnValue(expression, returnValue, subroutine)
                }' @ [956:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'returnValue' @ [956:21] ==> val returnValue: PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitReturnExpression[LocalVariableDescriptor]

'builder' @ [957:21] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'returnNoValue' @ [957:29] ==> public abstract fun returnNoValue(returnExpression: KtReturnExpression, subroutine: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [957:43] ==> value-parameter expression: KtReturnExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitReturnExpression[ValueParameterDescriptorImpl]

'subroutine' @ [957:55] ==> val subroutine: KtElement? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitReturnExpression[LocalVariableDescriptor]

'builder' @ [960:21] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'returnValue' @ [960:29] ==> public abstract fun returnValue(returnExpression: KtExpression, returnValue: PseudoValue, subroutine: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [960:41] ==> value-parameter expression: KtReturnExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitReturnExpression[ValueParameterDescriptorImpl]

'returnValue' @ [960:53] ==> val returnValue: PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitReturnExpression[LocalVariableDescriptor]

'subroutine' @ [960:66] ==> val subroutine: KtElement? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitReturnExpression[LocalVariableDescriptor]

'createNonSyntheticValue' @ [964:17] ==> private final fun createNonSyntheticValue(to: KtElement, kind: MagicKind, vararg from: KtElement?): PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [964:41] ==> value-parameter expression: KtReturnExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitReturnExpression[ValueParameterDescriptorImpl]

'UNSUPPORTED_ELEMENT' @ [964:63] ==> enum entry UNSUPPORTED_ELEMENT defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'returnedExpression' @ [964:84] ==> val returnedExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitReturnExpression[LocalVariableDescriptor]

'builder' @ [969:13] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'declareParameter' @ [969:21] ==> public abstract fun declareParameter(parameter: KtParameter): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'parameter' @ [969:38] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitParameter[ValueParameterDescriptorImpl]

'parameter' @ [970:32] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitParameter[ValueParameterDescriptorImpl]

'defaultValue' @ [970:42] ==> public final val KtParameter.defaultValue: KtExpression?[MyPropertyDescriptor]

'defaultValue' @ [971:17] ==> val defaultValue: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitParameter[LocalVariableDescriptor]

'builder' @ [972:40] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'createUnboundLabel' @ [972:48] ==> public abstract fun createUnboundLabel(name: String): Label defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'parameter' @ [972:104] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitParameter[ValueParameterDescriptorImpl]

'name' @ [972:114] ==> public final val KtParameter.name: String?[MyPropertyDescriptor]

'builder' @ [973:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'nondeterministicJump' @ [973:25] ==> public abstract fun nondeterministicJump(label: Label, element: KtElement, inputValue: PseudoValue?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'skipDefaultValue' @ [973:46] ==> val skipDefaultValue: Label defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitParameter[LocalVariableDescriptor]

'defaultValue' @ [973:64] ==> val defaultValue: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitParameter[LocalVariableDescriptor]

'generateInstructions' @ [974:17] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'defaultValue' @ [974:38] ==> val defaultValue: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitParameter[LocalVariableDescriptor]

'builder' @ [975:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'bindLabel' @ [975:25] ==> public abstract fun bindLabel(label: Label): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'skipDefaultValue' @ [975:35] ==> val skipDefaultValue: Label defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitParameter[LocalVariableDescriptor]

'generateInitializer' @ [977:13] ==> private final fun generateInitializer(declaration: KtDeclaration, initValue: PseudoValue): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'parameter' @ [977:33] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitParameter[ValueParameterDescriptorImpl]

'computePseudoValueForParameter' @ [977:44] ==> private final fun computePseudoValueForParameter(parameter: KtParameter): PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'parameter' @ [977:75] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitParameter[ValueParameterDescriptorImpl]

'parameter' @ [979:13] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitParameter[ValueParameterDescriptorImpl]

'destructuringDeclaration' @ [979:23] ==> public final val KtParameter.destructuringDeclaration: KtDestructuringDeclaration?[MyPropertyDescriptor]

'let' @ [979:49] ==> @InlineOnly public inline fun <T, R> KtDestructuringDeclaration.let(block: (KtDestructuringDeclaration) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDestructuringDeclaration
    <R> -> Unit

'visitDestructuringDeclaration' @ [980:17] ==> private final fun visitDestructuringDeclaration(declaration: KtDestructuringDeclaration, generateWriteForEntries: Boolean): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'it' @ [980:47] ==> value-parameter it: KtDestructuringDeclaration defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitParameter.<anonymous>[ValueParameterDescriptorImpl]

'createSyntheticValue' @ [985:34] ==> private final fun createSyntheticValue(instructionElement: KtElement, kind: MagicKind, vararg from: KtElement): PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'parameter' @ [985:55] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.computePseudoValueForParameter[ValueParameterDescriptorImpl]

'FAKE_INITIALIZER' @ [985:76] ==> enum entry FAKE_INITIALIZER defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'builder' @ [986:32] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'getBoundValue' @ [986:40] ==> public abstract fun getBoundValue(element: KtElement?): PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'parameter' @ [986:54] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.computePseudoValueForParameter[ValueParameterDescriptorImpl]

'defaultValue' @ [986:64] ==> public final val KtParameter.defaultValue: KtExpression?[MyPropertyDescriptor]

'syntheticValue' @ [986:88] ==> val syntheticValue: PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.computePseudoValueForParameter[LocalVariableDescriptor]

'builder' @ [987:20] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'merge' @ [987:28] ==> public abstract fun merge(expression: KtExpression, inputValues: List<PseudoValue>): MergeInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'parameter' @ [987:34] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.computePseudoValueForParameter[ValueParameterDescriptorImpl]

'arrayListOf' @ [987:45] ==> public fun <T> arrayListOf(vararg elements: PseudoValue): ArrayList<PseudoValue> /* = ArrayList<PseudoValue> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PseudoValue

'defaultValue' @ [987:57] ==> val defaultValue: PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.computePseudoValueForParameter[LocalVariableDescriptor]

'syntheticValue' @ [987:71] ==> val syntheticValue: PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.computePseudoValueForParameter[LocalVariableDescriptor]

'outputValue' @ [987:88] ==> public open val outputValue: PseudoValue defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MergeInstruction[PropertyDescriptorImpl]

'!' @ [991:37] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isBlockInDoWhile' @ [991:38] ==> private final fun isBlockInDoWhile(expression: KtBlockExpression): Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [991:55] ==> value-parameter expression: KtBlockExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBlockExpression[ValueParameterDescriptorImpl]

'declareBlockScope' @ [992:17] ==> val declareBlockScope: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBlockExpression[LocalVariableDescriptor]

'builder' @ [993:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'enterBlockScope' @ [993:25] ==> public abstract fun enterBlockScope(block: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [993:41] ==> value-parameter expression: KtBlockExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBlockExpression[ValueParameterDescriptorImpl]

'mark' @ [995:13] ==> private final fun mark(element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [995:18] ==> value-parameter expression: KtBlockExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBlockExpression[ValueParameterDescriptorImpl]

'expression' @ [996:30] ==> value-parameter expression: KtBlockExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBlockExpression[ValueParameterDescriptorImpl]

'statements' @ [996:41] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'statements' @ [997:31] ==> val statements: List<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBlockExpression[LocalVariableDescriptor]

'statement' @ [998:40] ==> val statement: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBlockExpression[LocalVariableDescriptor]

'let' @ [998:72] ==> @InlineOnly public inline fun <T, R> KtClassOrObject.let(block: (KtClassOrObject) -> Label): Label defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassOrObject
    <R> -> Label

'builder' @ [998:78] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'createUnboundLabel' @ [998:86] ==> public abstract fun createUnboundLabel(name: String): Label defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'afterClassLabel' @ [999:21] ==> val afterClassLabel: Label? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBlockExpression[LocalVariableDescriptor]

'builder' @ [1000:21] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'nondeterministicJump' @ [1000:29] ==> public abstract fun nondeterministicJump(label: Label, element: KtElement, inputValue: PseudoValue?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'afterClassLabel' @ [1000:50] ==> val afterClassLabel: Label? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBlockExpression[LocalVariableDescriptor]

'statement' @ [1000:67] ==> val statement: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBlockExpression[LocalVariableDescriptor]

'generateInstructions' @ [1002:17] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'statement' @ [1002:38] ==> val statement: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBlockExpression[LocalVariableDescriptor]

'afterClassLabel' @ [1003:21] ==> val afterClassLabel: Label? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBlockExpression[LocalVariableDescriptor]

'builder' @ [1004:21] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'bindLabel' @ [1004:29] ==> public abstract fun bindLabel(label: Label): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'afterClassLabel' @ [1004:39] ==> val afterClassLabel: Label? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBlockExpression[LocalVariableDescriptor]

'if (statements.isEmpty()) {
                builder.loadUnit(expression)
            }
            else {
                copyValue(statements.lastOrNull(), expression)
            }' @ [1007:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'statements' @ [1007:17] ==> val statements: List<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBlockExpression[LocalVariableDescriptor]

'isEmpty' @ [1007:28] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'builder' @ [1008:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'loadUnit' @ [1008:25] ==> public abstract fun loadUnit(expression: KtExpression): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [1008:34] ==> value-parameter expression: KtBlockExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBlockExpression[ValueParameterDescriptorImpl]

'copyValue' @ [1011:17] ==> private final fun copyValue(from: KtElement?, to: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'statements' @ [1011:27] ==> val statements: List<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBlockExpression[LocalVariableDescriptor]

'lastOrNull' @ [1011:38] ==> public fun <T> List<(KtExpression..KtExpression?)>.lastOrNull(): KtExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'expression' @ [1011:52] ==> value-parameter expression: KtBlockExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBlockExpression[ValueParameterDescriptorImpl]

'declareBlockScope' @ [1013:17] ==> val declareBlockScope: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBlockExpression[LocalVariableDescriptor]

'builder' @ [1014:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'exitBlockScope' @ [1014:25] ==> public abstract fun exitBlockScope(block: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [1014:40] ==> value-parameter expression: KtBlockExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBlockExpression[ValueParameterDescriptorImpl]

'expression' @ [1019:26] ==> value-parameter expression: KtBlockExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.isBlockInDoWhile[ValueParameterDescriptorImpl]

'parent' @ [1019:37] ==> public final val KtBlockExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [1020:20] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.isBlockInDoWhile[LocalVariableDescriptor]

'parent' @ [1020:27] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'processLocalDeclaration' @ [1024:13] ==> private final fun processLocalDeclaration(subroutine: KtDeclaration): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[SimpleFunctionDescriptorImpl]

'function' @ [1024:37] ==> value-parameter function: KtFunction defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitFunction[ValueParameterDescriptorImpl]

'function' @ [1025:39] ==> value-parameter function: KtFunction defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitFunction[ValueParameterDescriptorImpl]

'function' @ [1025:72] ==> value-parameter function: KtFunction defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitFunction[ValueParameterDescriptorImpl]

'name' @ [1025:81] ==> public final val KtFunction.name: String?[MyPropertyDescriptor]

'isAnonymousFunction' @ [1026:17] ==> val isAnonymousFunction: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitFunction[LocalVariableDescriptor]

'function' @ [1026:40] ==> value-parameter function: KtFunction defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitFunction[ValueParameterDescriptorImpl]

'isLocal' @ [1026:49] ==> public final val KtFunction.isLocal: Boolean[MyPropertyDescriptor]

'function' @ [1026:60] ==> value-parameter function: KtFunction defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitFunction[ValueParameterDescriptorImpl]

'parent' @ [1026:69] ==> public final val KtFunction.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'builder' @ [1027:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'createLambda' @ [1027:25] ==> public abstract fun createLambda(expression: KtFunction): InstructionWithValue defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'function' @ [1027:38] ==> value-parameter function: KtFunction defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitFunction[ValueParameterDescriptorImpl]

'visitFunction' @ [1032:13] ==> private final fun visitFunction(function: KtFunction): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'function' @ [1032:27] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitNamedFunction[ValueParameterDescriptorImpl]

'mark' @ [1036:13] ==> private final fun mark(element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'lambdaExpression' @ [1036:18] ==> value-parameter lambdaExpression: KtLambdaExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitLambdaExpression[ValueParameterDescriptorImpl]

'lambdaExpression' @ [1037:35] ==> value-parameter lambdaExpression: KtLambdaExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitLambdaExpression[ValueParameterDescriptorImpl]

'functionLiteral' @ [1037:52] ==> public final val KtLambdaExpression.functionLiteral: KtFunctionLiteral[MyPropertyDescriptor]

'visitFunction' @ [1038:13] ==> private final fun visitFunction(function: KtFunction): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'functionLiteral' @ [1038:27] ==> val functionLiteral: KtFunctionLiteral defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitLambdaExpression[LocalVariableDescriptor]

'copyValue' @ [1039:13] ==> private final fun copyValue(from: KtElement?, to: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'functionLiteral' @ [1039:23] ==> val functionLiteral: KtFunctionLiteral defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitLambdaExpression[LocalVariableDescriptor]

'lambdaExpression' @ [1039:40] ==> value-parameter lambdaExpression: KtLambdaExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitLambdaExpression[ValueParameterDescriptorImpl]

'mark' @ [1043:13] ==> private final fun mark(element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [1043:18] ==> value-parameter expression: KtQualifiedExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitQualifiedExpression[ValueParameterDescriptorImpl]

'expression' @ [1044:38] ==> value-parameter expression: KtQualifiedExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitQualifiedExpression[ValueParameterDescriptorImpl]

'selectorExpression' @ [1044:49] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[PropertyDescriptorImpl]

'expression' @ [1045:38] ==> value-parameter expression: KtQualifiedExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitQualifiedExpression[ValueParameterDescriptorImpl]

'receiverExpression' @ [1045:49] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[PropertyDescriptorImpl]

'expression' @ [1046:24] ==> value-parameter expression: KtQualifiedExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitQualifiedExpression[ValueParameterDescriptorImpl]

'if (selectorExpression is KtCallExpression || selectorExpression is KtSimpleNameExpression) {
                if (!safe) {
                    generateInstructions(selectorExpression)
                }
                else {
                    val resultLabel = builder.createUnboundLabel("result of call")
                    builder.jumpOnFalse(resultLabel, expression, null)
                    generateInstructions(selectorExpression)
                    builder.bindLabel(resultLabel)
                }
                copyValue(selectorExpression, expression)
            }
            else {
                generateInstructions(receiverExpression)
                createNonSyntheticValue(expression, MagicKind.UNSUPPORTED_ELEMENT, receiverExpression)
            }' @ [1049:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'selectorExpression' @ [1049:17] ==> val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitQualifiedExpression[LocalVariableDescriptor]

'selectorExpression' @ [1049:59] ==> val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitQualifiedExpression[LocalVariableDescriptor]

'if (!safe) {
                    generateInstructions(selectorExpression)
                }
                else {
                    val resultLabel = builder.createUnboundLabel("result of call")
                    builder.jumpOnFalse(resultLabel, expression, null)
                    generateInstructions(selectorExpression)
                    builder.bindLabel(resultLabel)
                }' @ [1050:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [1050:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'safe' @ [1050:22] ==> val safe: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitQualifiedExpression[LocalVariableDescriptor]

'generateInstructions' @ [1051:21] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'selectorExpression' @ [1051:42] ==> val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitQualifiedExpression[LocalVariableDescriptor]

'builder' @ [1054:39] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'createUnboundLabel' @ [1054:47] ==> public abstract fun createUnboundLabel(name: String): Label defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'builder' @ [1055:21] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'jumpOnFalse' @ [1055:29] ==> public abstract fun jumpOnFalse(label: Label, element: KtElement, conditionValue: PseudoValue?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'resultLabel' @ [1055:41] ==> val resultLabel: Label defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitQualifiedExpression[LocalVariableDescriptor]

'expression' @ [1055:54] ==> value-parameter expression: KtQualifiedExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitQualifiedExpression[ValueParameterDescriptorImpl]

'generateInstructions' @ [1056:21] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'selectorExpression' @ [1056:42] ==> val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitQualifiedExpression[LocalVariableDescriptor]

'builder' @ [1057:21] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'bindLabel' @ [1057:29] ==> public abstract fun bindLabel(label: Label): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'resultLabel' @ [1057:39] ==> val resultLabel: Label defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitQualifiedExpression[LocalVariableDescriptor]

'copyValue' @ [1059:17] ==> private final fun copyValue(from: KtElement?, to: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'selectorExpression' @ [1059:27] ==> val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitQualifiedExpression[LocalVariableDescriptor]

'expression' @ [1059:47] ==> value-parameter expression: KtQualifiedExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitQualifiedExpression[ValueParameterDescriptorImpl]

'generateInstructions' @ [1062:17] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'receiverExpression' @ [1062:38] ==> val receiverExpression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitQualifiedExpression[LocalVariableDescriptor]

'createNonSyntheticValue' @ [1063:17] ==> private final fun createNonSyntheticValue(to: KtElement, kind: MagicKind, vararg from: KtElement?): PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [1063:41] ==> value-parameter expression: KtQualifiedExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitQualifiedExpression[ValueParameterDescriptorImpl]

'UNSUPPORTED_ELEMENT' @ [1063:63] ==> enum entry UNSUPPORTED_ELEMENT defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'receiverExpression' @ [1063:84] ==> val receiverExpression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitQualifiedExpression[LocalVariableDescriptor]

'!' @ [1068:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'generateCall' @ [1068:18] ==> private final fun generateCall(callElement: KtElement): Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [1068:31] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitCallExpression[ValueParameterDescriptorImpl]

'ArrayList' @ [1069:40] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtExpression

'expression' @ [1070:34] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitCallExpression[ValueParameterDescriptorImpl]

'valueArguments' @ [1070:45] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'argument' @ [1071:46] ==> val argument: (KtValueArgument..KtValueArgument?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitCallExpression[LocalVariableDescriptor]

'getArgumentExpression' @ [1071:55] ==> @Override @Nullable @IfNotParsed public open fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'argumentExpression' @ [1072:25] ==> val argumentExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitCallExpression[LocalVariableDescriptor]

'generateInstructions' @ [1073:25] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'argumentExpression' @ [1073:46] ==> val argumentExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitCallExpression[LocalVariableDescriptor]

'inputExpressions' @ [1074:25] ==> val inputExpressions: ArrayList<KtExpression> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitCallExpression[LocalVariableDescriptor]

'add' @ [1074:42] ==> public open fun add(element: KtExpression): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'argumentExpression' @ [1074:46] ==> val argumentExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitCallExpression[LocalVariableDescriptor]

'expression' @ [1077:40] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitCallExpression[ValueParameterDescriptorImpl]

'calleeExpression' @ [1077:51] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'generateInstructions' @ [1078:17] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'calleeExpression' @ [1078:38] ==> val calleeExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitCallExpression[LocalVariableDescriptor]

'calleeExpression' @ [1079:21] ==> val calleeExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitCallExpression[LocalVariableDescriptor]

'inputExpressions' @ [1080:21] ==> val inputExpressions: ArrayList<KtExpression> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitCallExpression[LocalVariableDescriptor]

'add' @ [1080:38] ==> public open fun add(element: KtExpression): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'calleeExpression' @ [1080:42] ==> val calleeExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitCallExpression[LocalVariableDescriptor]

'generateAndGetReceiverIfAny' @ [1081:21] ==> private final fun generateAndGetReceiverIfAny(expression: KtExpression): KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [1081:49] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitCallExpression[ValueParameterDescriptorImpl]

'let' @ [1081:62] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> Boolean

'inputExpressions' @ [1081:68] ==> val inputExpressions: ArrayList<KtExpression> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitCallExpression[LocalVariableDescriptor]

'add' @ [1081:85] ==> public open fun add(element: KtExpression): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [1081:89] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitCallExpression.<anonymous>[ValueParameterDescriptorImpl]

'mark' @ [1084:17] ==> private final fun mark(element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [1084:22] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitCallExpression[ValueParameterDescriptorImpl]

'createNonSyntheticValue' @ [1085:17] ==> private final fun createNonSyntheticValue(to: KtElement, from: List<KtElement?>, kind: MagicKind): PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [1085:41] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitCallExpression[ValueParameterDescriptorImpl]

'inputExpressions' @ [1085:53] ==> val inputExpressions: ArrayList<KtExpression> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitCallExpression[LocalVariableDescriptor]

'UNRESOLVED_CALL' @ [1085:81] ==> enum entry UNRESOLVED_CALL defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'expression' @ [1090:26] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateAndGetReceiverIfAny[ValueParameterDescriptorImpl]

'parent' @ [1090:37] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [1092:17] ==> val parent: KtQualifiedExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateAndGetReceiverIfAny[LocalVariableDescriptor]

'selectorExpression' @ [1092:24] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[PropertyDescriptorImpl]

'expression' @ [1092:47] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateAndGetReceiverIfAny[ValueParameterDescriptorImpl]

'parent' @ [1094:38] ==> val parent: KtQualifiedExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateAndGetReceiverIfAny[LocalVariableDescriptor]

'receiverExpression' @ [1094:45] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[PropertyDescriptorImpl]

'generateInstructions' @ [1095:13] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'receiverExpression' @ [1095:34] ==> val receiverExpression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateAndGetReceiverIfAny[LocalVariableDescriptor]

'receiverExpression' @ [1097:20] ==> val receiverExpression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateAndGetReceiverIfAny[LocalVariableDescriptor]

'builder' @ [1101:13] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'declareVariable' @ [1101:21] ==> public abstract fun declareVariable(property: KtVariableDeclaration): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'property' @ [1101:37] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitProperty[ValueParameterDescriptorImpl]

'property' @ [1102:31] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitProperty[ValueParameterDescriptorImpl]

'initializer' @ [1102:40] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

'initializer' @ [1103:17] ==> val initializer: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitProperty[LocalVariableDescriptor]

'visitAssignment' @ [1104:17] ==> private final fun visitAssignment(lhs: KtExpression?, rhsDeferredValue: () -> PseudoValue?, parentExpression: KtExpression): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'property' @ [1104:33] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitProperty[ValueParameterDescriptorImpl]

'getDeferredValue' @ [1104:43] ==> private final fun getDeferredValue(expression: KtExpression?): () -> PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'initializer' @ [1104:60] ==> val initializer: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitProperty[LocalVariableDescriptor]

'property' @ [1104:74] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitProperty[ValueParameterDescriptorImpl]

'property' @ [1106:28] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitProperty[ValueParameterDescriptorImpl]

'delegateExpression' @ [1106:37] ==> public final val KtProperty.delegateExpression: KtExpression?[MyPropertyDescriptor]

'delegate' @ [1107:17] ==> val delegate: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitProperty[LocalVariableDescriptor]

'visitAssignment' @ [1109:17] ==> private final fun visitAssignment(lhs: KtExpression?, rhsDeferredValue: () -> PseudoValue?, parentExpression: KtExpression): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'property' @ [1109:33] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitProperty[ValueParameterDescriptorImpl]

'getDeferredValue' @ [1109:43] ==> private final fun getDeferredValue(expression: KtExpression?): () -> PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'property' @ [1109:67] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitProperty[ValueParameterDescriptorImpl]

'generateInstructions' @ [1110:17] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'delegate' @ [1110:38] ==> val delegate: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitProperty[LocalVariableDescriptor]

'property' @ [1111:21] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitProperty[ValueParameterDescriptorImpl]

'isLocal' @ [1111:30] ==> public final val KtProperty.isLocal: Boolean[MyPropertyDescriptor]

'generateInitializer' @ [1112:21] ==> private final fun generateInitializer(declaration: KtDeclaration, initValue: PseudoValue): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'property' @ [1112:41] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitProperty[ValueParameterDescriptorImpl]

'createSyntheticValue' @ [1112:51] ==> private final fun createSyntheticValue(instructionElement: KtElement, kind: MagicKind, vararg from: KtElement): PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'property' @ [1112:72] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitProperty[ValueParameterDescriptorImpl]

'FAKE_INITIALIZER' @ [1112:92] ==> enum entry FAKE_INITIALIZER defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'builder' @ [1114:21] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'getBoundValue' @ [1114:29] ==> public abstract fun getBoundValue(element: KtElement?): PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'delegate' @ [1114:43] ==> val delegate: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitProperty[LocalVariableDescriptor]

'createSyntheticValue' @ [1115:21] ==> private final fun createSyntheticValue(instructionElement: KtElement, kind: MagicKind, vararg from: KtElement): PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'property' @ [1115:42] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitProperty[ValueParameterDescriptorImpl]

'VALUE_CONSUMER' @ [1115:62] ==> enum entry VALUE_CONSUMER defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'delegate' @ [1115:78] ==> val delegate: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitProperty[LocalVariableDescriptor]

'isLocal' @ [1119:27] ==> public open fun isLocal(@NotNull declaration: KtDeclaration): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'property' @ [1119:35] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitProperty[ValueParameterDescriptorImpl]

'property' @ [1120:34] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitProperty[ValueParameterDescriptorImpl]

'accessors' @ [1120:43] ==> public final val KtProperty.accessors: (MutableList<(KtPropertyAccessor..KtPropertyAccessor?)>..List<(KtPropertyAccessor..KtPropertyAccessor?)>)[MyPropertyDescriptor]

'generateInstructions' @ [1121:21] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'accessor' @ [1121:42] ==> val accessor: (KtPropertyAccessor..KtPropertyAccessor?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitProperty[LocalVariableDescriptor]

'visitDestructuringDeclaration' @ [1127:13] ==> private final fun visitDestructuringDeclaration(declaration: KtDestructuringDeclaration, generateWriteForEntries: Boolean): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'declaration' @ [1127:43] ==> value-parameter declaration: KtDestructuringDeclaration defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDestructuringDeclaration[ValueParameterDescriptorImpl]

'declaration' @ [1131:31] ==> value-parameter declaration: KtDestructuringDeclaration defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDestructuringDeclaration[ValueParameterDescriptorImpl]

'initializer' @ [1131:43] ==> public final val KtDestructuringDeclaration.initializer: KtExpression?[MyPropertyDescriptor]

'generateInstructions' @ [1132:13] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'initializer' @ [1132:34] ==> val initializer: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDestructuringDeclaration[LocalVariableDescriptor]

'declaration' @ [1133:27] ==> value-parameter declaration: KtDestructuringDeclaration defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDestructuringDeclaration[ValueParameterDescriptorImpl]

'entries' @ [1133:39] ==> public final val KtDestructuringDeclaration.entries: (MutableList<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>..List<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>)[MyPropertyDescriptor]

'builder' @ [1134:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'declareVariable' @ [1134:25] ==> public abstract fun declareVariable(property: KtVariableDeclaration): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'entry' @ [1134:41] ==> val entry: (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDestructuringDeclaration[LocalVariableDescriptor]

'trace' @ [1136:36] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[PropertyDescriptorImpl]

'get' @ [1136:42] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..ReadOnlySlice<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?), key: (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)): ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtDestructuringDeclarationEntry
    <V : (Any..Any?)> -> ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>

'COMPONENT_RESOLVED_CALL' @ [1136:61] ==> public final val COMPONENT_RESOLVED_CALL: (WritableSlice<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'entry' @ [1136:86] ==> val entry: (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDestructuringDeclaration[LocalVariableDescriptor]

'writtenValue' @ [1139:17] ==> val writtenValue: PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDestructuringDeclaration[LocalVariableDescriptor]

'if (resolvedCall != null) {
                    builder.call(
                            entry,
                            resolvedCall,
                            getReceiverValues(resolvedCall),
                            emptyMap()).outputValue
                }
                else {
                    initializer?.let { createSyntheticValue(entry, MagicKind.UNRESOLVED_CALL, it) }
                }' @ [1139:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PseudoValue?, elseBranch: PseudoValue?): PseudoValue?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PseudoValue?

'resolvedCall' @ [1139:36] ==> val resolvedCall: ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDestructuringDeclaration[LocalVariableDescriptor]

'builder' @ [1140:21] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'call' @ [1140:29] ==> public abstract fun call(valueElement: KtElement, resolvedCall: ResolvedCall<*>, receiverValues: Map<PseudoValue, ReceiverValue>, arguments: Map<PseudoValue, ValueParameterDescriptor>): CallInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'entry' @ [1141:29] ==> val entry: (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDestructuringDeclaration[LocalVariableDescriptor]

'resolvedCall' @ [1142:29] ==> val resolvedCall: ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDestructuringDeclaration[LocalVariableDescriptor]

'getReceiverValues' @ [1143:29] ==> private final fun getReceiverValues(resolvedCall: ResolvedCall<*>): Map<PseudoValue, ReceiverValue> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [1143:47] ==> val resolvedCall: ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDestructuringDeclaration[LocalVariableDescriptor]

'emptyMap' @ [1144:29] ==> public fun <K, V> emptyMap(): Map<PseudoValue, ValueParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> PseudoValue
    <V> -> ValueParameterDescriptor

'outputValue' @ [1144:41] ==> public open val outputValue: PseudoValue? defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction[PropertyDescriptorImpl]

'initializer' @ [1147:21] ==> val initializer: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDestructuringDeclaration[LocalVariableDescriptor]

'let' @ [1147:34] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> PseudoValue): PseudoValue defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> PseudoValue

'createSyntheticValue' @ [1147:40] ==> private final fun createSyntheticValue(instructionElement: KtElement, kind: MagicKind, vararg from: KtElement): PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'entry' @ [1147:61] ==> val entry: (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDestructuringDeclaration[LocalVariableDescriptor]

'UNRESOLVED_CALL' @ [1147:78] ==> enum entry UNRESOLVED_CALL defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'it' @ [1147:95] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDestructuringDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'generateWriteForEntries' @ [1150:21] ==> value-parameter generateWriteForEntries: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDestructuringDeclaration[ValueParameterDescriptorImpl]

'generateInitializer' @ [1151:21] ==> private final fun generateInitializer(declaration: KtDeclaration, initValue: PseudoValue): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'entry' @ [1151:41] ==> val entry: (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDestructuringDeclaration[LocalVariableDescriptor]

'writtenValue' @ [1151:48] ==> val writtenValue: PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDestructuringDeclaration[LocalVariableDescriptor]

'createSyntheticValue' @ [1151:64] ==> private final fun createSyntheticValue(instructionElement: KtElement, kind: MagicKind, vararg from: KtElement): PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'entry' @ [1151:85] ==> val entry: (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDestructuringDeclaration[LocalVariableDescriptor]

'FAKE_INITIALIZER' @ [1151:102] ==> enum entry FAKE_INITIALIZER defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'processLocalDeclaration' @ [1157:13] ==> private final fun processLocalDeclaration(subroutine: KtDeclaration): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[SimpleFunctionDescriptorImpl]

'accessor' @ [1157:37] ==> value-parameter accessor: KtPropertyAccessor defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitPropertyAccessor[ValueParameterDescriptorImpl]

'mark' @ [1161:13] ==> private final fun mark(element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [1161:18] ==> value-parameter expression: KtBinaryExpressionWithTypeRHS defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryWithTypeRHSExpression[ValueParameterDescriptorImpl]

'expression' @ [1163:33] ==> value-parameter expression: KtBinaryExpressionWithTypeRHS defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryWithTypeRHSExpression[ValueParameterDescriptorImpl]

'operationReference' @ [1163:44] ==> public final val KtBinaryExpressionWithTypeRHS.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'getReferencedNameElementType' @ [1163:63] ==> public abstract fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[SimpleFunctionDescriptorImpl]

'expression' @ [1164:24] ==> value-parameter expression: KtBinaryExpressionWithTypeRHS defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryWithTypeRHSExpression[ValueParameterDescriptorImpl]

'left' @ [1164:35] ==> public final val KtBinaryExpressionWithTypeRHS.left: KtExpression[MyPropertyDescriptor]

'if (operationType === KtTokens.AS_KEYWORD || operationType === KtTokens.`AS_SAFE`) {
                generateInstructions(left)
                if (getBoundOrUnreachableValue(left) != null) {
                    createNonSyntheticValue(expression, MagicKind.CAST, left)
                }
            }
            else {
                visitKtElement(expression)
                createNonSyntheticValue(expression, MagicKind.UNSUPPORTED_ELEMENT, left)
            }' @ [1165:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'operationType' @ [1165:17] ==> val operationType: IElementType defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryWithTypeRHSExpression[LocalVariableDescriptor]

'AS_KEYWORD' @ [1165:44] ==> public final val AS_KEYWORD: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'operationType' @ [1165:58] ==> val operationType: IElementType defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryWithTypeRHSExpression[LocalVariableDescriptor]

'`AS_SAFE`' @ [1165:85] ==> public final val AS_SAFE: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'generateInstructions' @ [1166:17] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'left' @ [1166:38] ==> val left: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryWithTypeRHSExpression[LocalVariableDescriptor]

'getBoundOrUnreachableValue' @ [1167:21] ==> private final fun getBoundOrUnreachableValue(element: KtElement?): PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'left' @ [1167:48] ==> val left: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryWithTypeRHSExpression[LocalVariableDescriptor]

'createNonSyntheticValue' @ [1168:21] ==> private final fun createNonSyntheticValue(to: KtElement, kind: MagicKind, vararg from: KtElement?): PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [1168:45] ==> value-parameter expression: KtBinaryExpressionWithTypeRHS defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryWithTypeRHSExpression[ValueParameterDescriptorImpl]

'CAST' @ [1168:67] ==> enum entry CAST defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'left' @ [1168:73] ==> val left: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryWithTypeRHSExpression[LocalVariableDescriptor]

'visitKtElement' @ [1172:17] ==> public open fun visitKtElement(element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [1172:32] ==> value-parameter expression: KtBinaryExpressionWithTypeRHS defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryWithTypeRHSExpression[ValueParameterDescriptorImpl]

'createNonSyntheticValue' @ [1173:17] ==> private final fun createNonSyntheticValue(to: KtElement, kind: MagicKind, vararg from: KtElement?): PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [1173:41] ==> value-parameter expression: KtBinaryExpressionWithTypeRHS defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryWithTypeRHSExpression[ValueParameterDescriptorImpl]

'UNSUPPORTED_ELEMENT' @ [1173:63] ==> enum entry UNSUPPORTED_ELEMENT defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'left' @ [1173:84] ==> val left: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitBinaryWithTypeRHSExpression[LocalVariableDescriptor]

'catchFinallyStack' @ [1178:17] ==> private final val catchFinallyStack: Stack<ControlFlowProcessor.CatchFinallyLabels> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'isNotEmpty' @ [1178:35] ==> @InlineOnly public inline fun <T> Collection<(ControlFlowProcessor.CatchFinallyLabels..ControlFlowProcessor.CatchFinallyLabels?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.cfg.ControlFlowProcessor.CatchFinallyLabels..org.jetbrains.kotlin.cfg.ControlFlowProcessor.CatchFinallyLabels?)

'with' @ [1179:17] ==> @InlineOnly public inline fun <T, R> with(receiver: (ControlFlowProcessor.CatchFinallyLabels..ControlFlowProcessor.CatchFinallyLabels?), block: (ControlFlowProcessor.CatchFinallyLabels..ControlFlowProcessor.CatchFinallyLabels?).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.cfg.ControlFlowProcessor.CatchFinallyLabels..org.jetbrains.kotlin.cfg.ControlFlowProcessor.CatchFinallyLabels?)
    <R> -> Unit

'catchFinallyStack' @ [1179:22] ==> private final val catchFinallyStack: Stack<ControlFlowProcessor.CatchFinallyLabels> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'peek' @ [1179:40] ==> public open fun peek(): (ControlFlowProcessor.CatchFinallyLabels..ControlFlowProcessor.CatchFinallyLabels?) defined in java.util.Stack[JavaMethodDescriptor]

'tryExpression' @ [1180:25] ==> public final val tryExpression: KtTryExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CatchFinallyLabels[PropertyDescriptorImpl]

'onException' @ [1181:25] ==> public final val onException: Label? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CatchFinallyLabels[PropertyDescriptorImpl]

'let' @ [1181:38] ==> @InlineOnly public inline fun <T, R> Label.let(block: (Label) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Label
    <R> -> Unit

'builder' @ [1182:29] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'nondeterministicJump' @ [1182:37] ==> public abstract fun nondeterministicJump(label: Label, element: KtElement, inputValue: PseudoValue?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'it' @ [1182:58] ==> value-parameter it: Label defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateJumpsToCatchAndFinally.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'tryExpression' @ [1182:62] ==> public final val tryExpression: KtTryExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CatchFinallyLabels[PropertyDescriptorImpl]

'toFinally' @ [1184:25] ==> public final val toFinally: Label? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CatchFinallyLabels[PropertyDescriptorImpl]

'let' @ [1184:36] ==> @InlineOnly public inline fun <T, R> Label.let(block: (Label) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Label
    <R> -> Unit

'builder' @ [1185:29] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'nondeterministicJump' @ [1185:37] ==> public abstract fun nondeterministicJump(label: Label, element: KtElement, inputValue: PseudoValue?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'it' @ [1185:58] ==> value-parameter it: Label defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateJumpsToCatchAndFinally.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'tryExpression' @ [1185:62] ==> public final val tryExpression: KtTryExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CatchFinallyLabels[PropertyDescriptorImpl]

'mark' @ [1193:13] ==> private final fun mark(element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [1193:18] ==> value-parameter expression: KtThrowExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitThrowExpression[ValueParameterDescriptorImpl]

'generateJumpsToCatchAndFinally' @ [1195:13] ==> private final fun generateJumpsToCatchAndFinally(): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [1197:36] ==> value-parameter expression: KtThrowExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitThrowExpression[ValueParameterDescriptorImpl]

'thrownExpression' @ [1197:47] ==> public final val KtThrowExpression.thrownExpression: KtExpression?[MyPropertyDescriptor]

'generateInstructions' @ [1198:13] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'thrownExpression' @ [1198:34] ==> val thrownExpression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitThrowExpression[LocalVariableDescriptor]

'builder' @ [1200:31] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'getBoundValue' @ [1200:39] ==> public abstract fun getBoundValue(element: KtElement?): PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'thrownExpression' @ [1200:53] ==> val thrownExpression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitThrowExpression[LocalVariableDescriptor]

'builder' @ [1201:13] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'throwException' @ [1201:21] ==> public abstract fun throwException(throwExpression: KtThrowExpression, thrownValue: PseudoValue): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [1201:36] ==> value-parameter expression: KtThrowExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitThrowExpression[ValueParameterDescriptorImpl]

'thrownValue' @ [1201:48] ==> val thrownValue: PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitThrowExpression[LocalVariableDescriptor]

'generateArrayAccess' @ [1205:13] ==> private final fun generateArrayAccess(arrayAccessExpression: KtArrayAccessExpression, resolvedCall: ResolvedCall<*>?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [1205:33] ==> value-parameter expression: KtArrayAccessExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitArrayAccessExpression[ValueParameterDescriptorImpl]

'trace' @ [1205:45] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[PropertyDescriptorImpl]

'get' @ [1205:51] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..ReadOnlySlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?), key: (KtExpression..KtExpression?)): ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtExpression
    <V : (Any..Any?)> -> ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>

'INDEXED_LVALUE_GET' @ [1205:70] ==> public final val INDEXED_LVALUE_GET: (WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [1205:90] ==> value-parameter expression: KtArrayAccessExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitArrayAccessExpression[ValueParameterDescriptorImpl]

'mark' @ [1209:13] ==> private final fun mark(element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [1209:18] ==> value-parameter expression: KtIsExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitIsExpression[ValueParameterDescriptorImpl]

'expression' @ [1210:24] ==> value-parameter expression: KtIsExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitIsExpression[ValueParameterDescriptorImpl]

'leftHandSide' @ [1210:35] ==> public final val KtIsExpression.leftHandSide: KtExpression[MyPropertyDescriptor]

'generateInstructions' @ [1211:13] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'left' @ [1211:34] ==> val left: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitIsExpression[LocalVariableDescriptor]

'createNonSyntheticValue' @ [1212:13] ==> private final fun createNonSyntheticValue(to: KtElement, kind: MagicKind, vararg from: KtElement?): PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [1212:37] ==> value-parameter expression: KtIsExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitIsExpression[ValueParameterDescriptorImpl]

'IS' @ [1212:59] ==> enum entry IS defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'left' @ [1212:63] ==> val left: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitIsExpression[LocalVariableDescriptor]

'mark' @ [1216:13] ==> private final fun mark(element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [1216:18] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[ValueParameterDescriptorImpl]

'expression' @ [1218:37] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[ValueParameterDescriptorImpl]

'subjectExpression' @ [1218:48] ==> public final val KtWhenExpression.subjectExpression: KtExpression?[MyPropertyDescriptor]

'subjectExpression' @ [1219:17] ==> val subjectExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[LocalVariableDescriptor]

'generateInstructions' @ [1220:17] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'subjectExpression' @ [1220:38] ==> val subjectExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[LocalVariableDescriptor]

'ArrayList' @ [1223:28] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtExpression

'builder' @ [1225:29] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'createUnboundLabel' @ [1225:37] ==> public abstract fun createUnboundLabel(name: String): Label defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [1228:28] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[ValueParameterDescriptorImpl]

'entries' @ [1228:39] ==> public final val KtWhenExpression.entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>)[MyPropertyDescriptor]

'iterator' @ [1228:47] ==> public abstract fun iterator(): MutableIterator<(KtWhenEntry..KtWhenEntry?)> defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'iterator' @ [1229:20] ==> val iterator: MutableIterator<(KtWhenEntry..KtWhenEntry?)> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[LocalVariableDescriptor]

'hasNext' @ [1229:29] ==> public abstract fun hasNext(): Boolean defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'iterator' @ [1230:33] ==> val iterator: MutableIterator<(KtWhenEntry..KtWhenEntry?)> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[LocalVariableDescriptor]

'next' @ [1230:42] ==> public abstract fun next(): (KtWhenEntry..KtWhenEntry?) defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'mark' @ [1231:17] ==> private final fun mark(element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'whenEntry' @ [1231:22] ==> val whenEntry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[LocalVariableDescriptor]

'whenEntry' @ [1233:30] ==> val whenEntry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[LocalVariableDescriptor]

'isElse' @ [1233:40] ==> public final val KtWhenEntry.isElse: Boolean[MyPropertyDescriptor]

'isElse' @ [1234:21] ==> val isElse: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[LocalVariableDescriptor]

'iterator' @ [1235:25] ==> val iterator: MutableIterator<(KtWhenEntry..KtWhenEntry?)> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[LocalVariableDescriptor]

'hasNext' @ [1235:34] ==> public abstract fun hasNext(): Boolean defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'trace' @ [1236:25] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[PropertyDescriptorImpl]

'report' @ [1236:31] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'ELSE_MISPLACED_IN_WHEN' @ [1236:38] ==> public final val ELSE_MISPLACED_IN_WHEN: (DiagnosticFactory0<(KtWhenEntry..KtWhenEntry?)>..DiagnosticFactory0<(KtWhenEntry..KtWhenEntry?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [1236:61] ==> @NotNull public open fun on(@NotNull element: KtWhenEntry): SimpleDiagnostic<(KtWhenEntry..KtWhenEntry?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'whenEntry' @ [1236:64] ==> val whenEntry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[LocalVariableDescriptor]

'builder' @ [1239:33] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'createUnboundLabel' @ [1239:41] ==> public abstract fun createUnboundLabel(name: String): Label defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'whenEntry' @ [1241:34] ==> val whenEntry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[LocalVariableDescriptor]

'conditions' @ [1241:44] ==> public final val KtWhenEntry.conditions: (Array<(KtWhenCondition..KtWhenCondition?)>..Array<out (KtWhenCondition..KtWhenCondition?)>)[MyPropertyDescriptor]

'conditions' @ [1242:27] ==> val conditions: (Array<(KtWhenCondition..KtWhenCondition?)>..Array<out (KtWhenCondition..KtWhenCondition?)>) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[LocalVariableDescriptor]

'indices' @ [1242:38] ==> public val <T> Array<out (KtWhenCondition..KtWhenCondition?)>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtWhenCondition..org.jetbrains.kotlin.psi.KtWhenCondition?)

'conditions' @ [1243:37] ==> val conditions: (Array<(KtWhenCondition..KtWhenCondition?)>..Array<out (KtWhenCondition..KtWhenCondition?)>) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[LocalVariableDescriptor]

'i' @ [1243:48] ==> val i: Int defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[LocalVariableDescriptor]

'condition' @ [1244:21] ==> val condition: (KtWhenCondition..KtWhenCondition?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[LocalVariableDescriptor]

'accept' @ [1244:31] ==> @Override public final fun accept(@NotNull visitor: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtWhenCondition[JavaMethodDescriptor]

'conditionVisitor' @ [1244:38] ==> private final val conditionVisitor: <no name provided> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'i' @ [1245:25] ==> val i: Int defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[LocalVariableDescriptor]

'conditions' @ [1245:33] ==> val conditions: (Array<(KtWhenCondition..KtWhenCondition?)>..Array<out (KtWhenCondition..KtWhenCondition?)>) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[LocalVariableDescriptor]

'size' @ [1245:44] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'builder' @ [1246:25] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'nondeterministicJump' @ [1246:33] ==> public abstract fun nondeterministicJump(label: Label, element: KtElement, inputValue: PseudoValue?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'bodyLabel' @ [1246:54] ==> val bodyLabel: Label defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[LocalVariableDescriptor]

'expression' @ [1246:65] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[ValueParameterDescriptorImpl]

'builder' @ [1246:77] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'getBoundValue' @ [1246:85] ==> public abstract fun getBoundValue(element: KtElement?): PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'condition' @ [1246:99] ==> val condition: (KtWhenCondition..KtWhenCondition?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[LocalVariableDescriptor]

'!' @ [1250:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isElse' @ [1250:22] ==> val isElse: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[LocalVariableDescriptor]

'nextLabel' @ [1251:21] ==> var nextLabel: Label? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[LocalVariableDescriptor]

'builder' @ [1251:33] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'createUnboundLabel' @ [1251:41] ==> public abstract fun createUnboundLabel(name: String): Label defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'conditions' @ [1252:41] ==> val conditions: (Array<(KtWhenCondition..KtWhenCondition?)>..Array<out (KtWhenCondition..KtWhenCondition?)>) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[LocalVariableDescriptor]

'lastOrNull' @ [1252:52] ==> public fun <T> Array<out (KtWhenCondition..KtWhenCondition?)>.lastOrNull(): KtWhenCondition? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtWhenCondition..org.jetbrains.kotlin.psi.KtWhenCondition?)

'builder' @ [1253:21] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'nondeterministicJump' @ [1253:29] ==> public abstract fun nondeterministicJump(label: Label, element: KtElement, inputValue: PseudoValue?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'nextLabel' @ [1253:50] ==> var nextLabel: Label? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[LocalVariableDescriptor]

'expression' @ [1253:61] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[ValueParameterDescriptorImpl]

'builder' @ [1253:73] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'getBoundValue' @ [1253:81] ==> public abstract fun getBoundValue(element: KtElement?): PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'lastCondition' @ [1253:95] ==> val lastCondition: KtWhenCondition? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[LocalVariableDescriptor]

'builder' @ [1256:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'bindLabel' @ [1256:25] ==> public abstract fun bindLabel(label: Label): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'bodyLabel' @ [1256:35] ==> val bodyLabel: Label defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[LocalVariableDescriptor]

'whenEntry' @ [1257:43] ==> val whenEntry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[LocalVariableDescriptor]

'expression' @ [1257:53] ==> public final val KtWhenEntry.expression: KtExpression?[MyPropertyDescriptor]

'whenEntryExpression' @ [1258:21] ==> val whenEntryExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[LocalVariableDescriptor]

'generateInstructions' @ [1259:21] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'whenEntryExpression' @ [1259:42] ==> val whenEntryExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[LocalVariableDescriptor]

'branches' @ [1260:21] ==> val branches: ArrayList<KtExpression> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[LocalVariableDescriptor]

'add' @ [1260:30] ==> public open fun add(element: KtExpression): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'whenEntryExpression' @ [1260:34] ==> val whenEntryExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[LocalVariableDescriptor]

'builder' @ [1262:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'jump' @ [1262:25] ==> public abstract fun jump(label: Label, element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'doneLabel' @ [1262:30] ==> val doneLabel: Label defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[LocalVariableDescriptor]

'expression' @ [1262:41] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[ValueParameterDescriptorImpl]

'!' @ [1264:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isElse' @ [1264:22] ==> val isElse: Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[LocalVariableDescriptor]

'nextLabel' @ [1264:32] ==> var nextLabel: Label? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[LocalVariableDescriptor]

'builder' @ [1265:21] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'bindLabel' @ [1265:29] ==> public abstract fun bindLabel(label: Label): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'nextLabel' @ [1265:39] ==> var nextLabel: Label? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[LocalVariableDescriptor]

'!' @ [1268:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'iterator' @ [1268:26] ==> val iterator: MutableIterator<(KtWhenEntry..KtWhenEntry?)> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[LocalVariableDescriptor]

'hasNext' @ [1268:35] ==> public abstract fun hasNext(): Boolean defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'WhenChecker' @ [1268:48] ==> public object WhenChecker defined in org.jetbrains.kotlin.cfg in file WhenChecker.kt[FakeCallableDescriptorForObject]

'isWhenExhaustive' @ [1268:60] ==> @JvmStatic public final fun isWhenExhaustive(expression: KtWhenExpression, trace: BindingTrace): Boolean defined in org.jetbrains.kotlin.cfg.WhenChecker[SimpleFunctionDescriptorImpl]

'expression' @ [1268:77] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[ValueParameterDescriptorImpl]

'trace' @ [1268:89] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[PropertyDescriptorImpl]

'builder' @ [1269:25] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'magic' @ [1269:33] ==> public abstract fun magic(instructionElement: KtElement, valueElement: KtElement?, inputValues: List<PseudoValue>, kind: MagicKind): MagicInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [1269:39] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[ValueParameterDescriptorImpl]

'emptyList' @ [1269:57] ==> public fun <T> emptyList(): List<PseudoValue> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PseudoValue

'EXHAUSTIVE_WHEN_ELSE' @ [1269:80] ==> enum entry EXHAUSTIVE_WHEN_ELSE defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'builder' @ [1273:13] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'bindLabel' @ [1273:21] ==> public abstract fun bindLabel(label: Label): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'doneLabel' @ [1273:31] ==> val doneLabel: Label defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[LocalVariableDescriptor]

'mergeValues' @ [1275:13] ==> private final fun mergeValues(from: List<KtExpression>, to: KtExpression): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'branches' @ [1275:25] ==> val branches: ArrayList<KtExpression> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[LocalVariableDescriptor]

'expression' @ [1275:35] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[ValueParameterDescriptorImpl]

'WhenChecker' @ [1276:13] ==> public object WhenChecker defined in org.jetbrains.kotlin.cfg in file WhenChecker.kt[FakeCallableDescriptorForObject]

'checkDuplicatedLabels' @ [1276:25] ==> public final fun checkDuplicatedLabels(expression: KtWhenExpression, trace: BindingTrace): Unit defined in org.jetbrains.kotlin.cfg.WhenChecker[SimpleFunctionDescriptorImpl]

'expression' @ [1276:47] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitWhenExpression[ValueParameterDescriptorImpl]

'trace' @ [1276:59] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[PropertyDescriptorImpl]

'mark' @ [1280:13] ==> private final fun mark(element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [1280:18] ==> value-parameter expression: KtObjectLiteralExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitObjectLiteralExpression[ValueParameterDescriptorImpl]

'expression' @ [1281:31] ==> value-parameter expression: KtObjectLiteralExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitObjectLiteralExpression[ValueParameterDescriptorImpl]

'objectDeclaration' @ [1281:42] ==> public final val KtObjectLiteralExpression.objectDeclaration: KtObjectDeclaration[MyPropertyDescriptor]

'generateInstructions' @ [1282:13] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'declaration' @ [1282:34] ==> val declaration: KtObjectDeclaration defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitObjectLiteralExpression[LocalVariableDescriptor]

'builder' @ [1284:13] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'createAnonymousObject' @ [1284:21] ==> public abstract fun createAnonymousObject(expression: KtObjectLiteralExpression): InstructionWithValue defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [1284:43] ==> value-parameter expression: KtObjectLiteralExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitObjectLiteralExpression[ValueParameterDescriptorImpl]

'generateHeaderDelegationSpecifiers' @ [1288:13] ==> private final fun generateHeaderDelegationSpecifiers(classOrObject: KtClassOrObject): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'objectDeclaration' @ [1288:48] ==> value-parameter objectDeclaration: KtObjectDeclaration defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitObjectDeclaration[ValueParameterDescriptorImpl]

'generateInitializersForScriptClassOrObject' @ [1289:13] ==> private final fun generateInitializersForScriptClassOrObject(classOrObject: KtDeclarationContainer): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'objectDeclaration' @ [1289:56] ==> value-parameter objectDeclaration: KtObjectDeclaration defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitObjectDeclaration[ValueParameterDescriptorImpl]

'generateDeclarationForLocalClassOrObjectIfNeeded' @ [1290:13] ==> private final fun generateDeclarationForLocalClassOrObjectIfNeeded(classOrObject: KtClassOrObject): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'objectDeclaration' @ [1290:62] ==> value-parameter objectDeclaration: KtObjectDeclaration defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitObjectDeclaration[ValueParameterDescriptorImpl]

'mark' @ [1294:13] ==> private final fun mark(element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [1294:18] ==> value-parameter expression: KtStringTemplateExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitStringTemplateExpression[ValueParameterDescriptorImpl]

'ArrayList' @ [1296:36] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtExpression

'expression' @ [1297:27] ==> value-parameter expression: KtStringTemplateExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitStringTemplateExpression[ValueParameterDescriptorImpl]

'entries' @ [1297:38] ==> public final val KtStringTemplateExpression.entries: (Array<(KtStringTemplateEntry..KtStringTemplateEntry?)>..Array<out (KtStringTemplateEntry..KtStringTemplateEntry?)>)[MyPropertyDescriptor]

'entry' @ [1298:21] ==> val entry: (KtStringTemplateEntry..KtStringTemplateEntry?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitStringTemplateExpression[LocalVariableDescriptor]

'entry' @ [1299:43] ==> val entry: (KtStringTemplateEntry..KtStringTemplateEntry?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitStringTemplateExpression[LocalVariableDescriptor]

'getExpression' @ [1299:49] ==> @Nullable public open fun getExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.KtStringTemplateEntry[JavaMethodDescriptor]

'generateInstructions' @ [1300:21] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'entryExpression' @ [1300:42] ==> val entryExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitStringTemplateExpression[LocalVariableDescriptor]

'entryExpression' @ [1301:25] ==> val entryExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitStringTemplateExpression[LocalVariableDescriptor]

'inputExpressions' @ [1302:25] ==> val inputExpressions: ArrayList<KtExpression> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitStringTemplateExpression[LocalVariableDescriptor]

'add' @ [1302:42] ==> public open fun add(element: KtExpression): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'entryExpression' @ [1302:46] ==> val entryExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitStringTemplateExpression[LocalVariableDescriptor]

'builder' @ [1306:13] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'loadStringTemplate' @ [1306:21] ==> public abstract fun loadStringTemplate(expression: KtStringTemplateExpression, inputValues: List<PseudoValue>): InstructionWithValue defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [1306:40] ==> value-parameter expression: KtStringTemplateExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitStringTemplateExpression[ValueParameterDescriptorImpl]

'elementsToValues' @ [1306:52] ==> private final fun elementsToValues(from: List<KtElement?>): List<PseudoValue> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'inputExpressions' @ [1306:69] ==> val inputExpressions: ArrayList<KtExpression> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitStringTemplateExpression[LocalVariableDescriptor]

'generateInstructions' @ [1314:13] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'classInitializer' @ [1314:34] ==> value-parameter classInitializer: KtAnonymousInitializer defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitAnonymousInitializer[ValueParameterDescriptorImpl]

'body' @ [1314:51] ==> public abstract val body: KtExpression? defined in org.jetbrains.kotlin.psi.KtAnonymousInitializer[PropertyDescriptorImpl]

'classOrObject' @ [1318:31] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateHeaderDelegationSpecifiers[ValueParameterDescriptorImpl]

'superTypeListEntries' @ [1318:45] ==> public final val KtClassOrObject.superTypeListEntries: List<KtSuperTypeListEntry>[MyPropertyDescriptor]

'generateInstructions' @ [1319:17] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'specifier' @ [1319:38] ==> val specifier: KtSuperTypeListEntry defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateHeaderDelegationSpecifiers[LocalVariableDescriptor]

'classOrObject' @ [1324:33] ==> value-parameter classOrObject: KtDeclarationContainer defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateInitializersForScriptClassOrObject[ValueParameterDescriptorImpl]

'declarations' @ [1324:47] ==> public final val KtDeclarationContainer.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'declaration' @ [1325:21] ==> val declaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateInitializersForScriptClassOrObject[LocalVariableDescriptor]

'declaration' @ [1325:50] ==> val declaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateInitializersForScriptClassOrObject[LocalVariableDescriptor]

'generateInstructions' @ [1326:21] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'declaration' @ [1326:42] ==> val declaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateInitializersForScriptClassOrObject[LocalVariableDescriptor]

'trace' @ [1332:35] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[PropertyDescriptorImpl]

'DECLARATION_TO_DESCRIPTOR' @ [1332:56] ==> @SuppressWarnings public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'entryOrObject' @ [1332:83] ==> value-parameter entryOrObject: KtClassOrObject defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.processEntryOrObject[ValueParameterDescriptorImpl]

'classDescriptor' @ [1333:17] ==> val classDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.processEntryOrObject[LocalVariableDescriptor]

'builder' @ [1334:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'declareEntryOrObject' @ [1334:25] ==> public abstract fun declareEntryOrObject(entryOrObject: KtClassOrObject): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'entryOrObject' @ [1334:46] ==> value-parameter entryOrObject: KtClassOrObject defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.processEntryOrObject[ValueParameterDescriptorImpl]

'builder' @ [1335:17] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'write' @ [1335:25] ==> public abstract fun write(assignment: KtElement, lValue: KtElement, rValue: PseudoValue, target: AccessTarget, receiverValues: Map<PseudoValue, ReceiverValue>): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'entryOrObject' @ [1335:31] ==> value-parameter entryOrObject: KtClassOrObject defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.processEntryOrObject[ValueParameterDescriptorImpl]

'entryOrObject' @ [1335:46] ==> value-parameter entryOrObject: KtClassOrObject defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.processEntryOrObject[ValueParameterDescriptorImpl]

'createSyntheticValue' @ [1335:61] ==> private final fun createSyntheticValue(instructionElement: KtElement, kind: MagicKind, vararg from: KtElement): PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'entryOrObject' @ [1335:82] ==> value-parameter entryOrObject: KtClassOrObject defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.processEntryOrObject[ValueParameterDescriptorImpl]

'FAKE_INITIALIZER' @ [1335:107] ==> enum entry FAKE_INITIALIZER defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'Declaration' @ [1336:44] ==> public constructor Declaration(descriptor: VariableDescriptor) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.AccessTarget.Declaration[ClassConstructorDescriptorImpl]

'FakeCallableDescriptorForObject' @ [1336:56] ==> public constructor FakeCallableDescriptorForObject(classDescriptor: ClassDescriptor) defined in org.jetbrains.kotlin.resolve.calls.util.FakeCallableDescriptorForObject[DeserializedClassConstructorDescriptor]

'classDescriptor' @ [1336:88] ==> val classDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.processEntryOrObject[LocalVariableDescriptor]

'emptyMap' @ [1336:107] ==> public fun <K, V> emptyMap(): Map<PseudoValue, ReceiverValue> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> PseudoValue
    <V> -> ReceiverValue

'generateInstructions' @ [1337:17] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'entryOrObject' @ [1337:38] ==> value-parameter entryOrObject: KtClassOrObject defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.processEntryOrObject[ValueParameterDescriptorImpl]

'klass' @ [1342:17] ==> value-parameter klass: KtClass defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitClass[ValueParameterDescriptorImpl]

'hasPrimaryConstructor' @ [1342:23] ==> public open fun hasPrimaryConstructor(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[SimpleFunctionDescriptorImpl]

'processParameters' @ [1343:17] ==> private final fun processParameters(parameters: List<KtParameter>): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'klass' @ [1343:35] ==> value-parameter klass: KtClass defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitClass[ValueParameterDescriptorImpl]

'primaryConstructorParameters' @ [1343:41] ==> public final val KtClass.primaryConstructorParameters: List<KtParameter>[MyPropertyDescriptor]

'generateHeaderDelegationSpecifiers' @ [1346:17] ==> private final fun generateHeaderDelegationSpecifiers(classOrObject: KtClassOrObject): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'klass' @ [1346:52] ==> value-parameter klass: KtClass defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitClass[ValueParameterDescriptorImpl]

'generateInitializersForScriptClassOrObject' @ [1347:17] ==> private final fun generateInitializersForScriptClassOrObject(classOrObject: KtDeclarationContainer): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'klass' @ [1347:60] ==> value-parameter klass: KtClass defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitClass[ValueParameterDescriptorImpl]

'generateDeclarationForLocalClassOrObjectIfNeeded' @ [1350:13] ==> private final fun generateDeclarationForLocalClassOrObjectIfNeeded(classOrObject: KtClassOrObject): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'klass' @ [1350:62] ==> value-parameter klass: KtClass defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitClass[ValueParameterDescriptorImpl]

'klass' @ [1352:17] ==> value-parameter klass: KtClass defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitClass[ValueParameterDescriptorImpl]

'isEnum' @ [1352:23] ==> public final fun isEnum(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[SimpleFunctionDescriptorImpl]

'klass' @ [1353:17] ==> value-parameter klass: KtClass defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitClass[ValueParameterDescriptorImpl]

'declarations' @ [1353:23] ==> public final val KtClass.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'forEach' @ [1353:36] ==> @HidesMembers public inline fun <T> Iterable<KtDeclaration>.forEach(action: (KtDeclaration) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'when (it) {
                        is KtEnumEntry -> {
                            processEntryOrObject(it)
                        }
                        is KtObjectDeclaration -> if (it.isCompanion()) {
                            processEntryOrObject(it)
                        }
                    }' @ [1354:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'it' @ [1354:27] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitClass.<anonymous>[ValueParameterDescriptorImpl]

'processEntryOrObject' @ [1356:29] ==> private final fun processEntryOrObject(entryOrObject: KtClassOrObject): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'it' @ [1356:50] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitClass.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [1358:55] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitClass.<anonymous>[ValueParameterDescriptorImpl]

'isCompanion' @ [1358:58] ==> public final fun isCompanion(): Boolean defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[SimpleFunctionDescriptorImpl]

'processEntryOrObject' @ [1359:29] ==> private final fun processEntryOrObject(entryOrObject: KtClassOrObject): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'it' @ [1359:50] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitClass.<anonymous>[ValueParameterDescriptorImpl]

'generateInitializersForScriptClassOrObject' @ [1367:13] ==> private final fun generateInitializersForScriptClassOrObject(classOrObject: KtDeclarationContainer): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'script' @ [1367:56] ==> value-parameter script: KtScript defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitScript[ValueParameterDescriptorImpl]

'classOrObject' @ [1371:17] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateDeclarationForLocalClassOrObjectIfNeeded[ValueParameterDescriptorImpl]

'isLocal' @ [1371:31] ==> public final val KtClassOrObject.isLocal: Boolean[MyPropertyDescriptor]

'classOrObject' @ [1372:37] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateDeclarationForLocalClassOrObjectIfNeeded[ValueParameterDescriptorImpl]

'declarations' @ [1372:51] ==> public final val KtClassOrObject.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'declaration' @ [1373:25] ==> val declaration: KtDeclaration defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateDeclarationForLocalClassOrObjectIfNeeded[LocalVariableDescriptor]

'declaration' @ [1374:25] ==> val declaration: KtDeclaration defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateDeclarationForLocalClassOrObjectIfNeeded[LocalVariableDescriptor]

'declaration' @ [1375:25] ==> val declaration: KtDeclaration defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateDeclarationForLocalClassOrObjectIfNeeded[LocalVariableDescriptor]

'generateInstructions' @ [1378:21] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'declaration' @ [1378:42] ==> val declaration: KtDeclaration defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateDeclarationForLocalClassOrObjectIfNeeded[LocalVariableDescriptor]

'parameters' @ [1384:31] ==> value-parameter parameters: List<KtParameter> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.processParameters[ValueParameterDescriptorImpl]

'generateInstructions' @ [1385:17] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'parameter' @ [1385:38] ==> val parameter: KtParameter defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.processParameters[LocalVariableDescriptor]

'?:' @ [1390:33] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtClassOrObject?, right: KtClassOrObject): KtClassOrObject[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtClassOrObject

'getParentOfType' @ [1390:45] ==> @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(KtClassOrObject..KtClassOrObject?)>): KtClassOrObject? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtClassOrObject

'constructor' @ [1390:61] ==> value-parameter constructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitSecondaryConstructor[ValueParameterDescriptorImpl]

'java' @ [1390:97] ==> public val <T> KClass<KtClassOrObject>.java: Class<KtClassOrObject> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtClassOrObject

'error' @ [1390:106] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'processParameters' @ [1392:13] ==> private final fun processParameters(parameters: List<KtParameter>): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'constructor' @ [1392:31] ==> value-parameter constructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitSecondaryConstructor[ValueParameterDescriptorImpl]

'valueParameters' @ [1392:43] ==> public final val KtSecondaryConstructor.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'generateCallOrMarkUnresolved' @ [1393:13] ==> private final fun generateCallOrMarkUnresolved(call: KtCallElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'constructor' @ [1393:42] ==> value-parameter constructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitSecondaryConstructor[ValueParameterDescriptorImpl]

'getDelegationCall' @ [1393:54] ==> public final fun getDelegationCall(): KtConstructorDelegationCall defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[SimpleFunctionDescriptorImpl]

'!' @ [1395:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'constructor' @ [1395:18] ==> value-parameter constructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitSecondaryConstructor[ValueParameterDescriptorImpl]

'getDelegationCall' @ [1395:30] ==> public final fun getDelegationCall(): KtConstructorDelegationCall defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[SimpleFunctionDescriptorImpl]

'isCallToThis' @ [1395:50] ==> public final val KtConstructorDelegationCall.isCallToThis: Boolean[MyPropertyDescriptor]

'generateInitializersForScriptClassOrObject' @ [1396:17] ==> private final fun generateInitializersForScriptClassOrObject(classOrObject: KtDeclarationContainer): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'classOrObject' @ [1396:60] ==> val classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitSecondaryConstructor[LocalVariableDescriptor]

'generateInstructions' @ [1399:13] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'constructor' @ [1399:34] ==> value-parameter constructor: KtSecondaryConstructor defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitSecondaryConstructor[ValueParameterDescriptorImpl]

'bodyExpression' @ [1399:46] ==> public final val KtSecondaryConstructor.bodyExpression: KtBlockExpression?[MyPropertyDescriptor]

'generateCallOrMarkUnresolved' @ [1403:13] ==> private final fun generateCallOrMarkUnresolved(call: KtCallElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'call' @ [1403:42] ==> value-parameter call: KtSuperTypeCallEntry defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitSuperTypeCallEntry[ValueParameterDescriptorImpl]

'!' @ [1407:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'generateCall' @ [1407:18] ==> private final fun generateCall(callElement: KtElement): Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'call' @ [1407:31] ==> value-parameter call: KtCallElement defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateCallOrMarkUnresolved[ValueParameterDescriptorImpl]

'call' @ [1408:33] ==> value-parameter call: KtCallElement defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateCallOrMarkUnresolved[ValueParameterDescriptorImpl]

'valueArguments' @ [1408:38] ==> public final val KtCallElement.valueArguments: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'mapNotNull' @ [1408:53] ==> public inline fun <T, R : Any> Iterable<(ValueArgument..ValueArgument?)>.mapNotNull(transform: ((ValueArgument..ValueArgument?)) -> KtExpression?): List<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)
    <R : Any> -> KtExpression

'arguments' @ [1410:34] ==> val arguments: List<KtExpression> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateCallOrMarkUnresolved[LocalVariableDescriptor]

'generateInstructions' @ [1411:21] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'argument' @ [1411:42] ==> val argument: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateCallOrMarkUnresolved[LocalVariableDescriptor]

'createNonSyntheticValue' @ [1413:17] ==> private final fun createNonSyntheticValue(to: KtElement, from: List<KtElement?>, kind: MagicKind): PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'call' @ [1413:41] ==> value-parameter call: KtCallElement defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateCallOrMarkUnresolved[ValueParameterDescriptorImpl]

'arguments' @ [1413:47] ==> val arguments: List<KtExpression> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateCallOrMarkUnresolved[LocalVariableDescriptor]

'UNRESOLVED_CALL' @ [1413:68] ==> enum entry UNRESOLVED_CALL defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'specifier' @ [1418:38] ==> value-parameter specifier: KtDelegatedSuperTypeEntry defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDelegatedSuperTypeEntry[ValueParameterDescriptorImpl]

'delegateExpression' @ [1418:48] ==> public final val KtDelegatedSuperTypeEntry.delegateExpression: KtExpression?[MyPropertyDescriptor]

'generateInstructions' @ [1419:13] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'delegateExpression' @ [1419:34] ==> val delegateExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDelegatedSuperTypeEntry[LocalVariableDescriptor]

'delegateExpression' @ [1420:17] ==> val delegateExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDelegatedSuperTypeEntry[LocalVariableDescriptor]

'createSyntheticValue' @ [1421:17] ==> private final fun createSyntheticValue(instructionElement: KtElement, kind: MagicKind, vararg from: KtElement): PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'specifier' @ [1421:38] ==> value-parameter specifier: KtDelegatedSuperTypeEntry defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDelegatedSuperTypeEntry[ValueParameterDescriptorImpl]

'VALUE_CONSUMER' @ [1421:59] ==> enum entry VALUE_CONSUMER defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'delegateExpression' @ [1421:75] ==> val delegateExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDelegatedSuperTypeEntry[LocalVariableDescriptor]

'list' @ [1430:13] ==> value-parameter list: KtSuperTypeList defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitSuperTypeList[ValueParameterDescriptorImpl]

'acceptChildren' @ [1430:18] ==> public open fun acceptChildren(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtSuperTypeList[JavaMethodDescriptor]

'this' @ [1430:33] ==> <this> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[LazyClassReceiverParameterDescriptor]

'file' @ [1434:33] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitKtFile[ValueParameterDescriptorImpl]

'declarations' @ [1434:38] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'declaration' @ [1435:21] ==> val declaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitKtFile[LocalVariableDescriptor]

'generateInstructions' @ [1436:21] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'declaration' @ [1436:42] ==> val declaration: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitKtFile[LocalVariableDescriptor]

'mark' @ [1442:13] ==> private final fun mark(element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [1442:18] ==> value-parameter expression: KtDoubleColonExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDoubleColonExpression[ValueParameterDescriptorImpl]

'expression' @ [1443:38] ==> value-parameter expression: KtDoubleColonExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDoubleColonExpression[ValueParameterDescriptorImpl]

'receiverExpression' @ [1443:49] ==> public final val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDoubleColonExpression[PropertyDescriptorImpl]

'if (receiverExpression != null &&
                trace.bindingContext.get(BindingContext.DOUBLE_COLON_LHS, receiverExpression) is DoubleColonLHS.Expression) {
                generateInstructions(receiverExpression)
                createNonSyntheticValue(expression, MagicKind.BOUND_CALLABLE_REFERENCE, receiverExpression)
            }
            else {
                createNonSyntheticValue(expression, MagicKind.UNBOUND_CALLABLE_REFERENCE)
            }' @ [1444:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PseudoValue, elseBranch: PseudoValue): PseudoValue[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PseudoValue

'receiverExpression' @ [1444:17] ==> val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDoubleColonExpression[LocalVariableDescriptor]

'trace' @ [1445:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[PropertyDescriptorImpl]

'bindingContext' @ [1445:23] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'get' @ [1445:38] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>..ReadOnlySlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>?), key: (KtExpression..KtExpression?)): DoubleColonLHS? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtExpression
    <V : (Any..Any?)> -> DoubleColonLHS

'DOUBLE_COLON_LHS' @ [1445:57] ==> public final val DOUBLE_COLON_LHS: (WritableSlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>..WritableSlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'receiverExpression' @ [1445:75] ==> val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDoubleColonExpression[LocalVariableDescriptor]

'generateInstructions' @ [1446:17] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'receiverExpression' @ [1446:38] ==> val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDoubleColonExpression[LocalVariableDescriptor]

'createNonSyntheticValue' @ [1447:17] ==> private final fun createNonSyntheticValue(to: KtElement, kind: MagicKind, vararg from: KtElement?): PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [1447:41] ==> value-parameter expression: KtDoubleColonExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDoubleColonExpression[ValueParameterDescriptorImpl]

'BOUND_CALLABLE_REFERENCE' @ [1447:63] ==> enum entry BOUND_CALLABLE_REFERENCE defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'receiverExpression' @ [1447:89] ==> val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDoubleColonExpression[LocalVariableDescriptor]

'createNonSyntheticValue' @ [1450:17] ==> private final fun createNonSyntheticValue(to: KtElement, kind: MagicKind, vararg from: KtElement?): PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [1450:41] ==> value-parameter expression: KtDoubleColonExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitDoubleColonExpression[ValueParameterDescriptorImpl]

'UNBOUND_CALLABLE_REFERENCE' @ [1450:63] ==> enum entry UNBOUND_CALLABLE_REFERENCE defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'createNonSyntheticValue' @ [1455:13] ==> private final fun createNonSyntheticValue(to: KtElement, kind: MagicKind, vararg from: KtElement?): PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'element' @ [1455:37] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.visitKtElement[ValueParameterDescriptorImpl]

'UNSUPPORTED_ELEMENT' @ [1455:56] ==> enum entry UNSUPPORTED_ELEMENT defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'qualifier' @ [1459:39] ==> value-parameter qualifier: Qualifier defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateQualifier[ValueParameterDescriptorImpl]

'descriptor' @ [1459:49] ==> public abstract val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.Qualifier[DeserializedPropertyDescriptor]

'qualifierDescriptor' @ [1460:17] ==> val qualifierDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateQualifier[LocalVariableDescriptor]

'getFakeDescriptorForObject' @ [1461:17] ==> public fun getFakeDescriptorForObject(classifier: ClassifierDescriptor?): FakeCallableDescriptorForObject? defined in org.jetbrains.kotlin.resolve.calls.tower[DeserializedSimpleFunctionDescriptor]

'qualifierDescriptor' @ [1461:44] ==> val qualifierDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateQualifier[LocalVariableDescriptor]

'let' @ [1461:66] ==> @InlineOnly public inline fun <T, R> FakeCallableDescriptorForObject.let(block: (FakeCallableDescriptorForObject) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FakeCallableDescriptorForObject
    <R> -> Nothing

'mark' @ [1462:21] ==> private final fun mark(element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [1462:26] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateQualifier[ValueParameterDescriptorImpl]

'builder' @ [1463:21] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'read' @ [1463:29] ==> public abstract fun read(element: KtElement, target: AccessTarget, receiverValues: Map<PseudoValue, ReceiverValue>): ReadValueInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [1463:34] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateQualifier[ValueParameterDescriptorImpl]

'Declaration' @ [1463:59] ==> public constructor Declaration(descriptor: VariableDescriptor) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.AccessTarget.Declaration[ClassConstructorDescriptorImpl]

'it' @ [1463:71] ==> value-parameter it: FakeCallableDescriptorForObject defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateQualifier.<anonymous>[ValueParameterDescriptorImpl]

'emptyMap' @ [1463:76] ==> public fun <K, V> emptyMap(): Map<PseudoValue, ReceiverValue> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> PseudoValue
    <V> -> ReceiverValue

'callElement' @ [1471:32] ==> value-parameter callElement: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateCall[ValueParameterDescriptorImpl]

'getResolvedCall' @ [1471:44] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[SimpleFunctionDescriptorImpl]

'trace' @ [1471:60] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor[PropertyDescriptorImpl]

'bindingContext' @ [1471:66] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'resolvedCall' @ [1472:47] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateCall[LocalVariableDescriptor]

'call' @ [1472:61] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'callElement' @ [1472:67] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'callElement' @ [1473:17] ==> value-parameter callElement: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateCall[ValueParameterDescriptorImpl]

'isAncestor' @ [1473:29] ==> public fun PsiElement?.isAncestor(element: PsiElement, strict: Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[SimpleFunctionDescriptorImpl]

'callElementFromResolvedCall' @ [1473:40] ==> val callElementFromResolvedCall: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateCall[LocalVariableDescriptor]

'checkAndGenerateCall' @ [1474:20] ==> private final fun checkAndGenerateCall(resolvedCall: ResolvedCall<*>?): Boolean defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [1474:41] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateCall[LocalVariableDescriptor]

'resolvedCall' @ [1478:17] ==> value-parameter resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.checkAndGenerateCall[ValueParameterDescriptorImpl]

'generateCall' @ [1479:13] ==> private final fun generateCall(resolvedCall: ResolvedCall<*>): InstructionWithValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [1479:26] ==> value-parameter resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.checkAndGenerateCall[ValueParameterDescriptorImpl]

'resolvedCall' @ [1484:31] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateCall[ValueParameterDescriptorImpl]

'call' @ [1484:44] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'callElement' @ [1484:49] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'getReceiverValues' @ [1486:29] ==> private final fun getReceiverValues(resolvedCall: ResolvedCall<*>): Map<PseudoValue, ReceiverValue> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [1486:47] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateCall[ValueParameterDescriptorImpl]

'emptyMap' @ [1488:45] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> emptyMap(): (SmartFMap<(PseudoValue..PseudoValue?), (ValueParameterDescriptor..ValueParameterDescriptor?)>..SmartFMap<(PseudoValue..PseudoValue?), (ValueParameterDescriptor..ValueParameterDescriptor?)>?) defined in com.intellij.util.SmartFMap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PseudoValue
    <V : (Any..Any?)> -> ValueParameterDescriptor

'resolvedCall' @ [1489:30] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateCall[ValueParameterDescriptorImpl]

'call' @ [1489:43] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'valueArguments' @ [1489:48] ==> public final val Call.valueArguments: List<(ValueArgument..ValueArgument?)>[MyPropertyDescriptor]

'resolvedCall' @ [1490:39] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateCall[ValueParameterDescriptorImpl]

'getArgumentMapping' @ [1490:52] ==> @NotNull public abstract fun getArgumentMapping(@NotNull valueArgument: ValueArgument): ArgumentMapping defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCall[JavaMethodDescriptor]

'argument' @ [1490:71] ==> val argument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateCall[LocalVariableDescriptor]

'argument' @ [1491:42] ==> val argument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateCall[LocalVariableDescriptor]

'getArgumentExpression' @ [1491:51] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[SimpleFunctionDescriptorImpl]

'if (argumentMapping is ArgumentMatch) {
                    parameterValues = generateValueArgument(argument, argumentMapping.valueParameter, parameterValues)
                }
                else if (argumentExpression != null) {
                    generateInstructions(argumentExpression)
                    createSyntheticValue(argumentExpression, MagicKind.VALUE_CONSUMER, argumentExpression)
                }' @ [1492:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'argumentMapping' @ [1492:21] ==> val argumentMapping: ArgumentMapping defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateCall[LocalVariableDescriptor]

'parameterValues' @ [1493:21] ==> var parameterValues: (SmartFMap<(PseudoValue..PseudoValue?), (ValueParameterDescriptor..ValueParameterDescriptor?)>..SmartFMap<(PseudoValue..PseudoValue?), (ValueParameterDescriptor..ValueParameterDescriptor?)>?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateCall[LocalVariableDescriptor]

'generateValueArgument' @ [1493:39] ==> private final fun generateValueArgument(valueArgument: ValueArgument, parameterDescriptor: ValueParameterDescriptor, parameterValuesArg: SmartFMap<PseudoValue, ValueParameterDescriptor>): SmartFMap<PseudoValue, ValueParameterDescriptor> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'argument' @ [1493:61] ==> val argument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateCall[LocalVariableDescriptor]

'argumentMapping' @ [1493:71] ==> val argumentMapping: ArgumentMapping defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateCall[LocalVariableDescriptor]

'valueParameter' @ [1493:87] ==> public abstract val valueParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.model.ArgumentMatch[PropertyDescriptorImpl]

'parameterValues' @ [1493:103] ==> var parameterValues: (SmartFMap<(PseudoValue..PseudoValue?), (ValueParameterDescriptor..ValueParameterDescriptor?)>..SmartFMap<(PseudoValue..PseudoValue?), (ValueParameterDescriptor..ValueParameterDescriptor?)>?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateCall[LocalVariableDescriptor]

'argumentExpression' @ [1495:26] ==> val argumentExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateCall[LocalVariableDescriptor]

'generateInstructions' @ [1496:21] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'argumentExpression' @ [1496:42] ==> val argumentExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateCall[LocalVariableDescriptor]

'createSyntheticValue' @ [1497:21] ==> private final fun createSyntheticValue(instructionElement: KtElement, kind: MagicKind, vararg from: KtElement): PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'argumentExpression' @ [1497:42] ==> val argumentExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateCall[LocalVariableDescriptor]

'VALUE_CONSUMER' @ [1497:72] ==> enum entry VALUE_CONSUMER defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'argumentExpression' @ [1497:88] ==> val argumentExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateCall[LocalVariableDescriptor]

'resolvedCall' @ [1501:17] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateCall[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [1501:30] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'callElement' @ [1504:38] ==> val callElement: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateCall[LocalVariableDescriptor]

'error' @ [1504:70] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'+' @ [1504:76] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'callElement' @ [1504:128] ==> val callElement: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateCall[LocalVariableDescriptor]

'text' @ [1504:140] ==> public final val KtElement.text: (String..String?)[MyPropertyDescriptor]

'assert' @ [1505:17] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'parameterValues' @ [1505:24] ==> var parameterValues: (SmartFMap<(PseudoValue..PseudoValue?), (ValueParameterDescriptor..ValueParameterDescriptor?)>..SmartFMap<(PseudoValue..PseudoValue?), (ValueParameterDescriptor..ValueParameterDescriptor?)>?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateCall[LocalVariableDescriptor]

'isEmpty' @ [1505:40] ==> public open fun isEmpty(): Boolean defined in com.intellij.util.SmartFMap[JavaMethodDescriptor]

'+' @ [1505:53] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'callElement' @ [1505:108] ==> val callElement: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateCall[LocalVariableDescriptor]

'text' @ [1505:120] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'builder' @ [1506:24] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'readVariable' @ [1506:32] ==> public abstract fun readVariable(expression: KtExpression, resolvedCall: ResolvedCall<*>, receiverValues: Map<PseudoValue, ReceiverValue>): ReadValueInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'callExpression' @ [1506:45] ==> val callExpression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateCall[LocalVariableDescriptor]

'resolvedCall' @ [1506:61] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateCall[ValueParameterDescriptorImpl]

'receivers' @ [1506:75] ==> val receivers: Map<PseudoValue, ReceiverValue> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateCall[LocalVariableDescriptor]

'mark' @ [1509:13] ==> private final fun mark(element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [1509:18] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateCall[ValueParameterDescriptorImpl]

'call' @ [1509:31] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'callElement' @ [1509:36] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'builder' @ [1510:20] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'call' @ [1510:28] ==> public abstract fun call(valueElement: KtElement, resolvedCall: ResolvedCall<*>, receiverValues: Map<PseudoValue, ReceiverValue>, arguments: Map<PseudoValue, ValueParameterDescriptor>): CallInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'callElement' @ [1510:33] ==> val callElement: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateCall[LocalVariableDescriptor]

'resolvedCall' @ [1510:46] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateCall[ValueParameterDescriptorImpl]

'receivers' @ [1510:60] ==> val receivers: Map<PseudoValue, ReceiverValue> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateCall[LocalVariableDescriptor]

'parameterValues' @ [1510:71] ==> var parameterValues: (SmartFMap<(PseudoValue..PseudoValue?), (ValueParameterDescriptor..ValueParameterDescriptor?)>..SmartFMap<(PseudoValue..PseudoValue?), (ValueParameterDescriptor..ValueParameterDescriptor?)>?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateCall[LocalVariableDescriptor]

'resolvedCall' @ [1516:17] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[ValueParameterDescriptorImpl]

'varCallResult' @ [1517:17] ==> var varCallResult: PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[LocalVariableDescriptor]

'generateCall' @ [1517:33] ==> private final fun generateCall(resolvedCall: ResolvedCall<*>): InstructionWithValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [1517:46] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[ValueParameterDescriptorImpl]

'variableCall' @ [1517:59] ==> public abstract val variableCall: ResolvedCall<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.model.VariableAsFunctionResolvedCall[PropertyDescriptorImpl]

'outputValue' @ [1517:73] ==> public abstract val outputValue: PseudoValue? defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.InstructionWithValue[PropertyDescriptorImpl]

'resolvedCall' @ [1519:28] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[ValueParameterDescriptorImpl]

'explicitReceiverKind' @ [1519:41] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.explicitReceiverKind: ExplicitReceiverKind[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'when (kind) {
                    ExplicitReceiverKind.DISPATCH_RECEIVER -> explicitReceiver = resolvedCall.dispatchReceiver
                    ExplicitReceiverKind.EXTENSION_RECEIVER, ExplicitReceiverKind.BOTH_RECEIVERS -> explicitReceiver = resolvedCall.extensionReceiver
                    ExplicitReceiverKind.NO_EXPLICIT_RECEIVER -> {}
                }' @ [1521:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'kind' @ [1521:23] ==> val kind: ExplicitReceiverKind defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[LocalVariableDescriptor]

'DISPATCH_RECEIVER' @ [1522:42] ==> enum entry DISPATCH_RECEIVER defined in org.jetbrains.kotlin.resolve.calls.tasks.ExplicitReceiverKind[FakeCallableDescriptorForObject]

'explicitReceiver' @ [1522:63] ==> var explicitReceiver: ReceiverValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[LocalVariableDescriptor]

'resolvedCall' @ [1522:82] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [1522:95] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'EXTENSION_RECEIVER' @ [1523:42] ==> enum entry EXTENSION_RECEIVER defined in org.jetbrains.kotlin.resolve.calls.tasks.ExplicitReceiverKind[FakeCallableDescriptorForObject]

'BOTH_RECEIVERS' @ [1523:83] ==> enum entry BOTH_RECEIVERS defined in org.jetbrains.kotlin.resolve.calls.tasks.ExplicitReceiverKind[FakeCallableDescriptorForObject]

'explicitReceiver' @ [1523:101] ==> var explicitReceiver: ReceiverValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[LocalVariableDescriptor]

'resolvedCall' @ [1523:120] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[ValueParameterDescriptorImpl]

'extensionReceiver' @ [1523:133] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'NO_EXPLICIT_RECEIVER' @ [1524:42] ==> enum entry NO_EXPLICIT_RECEIVER defined in org.jetbrains.kotlin.resolve.calls.tasks.ExplicitReceiverKind[FakeCallableDescriptorForObject]

'emptyMap' @ [1528:44] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> emptyMap(): (SmartFMap<(PseudoValue..PseudoValue?), (ReceiverValue..ReceiverValue?)>..SmartFMap<(PseudoValue..PseudoValue?), (ReceiverValue..ReceiverValue?)>?) defined in com.intellij.util.SmartFMap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PseudoValue
    <V : (Any..Any?)> -> ReceiverValue

'explicitReceiver' @ [1529:17] ==> var explicitReceiver: ReceiverValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[LocalVariableDescriptor]

'varCallResult' @ [1529:45] ==> var varCallResult: PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[LocalVariableDescriptor]

'receiverValues' @ [1530:17] ==> var receiverValues: (SmartFMap<(PseudoValue..PseudoValue?), (ReceiverValue..ReceiverValue?)>..SmartFMap<(PseudoValue..PseudoValue?), (ReceiverValue..ReceiverValue?)>?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[LocalVariableDescriptor]

'receiverValues' @ [1530:34] ==> var receiverValues: (SmartFMap<(PseudoValue..PseudoValue?), (ReceiverValue..ReceiverValue?)>..SmartFMap<(PseudoValue..PseudoValue?), (ReceiverValue..ReceiverValue?)>?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[LocalVariableDescriptor]

'plus' @ [1530:49] ==> public open fun plus(@NotNull p0: PseudoValue, p1: (ReceiverValue..ReceiverValue?)): (SmartFMap<(PseudoValue..PseudoValue?), (ReceiverValue..ReceiverValue?)>..SmartFMap<(PseudoValue..PseudoValue?), (ReceiverValue..ReceiverValue?)>?) defined in com.intellij.util.SmartFMap[JavaMethodDescriptor]

'varCallResult' @ [1530:54] ==> var varCallResult: PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[LocalVariableDescriptor]

'explicitReceiver' @ [1530:69] ==> var explicitReceiver: ReceiverValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[LocalVariableDescriptor]

'resolvedCall' @ [1532:31] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[ValueParameterDescriptorImpl]

'call' @ [1532:44] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'callElement' @ [1532:49] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'receiverValues' @ [1533:13] ==> var receiverValues: (SmartFMap<(PseudoValue..PseudoValue?), (ReceiverValue..ReceiverValue?)>..SmartFMap<(PseudoValue..PseudoValue?), (ReceiverValue..ReceiverValue?)>?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[LocalVariableDescriptor]

'getReceiverValues' @ [1533:30] ==> private final fun getReceiverValues(callElement: KtElement, receiver: ReceiverValue?, receiverValuesArg: SmartFMap<PseudoValue, ReceiverValue>): SmartFMap<PseudoValue, ReceiverValue> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'callElement' @ [1533:48] ==> val callElement: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[LocalVariableDescriptor]

'resolvedCall' @ [1533:61] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [1533:74] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'receiverValues' @ [1533:92] ==> var receiverValues: (SmartFMap<(PseudoValue..PseudoValue?), (ReceiverValue..ReceiverValue?)>..SmartFMap<(PseudoValue..PseudoValue?), (ReceiverValue..ReceiverValue?)>?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[LocalVariableDescriptor]

'receiverValues' @ [1534:13] ==> var receiverValues: (SmartFMap<(PseudoValue..PseudoValue?), (ReceiverValue..ReceiverValue?)>..SmartFMap<(PseudoValue..PseudoValue?), (ReceiverValue..ReceiverValue?)>?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[LocalVariableDescriptor]

'getReceiverValues' @ [1534:30] ==> private final fun getReceiverValues(callElement: KtElement, receiver: ReceiverValue?, receiverValuesArg: SmartFMap<PseudoValue, ReceiverValue>): SmartFMap<PseudoValue, ReceiverValue> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'callElement' @ [1534:48] ==> val callElement: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[LocalVariableDescriptor]

'resolvedCall' @ [1534:61] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[ValueParameterDescriptorImpl]

'extensionReceiver' @ [1534:74] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'receiverValues' @ [1534:93] ==> var receiverValues: (SmartFMap<(PseudoValue..PseudoValue?), (ReceiverValue..ReceiverValue?)>..SmartFMap<(PseudoValue..PseudoValue?), (ReceiverValue..ReceiverValue?)>?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[LocalVariableDescriptor]

'receiverValues' @ [1535:20] ==> var receiverValues: (SmartFMap<(PseudoValue..PseudoValue?), (ReceiverValue..ReceiverValue?)>..SmartFMap<(PseudoValue..PseudoValue?), (ReceiverValue..ReceiverValue?)>?) defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[LocalVariableDescriptor]

'receiverValuesArg' @ [1543:34] ==> value-parameter receiverValuesArg: SmartFMap<PseudoValue, ReceiverValue> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[ValueParameterDescriptorImpl]

'receiver' @ [1544:17] ==> value-parameter receiver: ReceiverValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[ValueParameterDescriptorImpl]

'receiverValues' @ [1544:37] ==> var receiverValues: SmartFMap<PseudoValue, ReceiverValue> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[LocalVariableDescriptor]

'containsValue' @ [1544:52] ==> public open fun containsValue(value: (ReceiverValue..ReceiverValue?)): Boolean defined in com.intellij.util.SmartFMap[JavaMethodDescriptor]

'receiver' @ [1544:66] ==> value-parameter receiver: ReceiverValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[ValueParameterDescriptorImpl]

'receiverValues' @ [1544:84] ==> var receiverValues: SmartFMap<PseudoValue, ReceiverValue> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[LocalVariableDescriptor]

'when (receiver) {
                is ImplicitReceiver -> {
                    if (callElement is KtCallExpression) {
                        val declaration = receiver.declarationDescriptor
                        if (declaration is ClassDescriptor) {
                            val fakeDescriptor = getFakeDescriptorForObject(declaration)
                            val calleeExpression = callElement.calleeExpression
                            if (fakeDescriptor != null && calleeExpression != null) {
                                builder.read(calleeExpression, AccessTarget.Declaration(fakeDescriptor), emptyMap())
                            }
                        }
                    }
                    receiverValues = receiverValues.plus(createSyntheticValue(callElement, MagicKind.IMPLICIT_RECEIVER), receiver)
                }
                is ExpressionReceiver -> {
                    val expression = receiver.expression
                    if (builder.getBoundValue(expression) == null) {
                        generateInstructions(expression)
                    }

                    val receiverPseudoValue = getBoundOrUnreachableValue(expression)
                    if (receiverPseudoValue != null) {
                        receiverValues = receiverValues.plus(receiverPseudoValue, receiver)
                    }
                }
                is TransientReceiver -> {
                    // Do nothing
                }
                else -> {
                    throw IllegalArgumentException("Unknown receiver kind: " + receiver)
                }
            }' @ [1546:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'receiver' @ [1546:19] ==> value-parameter receiver: ReceiverValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[ValueParameterDescriptorImpl]

'callElement' @ [1548:25] ==> value-parameter callElement: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[ValueParameterDescriptorImpl]

'receiver' @ [1549:43] ==> value-parameter receiver: ReceiverValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[ValueParameterDescriptorImpl]

'declarationDescriptor' @ [1549:52] ==> public abstract val declarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitReceiver[DeserializedPropertyDescriptor]

'declaration' @ [1550:29] ==> val declaration: DeclarationDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[LocalVariableDescriptor]

'getFakeDescriptorForObject' @ [1551:50] ==> public fun getFakeDescriptorForObject(classifier: ClassifierDescriptor?): FakeCallableDescriptorForObject? defined in org.jetbrains.kotlin.resolve.calls.tower[DeserializedSimpleFunctionDescriptor]

'declaration' @ [1551:77] ==> val declaration: DeclarationDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[LocalVariableDescriptor]

'callElement' @ [1552:52] ==> value-parameter callElement: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[ValueParameterDescriptorImpl]

'calleeExpression' @ [1552:64] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'fakeDescriptor' @ [1553:33] ==> val fakeDescriptor: FakeCallableDescriptorForObject? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[LocalVariableDescriptor]

'calleeExpression' @ [1553:59] ==> val calleeExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[LocalVariableDescriptor]

'builder' @ [1554:33] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'read' @ [1554:41] ==> public abstract fun read(element: KtElement, target: AccessTarget, receiverValues: Map<PseudoValue, ReceiverValue>): ReadValueInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'calleeExpression' @ [1554:46] ==> val calleeExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[LocalVariableDescriptor]

'Declaration' @ [1554:77] ==> public constructor Declaration(descriptor: VariableDescriptor) defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.AccessTarget.Declaration[ClassConstructorDescriptorImpl]

'fakeDescriptor' @ [1554:89] ==> val fakeDescriptor: FakeCallableDescriptorForObject? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[LocalVariableDescriptor]

'emptyMap' @ [1554:106] ==> public fun <K, V> emptyMap(): Map<PseudoValue, ReceiverValue> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> PseudoValue
    <V> -> ReceiverValue

'receiverValues' @ [1558:21] ==> var receiverValues: SmartFMap<PseudoValue, ReceiverValue> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[LocalVariableDescriptor]

'receiverValues' @ [1558:38] ==> var receiverValues: SmartFMap<PseudoValue, ReceiverValue> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[LocalVariableDescriptor]

'plus' @ [1558:53] ==> public open fun plus(@NotNull p0: PseudoValue, p1: (ReceiverValue..ReceiverValue?)): (SmartFMap<(PseudoValue..PseudoValue?), (ReceiverValue..ReceiverValue?)>..SmartFMap<(PseudoValue..PseudoValue?), (ReceiverValue..ReceiverValue?)>?) defined in com.intellij.util.SmartFMap[JavaMethodDescriptor]

'createSyntheticValue' @ [1558:58] ==> private final fun createSyntheticValue(instructionElement: KtElement, kind: MagicKind, vararg from: KtElement): PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'callElement' @ [1558:79] ==> value-parameter callElement: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[ValueParameterDescriptorImpl]

'IMPLICIT_RECEIVER' @ [1558:102] ==> enum entry IMPLICIT_RECEIVER defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'receiver' @ [1558:122] ==> value-parameter receiver: ReceiverValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[ValueParameterDescriptorImpl]

'receiver' @ [1561:38] ==> value-parameter receiver: ReceiverValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[ValueParameterDescriptorImpl]

'expression' @ [1561:47] ==> public abstract val expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver[PropertyDescriptorImpl]

'builder' @ [1562:25] ==> private final val builder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[PropertyDescriptorImpl]

'getBoundValue' @ [1562:33] ==> public abstract fun getBoundValue(element: KtElement?): PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [1562:47] ==> val expression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[LocalVariableDescriptor]

'generateInstructions' @ [1563:25] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [1563:46] ==> val expression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[LocalVariableDescriptor]

'getBoundOrUnreachableValue' @ [1566:47] ==> private final fun getBoundOrUnreachableValue(element: KtElement?): PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [1566:74] ==> val expression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[LocalVariableDescriptor]

'receiverPseudoValue' @ [1567:25] ==> val receiverPseudoValue: PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[LocalVariableDescriptor]

'receiverValues' @ [1568:25] ==> var receiverValues: SmartFMap<PseudoValue, ReceiverValue> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[LocalVariableDescriptor]

'receiverValues' @ [1568:42] ==> var receiverValues: SmartFMap<PseudoValue, ReceiverValue> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[LocalVariableDescriptor]

'plus' @ [1568:57] ==> public open fun plus(@NotNull p0: PseudoValue, p1: (ReceiverValue..ReceiverValue?)): (SmartFMap<(PseudoValue..PseudoValue?), (ReceiverValue..ReceiverValue?)>..SmartFMap<(PseudoValue..PseudoValue?), (ReceiverValue..ReceiverValue?)>?) defined in com.intellij.util.SmartFMap[JavaMethodDescriptor]

'receiverPseudoValue' @ [1568:62] ==> val receiverPseudoValue: PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[LocalVariableDescriptor]

'receiver' @ [1568:83] ==> value-parameter receiver: ReceiverValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [1575:27] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'+' @ [1575:52] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'receiver' @ [1575:80] ==> value-parameter receiver: ReceiverValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[ValueParameterDescriptorImpl]

'receiverValues' @ [1579:20] ==> var receiverValues: SmartFMap<PseudoValue, ReceiverValue> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.getReceiverValues[LocalVariableDescriptor]

'parameterValuesArg' @ [1587:35] ==> value-parameter parameterValuesArg: SmartFMap<PseudoValue, ValueParameterDescriptor> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateValueArgument[ValueParameterDescriptorImpl]

'valueArgument' @ [1588:30] ==> value-parameter valueArgument: ValueArgument defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateValueArgument[ValueParameterDescriptorImpl]

'getArgumentExpression' @ [1588:44] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[SimpleFunctionDescriptorImpl]

'expression' @ [1589:17] ==> val expression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateValueArgument[LocalVariableDescriptor]

'!' @ [1590:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'valueArgument' @ [1590:22] ==> value-parameter valueArgument: ValueArgument defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateValueArgument[ValueParameterDescriptorImpl]

'isExternal' @ [1590:36] ==> public abstract fun isExternal(): Boolean defined in org.jetbrains.kotlin.psi.ValueArgument[SimpleFunctionDescriptorImpl]

'generateInstructions' @ [1591:21] ==> public final fun generateInstructions(element: KtElement?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [1591:42] ==> val expression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateValueArgument[LocalVariableDescriptor]

'getBoundOrUnreachableValue' @ [1594:32] ==> private final fun getBoundOrUnreachableValue(element: KtElement?): PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [1594:59] ==> val expression: KtExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateValueArgument[LocalVariableDescriptor]

'argValue' @ [1595:21] ==> val argValue: PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateValueArgument[LocalVariableDescriptor]

'parameterValues' @ [1596:21] ==> var parameterValues: SmartFMap<PseudoValue, ValueParameterDescriptor> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateValueArgument[LocalVariableDescriptor]

'parameterValues' @ [1596:39] ==> var parameterValues: SmartFMap<PseudoValue, ValueParameterDescriptor> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateValueArgument[LocalVariableDescriptor]

'plus' @ [1596:55] ==> public open fun plus(@NotNull p0: PseudoValue, p1: (ValueParameterDescriptor..ValueParameterDescriptor?)): (SmartFMap<(PseudoValue..PseudoValue?), (ValueParameterDescriptor..ValueParameterDescriptor?)>..SmartFMap<(PseudoValue..PseudoValue?), (ValueParameterDescriptor..ValueParameterDescriptor?)>?) defined in com.intellij.util.SmartFMap[JavaMethodDescriptor]

'argValue' @ [1596:60] ==> val argValue: PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateValueArgument[LocalVariableDescriptor]

'parameterDescriptor' @ [1596:70] ==> value-parameter parameterDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateValueArgument[ValueParameterDescriptorImpl]

'parameterValues' @ [1599:20] ==> var parameterValues: SmartFMap<PseudoValue, ValueParameterDescriptor> defined in org.jetbrains.kotlin.cfg.ControlFlowProcessor.CFPVisitor.generateValueArgument[LocalVariableDescriptor]

