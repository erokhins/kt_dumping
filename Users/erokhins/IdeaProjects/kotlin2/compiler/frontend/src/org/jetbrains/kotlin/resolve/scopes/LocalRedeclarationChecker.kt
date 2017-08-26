'newDescriptor' @ [34:20] ==> value-parameter newDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.AbstractLocalRedeclarationChecker.checkBeforeAddingToScope[ValueParameterDescriptorImpl]

'name' @ [34:34] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'WHEN_CHECK_DECLARATION_CONFLICTS' @ [35:41] ==> enum entry WHEN_CHECK_DECLARATION_CONFLICTS defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'when (newDescriptor) {
            is ClassifierDescriptor, is VariableDescriptor -> {
                val otherDescriptor = scope.getContributedClassifier(name, location)
                                      ?: scope.getContributedVariables(name, location).firstOrNull()
                if (otherDescriptor != null) {
                    handleRedeclaration(otherDescriptor, newDescriptor)
                }
            }
            is FunctionDescriptor -> {
                val otherFunctions = scope.getContributedFunctions(name, location)
                val otherClass = scope.getContributedClassifier(name, location)
                val potentiallyConflictingOverloads =
                        if (otherClass is ClassDescriptor)
                            otherFunctions + otherClass.constructors
                        else
                            otherFunctions

                for (overloadedDescriptor in potentiallyConflictingOverloads) {
                    if (!overloadChecker.isOverloadable(overloadedDescriptor, newDescriptor)) {
                        handleConflictingOverloads(newDescriptor, overloadedDescriptor)
                        break
                    }
                }
            }
            else -> throw IllegalStateException("Unexpected type of descriptor: ${newDescriptor::class.java.name}, descriptor: $newDescriptor")
        }' @ [36:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'newDescriptor' @ [36:15] ==> value-parameter newDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.AbstractLocalRedeclarationChecker.checkBeforeAddingToScope[ValueParameterDescriptorImpl]

'scope' @ [38:39] ==> value-parameter scope: LexicalScope defined in org.jetbrains.kotlin.resolve.scopes.AbstractLocalRedeclarationChecker.checkBeforeAddingToScope[ValueParameterDescriptorImpl]

'getContributedClassifier' @ [38:45] ==> public abstract fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedSimpleFunctionDescriptor]

'name' @ [38:70] ==> val name: Name defined in org.jetbrains.kotlin.resolve.scopes.AbstractLocalRedeclarationChecker.checkBeforeAddingToScope[LocalVariableDescriptor]

'location' @ [38:76] ==> val location: NoLookupLocation defined in org.jetbrains.kotlin.resolve.scopes.AbstractLocalRedeclarationChecker.checkBeforeAddingToScope[LocalVariableDescriptor]

'scope' @ [39:42] ==> value-parameter scope: LexicalScope defined in org.jetbrains.kotlin.resolve.scopes.AbstractLocalRedeclarationChecker.checkBeforeAddingToScope[ValueParameterDescriptorImpl]

'getContributedVariables' @ [39:48] ==> public abstract fun getContributedVariables(name: Name, location: LookupLocation): Collection<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedSimpleFunctionDescriptor]

'name' @ [39:72] ==> val name: Name defined in org.jetbrains.kotlin.resolve.scopes.AbstractLocalRedeclarationChecker.checkBeforeAddingToScope[LocalVariableDescriptor]

'location' @ [39:78] ==> val location: NoLookupLocation defined in org.jetbrains.kotlin.resolve.scopes.AbstractLocalRedeclarationChecker.checkBeforeAddingToScope[LocalVariableDescriptor]

'firstOrNull' @ [39:88] ==> public fun <T> Iterable<VariableDescriptor>.firstOrNull(): VariableDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableDescriptor

'otherDescriptor' @ [40:21] ==> val otherDescriptor: DeclarationDescriptorNonRoot? defined in org.jetbrains.kotlin.resolve.scopes.AbstractLocalRedeclarationChecker.checkBeforeAddingToScope[LocalVariableDescriptor]

'handleRedeclaration' @ [41:21] ==> protected abstract fun handleRedeclaration(first: DeclarationDescriptor, second: DeclarationDescriptor): Unit defined in org.jetbrains.kotlin.resolve.scopes.AbstractLocalRedeclarationChecker[SimpleFunctionDescriptorImpl]

'otherDescriptor' @ [41:41] ==> val otherDescriptor: DeclarationDescriptorNonRoot? defined in org.jetbrains.kotlin.resolve.scopes.AbstractLocalRedeclarationChecker.checkBeforeAddingToScope[LocalVariableDescriptor]

