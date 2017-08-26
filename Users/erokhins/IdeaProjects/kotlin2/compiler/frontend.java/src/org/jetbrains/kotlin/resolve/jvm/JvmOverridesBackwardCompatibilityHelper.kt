'hashSetOf' @ [30:34] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<CallableMemberDescriptor> /* = HashSet<CallableMemberDescriptor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'overridingDescriptor' @ [31:16] ==> value-parameter overridingDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.jvm.JvmOverridesBackwardCompatibilityHelper.overrideCanBeOmitted[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [31:37] ==> public final var CallableMemberDescriptor.overriddenDescriptors: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>)[MyPropertyDescriptor]

'all' @ [31:59] ==> public inline fun <T> Iterable<(CallableMemberDescriptor..CallableMemberDescriptor?)>.all(predicate: ((CallableMemberDescriptor..CallableMemberDescriptor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)

'isPlatformSpecificDescriptorThatCanBeImplicitlyOverridden' @ [32:13] ==> private final fun isPlatformSpecificDescriptorThatCanBeImplicitlyOverridden(overriddenDescriptor: CallableMemberDescriptor, visitedDescriptors: MutableSet<CallableMemberDescriptor>): Boolean defined in org.jetbrains.kotlin.resolve.jvm.JvmOverridesBackwardCompatibilityHelper[SimpleFunctionDescriptorImpl]

'it' @ [32:71] ==> value-parameter it: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.jvm.JvmOverridesBackwardCompatibilityHelper.overrideCanBeOmitted.<anonymous>[ValueParameterDescriptorImpl]

'visitedDescriptors' @ [32:75] ==> val visitedDescriptors: HashSet<CallableMemberDescriptor> /* = HashSet<CallableMemberDescriptor> */ defined in org.jetbrains.kotlin.resolve.jvm.JvmOverridesBackwardCompatibilityHelper.overrideCanBeOmitted[LocalVariableDescriptor]

'overriddenDescriptor' @ [40:13] ==> value-parameter overriddenDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.jvm.JvmOverridesBackwardCompatibilityHelper.isPlatformSpecificDescriptorThatCanBeImplicitlyOverridden[ValueParameterDescriptorImpl]

'modality' @ [40:34] ==> public final val CallableMemberDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [40:46] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'FINAL' @ [40:55] ==> enum entry FINAL defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'visitedDescriptors' @ [42:13] ==> value-parameter visitedDescriptors: MutableSet<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.jvm.JvmOverridesBackwardCompatibilityHelper.isPlatformSpecificDescriptorThatCanBeImplicitlyOverridden[ValueParameterDescriptorImpl]

'contains' @ [42:32] ==> public abstract fun contains(element: CallableMemberDescriptor): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'overriddenDescriptor' @ [42:41] ==> value-parameter overriddenDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.jvm.JvmOverridesBackwardCompatibilityHelper.isPlatformSpecificDescriptorThatCanBeImplicitlyOverridden[ValueParameterDescriptorImpl]

'original' @ [42:62] ==> public final val CallableMemberDescriptor.original: CallableMemberDescriptor[MyPropertyDescriptor]

'visitedDescriptors' @ [43:9] ==> value-parameter visitedDescriptors: MutableSet<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.jvm.JvmOverridesBackwardCompatibilityHelper.isPlatformSpecificDescriptorThatCanBeImplicitlyOverridden[ValueParameterDescriptorImpl]

'add' @ [43:28] ==> public abstract fun add(element: CallableMemberDescriptor): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'overriddenDescriptor' @ [43:32] ==> value-parameter overriddenDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.jvm.JvmOverridesBackwardCompatibilityHelper.isPlatformSpecificDescriptorThatCanBeImplicitlyOverridden[ValueParameterDescriptorImpl]

'original' @ [43:53] ==> public final val CallableMemberDescriptor.original: CallableMemberDescriptor[MyPropertyDescriptor]

