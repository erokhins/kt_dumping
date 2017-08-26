'if (original.overriddenDescriptors.isEmpty())
        this is JavaCallableMemberDescriptor || containingDeclaration is JavaClassDescriptor
    else
        original.overriddenDescriptors.any { it.hasJavaOriginInHierarchy() }' @ [25:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'original' @ [25:16] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'overriddenDescriptors' @ [25:25] ==> public final var FunctionDescriptor.overriddenDescriptors: (MutableCollection<out (FunctionDescriptor..FunctionDescriptor?)>..Collection<(FunctionDescriptor..FunctionDescriptor?)>)[MyPropertyDescriptor]

'isEmpty' @ [25:47] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'this' @ [26:9] ==> <this> defined in org.jetbrains.kotlin.synthetic.hasJavaOriginInHierarchy[ReceiverParameterDescriptorImpl]

'containingDeclaration' @ [26:49] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'original' @ [28:9] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'overriddenDescriptors' @ [28:18] ==> public final var FunctionDescriptor.overriddenDescriptors: (MutableCollection<out (FunctionDescriptor..FunctionDescriptor?)>..Collection<(FunctionDescriptor..FunctionDescriptor?)>)[MyPropertyDescriptor]

'any' @ [28:40] ==> public inline fun <T> Iterable<(FunctionDescriptor..FunctionDescriptor?)>.any(predicate: ((FunctionDescriptor..FunctionDescriptor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'it' @ [28:46] ==> value-parameter it: (FunctionDescriptor..FunctionDescriptor?) defined in org.jetbrains.kotlin.synthetic.hasJavaOriginInHierarchy.<anonymous>[ValueParameterDescriptorImpl]

'hasJavaOriginInHierarchy' @ [28:49] ==> public fun FunctionDescriptor.hasJavaOriginInHierarchy(): Boolean defined in org.jetbrains.kotlin.synthetic in file syntheticExtensionsUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [31:37] ==> <this> defined in org.jetbrains.kotlin.synthetic.isVisibleOutside[ReceiverParameterDescriptorImpl]

'PRIVATE' @ [31:58] ==> @NotNull public final val PRIVATE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'this' @ [31:69] ==> <this> defined in org.jetbrains.kotlin.synthetic.isVisibleOutside[ReceiverParameterDescriptorImpl]

'PRIVATE_TO_THIS' @ [31:90] ==> @NotNull public final val PRIVATE_TO_THIS: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'this' @ [31:109] ==> <this> defined in org.jetbrains.kotlin.synthetic.isVisibleOutside[ReceiverParameterDescriptorImpl]

'INVISIBLE_FAKE' @ [31:130] ==> @NotNull public final val INVISIBLE_FAKE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'originalDescriptor' @ [34:30] ==> value-parameter originalDescriptor: DeclarationDescriptorWithVisibility defined in org.jetbrains.kotlin.synthetic.syntheticVisibility[ValueParameterDescriptorImpl]

'visibility' @ [34:49] ==> public final val DeclarationDescriptorWithVisibility.visibility: Visibility[MyPropertyDescriptor]

'when (originalVisibility) {
        Visibilities.PUBLIC -> Visibilities.PUBLIC

        else -> object : Visibility(originalVisibility.name, originalVisibility.isPublicAPI) {
            override fun isVisible(
                    receiver: ReceiverValue?,
                    what: DeclarationDescriptorWithVisibility,
                    from: DeclarationDescriptor
            ) = originalVisibility.isVisible(
                    if (isUsedForExtension) Visibilities.ALWAYS_SUITABLE_RECEIVER else receiver, originalDescriptor, from)

            override fun mustCheckInImports()
                    = throw UnsupportedOperationException("Should never be called for this visibility")

            override fun normalize()
                    = originalVisibility.normalize()

            override val displayName: String
                get() = originalVisibility.displayName + " for synthetic extension"
        }
    }' @ [35:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Visibility, entry1: Visibility): Visibility[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Visibility

'originalVisibility' @ [35:18] ==> val originalVisibility: Visibility defined in org.jetbrains.kotlin.synthetic.syntheticVisibility[LocalVariableDescriptor]

'PUBLIC' @ [36:22] ==> @NotNull public final val PUBLIC: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'PUBLIC' @ [36:45] ==> @NotNull public final val PUBLIC: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'Visibility' @ [38:26] ==> protected constructor Visibility(name: String, isPublicAPI: Boolean) defined in org.jetbrains.kotlin.descriptors.Visibility[DeserializedClassConstructorDescriptor]

'originalVisibility' @ [38:37] ==> val originalVisibility: Visibility defined in org.jetbrains.kotlin.synthetic.syntheticVisibility[LocalVariableDescriptor]

'name' @ [38:56] ==> public final val name: String defined in org.jetbrains.kotlin.descriptors.Visibility[DeserializedPropertyDescriptor]

'originalVisibility' @ [38:62] ==> val originalVisibility: Visibility defined in org.jetbrains.kotlin.synthetic.syntheticVisibility[LocalVariableDescriptor]

'isPublicAPI' @ [38:81] ==> public final val isPublicAPI: Boolean defined in org.jetbrains.kotlin.descriptors.Visibility[DeserializedPropertyDescriptor]

'originalVisibility' @ [43:17] ==> val originalVisibility: Visibility defined in org.jetbrains.kotlin.synthetic.syntheticVisibility[LocalVariableDescriptor]

'isVisible' @ [43:36] ==> public abstract fun isVisible(receiver: ReceiverValue?, what: DeclarationDescriptorWithVisibility, from: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.descriptors.Visibility[DeserializedSimpleFunctionDescriptor]

'if (isUsedForExtension) Visibilities.ALWAYS_SUITABLE_RECEIVER else receiver' @ [44:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ReceiverValue?, elseBranch: ReceiverValue?): ReceiverValue?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ReceiverValue?

'isUsedForExtension' @ [44:25] ==> value-parameter isUsedForExtension: Boolean defined in org.jetbrains.kotlin.synthetic.syntheticVisibility[ValueParameterDescriptorImpl]

'ALWAYS_SUITABLE_RECEIVER' @ [44:58] ==> public final val ALWAYS_SUITABLE_RECEIVER: (ReceiverValue..ReceiverValue?) defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'receiver' @ [44:88] ==> value-parameter receiver: ReceiverValue? defined in org.jetbrains.kotlin.synthetic.syntheticVisibility.<no name provided>.isVisible[ValueParameterDescriptorImpl]

'originalDescriptor' @ [44:98] ==> value-parameter originalDescriptor: DeclarationDescriptorWithVisibility defined in org.jetbrains.kotlin.synthetic.syntheticVisibility[ValueParameterDescriptorImpl]

'from' @ [44:118] ==> value-parameter from: DeclarationDescriptor defined in org.jetbrains.kotlin.synthetic.syntheticVisibility.<no name provided>.isVisible[ValueParameterDescriptorImpl]

'UnsupportedOperationException' @ [47:29] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'originalVisibility' @ [50:23] ==> val originalVisibility: Visibility defined in org.jetbrains.kotlin.synthetic.syntheticVisibility[LocalVariableDescriptor]

'normalize' @ [50:42] ==> public open fun normalize(): Visibility defined in org.jetbrains.kotlin.descriptors.Visibility[DeserializedSimpleFunctionDescriptor]

'originalVisibility' @ [53:25] ==> val originalVisibility: Visibility defined in org.jetbrains.kotlin.synthetic.syntheticVisibility[LocalVariableDescriptor]

'displayName' @ [53:44] ==> public open val displayName: String defined in org.jetbrains.kotlin.descriptors.Visibility[DeserializedPropertyDescriptor]