'newDescriptor' @ [41:58] ==> value-parameter newDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.AbstractLocalRedeclarationChecker.checkBeforeAddingToScope[ValueParameterDescriptorImpl]

'scope' @ [45:38] ==> value-parameter scope: LexicalScope defined in org.jetbrains.kotlin.resolve.scopes.AbstractLocalRedeclarationChecker.checkBeforeAddingToScope[ValueParameterDescriptorImpl]

'getContributedFunctions' @ [45:44] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedSimpleFunctionDescriptor]

'name' @ [45:68] ==> val name: Name defined in org.jetbrains.kotlin.resolve.scopes.AbstractLocalRedeclarationChecker.checkBeforeAddingToScope[LocalVariableDescriptor]

'location' @ [45:74] ==> val location: NoLookupLocation defined in org.jetbrains.kotlin.resolve.scopes.AbstractLocalRedeclarationChecker.checkBeforeAddingToScope[LocalVariableDescriptor]

'scope' @ [46:34] ==> value-parameter scope: LexicalScope defined in org.jetbrains.kotlin.resolve.scopes.AbstractLocalRedeclarationChecker.checkBeforeAddingToScope[ValueParameterDescriptorImpl]

'getContributedClassifier' @ [46:40] ==> public abstract fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedSimpleFunctionDescriptor]

'name' @ [46:65] ==> val name: Name defined in org.jetbrains.kotlin.resolve.scopes.AbstractLocalRedeclarationChecker.checkBeforeAddingToScope[LocalVariableDescriptor]

'location' @ [46:71] ==> val location: NoLookupLocation defined in org.jetbrains.kotlin.resolve.scopes.AbstractLocalRedeclarationChecker.checkBeforeAddingToScope[LocalVariableDescriptor]

'if (otherClass is ClassDescriptor)
                            otherFunctions + otherClass.constructors
                        else
                            otherFunctions' @ [48:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<FunctionDescriptor>, elseBranch: Collection<FunctionDescriptor>): Collection<FunctionDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<FunctionDescriptor>

'otherClass' @ [48:29] ==> val otherClass: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.AbstractLocalRedeclarationChecker.checkBeforeAddingToScope[LocalVariableDescriptor]

'otherFunctions' @ [49:29] ==> val otherFunctions: Collection<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.AbstractLocalRedeclarationChecker.checkBeforeAddingToScope[LocalVariableDescriptor]

'otherClass' @ [49:46] ==> val otherClass: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.AbstractLocalRedeclarationChecker.checkBeforeAddingToScope[LocalVariableDescriptor]

'constructors' @ [49:57] ==> public final val ClassDescriptor.constructors: Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'otherFunctions' @ [51:29] ==> val otherFunctions: Collection<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.AbstractLocalRedeclarationChecker.checkBeforeAddingToScope[LocalVariableDescriptor]

'potentiallyConflictingOverloads' @ [53:46] ==> val potentiallyConflictingOverloads: Collection<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.AbstractLocalRedeclarationChecker.checkBeforeAddingToScope[LocalVariableDescriptor]