'when (overriddenDescriptor.kind) {
            CallableMemberDescriptor.Kind.DELEGATION,
            CallableMemberDescriptor.Kind.FAKE_OVERRIDE ->
                return isOverridingOnlyDescriptorsThatCanBeImplicitlyOverridden(overriddenDescriptor, visitedDescriptors)

            CallableMemberDescriptor.Kind.DECLARATION -> {
                when {
                    overriddenDescriptor.annotations.hasAnnotation(PLATFORM_DEPENDENT_ANNOTATION_FQ_NAME) ->
                        return true
                    overriddenDescriptor is JavaMethodDescriptor -> {
                        val containingClass = DescriptorUtils.getContainingClass(overriddenDescriptor)
                                              ?: return false

                        if (JavaToKotlinClassMap.mapKotlinToJava(containingClass.fqNameUnsafe) != null) return true
                        if (overriddenDescriptor.overriddenDescriptors.isEmpty()) return false

                        return isOverridingOnlyDescriptorsThatCanBeImplicitlyOverridden(overriddenDescriptor, visitedDescriptors)
                    }
                    else ->
                        return false
                }

            }

            else ->
                return false
        }' @ [45:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'overriddenDescriptor' @ [45:15] ==> value-parameter overriddenDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.jvm.JvmOverridesBackwardCompatibilityHelper.isPlatformSpecificDescriptorThatCanBeImplicitlyOverridden[ValueParameterDescriptorImpl]

'kind' @ [45:36] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'DELEGATION' @ [46:43] ==> enum entry DELEGATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'FAKE_OVERRIDE' @ [47:43] ==> enum entry FAKE_OVERRIDE defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'isOverridingOnlyDescriptorsThatCanBeImplicitlyOverridden' @ [48:24] ==> private final fun isOverridingOnlyDescriptorsThatCanBeImplicitlyOverridden(overriddenDescriptor: CallableMemberDescriptor, visitedDescriptors: MutableSet<CallableMemberDescriptor>): Boolean defined in org.jetbrains.kotlin.resolve.jvm.JvmOverridesBackwardCompatibilityHelper[SimpleFunctionDescriptorImpl]

'overriddenDescriptor' @ [48:81] ==> value-parameter overriddenDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.jvm.JvmOverridesBackwardCompatibilityHelper.isPlatformSpecificDescriptorThatCanBeImplicitlyOverridden[ValueParameterDescriptorImpl]

'visitedDescriptors' @ [48:103] ==> value-parameter visitedDescriptors: MutableSet<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.jvm.JvmOverridesBackwardCompatibilityHelper.isPlatformSpecificDescriptorThatCanBeImplicitlyOverridden[ValueParameterDescriptorImpl]

'DECLARATION' @ [50:43] ==> enum entry DECLARATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'when {
                    overriddenDescriptor.annotations.hasAnnotation(PLATFORM_DEPENDENT_ANNOTATION_FQ_NAME) ->
                        return true
                    overriddenDescriptor is JavaMethodDescriptor -> {
                        val containingClass = DescriptorUtils.getContainingClass(overriddenDescriptor)
                                              ?: return false

                        if (JavaToKotlinClassMap.mapKotlinToJava(containingClass.fqNameUnsafe) != null) return true
                        if (overriddenDescriptor.overriddenDescriptors.isEmpty()) return false

                        return isOverridingOnlyDescriptorsThatCanBeImplicitlyOverridden(overriddenDescriptor, visitedDescriptors)
                    }
                    else ->
                        return false
                }' @ [51:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'overriddenDescriptor' @ [52:21] ==> value-parameter overriddenDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.jvm.JvmOverridesBackwardCompatibilityHelper.isPlatformSpecificDescriptorThatCanBeImplicitlyOverridden[ValueParameterDescriptorImpl]

'annotations' @ [52:42] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor[DeserializedPropertyDescriptor]

'hasAnnotation' @ [52:54] ==> public open fun hasAnnotation(fqName: FqName): Boolean defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[DeserializedSimpleFunctionDescriptor]

'PLATFORM_DEPENDENT_ANNOTATION_FQ_NAME' @ [52:68] ==> public val PLATFORM_DEPENDENT_ANNOTATION_FQ_NAME: FqName defined in org.jetbrains.kotlin.descriptors.deserialization[DeserializedPropertyDescriptor]

'overriddenDescriptor' @ [54:21] ==> value-parameter overriddenDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.jvm.JvmOverridesBackwardCompatibilityHelper.isPlatformSpecificDescriptorThatCanBeImplicitlyOverridden[ValueParameterDescriptorImpl]

'?:' @ [55:47] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: ClassDescriptor?, right: ClassDescriptor): ClassDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> ClassDescriptor

