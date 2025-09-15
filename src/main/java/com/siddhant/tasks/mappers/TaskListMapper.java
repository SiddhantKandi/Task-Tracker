package com.siddhant.tasks.mappers;

import com.siddhant.tasks.domain.dto.TaskListDto;
import com.siddhant.tasks.domain.entities.TaskList;

public interface TaskListMapper {

    TaskList fromDto(TaskListDto taskListDto);

    TaskListDto toDto(TaskList taskList);
}
