'delegateBuilder' @ [33:9] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'loadUnit' @ [33:25] ==> public abstract fun loadUnit(expression: KtExpression): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [33:34] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.loadUnit[ValueParameterDescriptorImpl]

'delegateBuilder' @ [37:13] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'loadConstant' @ [37:29] ==> public abstract fun loadConstant(expression: KtExpression, constant: CompileTimeConstant<*>?): InstructionWithValue defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [37:42] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.loadConstant[ValueParameterDescriptorImpl]

'constant' @ [37:54] ==> value-parameter constant: CompileTimeConstant<*>? defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.loadConstant[ValueParameterDescriptorImpl]

'delegateBuilder' @ [40:13] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'createAnonymousObject' @ [40:29] ==> public abstract fun createAnonymousObject(expression: KtObjectLiteralExpression): InstructionWithValue defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [40:51] ==> value-parameter expression: KtObjectLiteralExpression defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.createAnonymousObject[ValueParameterDescriptorImpl]

'delegateBuilder' @ [42:79] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'createLambda' @ [42:95] ==> public abstract fun createLambda(expression: KtFunction): InstructionWithValue defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [42:108] ==> value-parameter expression: KtFunction defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.createLambda[ValueParameterDescriptorImpl]

'delegateBuilder' @ [45:13] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'loadStringTemplate' @ [45:29] ==> public abstract fun loadStringTemplate(expression: KtStringTemplateExpression, inputValues: List<PseudoValue>): InstructionWithValue defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [45:48] ==> value-parameter expression: KtStringTemplateExpression defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.loadStringTemplate[ValueParameterDescriptorImpl]

'inputValues' @ [45:60] ==> value-parameter inputValues: List<PseudoValue> defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.loadStringTemplate[ValueParameterDescriptorImpl]

'delegateBuilder' @ [51:50] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'magic' @ [51:66] ==> public abstract fun magic(instructionElement: KtElement, valueElement: KtElement?, inputValues: List<PseudoValue>, kind: MagicKind): MagicInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'instructionElement' @ [51:72] ==> value-parameter instructionElement: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.magic[ValueParameterDescriptorImpl]

'valueElement' @ [51:92] ==> value-parameter valueElement: KtElement? defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.magic[ValueParameterDescriptorImpl]

'inputValues' @ [51:106] ==> value-parameter inputValues: List<PseudoValue> defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.magic[ValueParameterDescriptorImpl]

'kind' @ [51:119] ==> value-parameter kind: MagicKind defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.magic[ValueParameterDescriptorImpl]

'delegateBuilder' @ [54:13] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'merge' @ [54:29] ==> public abstract fun merge(expression: KtExpression, inputValues: List<PseudoValue>): MergeInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [54:35] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.merge[ValueParameterDescriptorImpl]

'inputValues' @ [54:47] ==> value-parameter inputValues: List<PseudoValue> defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.merge[ValueParameterDescriptorImpl]

'delegateBuilder' @ [60:13] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'readVariable' @ [60:29] ==> public abstract fun readVariable(expression: KtExpression, resolvedCall: ResolvedCall<*>, receiverValues: Map<PseudoValue, ReceiverValue>): ReadValueInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [60:42] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.readVariable[ValueParameterDescriptorImpl]

'resolvedCall' @ [60:54] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.readVariable[ValueParameterDescriptorImpl]

'receiverValues' @ [60:68] ==> value-parameter receiverValues: Map<PseudoValue, ReceiverValue> defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.readVariable[ValueParameterDescriptorImpl]

'delegateBuilder' @ [67:13] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'call' @ [67:29] ==> public abstract fun call(valueElement: KtElement, resolvedCall: ResolvedCall<*>, receiverValues: Map<PseudoValue, ReceiverValue>, arguments: Map<PseudoValue, ValueParameterDescriptor>): CallInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'valueElement' @ [67:34] ==> value-parameter valueElement: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.call[ValueParameterDescriptorImpl]

'resolvedCall' @ [67:48] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.call[ValueParameterDescriptorImpl]

'receiverValues' @ [67:62] ==> value-parameter receiverValues: Map<PseudoValue, ReceiverValue> defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.call[ValueParameterDescriptorImpl]

'arguments' @ [67:78] ==> value-parameter arguments: Map<PseudoValue, ValueParameterDescriptor> defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.call[ValueParameterDescriptorImpl]

'delegateBuilder' @ [72:69] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'predefinedOperation' @ [72:85] ==> public abstract fun predefinedOperation(expression: KtExpression, operation: ControlFlowBuilder.PredefinedOperation, inputValues: List<PseudoValue>): OperationInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [72:105] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.predefinedOperation[ValueParameterDescriptorImpl]

