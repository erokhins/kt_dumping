'classifier' @ [27:17] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy.SHORT.renderClassifier[ValueParameterDescriptorImpl]

'renderer' @ [27:63] ==> value-parameter renderer: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy.SHORT.renderClassifier[ValueParameterDescriptorImpl]

'renderName' @ [27:72] ==> public abstract fun renderName(name: Name): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[SimpleFunctionDescriptorImpl]

'classifier' @ [27:83] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy.SHORT.renderClassifier[ValueParameterDescriptorImpl]

'name' @ [27:94] ==> public final val TypeParameterDescriptor.name: Name[MyPropertyDescriptor]

'ArrayList' @ [29:41] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Name

'classifier' @ [32:51] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy.SHORT.renderClassifier[ValueParameterDescriptorImpl]

'qualifiedNameElements' @ [34:17] ==> val qualifiedNameElements: ArrayList<Name> defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy.SHORT.renderClassifier[LocalVariableDescriptor]

'add' @ [34:39] ==> public open fun add(element: Name): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'current' @ [34:43] ==> var current: DeclarationDescriptor? defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy.SHORT.renderClassifier[LocalVariableDescriptor]

'name' @ [34:53] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'current' @ [35:17] ==> var current: DeclarationDescriptor? defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy.SHORT.renderClassifier[LocalVariableDescriptor]

'current' @ [35:27] ==> var current: DeclarationDescriptor? defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy.SHORT.renderClassifier[LocalVariableDescriptor]

'containingDeclaration' @ [35:35] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'current' @ [37:20] ==> var current: DeclarationDescriptor? defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy.SHORT.renderClassifier[LocalVariableDescriptor]

'renderFqName' @ [39:20] ==> public fun renderFqName(pathSegments: List<Name>): String defined in org.jetbrains.kotlin.renderer in file RenderingUtils.kt[SimpleFunctionDescriptorImpl]

'qualifiedNameElements' @ [39:33] ==> val qualifiedNameElements: ArrayList<Name> defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy.SHORT.renderClassifier[LocalVariableDescriptor]

'asReversed' @ [39:55] ==> @JvmName public fun <T> MutableList<Name>.asReversed(): MutableList<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'classifier' @ [45:17] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy.FULLY_QUALIFIED.renderClassifier[ValueParameterDescriptorImpl]

'renderer' @ [45:63] ==> value-parameter renderer: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy.FULLY_QUALIFIED.renderClassifier[ValueParameterDescriptorImpl]

'renderName' @ [45:72] ==> public abstract fun renderName(name: Name): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[SimpleFunctionDescriptorImpl]

'classifier' @ [45:83] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy.FULLY_QUALIFIED.renderClassifier[ValueParameterDescriptorImpl]

'name' @ [45:94] ==> public final val TypeParameterDescriptor.name: Name[MyPropertyDescriptor]

'renderer' @ [47:20] ==> value-parameter renderer: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy.FULLY_QUALIFIED.renderClassifier[ValueParameterDescriptorImpl]

'renderFqName' @ [47:29] ==> public abstract fun renderFqName(fqName: FqNameUnsafe): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[SimpleFunctionDescriptorImpl]

'getFqName' @ [47:58] ==> @NotNull public open fun getFqName(@NotNull descriptor: DeclarationDescriptor): FqNameUnsafe defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'classifier' @ [47:68] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy.FULLY_QUALIFIED.renderClassifier[ValueParameterDescriptorImpl]

'qualifiedNameForSourceCode' @ [54:17] ==> private final fun qualifiedNameForSourceCode(descriptor: ClassifierDescriptor): String defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy.SOURCE_CODE_QUALIFIED[SimpleFunctionDescriptorImpl]

'classifier' @ [54:44] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy.SOURCE_CODE_QUALIFIED.renderClassifier[ValueParameterDescriptorImpl]

'descriptor' @ [57:30] ==> value-parameter descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy.SOURCE_CODE_QUALIFIED.qualifiedNameForSourceCode[ValueParameterDescriptorImpl]

'name' @ [57:41] ==> public final val ClassifierDescriptor.name: Name[MyPropertyDescriptor]

'render' @ [57:46] ==> public fun Name.render(): String defined in org.jetbrains.kotlin.renderer in file RenderingUtils.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [58:17] ==> value-parameter descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy.SOURCE_CODE_QUALIFIED.qualifiedNameForSourceCode[ValueParameterDescriptorImpl]

'nameString' @ [59:24] ==> val nameString: String defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy.SOURCE_CODE_QUALIFIED.qualifiedNameForSourceCode[LocalVariableDescriptor]

'qualifierName' @ [61:29] ==> private final fun qualifierName(descriptor: DeclarationDescriptor): String? defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy.SOURCE_CODE_QUALIFIED[SimpleFunctionDescriptorImpl]

'descriptor' @ [61:43] ==> value-parameter descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy.SOURCE_CODE_QUALIFIED.qualifiedNameForSourceCode[ValueParameterDescriptorImpl]

'containingDeclaration' @ [61:54] ==> public final val ClassifierDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'if (qualifier != null && qualifier != "") qualifier + "." + nameString else nameString' @ [62:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'qualifier' @ [62:24] ==> val qualifier: String? defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy.SOURCE_CODE_QUALIFIED.qualifiedNameForSourceCode[LocalVariableDescriptor]

'qualifier' @ [62:45] ==> val qualifier: String? defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy.SOURCE_CODE_QUALIFIED.qualifiedNameForSourceCode[LocalVariableDescriptor]

'qualifier' @ [62:62] ==> val qualifier: String? defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy.SOURCE_CODE_QUALIFIED.qualifiedNameForSourceCode[LocalVariableDescriptor]

'nameString' @ [62:80] ==> val nameString: String defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy.SOURCE_CODE_QUALIFIED.qualifiedNameForSourceCode[LocalVariableDescriptor]

'nameString' @ [62:96] ==> val nameString: String defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy.SOURCE_CODE_QUALIFIED.qualifiedNameForSourceCode[LocalVariableDescriptor]

'when (descriptor) {
            is ClassDescriptor -> qualifiedNameForSourceCode(descriptor)
            is PackageFragmentDescriptor -> descriptor.fqName.toUnsafe().render()
            else -> null
        }' @ [65:81] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String?, entry1: String?, entry2: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String?

'descriptor' @ [65:87] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy.SOURCE_CODE_QUALIFIED.qualifierName[ValueParameterDescriptorImpl]

'qualifiedNameForSourceCode' @ [66:35] ==> private final fun qualifiedNameForSourceCode(descriptor: ClassifierDescriptor): String defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy.SOURCE_CODE_QUALIFIED[SimpleFunctionDescriptorImpl]

'descriptor' @ [66:62] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy.SOURCE_CODE_QUALIFIED.qualifierName[ValueParameterDescriptorImpl]

'descriptor' @ [67:45] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy.SOURCE_CODE_QUALIFIED.qualifierName[ValueParameterDescriptorImpl]

'fqName' @ [67:56] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[PropertyDescriptorImpl]

'toUnsafe' @ [67:63] ==> @NotNull public open fun toUnsafe(): FqNameUnsafe defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'render' @ [67:74] ==> public fun FqNameUnsafe.render(): String defined in org.jetbrains.kotlin.renderer in file RenderingUtils.kt[SimpleFunctionDescriptorImpl]