'getContainingClass' @ [55:63] ==> @Nullable public open fun getContainingClass(@NotNull p0: DeclarationDescriptor): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'overriddenDescriptor' @ [55:82] ==> value-parameter overriddenDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.jvm.JvmOverridesBackwardCompatibilityHelper.isPlatformSpecificDescriptorThatCanBeImplicitlyOverridden[ValueParameterDescriptorImpl]

'JavaToKotlinClassMap' @ [58:29] ==> public object JavaToKotlinClassMap : PlatformToKotlinClassMap defined in org.jetbrains.kotlin.platform[FakeCallableDescriptorForObject]

'mapKotlinToJava' @ [58:50] ==> public final fun mapKotlinToJava(kotlinFqName: FqNameUnsafe): ClassId? defined in org.jetbrains.kotlin.platform.JavaToKotlinClassMap[DeserializedSimpleFunctionDescriptor]

'containingClass' @ [58:66] ==> val containingClass: ClassDescriptor defined in org.jetbrains.kotlin.resolve.jvm.JvmOverridesBackwardCompatibilityHelper.isPlatformSpecificDescriptorThatCanBeImplicitlyOverridden[LocalVariableDescriptor]

'fqNameUnsafe' @ [58:82] ==> public val DeclarationDescriptor.fqNameUnsafe: FqNameUnsafe defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'overriddenDescriptor' @ [59:29] ==> value-parameter overriddenDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.jvm.JvmOverridesBackwardCompatibilityHelper.isPlatformSpecificDescriptorThatCanBeImplicitlyOverridden[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [59:50] ==> public final var JavaMethodDescriptor.overriddenDescriptors: (MutableCollection<out (FunctionDescriptor..FunctionDescriptor?)>..Collection<(FunctionDescriptor..FunctionDescriptor?)>)[MyPropertyDescriptor]

'isEmpty' @ [59:72] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'isOverridingOnlyDescriptorsThatCanBeImplicitlyOverridden' @ [61:32] ==> private final fun isOverridingOnlyDescriptorsThatCanBeImplicitlyOverridden(overriddenDescriptor: CallableMemberDescriptor, visitedDescriptors: MutableSet<CallableMemberDescriptor>): Boolean defined in org.jetbrains.kotlin.resolve.jvm.JvmOverridesBackwardCompatibilityHelper[SimpleFunctionDescriptorImpl]

'overriddenDescriptor' @ [61:89] ==> value-parameter overriddenDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.jvm.JvmOverridesBackwardCompatibilityHelper.isPlatformSpecificDescriptorThatCanBeImplicitlyOverridden[ValueParameterDescriptorImpl]

'visitedDescriptors' @ [61:111] ==> value-parameter visitedDescriptors: MutableSet<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.jvm.JvmOverridesBackwardCompatibilityHelper.isPlatformSpecificDescriptorThatCanBeImplicitlyOverridden[ValueParameterDescriptorImpl]

'overriddenDescriptor' @ [78:13] ==> value-parameter overriddenDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.jvm.JvmOverridesBackwardCompatibilityHelper.isOverridingOnlyDescriptorsThatCanBeImplicitlyOverridden[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [78:34] ==> public final var CallableMemberDescriptor.overriddenDescriptors: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>)[MyPropertyDescriptor]

'all' @ [78:56] ==> public inline fun <T> Iterable<(CallableMemberDescriptor..CallableMemberDescriptor?)>.all(predicate: ((CallableMemberDescriptor..CallableMemberDescriptor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)

'isPlatformSpecificDescriptorThatCanBeImplicitlyOverridden' @ [79:17] ==> private final fun isPlatformSpecificDescriptorThatCanBeImplicitlyOverridden(overriddenDescriptor: CallableMemberDescriptor, visitedDescriptors: MutableSet<CallableMemberDescriptor>): Boolean defined in org.jetbrains.kotlin.resolve.jvm.JvmOverridesBackwardCompatibilityHelper[SimpleFunctionDescriptorImpl]

'it' @ [79:75] ==> value-parameter it: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.jvm.JvmOverridesBackwardCompatibilityHelper.isOverridingOnlyDescriptorsThatCanBeImplicitlyOverridden.<anonymous>[ValueParameterDescriptorImpl]

'visitedDescriptors' @ [79:79] ==> value-parameter visitedDescriptors: MutableSet<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.jvm.JvmOverridesBackwardCompatibilityHelper.isOverridingOnlyDescriptorsThatCanBeImplicitlyOverridden[ValueParameterDescriptorImpl]