'operation' @ [72:117] ==> value-parameter operation: ControlFlowBuilder.PredefinedOperation defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.predefinedOperation[ValueParameterDescriptorImpl]

'inputValues' @ [72:128] ==> value-parameter inputValues: List<PseudoValue> defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.predefinedOperation[ValueParameterDescriptorImpl]

'delegateBuilder' @ [74:48] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'createUnboundLabel' @ [74:64] ==> public abstract fun createUnboundLabel(): Label defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'delegateBuilder' @ [76:60] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'createUnboundLabel' @ [76:76] ==> public abstract fun createUnboundLabel(name: String): Label defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'name' @ [76:95] ==> value-parameter name: String defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.createUnboundLabel[ValueParameterDescriptorImpl]

'delegateBuilder' @ [79:9] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'bindLabel' @ [79:25] ==> public abstract fun bindLabel(label: Label): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'label' @ [79:35] ==> value-parameter label: Label defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.bindLabel[ValueParameterDescriptorImpl]

'delegateBuilder' @ [83:9] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'jump' @ [83:25] ==> public abstract fun jump(label: Label, element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'label' @ [83:30] ==> value-parameter label: Label defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.jump[ValueParameterDescriptorImpl]

'element' @ [83:37] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.jump[ValueParameterDescriptorImpl]

'delegateBuilder' @ [87:9] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'jumpOnFalse' @ [87:25] ==> public abstract fun jumpOnFalse(label: Label, element: KtElement, conditionValue: PseudoValue?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'label' @ [87:37] ==> value-parameter label: Label defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.jumpOnFalse[ValueParameterDescriptorImpl]

'element' @ [87:44] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.jumpOnFalse[ValueParameterDescriptorImpl]

'conditionValue' @ [87:53] ==> value-parameter conditionValue: PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.jumpOnFalse[ValueParameterDescriptorImpl]

'delegateBuilder' @ [91:9] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'jumpOnTrue' @ [91:25] ==> public abstract fun jumpOnTrue(label: Label, element: KtElement, conditionValue: PseudoValue?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'label' @ [91:36] ==> value-parameter label: Label defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.jumpOnTrue[ValueParameterDescriptorImpl]

'element' @ [91:43] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.jumpOnTrue[ValueParameterDescriptorImpl]

'conditionValue' @ [91:52] ==> value-parameter conditionValue: PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.jumpOnTrue[ValueParameterDescriptorImpl]

'delegateBuilder' @ [95:9] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'nondeterministicJump' @ [95:25] ==> public abstract fun nondeterministicJump(label: Label, element: KtElement, inputValue: PseudoValue?): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'label' @ [95:46] ==> value-parameter label: Label defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.nondeterministicJump[ValueParameterDescriptorImpl]

'element' @ [95:53] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.nondeterministicJump[ValueParameterDescriptorImpl]

'inputValue' @ [95:62] ==> value-parameter inputValue: PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.nondeterministicJump[ValueParameterDescriptorImpl]

'delegateBuilder' @ [99:9] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'nondeterministicJump' @ [99:25] ==> public abstract fun nondeterministicJump(label: List<Label>, element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'label' @ [99:46] ==> value-parameter label: List<Label> defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.nondeterministicJump[ValueParameterDescriptorImpl]

'element' @ [99:53] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.nondeterministicJump[ValueParameterDescriptorImpl]

'delegateBuilder' @ [103:9] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'jumpToError' @ [103:25] ==> public abstract fun jumpToError(element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'element' @ [103:37] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.jumpToError[ValueParameterDescriptorImpl]

'delegateBuilder' @ [107:9] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'throwException' @ [107:25] ==> public abstract fun throwException(throwExpression: KtThrowExpression, thrownValue: PseudoValue): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'throwExpression' @ [107:40] ==> value-parameter throwExpression: KtThrowExpression defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.throwException[ValueParameterDescriptorImpl]

'thrownValue' @ [107:57] ==> value-parameter thrownValue: PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.throwException[ValueParameterDescriptorImpl]

'delegateBuilder' @ [110:76] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'getSubroutineExitPoint' @ [110:92] ==> public abstract fun getSubroutineExitPoint(labelElement: KtElement): Label? defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'labelElement' @ [110:115] ==> value-parameter labelElement: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.getSubroutineExitPoint[ValueParameterDescriptorImpl]

'delegateBuilder' @ [112:79] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'getLoopConditionEntryPoint' @ [112:95] ==> public abstract fun getLoopConditionEntryPoint(loop: KtLoopExpression): Label? defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'loop' @ [112:122] ==> value-parameter loop: KtLoopExpression defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.getLoopConditionEntryPoint[ValueParameterDescriptorImpl]

'delegateBuilder' @ [114:69] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'getLoopExitPoint' @ [114:85] ==> public abstract fun getLoopExitPoint(loop: KtLoopExpression): Label? defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'loop' @ [114:102] ==> value-parameter loop: KtLoopExpression defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.getLoopExitPoint[ValueParameterDescriptorImpl]

'delegateBuilder' @ [116:70] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'enterLoop' @ [116:86] ==> public abstract fun enterLoop(expression: KtLoopExpression): LoopInfo defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [116:96] ==> value-parameter expression: KtLoopExpression defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.enterLoop[ValueParameterDescriptorImpl]

'delegateBuilder' @ [119:9] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'enterLoopBody' @ [119:25] ==> public abstract fun enterLoopBody(expression: KtLoopExpression): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [119:39] ==> value-parameter expression: KtLoopExpression defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.enterLoopBody[ValueParameterDescriptorImpl]

'delegateBuilder' @ [123:9] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'exitLoopBody' @ [123:25] ==> public abstract fun exitLoopBody(expression: KtLoopExpression): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [123:38] ==> value-parameter expression: KtLoopExpression defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.exitLoopBody[ValueParameterDescriptorImpl]

'delegateBuilder' @ [127:17] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'currentLoop' @ [127:33] ==> public abstract val currentLoop: KtLoopExpression? defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[PropertyDescriptorImpl]

'delegateBuilder' @ [130:9] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'enterTryFinally' @ [130:25] ==> public abstract fun enterTryFinally(trigger: GenerationTrigger): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'trigger' @ [130:41] ==> value-parameter trigger: GenerationTrigger defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.enterTryFinally[ValueParameterDescriptorImpl]

'delegateBuilder' @ [134:9] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'exitTryFinally' @ [134:25] ==> public abstract fun exitTryFinally(): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'delegateBuilder' @ [138:9] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'enterSubroutine' @ [138:25] ==> public abstract fun enterSubroutine(subroutine: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'subroutine' @ [138:41] ==> value-parameter subroutine: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.enterSubroutine[ValueParameterDescriptorImpl]

'delegateBuilder' @ [141:70] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'exitSubroutine' @ [141:86] ==> public abstract fun exitSubroutine(subroutine: KtElement): Pseudocode defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'subroutine' @ [141:101] ==> value-parameter subroutine: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.exitSubroutine[ValueParameterDescriptorImpl]

'delegateBuilder' @ [144:17] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'currentSubroutine' @ [144:33] ==> public abstract val currentSubroutine: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[PropertyDescriptorImpl]

'delegateBuilder' @ [147:17] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'returnSubroutine' @ [147:33] ==> public abstract val returnSubroutine: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[PropertyDescriptorImpl]

'delegateBuilder' @ [150:9] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'returnValue' @ [150:25] ==> public abstract fun returnValue(returnExpression: KtExpression, returnValue: PseudoValue, subroutine: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'returnExpression' @ [150:37] ==> value-parameter returnExpression: KtExpression defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.returnValue[ValueParameterDescriptorImpl]

'returnValue' @ [150:55] ==> value-parameter returnValue: PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.returnValue[ValueParameterDescriptorImpl]

'subroutine' @ [150:68] ==> value-parameter subroutine: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.returnValue[ValueParameterDescriptorImpl]

'delegateBuilder' @ [154:9] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'returnNoValue' @ [154:25] ==> public abstract fun returnNoValue(returnExpression: KtReturnExpression, subroutine: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'returnExpression' @ [154:39] ==> value-parameter returnExpression: KtReturnExpression defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.returnNoValue[ValueParameterDescriptorImpl]

'subroutine' @ [154:57] ==> value-parameter subroutine: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.returnNoValue[ValueParameterDescriptorImpl]

'delegateBuilder' @ [158:13] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'read' @ [158:29] ==> public abstract fun read(element: KtElement, target: AccessTarget, receiverValues: Map<PseudoValue, ReceiverValue>): ReadValueInstruction defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'element' @ [158:34] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.read[ValueParameterDescriptorImpl]

'target' @ [158:43] ==> value-parameter target: AccessTarget defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.read[ValueParameterDescriptorImpl]

'receiverValues' @ [158:51] ==> value-parameter receiverValues: Map<PseudoValue, ReceiverValue> defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.read[ValueParameterDescriptorImpl]

'delegateBuilder' @ [166:9] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'write' @ [166:25] ==> public abstract fun write(assignment: KtElement, lValue: KtElement, rValue: PseudoValue, target: AccessTarget, receiverValues: Map<PseudoValue, ReceiverValue>): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'assignment' @ [166:31] ==> value-parameter assignment: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.write[ValueParameterDescriptorImpl]

'lValue' @ [166:43] ==> value-parameter lValue: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.write[ValueParameterDescriptorImpl]

'rValue' @ [166:51] ==> value-parameter rValue: PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.write[ValueParameterDescriptorImpl]

'target' @ [166:59] ==> value-parameter target: AccessTarget defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.write[ValueParameterDescriptorImpl]

'receiverValues' @ [166:67] ==> value-parameter receiverValues: Map<PseudoValue, ReceiverValue> defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.write[ValueParameterDescriptorImpl]

'delegateBuilder' @ [170:9] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'declareParameter' @ [170:25] ==> public abstract fun declareParameter(parameter: KtParameter): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'parameter' @ [170:42] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.declareParameter[ValueParameterDescriptorImpl]

'delegateBuilder' @ [174:9] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'declareVariable' @ [174:25] ==> public abstract fun declareVariable(property: KtVariableDeclaration): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'property' @ [174:41] ==> value-parameter property: KtVariableDeclaration defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.declareVariable[ValueParameterDescriptorImpl]

'delegateBuilder' @ [178:9] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'declareFunction' @ [178:25] ==> public abstract fun declareFunction(subroutine: KtElement, pseudocode: Pseudocode): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'subroutine' @ [178:41] ==> value-parameter subroutine: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.declareFunction[ValueParameterDescriptorImpl]

'pseudocode' @ [178:53] ==> value-parameter pseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.declareFunction[ValueParameterDescriptorImpl]

'delegateBuilder' @ [182:9] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'declareEntryOrObject' @ [182:25] ==> public abstract fun declareEntryOrObject(entryOrObject: KtClassOrObject): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'entryOrObject' @ [182:46] ==> value-parameter entryOrObject: KtClassOrObject defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.declareEntryOrObject[ValueParameterDescriptorImpl]

'delegateBuilder' @ [186:9] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'repeatPseudocode' @ [186:25] ==> public abstract fun repeatPseudocode(startLabel: Label, finishLabel: Label): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'startLabel' @ [186:42] ==> value-parameter startLabel: Label defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.repeatPseudocode[ValueParameterDescriptorImpl]

'finishLabel' @ [186:54] ==> value-parameter finishLabel: Label defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.repeatPseudocode[ValueParameterDescriptorImpl]

'delegateBuilder' @ [190:9] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'mark' @ [190:25] ==> public abstract fun mark(element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'element' @ [190:30] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.mark[ValueParameterDescriptorImpl]

'delegateBuilder' @ [193:69] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'getBoundValue' @ [193:85] ==> public abstract fun getBoundValue(element: KtElement?): PseudoValue? defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'element' @ [193:99] ==> value-parameter element: KtElement? defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.getBoundValue[ValueParameterDescriptorImpl]

'delegateBuilder' @ [196:9] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'bindValue' @ [196:25] ==> public abstract fun bindValue(value: PseudoValue, element: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'value' @ [196:35] ==> value-parameter value: PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.bindValue[ValueParameterDescriptorImpl]

'element' @ [196:42] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.bindValue[ValueParameterDescriptorImpl]

'delegateBuilder' @ [199:63] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'newValue' @ [199:79] ==> public abstract fun newValue(element: KtElement?): PseudoValue defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'element' @ [199:88] ==> value-parameter element: KtElement? defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.newValue[ValueParameterDescriptorImpl]

'delegateBuilder' @ [202:9] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'enterBlockScope' @ [202:25] ==> public abstract fun enterBlockScope(block: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'block' @ [202:41] ==> value-parameter block: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.enterBlockScope[ValueParameterDescriptorImpl]

'delegateBuilder' @ [206:9] ==> protected abstract val delegateBuilder: ControlFlowBuilder defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter[PropertyDescriptorImpl]

'exitBlockScope' @ [206:25] ==> public abstract fun exitBlockScope(block: KtElement): Unit defined in org.jetbrains.kotlin.cfg.ControlFlowBuilder[SimpleFunctionDescriptorImpl]

'block' @ [206:40] ==> value-parameter block: KtElement defined in org.jetbrains.kotlin.cfg.ControlFlowBuilderAdapter.exitBlockScope[ValueParameterDescriptorImpl]

