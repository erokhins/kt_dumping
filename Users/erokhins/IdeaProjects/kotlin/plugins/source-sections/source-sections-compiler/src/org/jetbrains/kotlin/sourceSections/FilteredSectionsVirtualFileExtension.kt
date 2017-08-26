'allowedSections' @ [25:45] ==> public final val allowedSections: Set<String>? defined in org.jetbrains.kotlin.sourceSections.FilteredSectionsVirtualFileExtension[PropertyDescriptorImpl]

'allowedSections' @ [25:72] ==> public final val allowedSections: Set<String>? defined in org.jetbrains.kotlin.sourceSections.FilteredSectionsVirtualFileExtension[PropertyDescriptorImpl]

'isEmpty' @ [25:88] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'when {
                file == null || allowedSections == null || allowedSections.isEmpty() -> file
                file is LightVirtualFile -> FilteredSectionsLightVirtualFile(file, allowedSections)
                else -> FilteredSectionsVirtualFile(file, allowedSections)
            }' @ [28:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: VirtualFile?, entry1: VirtualFile?, entry2: VirtualFile?): VirtualFile?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> VirtualFile?

'file' @ [29:17] ==> value-parameter file: VirtualFile? defined in org.jetbrains.kotlin.sourceSections.FilteredSectionsVirtualFileExtension.createPreprocessedFile[ValueParameterDescriptorImpl]

'allowedSections' @ [29:33] ==> public final val allowedSections: Set<String>? defined in org.jetbrains.kotlin.sourceSections.FilteredSectionsVirtualFileExtension[PropertyDescriptorImpl]

'allowedSections' @ [29:60] ==> public final val allowedSections: Set<String>? defined in org.jetbrains.kotlin.sourceSections.FilteredSectionsVirtualFileExtension[PropertyDescriptorImpl]

'isEmpty' @ [29:76] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'file' @ [29:89] ==> value-parameter file: VirtualFile? defined in org.jetbrains.kotlin.sourceSections.FilteredSectionsVirtualFileExtension.createPreprocessedFile[ValueParameterDescriptorImpl]

'file' @ [30:17] ==> value-parameter file: VirtualFile? defined in org.jetbrains.kotlin.sourceSections.FilteredSectionsVirtualFileExtension.createPreprocessedFile[ValueParameterDescriptorImpl]

'FilteredSectionsLightVirtualFile' @ [30:45] ==> public constructor FilteredSectionsLightVirtualFile(delegate: LightVirtualFile, sectionIds: Collection<String>) defined in org.jetbrains.kotlin.sourceSections.FilteredSectionsLightVirtualFile[ClassConstructorDescriptorImpl]

'file' @ [30:78] ==> value-parameter file: VirtualFile? defined in org.jetbrains.kotlin.sourceSections.FilteredSectionsVirtualFileExtension.createPreprocessedFile[ValueParameterDescriptorImpl]

'allowedSections' @ [30:84] ==> public final val allowedSections: Set<String>? defined in org.jetbrains.kotlin.sourceSections.FilteredSectionsVirtualFileExtension[PropertyDescriptorImpl]

'FilteredSectionsVirtualFile' @ [31:25] ==> public constructor FilteredSectionsVirtualFile(delegate: VirtualFile, sectionIds: Collection<String>) defined in org.jetbrains.kotlin.sourceSections.FilteredSectionsVirtualFile[ClassConstructorDescriptorImpl]

'file' @ [31:53] ==> value-parameter file: VirtualFile? defined in org.jetbrains.kotlin.sourceSections.FilteredSectionsVirtualFileExtension.createPreprocessedFile[ValueParameterDescriptorImpl]

'allowedSections' @ [31:59] ==> public final val allowedSections: Set<String>? defined in org.jetbrains.kotlin.sourceSections.FilteredSectionsVirtualFileExtension[PropertyDescriptorImpl]

'when {
                file == null || allowedSections == null || allowedSections.isEmpty() -> file
                else -> FilteredSectionsLightVirtualFile(file, allowedSections)
            }' @ [35:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: LightVirtualFile?, entry1: LightVirtualFile?): LightVirtualFile?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> LightVirtualFile?

'file' @ [36:17] ==> value-parameter file: LightVirtualFile? defined in org.jetbrains.kotlin.sourceSections.FilteredSectionsVirtualFileExtension.createPreprocessedLightFile[ValueParameterDescriptorImpl]

'allowedSections' @ [36:33] ==> public final val allowedSections: Set<String>? defined in org.jetbrains.kotlin.sourceSections.FilteredSectionsVirtualFileExtension[PropertyDescriptorImpl]

'allowedSections' @ [36:60] ==> public final val allowedSections: Set<String>? defined in org.jetbrains.kotlin.sourceSections.FilteredSectionsVirtualFileExtension[PropertyDescriptorImpl]

'isEmpty' @ [36:76] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'file' @ [36:89] ==> value-parameter file: LightVirtualFile? defined in org.jetbrains.kotlin.sourceSections.FilteredSectionsVirtualFileExtension.createPreprocessedLightFile[ValueParameterDescriptorImpl]

'FilteredSectionsLightVirtualFile' @ [37:25] ==> public constructor FilteredSectionsLightVirtualFile(delegate: LightVirtualFile, sectionIds: Collection<String>) defined in org.jetbrains.kotlin.sourceSections.FilteredSectionsLightVirtualFile[ClassConstructorDescriptorImpl]

'file' @ [37:58] ==> value-parameter file: LightVirtualFile? defined in org.jetbrains.kotlin.sourceSections.FilteredSectionsVirtualFileExtension.createPreprocessedLightFile[ValueParameterDescriptorImpl]

'allowedSections' @ [37:64] ==> public final val allowedSections: Set<String>? defined in org.jetbrains.kotlin.sourceSections.FilteredSectionsVirtualFileExtension[PropertyDescriptorImpl]

