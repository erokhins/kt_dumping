'KotlinUsageInfo<KtCallElement>' @ [60:5] ==> public constructor KotlinUsageInfo<T : PsiElement>(element: KtCallElement) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinUsageInfo[ClassConstructorDescriptorImpl]
Inferred types:
    <T : PsiElement> -> KtCallElement

'element' @ [60:36] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.<init>[ValueParameterDescriptorImpl]

'element' @ [61:27] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.<init>[ValueParameterDescriptorImpl]

'analyze' @ [61:35] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [61:59] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'element' @ [62:32] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.<init>[ValueParameterDescriptorImpl]

'getResolvedCall' @ [62:40] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [62:56] ==> private final val context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[PropertyDescriptorImpl]

'shouldSkipUsage' @ [65:13] ==> private final fun shouldSkipUsage(element: KtCallElement): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[SimpleFunctionDescriptorImpl]

'element' @ [65:29] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.processUsage[ValueParameterDescriptorImpl]

'changeNameIfNeeded' @ [67:9] ==> private final fun changeNameIfNeeded(changeInfo: KotlinChangeInfo, element: KtCallElement): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[SimpleFunctionDescriptorImpl]

'changeInfo' @ [67:28] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.processUsage[ValueParameterDescriptorImpl]

'element' @ [67:40] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.processUsage[ValueParameterDescriptorImpl]

'element' @ [69:13] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.processUsage[ValueParameterDescriptorImpl]

'valueArgumentList' @ [69:21] ==> public final val KtCallElement.valueArgumentList: KtValueArgumentList?[MyPropertyDescriptor]

'if (changeInfo.isParameterSetOrOrderChanged) {
                updateArgumentsAndReceiver(changeInfo, element, allUsages)
            }
            else {
                changeArgumentNames(changeInfo, element)
            }' @ [70:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'changeInfo' @ [70:17] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.processUsage[ValueParameterDescriptorImpl]

'isParameterSetOrOrderChanged' @ [70:28] ==> public final val KotlinChangeInfo.isParameterSetOrOrderChanged: Boolean[MyPropertyDescriptor]

'updateArgumentsAndReceiver' @ [71:17] ==> private final fun updateArgumentsAndReceiver(changeInfo: KotlinChangeInfo, element: KtCallElement, allUsages: Array<out UsageInfo>): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[SimpleFunctionDescriptorImpl]

'changeInfo' @ [71:44] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.processUsage[ValueParameterDescriptorImpl]

'element' @ [71:56] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.processUsage[ValueParameterDescriptorImpl]

'allUsages' @ [71:65] ==> value-parameter allUsages: Array<out UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.processUsage[ValueParameterDescriptorImpl]

'changeArgumentNames' @ [74:17] ==> private final fun changeArgumentNames(changeInfo: KotlinChangeInfo, element: KtCallElement): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[SimpleFunctionDescriptorImpl]

'changeInfo' @ [74:37] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.processUsage[ValueParameterDescriptorImpl]

'element' @ [74:49] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.processUsage[ValueParameterDescriptorImpl]

'changeInfo' @ [78:13] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.processUsage[ValueParameterDescriptorImpl]

'getNewParametersCount' @ [78:24] ==> public final fun getNewParametersCount(): Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[SimpleFunctionDescriptorImpl]

'element' @ [78:56] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.processUsage[ValueParameterDescriptorImpl]

'element' @ [79:29] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.processUsage[ValueParameterDescriptorImpl]

'getStrictParentOfType' @ [79:37] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtEnumEntry? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtEnumEntry

'enumEntry' @ [80:17] ==> val enumEntry: KtEnumEntry? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.processUsage[LocalVariableDescriptor]

'enumEntry' @ [80:38] ==> val enumEntry: KtEnumEntry? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.processUsage[LocalVariableDescriptor]

'initializerList' @ [80:48] ==> public final val KtEnumEntry.initializerList: KtInitializerList?[MyPropertyDescriptor]

'element' @ [80:67] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.processUsage[ValueParameterDescriptorImpl]

'parent' @ [80:75] ==> public final val KtSuperTypeCallEntry.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'enumEntry' @ [81:39] ==> val enumEntry: KtEnumEntry? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.processUsage[LocalVariableDescriptor]

'initializerList' @ [81:49] ==> public final val KtEnumEntry.initializerList: KtInitializerList?[MyPropertyDescriptor]

'enumEntry' @ [82:17] ==> val enumEntry: KtEnumEntry? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.processUsage[LocalVariableDescriptor]

'deleteChildRange' @ [82:27] ==> public open fun deleteChildRange(p0: (PsiElement..PsiElement?), p1: (PsiElement..PsiElement?)): Unit defined in org.jetbrains.kotlin.psi.KtEnumEntry[JavaMethodDescriptor]

'enumEntry' @ [82:44] ==> val enumEntry: KtEnumEntry? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.processUsage[LocalVariableDescriptor]

'getColon' @ [82:54] ==> public final fun getColon(): PsiElement? defined in org.jetbrains.kotlin.psi.KtEnumEntry[DeserializedSimpleFunctionDescriptor]

'initializerList' @ [82:68] ==> val initializerList: KtInitializerList? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.processUsage[LocalVariableDescriptor]

'initializerList' @ [82:85] ==> val initializerList: KtInitializerList? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.processUsage[LocalVariableDescriptor]

'resolvedCall' @ [91:13] ==> private final val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[PropertyDescriptorImpl]

'element' @ [91:37] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.shouldSkipUsage[ValueParameterDescriptorImpl]

'resolvedCall' @ [92:13] ==> private final val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[PropertyDescriptorImpl]

'resolvedCall' @ [92:37] ==> private final val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[PropertyDescriptorImpl]

'isReallySuccess' @ [92:50] ==> public fun ResolvedCall<*>.isReallySuccess(): Boolean defined in org.jetbrains.kotlin.resolve.calls.model[DeserializedSimpleFunctionDescriptor]

'element' @ [95:13] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.shouldSkipUsage[ValueParameterDescriptorImpl]

'element' @ [95:48] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.shouldSkipUsage[ValueParameterDescriptorImpl]

