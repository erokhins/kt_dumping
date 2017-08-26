'BaseImportingScope' @ [36:4] ==> public constructor BaseImportingScope(parent: ImportingScope?) defined in org.jetbrains.kotlin.resolve.scopes.BaseImportingScope[DeserializedClassConstructorDescriptor]

'name' @ [39:13] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope.getContributedClassifier[ValueParameterDescriptorImpl]

'aliasName' @ [39:21] ==> private final val aliasName: Name defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope[PropertyDescriptorImpl]

'when (packageOrClassDescriptor) {
            is PackageViewDescriptor -> packageOrClassDescriptor.memberScope.getContributedClassifier(declaredName, location)
            is ClassDescriptor -> packageOrClassDescriptor.unsubstitutedInnerClassesScope.getContributedClassifier(declaredName, location)
            else -> throw IllegalStateException("Should be class or package: $packageOrClassDescriptor")
        }' @ [41:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ClassifierDescriptor?, entry1: ClassifierDescriptor?, entry2: ClassifierDescriptor?): ClassifierDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ClassifierDescriptor?

'packageOrClassDescriptor' @ [41:22] ==> private final val packageOrClassDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope[PropertyDescriptorImpl]

'packageOrClassDescriptor' @ [42:41] ==> private final val packageOrClassDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope[PropertyDescriptorImpl]

'memberScope' @ [42:66] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'getContributedClassifier' @ [42:78] ==> public abstract fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'declaredName' @ [42:103] ==> private final val declaredName: Name defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope[PropertyDescriptorImpl]

'location' @ [42:117] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope.getContributedClassifier[ValueParameterDescriptorImpl]

'packageOrClassDescriptor' @ [43:35] ==> private final val packageOrClassDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope[PropertyDescriptorImpl]

'unsubstitutedInnerClassesScope' @ [43:60] ==> public final val ClassDescriptor.unsubstitutedInnerClassesScope: MemberScope[MyPropertyDescriptor]

'getContributedClassifier' @ [43:91] ==> public abstract fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'declaredName' @ [43:116] ==> private final val declaredName: Name defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope[PropertyDescriptorImpl]

'location' @ [43:130] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope.getContributedClassifier[ValueParameterDescriptorImpl]

'IllegalStateException' @ [44:27] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'packageOrClassDescriptor' @ [44:79] ==> private final val packageOrClassDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope[PropertyDescriptorImpl]

'name' @ [49:13] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope.getContributedFunctions[ValueParameterDescriptorImpl]

'aliasName' @ [49:21] ==> private final val aliasName: Name defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope[PropertyDescriptorImpl]

'emptyList' @ [49:39] ==> public fun <T> emptyList(): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'collectCallableMemberDescriptors' @ [51:16] ==> private final fun <D : CallableMemberDescriptor> collectCallableMemberDescriptors(location: LookupLocation, getDescriptors: MemberScope.(Name, LookupLocation) -> Collection<SimpleFunctionDescriptor>): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableMemberDescriptor> -> SimpleFunctionDescriptor

'location' @ [51:49] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope.getContributedFunctions[ValueParameterDescriptorImpl]

'MemberScope' @ [51:59] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[FakeCallableDescriptorForObject]

'name' @ [55:13] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope.getContributedVariables[ValueParameterDescriptorImpl]

'aliasName' @ [55:21] ==> private final val aliasName: Name defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope[PropertyDescriptorImpl]

'emptyList' @ [55:39] ==> public fun <T> emptyList(): List<VariableDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableDescriptor

'collectCallableMemberDescriptors' @ [57:16] ==> private final fun <D : CallableMemberDescriptor> collectCallableMemberDescriptors(location: LookupLocation, getDescriptors: MemberScope.(Name, LookupLocation) -> Collection<PropertyDescriptor>): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableMemberDescriptor> -> PropertyDescriptor

'location' @ [57:49] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope.getContributedVariables[ValueParameterDescriptorImpl]

'MemberScope' @ [57:59] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[FakeCallableDescriptorForObject]

