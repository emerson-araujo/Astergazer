package ua.dborisenko.astergazer.service;

import java.util.List;

import ua.dborisenko.astergazer.dto.JsTreeNodeDto;
import ua.dborisenko.astergazer.exception.ServiceException;

public interface IContextService {

    void create(String name) throws ServiceException;

    List<JsTreeNodeDto> getContextsTreeDto() throws ServiceException;

    void update(Long id, String name) throws ServiceException;

    void delete(Long id) throws ServiceException;
}