'parent' @ [95:56] ==> public final val KtSuperTypeCallEntry.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [95:63] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'!' @ [97:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [97:14] ==> private final val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[PropertyDescriptorImpl]

'call' @ [97:27] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'valueArguments' @ [97:32] ==> public final val Call.valueArguments: List<(ValueArgument..ValueArgument?)>[MyPropertyDescriptor]

'all' @ [97:47] ==> public inline fun <T> Iterable<(ValueArgument..ValueArgument?)>.all(predicate: ((ValueArgument..ValueArgument?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)

'resolvedCall' @ [97:52] ==> private final val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[PropertyDescriptorImpl]

'getArgumentMapping' @ [97:65] ==> @NotNull public abstract fun getArgumentMapping(@NotNull p0: ValueArgument): ArgumentMapping defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCall[JavaMethodDescriptor]

'it' @ [97:84] ==> value-parameter it: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.shouldSkipUsage.<anonymous>[ValueParameterDescriptorImpl]

'resolvedCall' @ [99:25] ==> private final val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[PropertyDescriptorImpl]

'valueArguments' @ [99:38] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.valueArguments: (MutableMap<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>..Map<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'!' @ [100:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [100:17] ==> private final val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[PropertyDescriptorImpl]

'resultingDescriptor' @ [100:30] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'valueParameters' @ [100:50] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'all' @ [100:66] ==> public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.all(predicate: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'arguments' @ [100:71] ==> val arguments: (MutableMap<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>..Map<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.shouldSkipUsage[LocalVariableDescriptor]

'containsKey' @ [100:81] ==> public abstract fun containsKey(key: (ValueParameterDescriptor..ValueParameterDescriptor?)): Boolean defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'it' @ [100:93] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.shouldSkipUsage.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [105:33] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[LazyClassReceiverParameterDescriptor]

'callee' @ [105:38] ==> private final val callee: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[PropertyDescriptorImpl]

'element' @ [105:45] ==> public final val <T : PsiElement> KotlinCallableDefinitionUsage<out PsiElement>.element: PsiElement?[MyPropertyDescriptor]
Inferred types:
    <T : PsiElement> -> PsiElement

'calleeElement' @ [106:17] ==> val calleeElement: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.<get-isPropertyJavaUsage>[LocalVariableDescriptor]

'calleeElement' @ [106:49] ==> val calleeElement: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.<get-isPropertyJavaUsage>[LocalVariableDescriptor]

'resolvedCall' @ [107:20] ==> private final val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[PropertyDescriptorImpl]

'resultingDescriptor' @ [107:34] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'!' @ [111:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'changeInfo' @ [111:14] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.changeNameIfNeeded[ValueParameterDescriptorImpl]

'isNameChanged' @ [111:25] ==> public final val KotlinChangeInfo.isNameChanged: Boolean[MyPropertyDescriptor]

'element' @ [113:22] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.changeNameIfNeeded[ValueParameterDescriptorImpl]

'calleeExpression' @ [113:30] ==> public final val KtCallElement.calleeExpression: KtExpression?[MyPropertyDescriptor]

'callee' @ [114:13] ==> val callee: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.changeNameIfNeeded[LocalVariableDescriptor]

'changeInfo' @ [116:23] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.changeNameIfNeeded[ValueParameterDescriptorImpl]

'newName' @ [116:34] ==> public final var KotlinChangeInfo.newName: String[MyPropertyDescriptor]

'isPropertyJavaUsage' @ [117:13] ==> private final val isPropertyJavaUsage: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[PropertyDescriptorImpl]

'callee' @ [118:31] ==> val callee: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.changeNameIfNeeded[LocalVariableDescriptor]

'getReferencedName' @ [118:38] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'if (JvmAbi.isGetterName(currentName))
                newName = JvmAbi.getterName(newName)
            else if (JvmAbi.isSetterName(currentName)) newName = JvmAbi.setterName(newName)' @ [119:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isGetterName' @ [119:24] ==> public open fun isGetterName(@NotNull p0: String): Boolean defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaMethodDescriptor]

'currentName' @ [119:37] ==> val currentName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.changeNameIfNeeded[LocalVariableDescriptor]

'newName' @ [120:17] ==> var newName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.changeNameIfNeeded[LocalVariableDescriptor]

'getterName' @ [120:34] ==> @NotNull public open fun getterName(@NotNull p0: String): String defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaMethodDescriptor]

'newName' @ [120:45] ==> var newName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.changeNameIfNeeded[LocalVariableDescriptor]

'isSetterName' @ [121:29] ==> public open fun isSetterName(@NotNull p0: String): Boolean defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaMethodDescriptor]

'currentName' @ [121:42] ==> val currentName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.changeNameIfNeeded[LocalVariableDescriptor]

'newName' @ [121:56] ==> var newName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.changeNameIfNeeded[LocalVariableDescriptor]

'setterName' @ [121:73] ==> @NotNull public open fun setterName(@NotNull p0: String): String defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaMethodDescriptor]

'newName' @ [121:84] ==> var newName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.changeNameIfNeeded[LocalVariableDescriptor]

'callee' @ [124:9] ==> val callee: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.changeNameIfNeeded[LocalVariableDescriptor]

'replace' @ [124:16] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'KtPsiFactory' @ [124:24] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [124:37] ==> public final val KotlinFunctionCallUsage.project: Project[MyPropertyDescriptor]

'createSimpleName' @ [124:46] ==> public final fun createSimpleName(name: String): KtSimpleNameExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'newName' @ [124:63] ==> var newName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.changeNameIfNeeded[LocalVariableDescriptor]

'receiverValue' @ [132:13] ==> value-parameter receiverValue: ReceiverValue? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.getReceiverExpressionIfMatched[ValueParameterDescriptorImpl]

'if (originalDescriptor is CallableDescriptor && originalDescriptor !is ReceiverParameterDescriptor) {
            originalDescriptor.extensionReceiverParameter ?: return null
        }
        else originalDescriptor' @ [136:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DeclarationDescriptor, elseBranch: DeclarationDescriptor): DeclarationDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DeclarationDescriptor

'originalDescriptor' @ [136:38] ==> value-parameter originalDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.getReceiverExpressionIfMatched[ValueParameterDescriptorImpl]

'originalDescriptor' @ [136:82] ==> value-parameter originalDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.getReceiverExpressionIfMatched[ValueParameterDescriptorImpl]

'originalDescriptor' @ [137:13] ==> value-parameter originalDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.getReceiverExpressionIfMatched[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [137:32] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'originalDescriptor' @ [139:14] ==> value-parameter originalDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.getReceiverExpressionIfMatched[ValueParameterDescriptorImpl]

'resolvedCall' @ [141:34] ==> private final val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[PropertyDescriptorImpl]

'extensionReceiver' @ [141:49] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'receiverValue' @ [141:70] ==> value-parameter receiverValue: ReceiverValue? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.getReceiverExpressionIfMatched[ValueParameterDescriptorImpl]

'adjustedDescriptor' @ [142:35] ==> val adjustedDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.getReceiverExpressionIfMatched[LocalVariableDescriptor]

'adjustedDescriptor' @ [142:88] ==> val adjustedDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.getReceiverExpressionIfMatched[LocalVariableDescriptor]

'value' @ [142:107] ==> public final val ReceiverParameterDescriptor.value: ReceiverValue[MyPropertyDescriptor]

'currentIsExtension' @ [143:13] ==> val currentIsExtension: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.getReceiverExpressionIfMatched[LocalVariableDescriptor]

'originalIsExtension' @ [143:35] ==> val originalIsExtension: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.getReceiverExpressionIfMatched[LocalVariableDescriptor]

'when (adjustedDescriptor) {
            is ReceiverParameterDescriptor -> adjustedDescriptor.type
            is ClassDescriptor -> adjustedDescriptor.defaultType
            else -> null
        }' @ [145:28] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinType?, entry1: KotlinType?, entry2: KotlinType?): KotlinType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KotlinType?

'adjustedDescriptor' @ [145:34] ==> val adjustedDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.getReceiverExpressionIfMatched[LocalVariableDescriptor]

'adjustedDescriptor' @ [146:47] ==> val adjustedDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.getReceiverExpressionIfMatched[LocalVariableDescriptor]

'type' @ [146:66] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'adjustedDescriptor' @ [147:35] ==> val adjustedDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.getReceiverExpressionIfMatched[LocalVariableDescriptor]

'defaultType' @ [147:54] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'originalType' @ [150:13] ==> val originalType: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.getReceiverExpressionIfMatched[LocalVariableDescriptor]

'!' @ [150:37] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'DEFAULT' @ [150:56] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'isSubtypeOf' @ [150:64] ==> public abstract fun isSubtypeOf(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'receiverValue' @ [150:76] ==> value-parameter receiverValue: ReceiverValue? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.getReceiverExpressionIfMatched[ValueParameterDescriptorImpl]

'type' @ [150:90] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'originalType' @ [150:96] ==> val originalType: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.getReceiverExpressionIfMatched[LocalVariableDescriptor]

'getReceiverExpression' @ [152:16] ==> private final fun getReceiverExpression(receiver: ReceiverValue, psiFactory: KtPsiFactory): KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.Companion[SimpleFunctionDescriptorImpl]

'receiverValue' @ [152:38] ==> value-parameter receiverValue: ReceiverValue? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.getReceiverExpressionIfMatched[ValueParameterDescriptorImpl]

'psiFactory' @ [152:53] ==> value-parameter psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.getReceiverExpressionIfMatched[ValueParameterDescriptorImpl]

'when {
            element is KtConstantExpression || element is KtThisExpression || element is KtSimpleNameExpression -> false
            element is KtBinaryExpression && OperatorConventions.ASSIGNMENT_OPERATIONS.contains(element.operationToken) -> true
            element is KtUnaryExpression && OperatorConventions.INCREMENT_OPERATIONS.contains(element.operationToken) -> true
            element is KtCallExpression -> element.getResolvedCall(context)?.resultingDescriptor is ConstructorDescriptor
            else -> element.children.any { needSeparateVariable(it) }
        }' @ [156:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean, entry4: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'element' @ [157:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.needSeparateVariable[ValueParameterDescriptorImpl]

'element' @ [157:48] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.needSeparateVariable[ValueParameterDescriptorImpl]

'element' @ [157:79] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.needSeparateVariable[ValueParameterDescriptorImpl]

'element' @ [158:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.needSeparateVariable[ValueParameterDescriptorImpl]

'ASSIGNMENT_OPERATIONS' @ [158:66] ==> public final val ASSIGNMENT_OPERATIONS: (ImmutableBiMap<(KtSingleValueToken..KtSingleValueToken?), (Name..Name?)>..ImmutableBiMap<(KtSingleValueToken..KtSingleValueToken?), (Name..Name?)>?) defined in org.jetbrains.kotlin.types.expressions.OperatorConventions[JavaPropertyDescriptor]

'contains' @ [158:88] ==> @InlineOnly public operator inline fun <@OnlyInputTypes K, V> Map<out (IElementType..IElementType?), (Name..Name?)>.contains(key: (IElementType..IElementType?)): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes K> -> (com.intellij.psi.tree.IElementType..com.intellij.psi.tree.IElementType?)
    <V> -> (org.jetbrains.kotlin.name.Name..org.jetbrains.kotlin.name.Name?)

'element' @ [158:97] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.needSeparateVariable[ValueParameterDescriptorImpl]

'operationToken' @ [158:105] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'element' @ [159:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.needSeparateVariable[ValueParameterDescriptorImpl]

'INCREMENT_OPERATIONS' @ [159:65] ==> public final val INCREMENT_OPERATIONS: (ImmutableSet<(KtSingleValueToken..KtSingleValueToken?)>..ImmutableSet<(KtSingleValueToken..KtSingleValueToken?)>?) defined in org.jetbrains.kotlin.types.expressions.OperatorConventions[JavaPropertyDescriptor]

'contains' @ [159:86] ==> public operator fun <@OnlyInputTypes T> Iterable<(IElementType..IElementType?)>.contains(element: (IElementType..IElementType?)): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (com.intellij.psi.tree.IElementType..com.intellij.psi.tree.IElementType?)

'element' @ [159:95] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.needSeparateVariable[ValueParameterDescriptorImpl]

'operationToken' @ [159:103] ==> public final val KtUnaryExpression.operationToken: (IElementType..IElementType?)[MyPropertyDescriptor]

'element' @ [160:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.needSeparateVariable[ValueParameterDescriptorImpl]

'element' @ [160:44] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.needSeparateVariable[ValueParameterDescriptorImpl]

'getResolvedCall' @ [160:52] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [160:68] ==> private final val context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[PropertyDescriptorImpl]

'resultingDescriptor' @ [160:78] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'element' @ [161:21] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.needSeparateVariable[ValueParameterDescriptorImpl]

'children' @ [161:29] ==> public final val PsiElement.children: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'any' @ [161:38] ==> public inline fun <T> Array<out (PsiElement..PsiElement?)>.any(predicate: ((PsiElement..PsiElement?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'needSeparateVariable' @ [161:44] ==> private final fun needSeparateVariable(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[SimpleFunctionDescriptorImpl]

'it' @ [161:65] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.needSeparateVariable.<anonymous>[ValueParameterDescriptorImpl]

'referenceMap' @ [170:13] ==> value-parameter referenceMap: Map<PsiReference, DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[ValueParameterDescriptorImpl]

'isEmpty' @ [170:26] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [170:39] ==> private final val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[PropertyDescriptorImpl]

'expression' @ [170:68] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[ValueParameterDescriptorImpl]

'expression' @ [172:29] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[ValueParameterDescriptorImpl]

'copy' @ [172:40] ==> public abstract fun copy(): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'createNameCounterpartMap' @ [174:34] ==> public fun createNameCounterpartMap(from: KtElement, to: KtElement): Map<KtSimpleNameExpression, KtSimpleNameExpression> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine[SimpleFunctionDescriptorImpl]

'expression' @ [174:59] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[ValueParameterDescriptorImpl]

'newExpression' @ [174:71] ==> var newExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'resolvedCall' @ [176:30] ==> private final val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[PropertyDescriptorImpl]

'valueArguments' @ [176:43] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.valueArguments: (MutableMap<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>..Map<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'ArrayList' @ [178:28] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Pair<KtExpression, KtExpression>

'component1' @ [179:21] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<PsiReference, DeclarationDescriptor>.component1(): PsiReference defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> PsiReference
    <V> -> DeclarationDescriptor

'component2' @ [179:26] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<PsiReference, DeclarationDescriptor>.component2(): DeclarationDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> PsiReference
    <V> -> DeclarationDescriptor

'referenceMap' @ [179:41] ==> value-parameter referenceMap: Map<PsiReference, DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[ValueParameterDescriptorImpl]

'entries' @ [179:54] ==> public abstract val entries: Set<Map.Entry<PsiReference, DeclarationDescriptor>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'if (descriptor is ValueParameterDescriptor) {
                // Ordinary parameter
                // Find corresponding parameter in the current function (may differ from 'descriptor' if original function is part of override hierarchy)
                val parameterDescriptor = resolvedCall.resultingDescriptor.valueParameters[descriptor.index]
                val resolvedValueArgument = valueArguments[parameterDescriptor] as? ExpressionValueArgument ?: continue
                val argument = resolvedValueArgument.valueArgument ?: continue

                addReceiver = false
                argumentExpression = argument.getArgumentExpression()
            }
            else {
                addReceiver = descriptor !is ReceiverParameterDescriptor
                argumentExpression =
                        getReceiverExpressionIfMatched(resolvedCall.extensionReceiver, descriptor, psiFactory)
                        ?: getReceiverExpressionIfMatched(resolvedCall.dispatchReceiver, descriptor, psiFactory)
            }' @ [182:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'descriptor' @ [182:17] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'resolvedCall' @ [185:43] ==> private final val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[PropertyDescriptorImpl]

'resultingDescriptor' @ [185:56] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'valueParameters' @ [185:76] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'descriptor' @ [185:92] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'index' @ [185:103] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'valueArguments' @ [186:45] ==> val valueArguments: (MutableMap<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>..Map<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'parameterDescriptor' @ [186:60] ==> val parameterDescriptor: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'resolvedValueArgument' @ [187:32] ==> val resolvedValueArgument: ExpressionValueArgument defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'valueArgument' @ [187:54] ==> public final val ExpressionValueArgument.valueArgument: ValueArgument?[MyPropertyDescriptor]

'addReceiver' @ [189:17] ==> val addReceiver: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'argumentExpression' @ [190:17] ==> var argumentExpression: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'argument' @ [190:38] ==> val argument: ValueArgument defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'getArgumentExpression' @ [190:47] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'addReceiver' @ [193:17] ==> val addReceiver: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'descriptor' @ [193:31] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'argumentExpression' @ [194:17] ==> var argumentExpression: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'getReceiverExpressionIfMatched' @ [195:25] ==> private final fun getReceiverExpressionIfMatched(receiverValue: ReceiverValue?, originalDescriptor: DeclarationDescriptor, psiFactory: KtPsiFactory): KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [195:56] ==> private final val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[PropertyDescriptorImpl]

'extensionReceiver' @ [195:69] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'descriptor' @ [195:88] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'psiFactory' @ [195:100] ==> value-parameter psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[ValueParameterDescriptorImpl]

'getReceiverExpressionIfMatched' @ [196:28] ==> private final fun getReceiverExpressionIfMatched(receiverValue: ReceiverValue?, originalDescriptor: DeclarationDescriptor, psiFactory: KtPsiFactory): KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [196:59] ==> private final val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[PropertyDescriptorImpl]

'dispatchReceiver' @ [196:72] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'descriptor' @ [196:90] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'psiFactory' @ [196:102] ==> value-parameter psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[ValueParameterDescriptorImpl]

'argumentExpression' @ [198:17] ==> var argumentExpression: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'needSeparateVariable' @ [200:17] ==> private final fun needSeparateVariable(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[SimpleFunctionDescriptorImpl]

'argumentExpression' @ [200:38] ==> var argumentExpression: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'==' @ [201:20] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.psi.KtElement[DeserializedSimpleFunctionDescriptor]

'getNonStrictParentOfType' @ [201:32] ==> @SafeVarargs @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getNonStrictParentOfType(@Nullable p0: PsiElement?, @NotNull vararg p1: (Class<out ({KtElement & ASTDelegatePsiElement}..{KtElement & ASTDelegatePsiElement}?)>..Class<out ({KtElement & ASTDelegatePsiElement}..{KtElement & ASTDelegatePsiElement}?)>?)): {KtElement & ASTDelegatePsiElement}? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> {KtElement & ASTDelegatePsiElement}

'element' @ [201:57] ==> public final val KotlinFunctionCallUsage.element: KtCallElement?[MyPropertyDescriptor]

'KtConstructorDelegationCall' @ [202:57] ==> public constructor KtConstructorDelegationCall(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtConstructorDelegationCall[JavaClassConstructorDescriptor]

'java' @ [202:92] ==> public val <T> KClass<KtConstructorDelegationCall>.java: Class<KtConstructorDelegationCall> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtConstructorDelegationCall

'java' @ [203:85] ==> public val <T> KClass<KtSuperTypeListEntry>.java: Class<KtSuperTypeListEntry> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtSuperTypeListEntry

'java' @ [204:76] ==> public val <T> KClass<KtParameter>.java: Class<KtParameter> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtParameter

'KotlinIntroduceVariableHandler' @ [206:17] ==> public object KotlinIntroduceVariableHandler : RefactoringActionHandler defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable in file KotlinIntroduceVariableHandler.kt[FakeCallableDescriptorForObject]

'doRefactoring' @ [206:48] ==> public final fun doRefactoring(project: Project, editor: Editor?, expressionToExtract: KtExpression?, isVar: Boolean, occurrencesToReplace: List<KtExpression>?, onNonInteractiveFinish: ((KtDeclaration) -> Unit)?): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable.KotlinIntroduceVariableHandler[SimpleFunctionDescriptorImpl]

'project' @ [207:25] ==> public final val KotlinFunctionCallUsage.project: Project[MyPropertyDescriptor]

'argumentExpression' @ [207:40] ==> var argumentExpression: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'listOf' @ [209:48] ==> public fun <T> listOf(element: KtExpression): List<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'argumentExpression' @ [209:55] ==> var argumentExpression: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'argumentExpression' @ [211:21] ==> var argumentExpression: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'psiFactory' @ [211:42] ==> value-parameter psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[ValueParameterDescriptorImpl]

'createExpression' @ [211:53] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'it' @ [211:70] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [211:73] ==> public final val KtDeclaration.name: String?[MyPropertyDescriptor]

'nameCounterpartMap' @ [215:53] ==> val nameCounterpartMap: Map<KtSimpleNameExpression, KtSimpleNameExpression> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'ref' @ [215:72] ==> val ref: PsiReference defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'element' @ [215:76] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'expressionToReplace' @ [216:26] ==> var expressionToReplace: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'parent' @ [216:46] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [218:17] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'expressionToReplace' @ [219:17] ==> var expressionToReplace: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'parent' @ [219:39] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'if (addReceiver) {
                val callExpression = expressionToReplace.getParentOfTypeAndBranch<KtCallExpression>(true) { calleeExpression }
                when {
                    callExpression != null -> expressionToReplace = callExpression
                    parent is KtOperationExpression && parent.operationReference == expressionToReplace -> continue@loop
                }

                val replacement = psiFactory.createExpression("${argumentExpression!!.text}.${expressionToReplace.text}")
                replacements.add(expressionToReplace to replacement)
            }
            else {
                replacements.add(expressionToReplace to argumentExpression!!)
            }' @ [222:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'addReceiver' @ [222:17] ==> val addReceiver: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'expressionToReplace' @ [223:38] ==> var expressionToReplace: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'getParentOfTypeAndBranch' @ [223:58] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtCallExpression.() -> PsiElement?): KtCallExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtCallExpression

'calleeExpression' @ [223:109] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'when {
                    callExpression != null -> expressionToReplace = callExpression
                    parent is KtOperationExpression && parent.operationReference == expressionToReplace -> continue@loop
                }' @ [224:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'callExpression' @ [225:21] ==> val callExpression: KtCallExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'expressionToReplace' @ [225:47] ==> var expressionToReplace: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'callExpression' @ [225:69] ==> val callExpression: KtCallExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'parent' @ [226:21] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'parent' @ [226:56] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'operationReference' @ [226:63] ==> public final val KtOperationExpression.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'expressionToReplace' @ [226:85] ==> var expressionToReplace: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'psiFactory' @ [229:35] ==> value-parameter psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[ValueParameterDescriptorImpl]

'createExpression' @ [229:46] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'argumentExpression' @ [229:66] ==> var argumentExpression: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'text' @ [229:87] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'expressionToReplace' @ [229:95] ==> var expressionToReplace: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'text' @ [229:115] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'replacements' @ [230:17] ==> val replacements: ArrayList<Pair<KtExpression, KtExpression>> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'add' @ [230:30] ==> public open fun add(element: Pair<KtExpression, KtExpression>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'expressionToReplace' @ [230:34] ==> var expressionToReplace: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'replacement' @ [230:57] ==> val replacement: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'replacements' @ [233:17] ==> val replacements: ArrayList<Pair<KtExpression, KtExpression>> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'add' @ [233:30] ==> public open fun add(element: Pair<KtExpression, KtExpression>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'expressionToReplace' @ [233:34] ==> var expressionToReplace: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'argumentExpression' @ [233:57] ==> var argumentExpression: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'sort' @ [238:23] ==> public open fun <T : (Any..Any?)> sort(@NotNull p0: (MutableList<(Pair<KtExpression, KtExpression>..Pair<KtExpression, KtExpression>?)>..List<(Pair<KtExpression, KtExpression>..Pair<KtExpression, KtExpression>?)>), @NotNull p1: Comparator<in (Pair<KtExpression, KtExpression>..Pair<KtExpression, KtExpression>?)>): Unit defined in com.intellij.util.containers.ContainerUtil[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Pair<KtExpression, KtExpression>

'replacements' @ [238:28] ==> val replacements: ArrayList<Pair<KtExpression, KtExpression>> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'REVERSED_TEXT_OFFSET_COMPARATOR' @ [238:42] ==> private final val REVERSED_TEXT_OFFSET_COMPARATOR: Comparator<Pair<KtElement, KtElement>> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.Companion[PropertyDescriptorImpl]

'component1' @ [239:15] ==> public final operator fun component1(): KtExpression defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [239:36] ==> public final operator fun component2(): KtExpression defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'replacements' @ [239:60] ==> val replacements: ArrayList<Pair<KtExpression, KtExpression>> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'expressionToReplace' @ [240:28] ==> val expressionToReplace: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'replaced' @ [240:48] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'replacingExpression' @ [240:57] ==> val replacingExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'expressionToReplace' @ [241:17] ==> val expressionToReplace: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'newExpression' @ [241:40] ==> var newExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'newExpression' @ [242:17] ==> var newExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'replaced' @ [242:33] ==> val replaced: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'newExpression' @ [246:16] ==> var newExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.substituteReferences[LocalVariableDescriptor]

'resolvedArgument' @ [256:21] ==> public final val resolvedArgument: ResolvedValueArgument? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.ArgumentInfo[PropertyDescriptorImpl]

'arguments' @ [256:39] ==> public final val ResolvedValueArgument.arguments: (MutableList<(ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'firstOrNull' @ [256:50] ==> public fun <T> List<(ValueArgument..ValueArgument?)>.firstOrNull(): ValueArgument? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)

'mainValueArgument' @ [259:21] ==> private final val mainValueArgument: ValueArgument? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.ArgumentInfo[PropertyDescriptorImpl]

'isNamed' @ [259:40] ==> public abstract fun isNamed(): Boolean defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'name' @ [265:13] ==> public final var name: String? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.ArgumentInfo[PropertyDescriptorImpl]

'parameter' @ [265:20] ==> public final val parameter: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.ArgumentInfo[PropertyDescriptorImpl]

'getInheritedName' @ [265:30] ==> public final fun getInheritedName(inheritedCallable: KotlinCallableDefinitionUsage<*>): String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[SimpleFunctionDescriptorImpl]

'callee' @ [265:47] ==> value-parameter callee: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.ArgumentInfo.makeNamed[ValueParameterDescriptorImpl]

'parameter' @ [268:28] ==> public final val parameter: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.ArgumentInfo[PropertyDescriptorImpl]

'defaultValueForParameter' @ [268:38] ==> public final var defaultValueForParameter: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'mainValueArgument' @ [268:74] ==> private final val mainValueArgument: ValueArgument? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.ArgumentInfo[PropertyDescriptorImpl]

'oldIndex' @ [272:13] ==> value-parameter oldIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.getResolvedValueArgument[ValueParameterDescriptorImpl]

'resolvedCall' @ [274:35] ==> private final val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[PropertyDescriptorImpl]

'resultingDescriptor' @ [274:50] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'valueParameters' @ [274:70] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'oldIndex' @ [274:86] ==> value-parameter oldIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.getResolvedValueArgument[ValueParameterDescriptorImpl]

'resolvedCall' @ [275:16] ==> private final val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[PropertyDescriptorImpl]

'valueArguments' @ [275:29] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.valueArguments: (MutableMap<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>..Map<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'parameterDescriptor' @ [275:44] ==> val parameterDescriptor: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.getResolvedValueArgument[LocalVariableDescriptor]

'NotNullableCopyableUserDataProperty' @ [279:16] ==> public constructor NotNullableCopyableUserDataProperty<in R : PsiElement, T : Any>(key: Key<Boolean>, defaultValue: Boolean) defined in org.jetbrains.kotlin.psi.NotNullableCopyableUserDataProperty[DeserializedClassConstructorDescriptor]
Inferred types:
    <in R : PsiElement> -> KtValueArgument
    <T : Any> -> Boolean

'create' @ [279:56] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): Key<(Boolean..Boolean?)> defined in com.intellij.openapi.util.Key[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'element' @ [286:36] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.getArgumentByDefaultValue[ValueParameterDescriptorImpl]

'isInsideOfCallerBody' @ [286:44] ==> public fun KtElement.isInsideOfCallerBody(allUsages: Array<out UsageInfo>): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature[SimpleFunctionDescriptorImpl]

'allUsages' @ [286:65] ==> value-parameter allUsages: Array<out UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.getArgumentByDefaultValue[ValueParameterDescriptorImpl]

'parameter' @ [287:35] ==> public final val parameter: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.ArgumentInfo[PropertyDescriptorImpl]

'defaultValueForCall' @ [287:45] ==> public final var defaultValueForCall: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'when {
            isInsideOfCallerBody -> psiFactory.createExpression(parameter.name)
            defaultValueForCall != null -> substituteReferences(defaultValueForCall, parameter.defaultValueParameterReferences, psiFactory)
            else -> null
        }' @ [288:24] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression?, entry1: KtExpression?, entry2: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression?

'isInsideOfCallerBody' @ [289:13] ==> val isInsideOfCallerBody: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.getArgumentByDefaultValue[LocalVariableDescriptor]

'psiFactory' @ [289:37] ==> value-parameter psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.getArgumentByDefaultValue[ValueParameterDescriptorImpl]

'createExpression' @ [289:48] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'parameter' @ [289:65] ==> public final val parameter: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.ArgumentInfo[PropertyDescriptorImpl]

'name' @ [289:75] ==> public final var KotlinParameterInfo.name: String[MyPropertyDescriptor]

'defaultValueForCall' @ [290:13] ==> val defaultValueForCall: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.getArgumentByDefaultValue[LocalVariableDescriptor]

'substituteReferences' @ [290:44] ==> private final fun substituteReferences(expression: KtExpression, referenceMap: Map<PsiReference, DeclarationDescriptor>, psiFactory: KtPsiFactory): KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[SimpleFunctionDescriptorImpl]

'defaultValueForCall' @ [290:65] ==> val defaultValueForCall: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.getArgumentByDefaultValue[LocalVariableDescriptor]

'parameter' @ [290:86] ==> public final val parameter: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.ArgumentInfo[PropertyDescriptorImpl]

'defaultValueParameterReferences' @ [290:96] ==> public final val defaultValueParameterReferences: Map<PsiReference, DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'psiFactory' @ [290:129] ==> value-parameter psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.getArgumentByDefaultValue[ValueParameterDescriptorImpl]

'if (isInsideOfCallerBody) null else name' @ [293:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'isInsideOfCallerBody' @ [293:28] ==> val isInsideOfCallerBody: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.getArgumentByDefaultValue[LocalVariableDescriptor]

'name' @ [293:60] ==> public final var name: String? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.ArgumentInfo[PropertyDescriptorImpl]

'let' @ [293:67] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Name): Name defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Name

'identifier' @ [293:78] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'it' @ [293:89] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.getArgumentByDefaultValue.<anonymous>[ValueParameterDescriptorImpl]

'psiFactory' @ [294:16] ==> value-parameter psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.getArgumentByDefaultValue[ValueParameterDescriptorImpl]

'createArgument' @ [294:27] ==> public final fun createArgument(expression: KtExpression?, name: Name? = ..., isSpread: Boolean = ...): KtValueArgument defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'argValue' @ [294:42] ==> val argValue: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.getArgumentByDefaultValue[LocalVariableDescriptor]

'psiFactory' @ [294:54] ==> value-parameter psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.getArgumentByDefaultValue[ValueParameterDescriptorImpl]

'createExpression' @ [294:65] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'argName' @ [294:88] ==> val argName: Name? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.getArgumentByDefaultValue[LocalVariableDescriptor]

'apply' @ [294:97] ==> @InlineOnly public inline fun <T> KtValueArgument.apply(block: KtValueArgument.() -> Unit): KtValueArgument defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtValueArgument

'generatedArgumentValue' @ [295:13] ==> private final var KtValueArgument.generatedArgumentValue: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[PropertyDescriptorImpl]

'argValue' @ [296:17] ==> val argValue: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.getArgumentByDefaultValue[LocalVariableDescriptor]

'getArgumentExpression' @ [297:17] ==> @IfNotParsed @Nullable public open fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'delete' @ [297:43] ==> public abstract fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'this' @ [303:46] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.wrapInvalidated[ReceiverParameterDescriptorImpl]

'element' @ [304:39] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.wrapInvalidated[ValueParameterDescriptorImpl]

'getQualifiedExpressionForSelector' @ [304:47] ==> public fun KtElement.getQualifiedExpressionForSelector(): KtQualifiedExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'receiverExpression' @ [304:85] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'isPropertyJavaUsage' @ [309:13] ==> private final val isPropertyJavaUsage: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[PropertyDescriptorImpl]

'updateJavaPropertyCall' @ [309:41] ==> private final fun updateJavaPropertyCall(changeInfo: KotlinChangeInfo, element: KtCallElement): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.Companion[SimpleFunctionDescriptorImpl]

'changeInfo' @ [309:64] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[ValueParameterDescriptorImpl]

'element' @ [309:76] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[ValueParameterDescriptorImpl]

'element' @ [311:31] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[ValueParameterDescriptorImpl]

'getQualifiedExpressionForSelector' @ [311:39] ==> public fun KtElement.getQualifiedExpressionForSelector(): KtQualifiedExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'element' @ [311:78] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[ValueParameterDescriptorImpl]

'element' @ [313:28] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[ValueParameterDescriptorImpl]

'valueArguments' @ [313:36] ==> public final val KtCallElement.valueArguments: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'changeInfo' @ [314:29] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[ValueParameterDescriptorImpl]

'getNonReceiverParameters' @ [314:40] ==> public final fun getNonReceiverParameters(): List<KotlinParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[SimpleFunctionDescriptorImpl]

'element' @ [316:31] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[ValueParameterDescriptorImpl]

'oldArguments' @ [316:62] ==> val oldArguments: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'isNotEmpty' @ [316:75] ==> @InlineOnly public inline fun <T> Collection<(ValueArgument..ValueArgument?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)

'oldArguments' @ [316:91] ==> val oldArguments: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'all' @ [316:104] ==> public inline fun <T> Iterable<(ValueArgument..ValueArgument?)>.all(predicate: ((ValueArgument..ValueArgument?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)

'it' @ [316:110] ==> value-parameter it: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[ValueParameterDescriptorImpl]

'isNamed' @ [316:113] ==> public abstract fun isNamed(): Boolean defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'changeInfo' @ [318:31] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[ValueParameterDescriptorImpl]

'receiverParameterInfo' @ [318:42] ==> public final var receiverParameterInfo: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[PropertyDescriptorImpl]

'changeInfo' @ [319:36] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[ValueParameterDescriptorImpl]

'methodDescriptor' @ [319:47] ==> public final val methodDescriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[PropertyDescriptorImpl]

'receiver' @ [319:64] ==> public abstract val receiver: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor[PropertyDescriptorImpl]

'resolvedCall' @ [321:33] ==> private final val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[PropertyDescriptorImpl]

'extensionReceiver' @ [321:47] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'resolvedCall' @ [322:32] ==> private final val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[PropertyDescriptorImpl]

'dispatchReceiver' @ [322:46] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'newReceiverInfo' @ [325:13] ==> val newReceiverInfo: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'fullCallElement' @ [325:40] ==> val fullCallElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'dispatchReceiver' @ [325:84] ==> val dispatchReceiver: ReceiverValue? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'newParameters' @ [327:32] ==> val newParameters: List<KotlinParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'withIndex' @ [327:46] ==> public fun <T> Iterable<KotlinParameterInfo>.withIndex(): Iterable<IndexedValue<KotlinParameterInfo>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinParameterInfo

'map' @ [327:58] ==> public inline fun <T, R> Iterable<IndexedValue<KotlinParameterInfo>>.map(transform: (IndexedValue<KotlinParameterInfo>) -> KotlinFunctionCallUsage.ArgumentInfo): List<KotlinFunctionCallUsage.ArgumentInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IndexedValue<KotlinParameterInfo>
    <R> -> ArgumentInfo

'component1' @ [328:18] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [328:25] ==> public final operator fun component2(): KotlinParameterInfo defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'it' @ [328:34] ==> value-parameter it: IndexedValue<KotlinParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[ValueParameterDescriptorImpl]

'param' @ [329:28] ==> val param: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[LocalVariableDescriptor]

'oldIndex' @ [329:34] ==> public final val KotlinParameterInfo.oldIndex: Int[MyPropertyDescriptor]

'if (oldIndex >= 0) getResolvedValueArgument(oldIndex) else null' @ [330:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ResolvedValueArgument?, elseBranch: ResolvedValueArgument?): ResolvedValueArgument?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ResolvedValueArgument?

'oldIndex' @ [330:40] ==> val oldIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[LocalVariableDescriptor]

'getResolvedValueArgument' @ [330:55] ==> private final fun getResolvedValueArgument(oldIndex: Int): ResolvedValueArgument? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[SimpleFunctionDescriptorImpl]

'oldIndex' @ [330:80] ==> val oldIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[LocalVariableDescriptor]

'if (param == originalReceiverInfo) extensionReceiver else null' @ [331:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ReceiverValue?, elseBranch: ReceiverValue?): ReceiverValue?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ReceiverValue?

'param' @ [331:37] ==> val param: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[LocalVariableDescriptor]

'originalReceiverInfo' @ [331:46] ==> val originalReceiverInfo: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'extensionReceiver' @ [331:68] ==> val extensionReceiver: ReceiverValue? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'receiverValue' @ [334:17] ==> var receiverValue: ReceiverValue? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[LocalVariableDescriptor]

'!' @ [334:56] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'receiverValue' @ [334:57] ==> var receiverValue: ReceiverValue? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[LocalVariableDescriptor]

'expression' @ [334:71] ==> public abstract val expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver[DeserializedPropertyDescriptor]

'isValid' @ [334:82] ==> public final val KtExpression.isValid: Boolean[MyPropertyDescriptor]

'receiverValue' @ [335:17] ==> var receiverValue: ReceiverValue? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[LocalVariableDescriptor]

'receiverValue' @ [335:33] ==> var receiverValue: ReceiverValue? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[LocalVariableDescriptor]

'wrapInvalidated' @ [335:47] ==> private final fun ExpressionReceiver.wrapInvalidated(element: KtCallElement): ExpressionReceiver defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[SimpleFunctionDescriptorImpl]

'element' @ [335:63] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[ValueParameterDescriptorImpl]

'ArgumentInfo' @ [337:13] ==> public constructor ArgumentInfo(parameter: KotlinParameterInfo, parameterIndex: Int, resolvedArgument: ResolvedValueArgument?, receiverValue: ReceiverValue?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.ArgumentInfo[ClassConstructorDescriptorImpl]

'param' @ [337:26] ==> val param: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[LocalVariableDescriptor]

'index' @ [337:33] ==> val index: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[LocalVariableDescriptor]

'resolvedArgument' @ [337:40] ==> val resolvedArgument: ResolvedValueArgument? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[LocalVariableDescriptor]

'receiverValue' @ [337:58] ==> var receiverValue: ReceiverValue? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[LocalVariableDescriptor]

'newParameters' @ [340:34] ==> val newParameters: List<KotlinParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'lastIndex' @ [340:48] ==> public val <T> List<KotlinParameterInfo>.lastIndex: Int defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinParameterInfo

'newArgumentInfos' @ [341:31] ==> val newArgumentInfos: List<KotlinFunctionCallUsage.ArgumentInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'firstOrNull' @ [341:48] ==> public inline fun <T> Iterable<KotlinFunctionCallUsage.ArgumentInfo>.firstOrNull(predicate: (KotlinFunctionCallUsage.ArgumentInfo) -> Boolean): KotlinFunctionCallUsage.ArgumentInfo? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArgumentInfo

'it' @ [342:13] ==> value-parameter it: KotlinFunctionCallUsage.ArgumentInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[ValueParameterDescriptorImpl]

'wasNamed' @ [342:16] ==> public final val wasNamed: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.ArgumentInfo[PropertyDescriptorImpl]

'it' @ [343:17] ==> value-parameter it: KotlinFunctionCallUsage.ArgumentInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[ValueParameterDescriptorImpl]

'parameter' @ [343:20] ==> public final val parameter: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.ArgumentInfo[PropertyDescriptorImpl]

'isNewParameter' @ [343:30] ==> public final val isNewParameter: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'purelyNamedCall' @ [343:48] ==> val purelyNamedCall: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'it' @ [344:17] ==> value-parameter it: KotlinFunctionCallUsage.ArgumentInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[ValueParameterDescriptorImpl]

'resolvedArgument' @ [344:20] ==> public final val resolvedArgument: ResolvedValueArgument? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.ArgumentInfo[PropertyDescriptorImpl]

'it' @ [344:63] ==> value-parameter it: KotlinFunctionCallUsage.ArgumentInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[ValueParameterDescriptorImpl]

'parameterIndex' @ [344:66] ==> public final val parameterIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.ArgumentInfo[PropertyDescriptorImpl]

'lastParameterIndex' @ [344:83] ==> val lastParameterIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'parameterIndex' @ [345:12] ==> public final val parameterIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.ArgumentInfo[PropertyDescriptorImpl]

'firstNamedIndex' @ [346:13] ==> var firstNamedIndex: Int? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'?:' @ [347:42] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Int?, right: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Int

'lastParameterIndex' @ [347:43] ==> val lastParameterIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'firstOrNull' @ [347:72] ==> public inline fun <T> Iterable<Int>.firstOrNull(predicate: (Int) -> Boolean): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'!' @ [347:86] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'newArgumentInfos' @ [347:87] ==> val newArgumentInfos: List<KotlinFunctionCallUsage.ArgumentInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'it' @ [347:104] ==> value-parameter it: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[ValueParameterDescriptorImpl]

'shouldSkip' @ [347:108] ==> public final fun shouldSkip(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.ArgumentInfo[SimpleFunctionDescriptorImpl]

'-' @ [348:45] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'firstNamedIndex' @ [349:13] ==> var firstNamedIndex: Int? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'..' @ [349:32] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'lastNonDefaultArgIndex' @ [349:35] ==> val lastNonDefaultArgIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'firstOrNull' @ [349:59] ==> public inline fun <T> Iterable<Int>.firstOrNull(predicate: (Int) -> Boolean): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'newArgumentInfos' @ [349:73] ==> val newArgumentInfos: List<KotlinFunctionCallUsage.ArgumentInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'it' @ [349:90] ==> value-parameter it: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[ValueParameterDescriptorImpl]

'shouldSkip' @ [349:94] ==> public final fun shouldSkip(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.ArgumentInfo[SimpleFunctionDescriptorImpl]

'if (firstNamedIndex != null) firstNamedIndex - 1 else lastParameterIndex' @ [352:35] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'firstNamedIndex' @ [352:39] ==> var firstNamedIndex: Int? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'firstNamedIndex' @ [352:64] ==> var firstNamedIndex: Int? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'lastParameterIndex' @ [352:89] ==> val lastParameterIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'lastPositionalIndex' @ [353:10] ==> val lastPositionalIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'lastParameterIndex' @ [353:37] ==> val lastParameterIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'forEach' @ [353:57] ==> @HidesMembers public inline fun <T> Iterable<Int>.forEach(action: (Int) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'newArgumentInfos' @ [353:67] ==> val newArgumentInfos: List<KotlinFunctionCallUsage.ArgumentInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'it' @ [353:84] ==> value-parameter it: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[ValueParameterDescriptorImpl]

'makeNamed' @ [353:88] ==> public final fun makeNamed(callee: KotlinCallableDefinitionUsage<*>): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.ArgumentInfo[SimpleFunctionDescriptorImpl]

'callee' @ [353:98] ==> private final val callee: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[PropertyDescriptorImpl]

'KtPsiFactory' @ [355:26] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'element' @ [355:39] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[ValueParameterDescriptorImpl]

'project' @ [355:47] ==> public final val KtCallElement.project: Project[MyPropertyDescriptor]

'psiFactory' @ [357:31] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'createCallArguments' @ [357:42] ==> public final fun createCallArguments(text: String): KtValueArgumentList defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'apply' @ [357:68] ==> @InlineOnly public inline fun <T> KtValueArgumentList.apply(block: KtValueArgumentList.() -> Unit): KtValueArgumentList defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtValueArgumentList

'newArgumentInfos' @ [358:29] ==> val newArgumentInfos: List<KotlinFunctionCallUsage.ArgumentInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'argInfo' @ [359:21] ==> val argInfo: KotlinFunctionCallUsage.ArgumentInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[LocalVariableDescriptor]

'shouldSkip' @ [359:29] ==> public final fun shouldSkip(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.ArgumentInfo[SimpleFunctionDescriptorImpl]

'argInfo' @ [361:28] ==> val argInfo: KotlinFunctionCallUsage.ArgumentInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[LocalVariableDescriptor]

'name' @ [361:36] ==> public final var name: String? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.ArgumentInfo[PropertyDescriptorImpl]

'let' @ [361:42] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Name): Name defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Name

'identifier' @ [361:53] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'it' @ [361:64] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'argInfo' @ [363:21] ==> val argInfo: KotlinFunctionCallUsage.ArgumentInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[LocalVariableDescriptor]

'receiverValue' @ [363:29] ==> public final val receiverValue: ReceiverValue? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.ArgumentInfo[PropertyDescriptorImpl]

'getReceiverExpression' @ [364:46] ==> private final fun getReceiverExpression(receiver: ReceiverValue, psiFactory: KtPsiFactory): KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.Companion[SimpleFunctionDescriptorImpl]

'argInfo' @ [364:68] ==> val argInfo: KotlinFunctionCallUsage.ArgumentInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[LocalVariableDescriptor]

'receiverValue' @ [364:76] ==> public final val receiverValue: ReceiverValue? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.ArgumentInfo[PropertyDescriptorImpl]

'psiFactory' @ [364:91] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'addArgument' @ [365:21] ==> @NotNull public open fun addArgument(@NotNull p0: KtValueArgument): KtValueArgument defined in org.jetbrains.kotlin.psi.KtValueArgumentList[JavaMethodDescriptor]

'psiFactory' @ [365:33] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'createArgument' @ [365:44] ==> public final fun createArgument(expression: KtExpression?, name: Name? = ..., isSpread: Boolean = ...): KtValueArgument defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'receiverExpression' @ [365:59] ==> val receiverExpression: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[LocalVariableDescriptor]

'name' @ [365:79] ==> val name: Name? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[LocalVariableDescriptor]

'argInfo' @ [369:40] ==> val argInfo: KotlinFunctionCallUsage.ArgumentInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[LocalVariableDescriptor]

'resolvedArgument' @ [369:48] ==> public final val resolvedArgument: ResolvedValueArgument? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.ArgumentInfo[PropertyDescriptorImpl]

'when (resolvedArgument) {
                    null, is DefaultValueArgument -> addArgument(argInfo.getArgumentByDefaultValue(element, allUsages, psiFactory))

                    is ExpressionValueArgument -> {
                        val valueArgument = resolvedArgument.valueArgument
                        val newValueArgument: KtValueArgument = when {
                            valueArgument == null -> argInfo.getArgumentByDefaultValue(element, allUsages, psiFactory)
                            valueArgument is KtLambdaArgument -> psiFactory.createArgument(valueArgument.getArgumentExpression(), name)
                            valueArgument is KtValueArgument && valueArgument.getArgumentName()?.asName == name -> valueArgument
                            else -> psiFactory.createArgument(valueArgument.getArgumentExpression(), name)
                        }
                        addArgument(newValueArgument)
                    }

                    // TODO: Support Kotlin varargs
                    is VarargValueArgument -> resolvedArgument.arguments.forEach {
                        if (it is KtValueArgument) addArgument(it)
                    }

                    else -> return
                }' @ [370:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any, entry3: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'resolvedArgument' @ [370:23] ==> val resolvedArgument: ResolvedValueArgument? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[LocalVariableDescriptor]

'addArgument' @ [371:54] ==> @NotNull public open fun addArgument(@NotNull p0: KtValueArgument): KtValueArgument defined in org.jetbrains.kotlin.psi.KtValueArgumentList[JavaMethodDescriptor]

'argInfo' @ [371:66] ==> val argInfo: KotlinFunctionCallUsage.ArgumentInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[LocalVariableDescriptor]

'getArgumentByDefaultValue' @ [371:74] ==> private final fun KotlinFunctionCallUsage.ArgumentInfo.getArgumentByDefaultValue(element: KtCallElement, allUsages: Array<out UsageInfo>, psiFactory: KtPsiFactory): KtValueArgument defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[SimpleFunctionDescriptorImpl]

'element' @ [371:100] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[ValueParameterDescriptorImpl]

'allUsages' @ [371:109] ==> value-parameter allUsages: Array<out UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[ValueParameterDescriptorImpl]

'psiFactory' @ [371:120] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'resolvedArgument' @ [374:45] ==> val resolvedArgument: ResolvedValueArgument? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[LocalVariableDescriptor]

'valueArgument' @ [374:62] ==> public final val ExpressionValueArgument.valueArgument: ValueArgument?[MyPropertyDescriptor]

'when {
                            valueArgument == null -> argInfo.getArgumentByDefaultValue(element, allUsages, psiFactory)
                            valueArgument is KtLambdaArgument -> psiFactory.createArgument(valueArgument.getArgumentExpression(), name)
                            valueArgument is KtValueArgument && valueArgument.getArgumentName()?.asName == name -> valueArgument
                            else -> psiFactory.createArgument(valueArgument.getArgumentExpression(), name)
                        }' @ [375:65] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtValueArgument, entry1: KtValueArgument, entry2: KtValueArgument, entry3: KtValueArgument): KtValueArgument[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtValueArgument

'valueArgument' @ [376:29] ==> val valueArgument: ValueArgument? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[LocalVariableDescriptor]

'argInfo' @ [376:54] ==> val argInfo: KotlinFunctionCallUsage.ArgumentInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[LocalVariableDescriptor]

'getArgumentByDefaultValue' @ [376:62] ==> private final fun KotlinFunctionCallUsage.ArgumentInfo.getArgumentByDefaultValue(element: KtCallElement, allUsages: Array<out UsageInfo>, psiFactory: KtPsiFactory): KtValueArgument defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[SimpleFunctionDescriptorImpl]

'element' @ [376:88] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[ValueParameterDescriptorImpl]

'allUsages' @ [376:97] ==> value-parameter allUsages: Array<out UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[ValueParameterDescriptorImpl]

'psiFactory' @ [376:108] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'valueArgument' @ [377:29] ==> val valueArgument: ValueArgument? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[LocalVariableDescriptor]

'psiFactory' @ [377:66] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'createArgument' @ [377:77] ==> public final fun createArgument(expression: KtExpression?, name: Name? = ..., isSpread: Boolean = ...): KtValueArgument defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'valueArgument' @ [377:92] ==> val valueArgument: ValueArgument? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[LocalVariableDescriptor]

'getArgumentExpression' @ [377:106] ==> public open fun getArgumentExpression(): KtExpression defined in org.jetbrains.kotlin.psi.KtLambdaArgument[DeserializedSimpleFunctionDescriptor]

'name' @ [377:131] ==> val name: Name? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[LocalVariableDescriptor]

'valueArgument' @ [378:29] ==> val valueArgument: ValueArgument? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[LocalVariableDescriptor]

'valueArgument' @ [378:65] ==> val valueArgument: ValueArgument? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[LocalVariableDescriptor]

'getArgumentName' @ [378:79] ==> @Nullable public open fun getArgumentName(): KtValueArgumentName? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'asName' @ [378:98] ==> public open val asName: Name defined in org.jetbrains.kotlin.psi.KtValueArgumentName[JavaPropertyDescriptor]

'name' @ [378:108] ==> val name: Name? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[LocalVariableDescriptor]

'valueArgument' @ [378:116] ==> val valueArgument: ValueArgument? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[LocalVariableDescriptor]

'psiFactory' @ [379:37] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'createArgument' @ [379:48] ==> public final fun createArgument(expression: KtExpression?, name: Name? = ..., isSpread: Boolean = ...): KtValueArgument defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'valueArgument' @ [379:63] ==> val valueArgument: ValueArgument? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[LocalVariableDescriptor]

'getArgumentExpression' @ [379:77] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'name' @ [379:102] ==> val name: Name? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[LocalVariableDescriptor]

'addArgument' @ [381:25] ==> @NotNull public open fun addArgument(@NotNull p0: KtValueArgument): KtValueArgument defined in org.jetbrains.kotlin.psi.KtValueArgumentList[JavaMethodDescriptor]

'newValueArgument' @ [381:37] ==> val newValueArgument: KtValueArgument defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[LocalVariableDescriptor]

'resolvedArgument' @ [385:47] ==> val resolvedArgument: ResolvedValueArgument? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[LocalVariableDescriptor]

'arguments' @ [385:64] ==> public final val VarargValueArgument.arguments: (MutableList<(ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'forEach' @ [385:74] ==> @HidesMembers public inline fun <T> Iterable<(ValueArgument..ValueArgument?)>.forEach(action: ((ValueArgument..ValueArgument?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)

'it' @ [386:29] ==> value-parameter it: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'addArgument' @ [386:52] ==> @NotNull public open fun addArgument(@NotNull p0: KtValueArgument): KtValueArgument defined in org.jetbrains.kotlin.psi.KtValueArgumentList[JavaMethodDescriptor]

'it' @ [386:64] ==> value-parameter it: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'newArgumentList' @ [394:9] ==> val newArgumentList: KtValueArgumentList defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'arguments' @ [394:25] ==> public final val KtValueArgumentList.arguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'singleOrNull' @ [394:35] ==> public fun <T> List<(KtValueArgument..KtValueArgument?)>.singleOrNull(): KtValueArgument? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)

'let' @ [394:51] ==> @InlineOnly public inline fun <T, R> KtValueArgument.let(block: (KtValueArgument) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtValueArgument
    <R> -> Unit

'it' @ [395:17] ==> value-parameter it: KtValueArgument defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[ValueParameterDescriptorImpl]

'getArgumentExpression' @ [395:20] ==> @IfNotParsed @Nullable public open fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'newArgumentList' @ [396:17] ==> val newArgumentList: KtValueArgumentList defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'removeArgument' @ [396:33] ==> public open fun removeArgument(@NotNull p0: KtValueArgument): Unit defined in org.jetbrains.kotlin.psi.KtValueArgumentList[JavaMethodDescriptor]

'it' @ [396:48] ==> value-parameter it: KtValueArgument defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[ValueParameterDescriptorImpl]

'oldArguments' @ [400:31] ==> val oldArguments: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'lastOrNull' @ [400:44] ==> public fun <T> List<(ValueArgument..ValueArgument?)>.lastOrNull(): ValueArgument? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)

'newParameters' @ [401:32] ==> val newParameters: List<KotlinParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'lastOrNull' @ [401:46] ==> public fun <T> List<KotlinParameterInfo>.lastOrNull(): KotlinParameterInfo? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinParameterInfo

'newArgumentList' @ [402:31] ==> val newArgumentList: KtValueArgumentList defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'arguments' @ [402:47] ==> public final val KtValueArgumentList.arguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'lastOrNull' @ [402:57] ==> public fun <T> List<(KtValueArgument..KtValueArgument?)>.lastOrNull(): KtValueArgument? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)

'getResolvedValueArgument' @ [403:39] ==> private final fun getResolvedValueArgument(oldIndex: Int): ResolvedValueArgument? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[SimpleFunctionDescriptorImpl]

'lastNewParameter' @ [403:64] ==> val lastNewParameter: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'oldIndex' @ [403:82] ==> public final val KotlinParameterInfo.oldIndex: Int[MyPropertyDescriptor]

'-' @ [403:94] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'lastOldArgument' @ [405:17] ==> val lastOldArgument: ValueArgument? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'oldLastResolvedArgument' @ [405:56] ==> val oldLastResolvedArgument: ExpressionValueArgument? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'valueArgument' @ [405:81] ==> public final val ExpressionValueArgument.valueArgument: ValueArgument?[MyPropertyDescriptor]

'lastOldArgument' @ [405:98] ==> val lastOldArgument: ValueArgument? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'lastNewParameter' @ [406:42] ==> val lastNewParameter: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'lastNewParameter' @ [407:45] ==> val lastNewParameter: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'isNewParameter' @ [407:62] ==> public final val isNewParameter: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'lastNewParameter' @ [408:45] ==> val lastNewParameter: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'defaultValueForCall' @ [408:62] ==> public final var defaultValueForCall: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'lastNewArgument' @ [409:45] ==> val lastNewArgument: KtValueArgument? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'!' @ [410:45] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'lastNewArgument' @ [410:46] ==> val lastNewArgument: KtValueArgument? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'isNamed' @ [410:62] ==> public open fun isNamed(): Boolean defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'if (lambdaArgumentNotTouched) {
            newArgumentList.removeArgument(newArgumentList.arguments.last())
        }
        else {
            val lambdaArguments = element.lambdaArguments
            if (lambdaArguments.isNotEmpty()) {
                element.deleteChildRange(lambdaArguments.first(), lambdaArguments.last())
            }
        }' @ [412:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'lambdaArgumentNotTouched' @ [412:13] ==> val lambdaArgumentNotTouched: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'newArgumentList' @ [413:13] ==> val newArgumentList: KtValueArgumentList defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'removeArgument' @ [413:29] ==> public open fun removeArgument(@NotNull p0: KtValueArgument): Unit defined in org.jetbrains.kotlin.psi.KtValueArgumentList[JavaMethodDescriptor]

'newArgumentList' @ [413:44] ==> val newArgumentList: KtValueArgumentList defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'arguments' @ [413:60] ==> public final val KtValueArgumentList.arguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'last' @ [413:70] ==> public fun <T> List<(KtValueArgument..KtValueArgument?)>.last(): (KtValueArgument..KtValueArgument?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)

'element' @ [416:35] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[ValueParameterDescriptorImpl]

'lambdaArguments' @ [416:43] ==> public final val KtCallElement.lambdaArguments: (MutableList<(KtLambdaArgument..KtLambdaArgument?)>..List<(KtLambdaArgument..KtLambdaArgument?)>)[MyPropertyDescriptor]

'lambdaArguments' @ [417:17] ==> val lambdaArguments: (MutableList<(KtLambdaArgument..KtLambdaArgument?)>..List<(KtLambdaArgument..KtLambdaArgument?)>) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'isNotEmpty' @ [417:33] ==> @InlineOnly public inline fun <T> Collection<(KtLambdaArgument..KtLambdaArgument?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtLambdaArgument..org.jetbrains.kotlin.psi.KtLambdaArgument?)

'element' @ [418:17] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[ValueParameterDescriptorImpl]

'deleteChildRange' @ [418:25] ==> public abstract fun deleteChildRange(p0: (PsiElement..PsiElement?), p1: (PsiElement..PsiElement?)): Unit defined in org.jetbrains.kotlin.psi.KtCallElement[JavaMethodDescriptor]

'lambdaArguments' @ [418:42] ==> val lambdaArguments: (MutableList<(KtLambdaArgument..KtLambdaArgument?)>..List<(KtLambdaArgument..KtLambdaArgument?)>) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'first' @ [418:58] ==> public fun <T> List<(KtLambdaArgument..KtLambdaArgument?)>.first(): (KtLambdaArgument..KtLambdaArgument?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtLambdaArgument..org.jetbrains.kotlin.psi.KtLambdaArgument?)

'lambdaArguments' @ [418:67] ==> val lambdaArguments: (MutableList<(KtLambdaArgument..KtLambdaArgument?)>..List<(KtLambdaArgument..KtLambdaArgument?)>) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'last' @ [418:83] ==> public fun <T> List<(KtLambdaArgument..KtLambdaArgument?)>.last(): (KtLambdaArgument..KtLambdaArgument?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtLambdaArgument..org.jetbrains.kotlin.psi.KtLambdaArgument?)

'element' @ [422:31] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[ValueParameterDescriptorImpl]

'valueArgumentList' @ [422:39] ==> public final val KtCallElement.valueArgumentList: KtValueArgumentList?[MyPropertyDescriptor]

'sure' @ [422:57] ==> public inline fun <T : Any> KtValueArgumentList?.sure(message: () -> String): KtValueArgumentList defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> KtValueArgumentList

'+' @ [422:64] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'element' @ [422:96] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[ValueParameterDescriptorImpl]

'text' @ [422:104] ==> public final val KtCallElement.text: (String..String?)[MyPropertyDescriptor]

'replaceListPsiAndKeepDelimiters' @ [423:9] ==> public fun <ListType : KtElement> replaceListPsiAndKeepDelimiters(originalList: KtValueArgumentList, newList: KtValueArgumentList, @Suppress listReplacer: (KtValueArgumentList).(KtValueArgumentList) -> KtValueArgumentList = ..., itemsFun: (KtValueArgumentList).() -> List<KtElement>): KtValueArgumentList defined in org.jetbrains.kotlin.idea.refactoring[SimpleFunctionDescriptorImpl]
Inferred types:
    <ListType : KtElement> -> KtValueArgumentList

'oldArgumentList' @ [423:41] ==> var oldArgumentList: KtValueArgumentList defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'newArgumentList' @ [423:58] ==> val newArgumentList: KtValueArgumentList defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'arguments' @ [423:77] ==> public final val KtValueArgumentList.arguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'element' @ [425:9] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[ValueParameterDescriptorImpl]

'accept' @ [425:17] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtCallElement[JavaMethodDescriptor]

'KtTreeVisitorVoid' @ [426:25] ==> public constructor KtTreeVisitorVoid() defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaClassConstructorDescriptor]

'argument' @ [428:29] ==> value-parameter argument: KtValueArgument defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<no name provided>.visitArgument[ValueParameterDescriptorImpl]

'generatedArgumentValue' @ [428:38] ==> private final var KtValueArgument.generatedArgumentValue: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[PropertyDescriptorImpl]

'argument' @ [429:29] ==> value-parameter argument: KtValueArgument defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<no name provided>.visitArgument[ValueParameterDescriptorImpl]

'generatedArgumentValue' @ [429:38] ==> private final var KtValueArgument.generatedArgumentValue: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[PropertyDescriptorImpl]

'argument' @ [430:29] ==> value-parameter argument: KtValueArgument defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<no name provided>.visitArgument[ValueParameterDescriptorImpl]

'addToShorteningWaitSet' @ [430:38] ==> public fun KtElement.addToShorteningWaitSet(options: ShortenReferences.Options = ...): Unit defined in org.jetbrains.kotlin.idea.codeInsight.shorten[DeserializedSimpleFunctionDescriptor]

'SHORTEN_ARGUMENTS_OPTIONS' @ [430:61] ==> private final val SHORTEN_ARGUMENTS_OPTIONS: ShortenReferences.Options defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.Companion[PropertyDescriptorImpl]

'element' @ [436:37] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[ValueParameterDescriptorImpl]

'newReceiverInfo' @ [437:13] ==> val newReceiverInfo: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'originalReceiverInfo' @ [437:32] ==> val originalReceiverInfo: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'if (newReceiverInfo != null) {
                val receiverArgument = getResolvedValueArgument(newReceiverInfo.oldIndex)?.arguments?.singleOrNull()
                val extensionReceiverExpression = receiverArgument?.getArgumentExpression()
                val defaultValueForCall = newReceiverInfo.defaultValueForCall
                val receiver = extensionReceiverExpression?.let { psiFactory.createExpression(it.text) }
                               ?: defaultValueForCall
                               ?: psiFactory.createExpression("_")

                psiFactory.createExpressionByPattern("$0.$1", receiver, element)
            }
            else {
                psiFactory.createExpression(element.text)
            }' @ [438:48] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement, elseBranch: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement

'newReceiverInfo' @ [438:52] ==> val newReceiverInfo: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'getResolvedValueArgument' @ [439:40] ==> private final fun getResolvedValueArgument(oldIndex: Int): ResolvedValueArgument? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[SimpleFunctionDescriptorImpl]

'newReceiverInfo' @ [439:65] ==> val newReceiverInfo: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'oldIndex' @ [439:81] ==> public final val KotlinParameterInfo.oldIndex: Int[MyPropertyDescriptor]

'arguments' @ [439:92] ==> public final val ResolvedValueArgument.arguments: (MutableList<(ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'singleOrNull' @ [439:103] ==> public fun <T> List<(ValueArgument..ValueArgument?)>.singleOrNull(): ValueArgument? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)

'receiverArgument' @ [440:51] ==> val receiverArgument: ValueArgument? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'getArgumentExpression' @ [440:69] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'newReceiverInfo' @ [441:43] ==> val newReceiverInfo: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'defaultValueForCall' @ [441:59] ==> public final var defaultValueForCall: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'extensionReceiverExpression' @ [442:32] ==> val extensionReceiverExpression: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'let' @ [442:61] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> KtExpression): KtExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> KtExpression

'psiFactory' @ [442:67] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'createExpression' @ [442:78] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'it' @ [442:95] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [442:98] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'defaultValueForCall' @ [443:35] ==> val defaultValueForCall: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'psiFactory' @ [444:35] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'createExpression' @ [444:46] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'psiFactory' @ [446:17] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'createExpressionByPattern' @ [446:28] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'receiver' @ [446:63] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'element' @ [446:73] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[ValueParameterDescriptorImpl]

'psiFactory' @ [449:17] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'createExpression' @ [449:28] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'element' @ [449:45] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[ValueParameterDescriptorImpl]

'text' @ [449:53] ==> public final val KtCallElement.text: (String..String?)[MyPropertyDescriptor]

'newElement' @ [452:13] ==> var newElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'fullCallElement' @ [452:26] ==> val fullCallElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'replace' @ [452:42] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'replacingElement' @ [452:50] ==> val replacingElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'!' @ [455:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'lambdaArgumentNotTouched' @ [455:14] ==> val lambdaArgumentNotTouched: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'newLambdaArgumentAddedLast' @ [455:42] ==> val newLambdaArgumentAddedLast: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'?:' @ [456:38] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtElement?, right: KtElement): KtElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtElement

'newElement' @ [456:39] ==> var newElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'selectorExpression' @ [456:78] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'newElement' @ [456:100] ==> var newElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'newCallExpression' @ [457:13] ==> val newCallExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.updateArgumentsAndReceiver[LocalVariableDescriptor]

'moveFunctionLiteralOutsideParentheses' @ [457:31] ==> public fun KtCallExpression.moveFunctionLiteralOutsideParentheses(): Unit defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'element' @ [462:26] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.changeArgumentNames[ValueParameterDescriptorImpl]

'valueArguments' @ [462:34] ==> public final val KtCallElement.valueArguments: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'argument' @ [463:32] ==> val argument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.changeArgumentNames[LocalVariableDescriptor]

'getArgumentName' @ [463:41] ==> public abstract fun getArgumentName(): ValueArgumentName? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'argumentName' @ [464:42] ==> val argumentName: ValueArgumentName? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.changeArgumentNames[LocalVariableDescriptor]

'referenceExpression' @ [464:56] ==> public abstract val referenceExpression: KtSimpleNameExpression? defined in org.jetbrains.kotlin.psi.ValueArgumentName[DeserializedPropertyDescriptor]

'changeInfo' @ [465:37] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.changeArgumentNames[ValueParameterDescriptorImpl]

'getOldParameterIndex' @ [465:48] ==> public final fun getOldParameterIndex(oldParameterName: String): Int? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[SimpleFunctionDescriptorImpl]

'argumentNameExpression' @ [465:69] ==> val argumentNameExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.changeArgumentNames[LocalVariableDescriptor]

'getReferencedName' @ [465:92] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'if (changeInfo.receiverParameterInfo != null) oldParameterIndex + 1 else oldParameterIndex' @ [466:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'changeInfo' @ [466:41] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.changeArgumentNames[ValueParameterDescriptorImpl]

'receiverParameterInfo' @ [466:52] ==> public final var receiverParameterInfo: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[PropertyDescriptorImpl]

'oldParameterIndex' @ [466:83] ==> val oldParameterIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.changeArgumentNames[LocalVariableDescriptor]

'oldParameterIndex' @ [466:110] ==> val oldParameterIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.changeArgumentNames[LocalVariableDescriptor]

'changeInfo' @ [467:33] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.changeArgumentNames[ValueParameterDescriptorImpl]

'newParameters' @ [467:44] ==> public final val KotlinChangeInfo.newParameters: Array<KotlinParameterInfo>[MyPropertyDescriptor]

'newParameterIndex' @ [467:58] ==> val newParameterIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.changeArgumentNames[LocalVariableDescriptor]

'changeArgumentName' @ [468:13] ==> private final fun changeArgumentName(argumentNameExpression: KtSimpleNameExpression?, parameterInfo: KotlinParameterInfo): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[SimpleFunctionDescriptorImpl]

'argumentNameExpression' @ [468:32] ==> val argumentNameExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.changeArgumentNames[LocalVariableDescriptor]

'parameterInfo' @ [468:56] ==> val parameterInfo: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.changeArgumentNames[LocalVariableDescriptor]

'argumentNameExpression' @ [473:26] ==> value-parameter argumentNameExpression: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.changeArgumentName[ValueParameterDescriptorImpl]

'getIdentifier' @ [473:50] ==> public abstract fun getIdentifier(): PsiElement? defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'parameterInfo' @ [474:23] ==> value-parameter parameterInfo: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.changeArgumentName[ValueParameterDescriptorImpl]

'getInheritedName' @ [474:37] ==> public final fun getInheritedName(inheritedCallable: KotlinCallableDefinitionUsage<*>): String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[SimpleFunctionDescriptorImpl]

'callee' @ [474:54] ==> private final val callee: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage[PropertyDescriptorImpl]

'identifier' @ [475:9] ==> val identifier: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.changeArgumentName[LocalVariableDescriptor]

'replace' @ [475:20] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'KtPsiFactory' @ [475:28] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [475:41] ==> public final val KotlinFunctionCallUsage.project: Project[MyPropertyDescriptor]

'createIdentifier' @ [475:50] ==> public final fun createIdentifier(name: String): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'newName' @ [475:67] ==> val newName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.changeArgumentName[LocalVariableDescriptor]

'Comparator' @ [479:55] ==> @FunctionalInterface public fun <T : (Any..Any?)> Comparator(function: ((Pair<KtElement, KtElement>..Pair<KtElement, KtElement>?), (Pair<KtElement, KtElement>..Pair<KtElement, KtElement>?)) -> Int): Comparator<Pair<KtElement, KtElement>> defined in java.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> Pair<KtElement, KtElement>

'p1' @ [480:27] ==> value-parameter p1: (Pair<KtElement, KtElement>..Pair<KtElement, KtElement>?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.Companion.REVERSED_TEXT_OFFSET_COMPARATOR.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [480:30] ==> public final val first: KtElement defined in kotlin.Pair[DeserializedPropertyDescriptor]

'startOffset' @ [480:36] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'p2' @ [481:27] ==> value-parameter p2: (Pair<KtElement, KtElement>..Pair<KtElement, KtElement>?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.Companion.REVERSED_TEXT_OFFSET_COMPARATOR.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [481:30] ==> public final val first: KtElement defined in kotlin.Pair[DeserializedPropertyDescriptor]

'startOffset' @ [481:36] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'when {
                offset1 < offset2 -> 1
                offset1 > offset2 -> -1
                else -> 0
            }' @ [482:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int, entry1: Int, entry2: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int

'offset1' @ [483:17] ==> val offset1: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.Companion.REVERSED_TEXT_OFFSET_COMPARATOR.<anonymous>[LocalVariableDescriptor]

'offset2' @ [483:27] ==> val offset2: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.Companion.REVERSED_TEXT_OFFSET_COMPARATOR.<anonymous>[LocalVariableDescriptor]

'offset1' @ [484:17] ==> val offset1: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.Companion.REVERSED_TEXT_OFFSET_COMPARATOR.<anonymous>[LocalVariableDescriptor]

'offset2' @ [484:27] ==> val offset2: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.Companion.REVERSED_TEXT_OFFSET_COMPARATOR.<anonymous>[LocalVariableDescriptor]

'-' @ [484:38] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'ShortenReferences' @ [489:49] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'Options' @ [489:67] ==> public constructor Options(removeThisLabels: Boolean = ..., removeThis: Boolean = ..., removeExplicitCompanion: Boolean = ...) defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Options[DeserializedClassConstructorDescriptor]

'changeInfo' @ [492:35] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.Companion.updateJavaPropertyCall[ValueParameterDescriptorImpl]

'receiverParameterInfo' @ [492:46] ==> public final var receiverParameterInfo: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[PropertyDescriptorImpl]

'changeInfo' @ [493:40] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.Companion.updateJavaPropertyCall[ValueParameterDescriptorImpl]

'methodDescriptor' @ [493:51] ==> public final val methodDescriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[PropertyDescriptorImpl]

'receiver' @ [493:68] ==> public abstract val receiver: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMethodDescriptor[PropertyDescriptorImpl]

'newReceiverInfo' @ [494:17] ==> val newReceiverInfo: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.Companion.updateJavaPropertyCall[LocalVariableDescriptor]

'originalReceiverInfo' @ [494:36] ==> val originalReceiverInfo: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.Companion.updateJavaPropertyCall[LocalVariableDescriptor]

'element' @ [496:29] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.Companion.updateJavaPropertyCall[ValueParameterDescriptorImpl]

'valueArgumentList' @ [496:37] ==> public final val KtCallElement.valueArgumentList: KtValueArgumentList?[MyPropertyDescriptor]

'sure' @ [496:55] ==> public inline fun <T : Any> KtValueArgumentList?.sure(message: () -> String): KtValueArgumentList defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> KtValueArgumentList

'+' @ [496:62] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'element' @ [496:94] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.Companion.updateJavaPropertyCall[ValueParameterDescriptorImpl]

'text' @ [496:102] ==> public final val KtCallElement.text: (String..String?)[MyPropertyDescriptor]

'element' @ [497:32] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.Companion.updateJavaPropertyCall[ValueParameterDescriptorImpl]

'valueArguments' @ [497:40] ==> public final val KtCallElement.valueArguments: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'KtPsiFactory' @ [499:30] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'element' @ [499:43] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.Companion.updateJavaPropertyCall[ValueParameterDescriptorImpl]

'project' @ [499:51] ==> public final val KtCallElement.project: Project[MyPropertyDescriptor]

'oldArguments' @ [501:33] ==> val oldArguments: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.Companion.updateJavaPropertyCall[LocalVariableDescriptor]

'firstOrNull' @ [501:46] ==> public fun <T> List<(ValueArgument..ValueArgument?)>.firstOrNull(): ValueArgument? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)

'when {
                newReceiverInfo != null -> {
                    val defaultValueForCall = newReceiverInfo.defaultValueForCall ?: psiFactory.createExpression("_")
                    val newReceiverArgument = psiFactory.createArgument(defaultValueForCall, null, false)

                    if (originalReceiverInfo != null) {
                        firstArgument?.replace(newReceiverArgument)
                    }
                    else {
                        arguments.addArgumentAfter(newReceiverArgument, null)
                    }
                }

                firstArgument != null -> arguments.removeArgument(firstArgument)
            }' @ [503:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any?, entry1: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any?

'newReceiverInfo' @ [504:17] ==> val newReceiverInfo: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.Companion.updateJavaPropertyCall[LocalVariableDescriptor]

'newReceiverInfo' @ [505:47] ==> val newReceiverInfo: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.Companion.updateJavaPropertyCall[LocalVariableDescriptor]

'defaultValueForCall' @ [505:63] ==> public final var defaultValueForCall: KtExpression? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'psiFactory' @ [505:86] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.Companion.updateJavaPropertyCall[LocalVariableDescriptor]

'createExpression' @ [505:97] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'psiFactory' @ [506:47] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.Companion.updateJavaPropertyCall[LocalVariableDescriptor]

'createArgument' @ [506:58] ==> public final fun createArgument(expression: KtExpression?, name: Name? = ..., isSpread: Boolean = ...): KtValueArgument defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'defaultValueForCall' @ [506:73] ==> val defaultValueForCall: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.Companion.updateJavaPropertyCall[LocalVariableDescriptor]

'if (originalReceiverInfo != null) {
                        firstArgument?.replace(newReceiverArgument)
                    }
                    else {
                        arguments.addArgumentAfter(newReceiverArgument, null)
                    }' @ [508:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement?, elseBranch: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement?

'originalReceiverInfo' @ [508:25] ==> val originalReceiverInfo: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.Companion.updateJavaPropertyCall[LocalVariableDescriptor]

'firstArgument' @ [509:25] ==> val firstArgument: KtValueArgument? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.Companion.updateJavaPropertyCall[LocalVariableDescriptor]

'replace' @ [509:40] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'newReceiverArgument' @ [509:48] ==> val newReceiverArgument: KtValueArgument defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.Companion.updateJavaPropertyCall[LocalVariableDescriptor]

'arguments' @ [512:25] ==> val arguments: KtValueArgumentList defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.Companion.updateJavaPropertyCall[LocalVariableDescriptor]

'addArgumentAfter' @ [512:35] ==> @NotNull public open fun addArgumentAfter(@NotNull p0: KtValueArgument, @Nullable p1: KtValueArgument?): KtValueArgument defined in org.jetbrains.kotlin.psi.KtValueArgumentList[JavaMethodDescriptor]

'newReceiverArgument' @ [512:52] ==> val newReceiverArgument: KtValueArgument defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.Companion.updateJavaPropertyCall[LocalVariableDescriptor]

'firstArgument' @ [516:17] ==> val firstArgument: KtValueArgument? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.Companion.updateJavaPropertyCall[LocalVariableDescriptor]

'arguments' @ [516:42] ==> val arguments: KtValueArgumentList defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.Companion.updateJavaPropertyCall[LocalVariableDescriptor]

'removeArgument' @ [516:52] ==> public open fun removeArgument(@NotNull p0: KtValueArgument): Unit defined in org.jetbrains.kotlin.psi.KtValueArgumentList[JavaMethodDescriptor]

'firstArgument' @ [516:67] ==> val firstArgument: KtValueArgument? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.Companion.updateJavaPropertyCall[LocalVariableDescriptor]

'when (receiver) {
                is ExpressionReceiver -> receiver.expression
                is ImplicitReceiver -> {
                    val descriptor = receiver.declarationDescriptor
                    val thisText = if (descriptor is ClassDescriptor) "this@" + descriptor.name.asString() else "this"
                    psiFactory.createExpression(thisText)
                }
                else -> null
            }' @ [521:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression?, entry1: KtExpression?, entry2: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression?

'receiver' @ [521:26] ==> value-parameter receiver: ReceiverValue defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.Companion.getReceiverExpression[ValueParameterDescriptorImpl]

'receiver' @ [522:42] ==> value-parameter receiver: ReceiverValue defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.Companion.getReceiverExpression[ValueParameterDescriptorImpl]

'expression' @ [522:51] ==> public abstract val expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver[DeserializedPropertyDescriptor]

'receiver' @ [524:38] ==> value-parameter receiver: ReceiverValue defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.Companion.getReceiverExpression[ValueParameterDescriptorImpl]

'declarationDescriptor' @ [524:47] ==> public abstract val declarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitReceiver[DeserializedPropertyDescriptor]

'if (descriptor is ClassDescriptor) "this@" + descriptor.name.asString() else "this"' @ [525:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'descriptor' @ [525:40] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.Companion.getReceiverExpression[LocalVariableDescriptor]

'+' @ [525:71] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [525:81] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.Companion.getReceiverExpression[LocalVariableDescriptor]

'name' @ [525:92] ==> public final val ClassDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [525:97] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'psiFactory' @ [526:21] ==> value-parameter psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.Companion.getReceiverExpression[ValueParameterDescriptorImpl]

'createExpression' @ [526:32] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'thisText' @ [526:49] ==> val thisText: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinFunctionCallUsage.Companion.getReceiverExpression[LocalVariableDescriptor]