'SmartList' @ [65:27] ==> public constructor SmartList<E : (Any..Any?)>() defined in com.intellij.util.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> DeclarationDescriptor

'descriptors' @ [67:9] ==> val descriptors: SmartList<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope.getContributedDescriptors[LocalVariableDescriptor]

'addIfNotNull' @ [67:21] ==> public fun <T : Any> MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>.addIfNotNull(t: DeclarationDescriptor?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)

'getContributedClassifier' @ [67:34] ==> public open fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope[SimpleFunctionDescriptorImpl]

'aliasName' @ [67:59] ==> private final val aliasName: Name defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope[PropertyDescriptorImpl]

'WHEN_GET_ALL_DESCRIPTORS' @ [67:87] ==> enum entry WHEN_GET_ALL_DESCRIPTORS defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'descriptors' @ [68:9] ==> val descriptors: SmartList<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope.getContributedDescriptors[LocalVariableDescriptor]

'addAll' @ [68:21] ==> public open fun addAll(elements: Collection<(DeclarationDescriptor..DeclarationDescriptor?)>): Boolean defined in com.intellij.util.SmartList[JavaMethodDescriptor]

'getContributedFunctions' @ [68:28] ==> public open fun getContributedFunctions(name: Name, location: LookupLocation): Collection<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope[SimpleFunctionDescriptorImpl]

'aliasName' @ [68:52] ==> private final val aliasName: Name defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope[PropertyDescriptorImpl]

'WHEN_GET_ALL_DESCRIPTORS' @ [68:80] ==> enum entry WHEN_GET_ALL_DESCRIPTORS defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'descriptors' @ [69:9] ==> val descriptors: SmartList<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope.getContributedDescriptors[LocalVariableDescriptor]

'addAll' @ [69:21] ==> public open fun addAll(elements: Collection<(DeclarationDescriptor..DeclarationDescriptor?)>): Boolean defined in com.intellij.util.SmartList[JavaMethodDescriptor]

'getContributedVariables' @ [69:28] ==> public open fun getContributedVariables(name: Name, location: LookupLocation): Collection<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope[SimpleFunctionDescriptorImpl]

'aliasName' @ [69:52] ==> private final val aliasName: Name defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope[PropertyDescriptorImpl]

'WHEN_GET_ALL_DESCRIPTORS' @ [69:80] ==> enum entry WHEN_GET_ALL_DESCRIPTORS defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'changeNamesForAliased' @ [71:13] ==> value-parameter changeNamesForAliased: Boolean defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope.getContributedDescriptors[ValueParameterDescriptorImpl]

'aliasName' @ [71:38] ==> private final val aliasName: Name defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope[PropertyDescriptorImpl]

'declaredName' @ [71:51] ==> private final val declaredName: Name defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope[PropertyDescriptorImpl]

'descriptors' @ [72:23] ==> val descriptors: SmartList<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope.getContributedDescriptors[LocalVariableDescriptor]

'indices' @ [72:35] ==> public val Collection<*>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]

'descriptors' @ [73:34] ==> val descriptors: SmartList<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope.getContributedDescriptors[LocalVariableDescriptor]

'i' @ [73:46] ==> val i: Int defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope.getContributedDescriptors[LocalVariableDescriptor]

'when (descriptor) {
                    is ClassDescriptor -> {
                        object : ClassDescriptor by descriptor {
                            override fun getName() = aliasName
                        }
                    }

                    is TypeAliasDescriptor -> {
                        object : TypeAliasDescriptor by descriptor {
                            override fun getName() = aliasName
                        }
                    }

                    is CallableMemberDescriptor -> {
                        descriptor
                                .newCopyBuilder()
                                .setName(aliasName)
                                .setOriginal(descriptor)
                                .build()!!
                    }

                    else -> error("Unknown kind of descriptor in import alias: $descriptor")
                }' @ [74:60] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: DeclarationDescriptor, entry1: DeclarationDescriptor, entry2: DeclarationDescriptor, entry3: DeclarationDescriptor): DeclarationDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> DeclarationDescriptor