'!' @ [54:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'overloadChecker' @ [54:26] ==> public final val overloadChecker: OverloadChecker defined in org.jetbrains.kotlin.resolve.scopes.AbstractLocalRedeclarationChecker[PropertyDescriptorImpl]

'isOverloadable' @ [54:42] ==> public final fun isOverloadable(a: DeclarationDescriptor, b: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.OverloadChecker[SimpleFunctionDescriptorImpl]

'overloadedDescriptor' @ [54:57] ==> val overloadedDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.scopes.AbstractLocalRedeclarationChecker.checkBeforeAddingToScope[LocalVariableDescriptor]

'newDescriptor' @ [54:79] ==> value-parameter newDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.AbstractLocalRedeclarationChecker.checkBeforeAddingToScope[ValueParameterDescriptorImpl]

'handleConflictingOverloads' @ [55:25] ==> protected abstract fun handleConflictingOverloads(first: CallableMemberDescriptor, second: CallableMemberDescriptor): Unit defined in org.jetbrains.kotlin.resolve.scopes.AbstractLocalRedeclarationChecker[SimpleFunctionDescriptorImpl]

'newDescriptor' @ [55:52] ==> value-parameter newDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.AbstractLocalRedeclarationChecker.checkBeforeAddingToScope[ValueParameterDescriptorImpl]

'overloadedDescriptor' @ [55:67] ==> val overloadedDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.scopes.AbstractLocalRedeclarationChecker.checkBeforeAddingToScope[LocalVariableDescriptor]

'IllegalStateException' @ [60:27] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'newDescriptor' @ [60:83] ==> value-parameter newDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.AbstractLocalRedeclarationChecker.checkBeforeAddingToScope[ValueParameterDescriptorImpl]

'java' @ [60:104] ==> public val <T> KClass<out DeclarationDescriptor>.java: Class<out DeclarationDescriptor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'name' @ [60:109] ==> public final val <T : (Any..Any?)> Class<out DeclarationDescriptor>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> DeclarationDescriptor

'newDescriptor' @ [60:129] ==> value-parameter newDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.AbstractLocalRedeclarationChecker.checkBeforeAddingToScope[ValueParameterDescriptorImpl]

'AbstractLocalRedeclarationChecker' @ [68:77] ==> public constructor AbstractLocalRedeclarationChecker(overloadChecker: OverloadChecker) defined in org.jetbrains.kotlin.resolve.scopes.AbstractLocalRedeclarationChecker[ClassConstructorDescriptorImpl]

'overloadChecker' @ [68:111] ==> value-parameter overloadChecker: OverloadChecker defined in org.jetbrains.kotlin.resolve.scopes.ThrowingLocalRedeclarationChecker.<init>[ValueParameterDescriptorImpl]

'IllegalStateException' @ [70:15] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'String' @ [70:37] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'format' @ [70:44] ==> @InlineOnly public inline fun String.Companion.format(format: String, vararg args: Any?): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'getFqName' @ [71:67] ==> @NotNull public open fun getFqName(@NotNull p0: DeclarationDescriptor): FqNameUnsafe defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'first' @ [71:77] ==> value-parameter first: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.ThrowingLocalRedeclarationChecker.handleRedeclaration[ValueParameterDescriptorImpl]

'first' @ [71:85] ==> value-parameter first: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.ThrowingLocalRedeclarationChecker.handleRedeclaration[ValueParameterDescriptorImpl]

'getFqName' @ [72:67] ==> @NotNull public open fun getFqName(@NotNull p0: DeclarationDescriptor): FqNameUnsafe defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'second' @ [72:77] ==> value-parameter second: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.ThrowingLocalRedeclarationChecker.handleRedeclaration[ValueParameterDescriptorImpl]

'second' @ [72:86] ==> value-parameter second: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.ThrowingLocalRedeclarationChecker.handleRedeclaration[ValueParameterDescriptorImpl]

'IllegalStateException' @ [76:15] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'String' @ [76:37] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'format' @ [76:44] ==> @InlineOnly public inline fun String.Companion.format(format: String, vararg args: Any?): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'getFqName' @ [77:67] ==> @NotNull public open fun getFqName(@NotNull p0: DeclarationDescriptor): FqNameUnsafe defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'first' @ [77:77] ==> value-parameter first: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.scopes.ThrowingLocalRedeclarationChecker.handleConflictingOverloads[ValueParameterDescriptorImpl]

'first' @ [77:85] ==> value-parameter first: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.scopes.ThrowingLocalRedeclarationChecker.handleConflictingOverloads[ValueParameterDescriptorImpl]

'getFqName' @ [78:67] ==> @NotNull public open fun getFqName(@NotNull p0: DeclarationDescriptor): FqNameUnsafe defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'second' @ [78:77] ==> value-parameter second: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.scopes.ThrowingLocalRedeclarationChecker.handleConflictingOverloads[ValueParameterDescriptorImpl]

'second' @ [78:86] ==> value-parameter second: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.scopes.ThrowingLocalRedeclarationChecker.handleConflictingOverloads[ValueParameterDescriptorImpl]

'AbstractLocalRedeclarationChecker' @ [82:103] ==> public constructor AbstractLocalRedeclarationChecker(overloadChecker: OverloadChecker) defined in org.jetbrains.kotlin.resolve.scopes.AbstractLocalRedeclarationChecker[ClassConstructorDescriptorImpl]

'overloadChecker' @ [82:137] ==> value-parameter overloadChecker: OverloadChecker defined in org.jetbrains.kotlin.resolve.scopes.TraceBasedLocalRedeclarationChecker.<init>[ValueParameterDescriptorImpl]

'reportOnDeclarationOrFail' @ [84:9] ==> public inline fun reportOnDeclarationOrFail(trace: BindingTrace, descriptor: DeclarationDescriptor, what: (PsiElement) -> Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics[SimpleFunctionDescriptorImpl]

'trace' @ [84:35] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.scopes.TraceBasedLocalRedeclarationChecker[PropertyDescriptorImpl]

'first' @ [84:42] ==> value-parameter first: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.TraceBasedLocalRedeclarationChecker.handleRedeclaration[ValueParameterDescriptorImpl]

'REDECLARATION' @ [84:58] ==> public final val REDECLARATION: (DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [84:72] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>)): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'it' @ [84:75] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.resolve.scopes.TraceBasedLocalRedeclarationChecker.handleRedeclaration.<anonymous>[ValueParameterDescriptorImpl]

'listOf' @ [84:79] ==> public fun <T> listOf(vararg elements: DeclarationDescriptor): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'first' @ [84:86] ==> value-parameter first: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.TraceBasedLocalRedeclarationChecker.handleRedeclaration[ValueParameterDescriptorImpl]

'second' @ [84:93] ==> value-parameter second: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.TraceBasedLocalRedeclarationChecker.handleRedeclaration[ValueParameterDescriptorImpl]

'reportOnDeclarationOrFail' @ [85:9] ==> public inline fun reportOnDeclarationOrFail(trace: BindingTrace, descriptor: DeclarationDescriptor, what: (PsiElement) -> Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics[SimpleFunctionDescriptorImpl]

'trace' @ [85:35] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.scopes.TraceBasedLocalRedeclarationChecker[PropertyDescriptorImpl]

'second' @ [85:42] ==> value-parameter second: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.TraceBasedLocalRedeclarationChecker.handleRedeclaration[ValueParameterDescriptorImpl]

'REDECLARATION' @ [85:59] ==> public final val REDECLARATION: (DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [85:73] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>)): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'it' @ [85:76] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.resolve.scopes.TraceBasedLocalRedeclarationChecker.handleRedeclaration.<anonymous>[ValueParameterDescriptorImpl]

'listOf' @ [85:80] ==> public fun <T> listOf(vararg elements: DeclarationDescriptor): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'first' @ [85:87] ==> value-parameter first: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.TraceBasedLocalRedeclarationChecker.handleRedeclaration[ValueParameterDescriptorImpl]

'second' @ [85:94] ==> value-parameter second: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.TraceBasedLocalRedeclarationChecker.handleRedeclaration[ValueParameterDescriptorImpl]

'reportOnDeclarationOrFail' @ [89:9] ==> public inline fun reportOnDeclarationOrFail(trace: BindingTrace, descriptor: DeclarationDescriptor, what: (PsiElement) -> Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics[SimpleFunctionDescriptorImpl]

'trace' @ [89:35] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.scopes.TraceBasedLocalRedeclarationChecker[PropertyDescriptorImpl]

'first' @ [89:42] ==> value-parameter first: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.scopes.TraceBasedLocalRedeclarationChecker.handleConflictingOverloads[ValueParameterDescriptorImpl]

'CONFLICTING_OVERLOADS' @ [89:58] ==> public final val CONFLICTING_OVERLOADS: (DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [89:80] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>)): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'it' @ [89:83] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.resolve.scopes.TraceBasedLocalRedeclarationChecker.handleConflictingOverloads.<anonymous>[ValueParameterDescriptorImpl]

'listOf' @ [89:87] ==> public fun <T> listOf(vararg elements: CallableMemberDescriptor): List<CallableMemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'first' @ [89:94] ==> value-parameter first: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.scopes.TraceBasedLocalRedeclarationChecker.handleConflictingOverloads[ValueParameterDescriptorImpl]

'second' @ [89:101] ==> value-parameter second: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.scopes.TraceBasedLocalRedeclarationChecker.handleConflictingOverloads[ValueParameterDescriptorImpl]

'reportOnDeclarationOrFail' @ [90:9] ==> public inline fun reportOnDeclarationOrFail(trace: BindingTrace, descriptor: DeclarationDescriptor, what: (PsiElement) -> Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics[SimpleFunctionDescriptorImpl]

'trace' @ [90:35] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.scopes.TraceBasedLocalRedeclarationChecker[PropertyDescriptorImpl]

'second' @ [90:42] ==> value-parameter second: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.scopes.TraceBasedLocalRedeclarationChecker.handleConflictingOverloads[ValueParameterDescriptorImpl]

'CONFLICTING_OVERLOADS' @ [90:59] ==> public final val CONFLICTING_OVERLOADS: (DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [90:81] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>)): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'it' @ [90:84] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.resolve.scopes.TraceBasedLocalRedeclarationChecker.handleConflictingOverloads.<anonymous>[ValueParameterDescriptorImpl]

'listOf' @ [90:88] ==> public fun <T> listOf(vararg elements: CallableMemberDescriptor): List<CallableMemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'first' @ [90:95] ==> value-parameter first: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.scopes.TraceBasedLocalRedeclarationChecker.handleConflictingOverloads[ValueParameterDescriptorImpl]

'second' @ [90:102] ==> value-parameter second: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.scopes.TraceBasedLocalRedeclarationChecker.handleConflictingOverloads[ValueParameterDescriptorImpl]

