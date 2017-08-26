'if (workerScope is AbstractScopeAdapter)
                (workerScope as AbstractScopeAdapter).getActualScope()
            else
                workerScope' @ [34:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: MemberScope, elseBranch: MemberScope): MemberScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> MemberScope

'workerScope' @ [34:17] ==> protected abstract val workerScope: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter[PropertyDescriptorImpl]

'workerScope' @ [35:18] ==> protected abstract val workerScope: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter[PropertyDescriptorImpl]

'getActualScope' @ [35:55] ==> public final fun getActualScope(): MemberScope defined in org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter[SimpleFunctionDescriptorImpl]

'workerScope' @ [37:17] ==> protected abstract val workerScope: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter[PropertyDescriptorImpl]

'workerScope' @ [40:16] ==> protected abstract val workerScope: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter[PropertyDescriptorImpl]

'getContributedFunctions' @ [40:28] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'name' @ [40:52] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter.getContributedFunctions[ValueParameterDescriptorImpl]

'location' @ [40:58] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter.getContributedFunctions[ValueParameterDescriptorImpl]

'workerScope' @ [44:16] ==> protected abstract val workerScope: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter[PropertyDescriptorImpl]

'getContributedClassifier' @ [44:28] ==> public abstract fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'name' @ [44:53] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter.getContributedClassifier[ValueParameterDescriptorImpl]

'location' @ [44:59] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter.getContributedClassifier[ValueParameterDescriptorImpl]

'workerScope' @ [48:16] ==> protected abstract val workerScope: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter[PropertyDescriptorImpl]

'getContributedVariables' @ [48:28] ==> public abstract fun getContributedVariables(name: Name, location: LookupLocation): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'name' @ [48:52] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter.getContributedVariables[ValueParameterDescriptorImpl]

'location' @ [48:58] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter.getContributedVariables[ValueParameterDescriptorImpl]

'workerScope' @ [53:16] ==> protected abstract val workerScope: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter[PropertyDescriptorImpl]

'getContributedDescriptors' @ [53:28] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'kindFilter' @ [53:54] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter.getContributedDescriptors[ValueParameterDescriptorImpl]

'nameFilter' @ [53:66] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter.getContributedDescriptors[ValueParameterDescriptorImpl]

'workerScope' @ [56:39] ==> protected abstract val workerScope: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter[PropertyDescriptorImpl]

'getFunctionNames' @ [56:51] ==> public abstract fun getFunctionNames(): Set<Name> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'workerScope' @ [57:39] ==> protected abstract val workerScope: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter[PropertyDescriptorImpl]

'getVariableNames' @ [57:51] ==> public abstract fun getVariableNames(): Set<Name> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'p' @ [60:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter.printScopeStructure[ValueParameterDescriptorImpl]

'println' @ [60:11] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'this' @ [60:19] ==> <this> defined in org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter[LazyClassReceiverParameterDescriptor]

'java' @ [60:31] ==> public val <T> KClass<out AbstractScopeAdapter>.java: Class<out AbstractScopeAdapter> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> AbstractScopeAdapter

'simpleName' @ [60:36] ==> public final val <T : (Any..Any?)> Class<out AbstractScopeAdapter>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> AbstractScopeAdapter

'p' @ [61:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter.printScopeStructure[ValueParameterDescriptorImpl]

'pushIndent' @ [61:11] ==> @NotNull public open fun pushIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [63:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter.printScopeStructure[ValueParameterDescriptorImpl]

'print' @ [63:11] ==> @NotNull public open fun print(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'workerScope' @ [64:9] ==> protected abstract val workerScope: MemberScope defined in org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter[PropertyDescriptorImpl]

'printScopeStructure' @ [64:21] ==> public abstract fun printScopeStructure(p: Printer): Unit defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'p' @ [64:41] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter.printScopeStructure[ValueParameterDescriptorImpl]

'withholdIndentOnce' @ [64:43] ==> @NotNull public open fun withholdIndentOnce(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [66:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter.printScopeStructure[ValueParameterDescriptorImpl]

'popIndent' @ [66:11] ==> @NotNull public open fun popIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [67:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter.printScopeStructure[ValueParameterDescriptorImpl]

'println' @ [67:11] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