'descriptor' @ [74:66] ==> val descriptor: (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope.getContributedDescriptors[LocalVariableDescriptor]

'descriptor' @ [76:53] ==> val descriptor: (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope.getContributedDescriptors[LocalVariableDescriptor]

'aliasName' @ [77:54] ==> private final val aliasName: Name defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope[PropertyDescriptorImpl]

'descriptor' @ [82:57] ==> val descriptor: (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope.getContributedDescriptors[LocalVariableDescriptor]

'aliasName' @ [83:54] ==> private final val aliasName: Name defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope[PropertyDescriptorImpl]

'descriptor' @ [88:25] ==> val descriptor: (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope.getContributedDescriptors[LocalVariableDescriptor]

'newCopyBuilder' @ [89:34] ==> @NotNull public abstract fun newCopyBuilder(): CallableMemberDescriptor.CopyBuilder<out (CallableMemberDescriptor..CallableMemberDescriptor?)> defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor[JavaMethodDescriptor]

'setName' @ [90:34] ==> @NotNull public abstract fun setName(@NotNull p0: Name): CallableMemberDescriptor.CopyBuilder<out (CallableMemberDescriptor..CallableMemberDescriptor?)> defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.CopyBuilder[JavaMethodDescriptor]

'aliasName' @ [90:42] ==> private final val aliasName: Name defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope[PropertyDescriptorImpl]

'setOriginal' @ [91:34] ==> @NotNull public abstract fun setOriginal(@Nullable p0: CallableMemberDescriptor?): CallableMemberDescriptor.CopyBuilder<out (CallableMemberDescriptor..CallableMemberDescriptor?)> defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.CopyBuilder[JavaMethodDescriptor]

'descriptor' @ [91:46] ==> val descriptor: (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope.getContributedDescriptors[LocalVariableDescriptor]

'build' @ [92:34] ==> @Nullable public abstract fun build(): CallableMemberDescriptor? defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.CopyBuilder[JavaMethodDescriptor]

'error' @ [95:29] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [95:81] ==> val descriptor: (DeclarationDescriptor..DeclarationDescriptor?) defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope.getContributedDescriptors[LocalVariableDescriptor]

'descriptors' @ [97:17] ==> val descriptors: SmartList<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope.getContributedDescriptors[LocalVariableDescriptor]

'i' @ [97:29] ==> val i: Int defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope.getContributedDescriptors[LocalVariableDescriptor]

'newDescriptor' @ [97:34] ==> val newDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope.getContributedDescriptors[LocalVariableDescriptor]

'descriptors' @ [101:16] ==> val descriptors: SmartList<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope.getContributedDescriptors[LocalVariableDescriptor]

'p' @ [105:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope.printStructure[ValueParameterDescriptorImpl]

'println' @ [105:11] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'this' @ [105:19] ==> <this> defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope[LazyClassReceiverParameterDescriptor]

'java' @ [105:31] ==> public val <T> KClass<out LazyExplicitImportScope>.java: Class<out LazyExplicitImportScope> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> LazyExplicitImportScope

'simpleName' @ [105:36] ==> public final val <T : (Any..Any?)> Class<out LazyExplicitImportScope>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> LazyExplicitImportScope

'aliasName' @ [105:54] ==> private final val aliasName: Name defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope[PropertyDescriptorImpl]

'getContributedDescriptors' @ [109:51] ==> public open fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope[DeserializedSimpleFunctionDescriptor]

'apply' @ [109:79] ==> @InlineOnly public inline fun <T> Collection<DeclarationDescriptor>.apply(block: Collection<DeclarationDescriptor>.() -> Unit): Collection<DeclarationDescriptor> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<DeclarationDescriptor>

'storeReferences' @ [109:85] ==> private final val storeReferences: (Collection<DeclarationDescriptor>) -> Unit defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope[PropertyDescriptorImpl]

'SmartList' @ [115:27] ==> public constructor SmartList<E : (Any..Any?)>() defined in com.intellij.util.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> D

'when (packageOrClassDescriptor) {
            is PackageViewDescriptor -> {
                val packageScope = packageOrClassDescriptor.memberScope
                descriptors.addAll(packageScope.getDescriptors(declaredName, location))
            }

            is ClassDescriptor -> {
                val staticClassScope = packageOrClassDescriptor.staticScope
                descriptors.addAll(staticClassScope.getDescriptors(declaredName, location))

                if (packageOrClassDescriptor.kind == ClassKind.OBJECT) {
                    descriptors.addAll(
                            packageOrClassDescriptor.unsubstitutedMemberScope.getDescriptors(declaredName, location)
                                    .mapNotNull { it.asImportedFromObjectIfPossible() }
                    )
                }
            }

            else -> throw IllegalStateException("Should be class or package: $packageOrClassDescriptor")
        }' @ [117:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'packageOrClassDescriptor' @ [117:15] ==> private final val packageOrClassDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope[PropertyDescriptorImpl]

'packageOrClassDescriptor' @ [119:36] ==> private final val packageOrClassDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope[PropertyDescriptorImpl]

'memberScope' @ [119:61] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'descriptors' @ [120:17] ==> val descriptors: SmartList<D> defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope.collectCallableMemberDescriptors[LocalVariableDescriptor]

'addAll' @ [120:29] ==> public open fun addAll(elements: Collection<(D..D?)>): Boolean defined in com.intellij.util.SmartList[JavaMethodDescriptor]

'packageScope' @ [120:36] ==> val packageScope: MemberScope defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope.collectCallableMemberDescriptors[LocalVariableDescriptor]

'invoke' @ [120:49] ==> public abstract operator fun MemberScope.invoke(p2: Name, p3: LookupLocation): Collection<D> defined in kotlin.Function3[FunctionInvokeDescriptor]

'declaredName' @ [120:64] ==> private final val declaredName: Name defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope[PropertyDescriptorImpl]

'location' @ [120:78] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope.collectCallableMemberDescriptors[ValueParameterDescriptorImpl]

'packageOrClassDescriptor' @ [124:40] ==> private final val packageOrClassDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope[PropertyDescriptorImpl]

'staticScope' @ [124:65] ==> public final val ClassDescriptor.staticScope: MemberScope[MyPropertyDescriptor]

'descriptors' @ [125:17] ==> val descriptors: SmartList<D> defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope.collectCallableMemberDescriptors[LocalVariableDescriptor]

'addAll' @ [125:29] ==> public open fun addAll(elements: Collection<(D..D?)>): Boolean defined in com.intellij.util.SmartList[JavaMethodDescriptor]

'staticClassScope' @ [125:36] ==> val staticClassScope: MemberScope defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope.collectCallableMemberDescriptors[LocalVariableDescriptor]

'invoke' @ [125:53] ==> public abstract operator fun MemberScope.invoke(p2: Name, p3: LookupLocation): Collection<D> defined in kotlin.Function3[FunctionInvokeDescriptor]

'declaredName' @ [125:68] ==> private final val declaredName: Name defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope[PropertyDescriptorImpl]

'location' @ [125:82] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope.collectCallableMemberDescriptors[ValueParameterDescriptorImpl]

'packageOrClassDescriptor' @ [127:21] ==> private final val packageOrClassDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope[PropertyDescriptorImpl]

'kind' @ [127:46] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'OBJECT' @ [127:64] ==> enum entry OBJECT defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'descriptors' @ [128:21] ==> val descriptors: SmartList<D> defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope.collectCallableMemberDescriptors[LocalVariableDescriptor]

'addAll' @ [128:33] ==> public open fun addAll(elements: Collection<(D..D?)>): Boolean defined in com.intellij.util.SmartList[JavaMethodDescriptor]

'packageOrClassDescriptor' @ [129:29] ==> private final val packageOrClassDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope[PropertyDescriptorImpl]

'unsubstitutedMemberScope' @ [129:54] ==> public final val ClassDescriptor.unsubstitutedMemberScope: MemberScope[MyPropertyDescriptor]

'invoke' @ [129:79] ==> public abstract operator fun MemberScope.invoke(p2: Name, p3: LookupLocation): Collection<D> defined in kotlin.Function3[FunctionInvokeDescriptor]

'declaredName' @ [129:94] ==> private final val declaredName: Name defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope[PropertyDescriptorImpl]

'location' @ [129:108] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope.collectCallableMemberDescriptors[ValueParameterDescriptorImpl]

'mapNotNull' @ [130:38] ==> public inline fun <T, R : Any> Iterable<D>.mapNotNull(transform: (D) -> D?): List<D> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> D
    <R : Any> -> D

'it' @ [130:51] ==> value-parameter it: D defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope.collectCallableMemberDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'asImportedFromObjectIfPossible' @ [130:54] ==> @Suppress private final fun <D : CallableMemberDescriptor> D.asImportedFromObjectIfPossible(): D? defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableMemberDescriptor> -> D

'IllegalStateException' @ [135:27] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'packageOrClassDescriptor' @ [135:79] ==> private final val packageOrClassDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope[PropertyDescriptorImpl]

'descriptors' @ [138:16] ==> val descriptors: SmartList<D> defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope.collectCallableMemberDescriptors[LocalVariableDescriptor]

'choseOnlyVisibleOrAll' @ [138:28] ==> private final fun <D : CallableMemberDescriptor> Collection<(D..D?)>.choseOnlyVisibleOrAll(): Collection<(D..D?)> defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableMemberDescriptor> -> (D..D?)

'Suppress' @ [141:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'when (this) {
        is PropertyDescriptor -> asImportedFromObject() as D
        is FunctionDescriptor -> asImportedFromObject() as D
        else -> null
    }' @ [142:89] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: D?, entry1: D?, entry2: D?): D?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> D?

'this' @ [142:95] ==> <this> defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope.asImportedFromObjectIfPossible[ReceiverParameterDescriptorImpl]

'asImportedFromObject' @ [143:34] ==> public fun PropertyDescriptor.asImportedFromObject(original: PropertyImportedFromObject? = ...): PropertyImportedFromObject defined in org.jetbrains.kotlin.resolve[SimpleFunctionDescriptorImpl]

'asImportedFromObject' @ [144:34] ==> public fun FunctionDescriptor.asImportedFromObject(original: FunctionImportedFromObject? = ...): FunctionImportedFromObject defined in org.jetbrains.kotlin.resolve[SimpleFunctionDescriptorImpl]

'filter' @ [149:13] ==> public inline fun <T> Iterable<D>.filter(predicate: (D) -> Boolean): List<D> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> D

'isVisible' @ [149:22] ==> internal fun isVisible(descriptor: DeclarationDescriptor, shouldBeVisibleFrom: DeclarationDescriptor?, position: QualifierPosition): Boolean defined in org.jetbrains.kotlin.resolve in file QualifiedExpressionResolver.kt[SimpleFunctionDescriptorImpl]

'it' @ [149:32] ==> value-parameter it: D defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope.choseOnlyVisibleOrAll.<anonymous>[ValueParameterDescriptorImpl]

'packageFragmentForVisibilityCheck' @ [149:36] ==> private final val packageFragmentForVisibilityCheck: PackageFragmentDescriptor? defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope[PropertyDescriptorImpl]

'IMPORT' @ [149:100] ==> enum entry IMPORT defined in org.jetbrains.kotlin.resolve.QualifierPosition[FakeCallableDescriptorForObject]

'takeIf' @ [150:21] ==> @InlineOnly @SinceKotlin public inline fun <T> List<D>.takeIf(predicate: (List<D>) -> Boolean): List<D>? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<D>

'it' @ [150:30] ==> value-parameter it: List<D> defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope.choseOnlyVisibleOrAll.<anonymous>[ValueParameterDescriptorImpl]

'isNotEmpty' @ [150:33] ==> @InlineOnly public inline fun <T> Collection<D>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> D

'this' @ [150:51] ==> <this> defined in org.jetbrains.kotlin.resolve.LazyExplicitImportScope.choseOnlyVisibleOrAll[ReceiverParameterDescriptorImpl]

